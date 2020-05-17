package net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.playground

import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSL
import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.dynamoDbClient
import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.model.*
import software.amazon.awssdk.auth.credentials.DefaultCredentialsProvider
import software.amazon.awssdk.regions.Region
import software.amazon.awssdk.services.dynamodb.model.*
import software.amazon.awssdk.services.dynamodb.model.ScalarAttributeType.*
import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.contract

@ExperimentalContracts
private class _Playground {
  val client = dynamoDbClient {
    region = Region.EU_CENTRAL_1
    credentialsProvider = DefaultCredentialsProvider.builder().build()
    @Suppress("DEPRECATION")
    builder.enableEndpointDiscovery()
  }

  val elements = arrayOf(
    keySchemaElement {
      attributeName = "SomeID"
      keyType = KeyType.HASH
    }
  )

  val element =
    keySchemaElement {
      attributeName = "SomeID"
      keyType = KeyType.HASH
    }

  val attrDef = attributeDefinition {
    attributeName = "ID"
    attributeType("S")
  }

  val attributes = attributeDefinitionCollection {
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

  val request = putItemRequest {
    tableName = "some table"
    item = mapOf("foo" to attributeValue { s = "bar" })
  }

  val createTableRequest = createTableRequest {
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

    val block = DynamodbDSL.provisionedThroughput {
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

  // TODO: implement a automatic map to attributeValueMap converter
  fun attributeValueMapOf(vararg entries: Pair<String, Any>) : Map<String, AttributeValue> {
    return emptyMap()
  }

  fun Map<String, Any>.toAttributes() : Map<String, AttributeValue> {
    return emptyMap()
  }

  val fooMap = attributeValueMapOf(
    "ID" to "hotel.id",
    "NAME" to "hotel.name",
    "ZIP" to "hotel.zip",
    "STATE" to "hotel.state",
    "ADDRESS" to "hotel.address",
    "foo" to mapOf(
      "ID" to "hotel.id",
      "NAME" to "hotel.name",
      "ZIP" to "hotel.zip",
      "STATE" to 17,
      "valid" to attributeValue { n = "17" }
    ).toAttributes()
  )

  val foo2 = attributeValueMap {
    o("ID") { s = "hotel.id" }
    o("NAME") { s = "hotel.name" }
    o("ZIP") { s = "hotel.zip" }
    o("STATE") { s = "hotel.state" }
    o("ADDRESS") { s = "hotel.address" }
    o("foo") {
      m = attributeValueMap {
        o("ID") { s = "hotel.id" }
        o("NAME") { s = "hotel.name" }
        o("ZIP") { s = "hotel.zip" }
        o("STATE") { n = "17" }
        o("valid") { bool = true }
      }
    }
  }


  val query = queryRequest {
    select = Select.COUNT
  }


  val pir = putItemRequest {
    item {
      o("ID") { s = "hotel.id" }
      o("NAME") { s = "hotel.name" }
      o("ZIP") { s = "hotel.zip" }
      o("STATE") { s = "hotel.state" }
      o("ADDRESS") { s = "hotel.address" }
    }
  }


  init {

    client.describeBackupBy {
      backupArn = "asdd"
    }
  }
}

