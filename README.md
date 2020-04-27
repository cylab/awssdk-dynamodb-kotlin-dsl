# AWS-SDK DynamoDB Kotlin DSL 

[![Maven Central](https://maven-badges.herokuapp.com/maven-central/net.highteq.cylab/awssdk-dynamodb-kotlin-dsl/badge.svg)](https://maven-badges.herokuapp.com/maven-central/net.highteq.cylab/awssdk-dynamodb-kotlin-dsl)

This DSL is generated from https://github.com/aws/aws-sdk-java-v2 by https://github.com/cylab/aws-kotlin-dsl-builder

Current version is `2.5.54_ALPHA2`. The release is available as 

    net.highteq.cylab:awssdk-dynamodb-kotlin-dsl:2.5.54_ALPHA2

at maven central.

**CAUTION:** This is very much work in progress and might not work as expected or at all.
Feel free to try it out and give feedback at the generator project (see above)

All Builders of the SDK are wrapped in Kotlin style DSLs.
Use buildXXX { } everytime you would use XXX.builder() e.g.

    buildDynamoDbClient {
    }

builder functions are exposed as properties inside the DSL block like:

    val client = buildDynamoDbClient {
      region = Region.EU_CENTRAL_1
    }

if for some reason, a buildXXXX DSL function isn't (yet) available, you can
just use the plain old java style builder instead:
  
    val client = buildDynamoDbClient {
      region = Region.EU_CENTRAL_1
      credentialsProvider = DefaultCredentialsProvider.builder().build()
    }

or if something is missing, access the internal builder instance as a workaround:

    val client = buildDynamoDbClient {
      region = Region.EU_CENTRAL_1
      @Suppress("DEPRECATION")
      builder.enableEndpointDiscovery()
    }

note the `@Suppress("DEPRECATION")` annotation! Using the internal builder is
not recommended and should only be a last resort.

In any case, please report a bug at the generator project:
https://github.com/cylab/aws-kotlin-dsl-builder

## More Examples

For types that are used in collections, you can create a collection using `buildXXXCollection`:

    buildAttributeDefinitionCollection {
    }

The elements in this DSL can be added by the `item {}` sub DSL or by using the `+` operator on existing instances:

    buildAttributeDefinitionCollection {
      add {
        attributeName = Constants.ID
        attributeType = ScalarAttributeType.S
      }
      add {
        attributeName = Constants.NAME
        attributeType = ScalarAttributeType.S
      }
      
      +existingAttribute
      
      +existingCollectionOfAttributes
    }

The same mechanism works, if the collection is part of a sub DSL:

    val createTableRequest = buildCreateTableRequest {
      attributeDefinitions {
        add {
          attributeName = Constants.ID
          attributeType = ScalarAttributeType.S
        }
        add {
          attributeName = Constants.NAME
          attributeType = ScalarAttributeType.S
        }
      
        +existingAttribute
          
        +existingCollectionOfAttributes
      }
    }
