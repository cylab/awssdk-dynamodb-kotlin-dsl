# AWS-SDK DynamoDB Kotlin DSL 

This DSL is generated from https://github.com/aws/aws-sdk-java-v2 by https://github.com/cylab/aws-kotlin-dsl-builder

**CAUTION:** This is very much work in progress and might not work as expected or at all.
Feel free to try it out and give feedback at the generator project (see above)

All Builders of the SDK are wrapped in Kotlin style DSLs.
Use buildXXXXX { } everytime you would use XXXXX.builder() e.g.

    buildDynamoDbClient {
    }

builder functions are exposed as properties inside the DSL block like:

    val client = buildDynamoDbClient {
       region = Region.EU_CENTRAL_1
       credentialsProvider = buildDefaultCredentialsProvider()
    }

## Known Issues

Methods derived from parent types are not converted to DSLs.  
