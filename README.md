# AWS-SDK DynamoDB Kotlin DSL 

[![Maven Central](https://img.shields.io/maven-central/v/net.highteq.cylab/awssdk-dynamodb-kotlin-dsl.svg?label=Maven%20Central)](https://search.maven.org/search?q=g:%22net.highteq.cylab%22%20AND%20a:%22awssdk-dynamodb-kotlin-dsl%22)

This DSL is generated from https://github.com/aws/aws-sdk-java-v2 by https://github.com/cylab/aws-kotlin-dsl-builder.

Everything is inlined, so performance impact should be negligible. 

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

The objects in this DSL can be added by the `o {}` sub DSL
or by using the `+` operator on existing instances:

    buildAttributeDefinitionCollection {
      o {
        attributeName = Constants.ID
        attributeType = ScalarAttributeType.S
      }
      o {
        attributeName = Constants.NAME
        attributeType = ScalarAttributeType.S
      }
      
      +existingAttribute
      
      +existingCollectionOfAttributes
    }

The same mechanism works, if the collection is part of a sub DSL:

    val createTableRequest = buildCreateTableRequest {
      attributeDefinitions {
        o {
          attributeName = Constants.ID
          attributeType = ScalarAttributeType.S
        }
        o {
          attributeName = Constants.NAME
          attributeType = ScalarAttributeType.S
        }
      
        +existingAttribute
          
        +existingCollectionOfAttributes
      }
    }

Like normal collections, you can also build Maps using `buildXXXMap`.
This time the object DSL takes the key as parameter:

    val hotelItem = buildAttributeValueMap {
      o("ID") { s = hotel.id }
      o("NAME") { s = hotel.name }
      o("ADDRESS") { s = hotel.address }
    }

The same mechanism is also available in sub DSLs:

    val deleteRequest = buildDeleteItemRequest {
      tableName = "SomeTable"
      key {
        o("ID") { s = "someValue" }
      }
    }

or in a nested AttributeValueMap

    val putRequest = buildPutItemRequest {
      item {
        o("ID") { s = hotel.id }
        o("NAME") { s = hotel.name }
        o("ADDRESS") {
          m {
            o("STREET") { s = hotel.street }
            o("ZIP") { s = hotel.zip }
            o("CITY") { s = hotel.city }
            o("STATE") { s = hotel.state }
          }
        }
      }
    }

## Extension functions for buildable types

All methods, that take a single argument of a type for which a DSL
exists, is complemented with a sub DSL variant as extension function.
These functions always end with 'By' to make sure, no ambiguity is
introduced with other overloads of the original method.

So instead of

    val putRequest = buildPutItemRequest {
      tableName = "table"
      item {
        o("ID") { s = hotel.id }
        o("NAME") { s = hotel.name }
      }
    }
    
    client.putItem(putRequest)

you can just write

    client.putItemBy {
      tableName = "table"
      item {
        o("ID") { s = hotel.id }
        o("NAME") { s = hotel.name }
      }
    }

