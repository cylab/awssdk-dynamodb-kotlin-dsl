package net.highteq.cylab.awssdk.dynamodb.kotlin.dsl

import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.model.*
import software.amazon.awssdk.auth.credentials.DefaultCredentialsProvider
import software.amazon.awssdk.regions.Region
import software.amazon.awssdk.services.dynamodb.model.KeyType
import software.amazon.awssdk.services.dynamodb.model.ScalarAttributeType.S
import software.amazon.awssdk.services.dynamodb.model.Select

private class _Playground {
  val client = buildDynamoDbClient {
    region = Region.EU_CENTRAL_1
    credentialsProvider = DefaultCredentialsProvider.builder().build()
    @Suppress("DEPRECATION")
    builder.enableEndpointDiscovery()
  }

  val elements = arrayOf(
    buildKeySchemaElement {
      attributeName = "SomeID"
      keyType = KeyType.HASH
    }
  )

  val element =
    buildKeySchemaElement {
      attributeName = "SomeID"
      keyType = KeyType.HASH
    }

  val attrDef = buildAttributeDefinition {
    attributeName = "ID"
    attributeType("S")
  }

  val attributes = buildAttributeDefinitionCollection {
    o {
      attributeName = "ID"
      attributeType("S")
    }
    o {
      attributeName = "NAME"
      attributeType = S
    }
    o {
      attributeName = "STATE"
      attributeType = S
    }
    +attrDef
  }

  val request = buildPutItemRequest {
    tableName = "some table"
    item = mapOf("foo" to buildAttributeValue { s = "bar" })
  }

  val createTableRequest = buildCreateTableRequest {
    attributeDefinitions = attributes

    keySchema {
      o {
        attributeName = "SomeID"
        keyType = KeyType.HASH
      }
      o {
        attributeName = "SomeID"
        keyType = KeyType.HASH
      }
      +elements
      +element
    }

    val block = buildProvisionedThroughput {
      readCapacityUnits = 10
      writeCapacityUnits = 10
    }
    provisionedThroughput = block

    tableName = "SomeTable"
  }

//  val result = buildDynamoDbAsyncClient{}.getItem {
//    key { o("id") { s = "some id" } }
//    tableName = "SomeTable"
//  }
//
//  val result2 = buildDynamoDbAsyncClient{}.getItemBy {
//    key { o("id") { s = "some id" } }
//    tableName = "SomeTable"
//  }
//
//  val deleteItemRequest = deleteItemRequestBy {
//    tableName = "SomeTable"
//    key {
//      o("ID") { s = "someValue" }
//    }
//  }


  //val foo = buildAttributeMap {
  //  s("ID" to "hotel.id")
  //  s("NAME" to "hotel.name")
  //  s("ZIP" to "hotel.zip")
  //  s("STATE" to "hotel.state")
  //  s("ADDRESS" to "hotel.address")
  //  m("foo") {
  //    s("ID" to "hotel.id")
  //    s("NAME" to "hotel.name")
  //    s("ZIP" to "hotel.zip")
  //    s("STATE" to "hotel.state")
  //    bool("valid" to true)
  //  }
  //}

  val foo2 = buildAttributeValueMap {
    o("ID") { s = "hotel.id" }
    o("NAME") { s = "hotel.name" }
    o("ZIP") { s = "hotel.zip" }
    o("STATE") { s = "hotel.state" }
    o("ADDRESS") { s = "hotel.address" }
    o("foo") {
      m = buildAttributeValueMap {
        o("ID") { s = "hotel.id" }
        o("NAME") { s = "hotel.name" }
        o("ZIP") { s = "hotel.zip" }
        o("STATE") { s = "hotel.state" }
        o("valid") { bool = true }
      }
    }
  }


  val query = buildQueryRequest {
    select = Select.COUNT
  }


  val pir = buildPutItemRequest {
    item {
      o("ID") { s = "hotel.id" }
      o("NAME") { s = "hotel.name" }
      o("ZIP") { s = "hotel.zip" }
      o("STATE") { s = "hotel.state" }
      o("ADDRESS") { s = "hotel.address" }
    }
  }
}

