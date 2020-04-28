/*
  This file was generated from https://github.com/aws/aws-sdk-java-v2 by https://github.com/cylab/aws-kotlin-dsl-builder
  Like the original code, this file and project is licensed under
  Apache License Version 2.0
  See LICENSE.txt for more info
*/
package net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.model

import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSL
import software.amazon.awssdk.services.dynamodb.model.AttributeValueUpdate

/**
  * Builds instances of type AttributeValueUpdate:
  * For the UpdateItem operation, represents the attributes to be modified, the action to perform on each,
  *  and the new value for each.
  * 
  *  You cannot use UpdateItem to update any primary key attributes. Instead, you will need to delete the
  *  item, and then use PutItem to create a new item with new attributes.
  * 
  *  Attribute values cannot be null; string and binary type attributes must have lengths greater than zero; and set type
  *  attributes must not be empty. Requests with empty values will be rejected with a ValidationException
  *  exception.
  */
@DynamodbDSL
class AttributeValueUpdateMapDSL {
  private val map = mutableMapOf<String, AttributeValueUpdate>()
  internal fun build() : Map<String, AttributeValueUpdate> = map

  /**
    * Builds an object of type AttributeValueUpdate from 
    * the given DSL in 'dslBlock' and adds it to the map at ['key']
    */
  fun o(key: String, dslBlock: AttributeValueUpdateDSL.() -> Unit) {
    map[key] = AttributeValueUpdateDSL().apply(dslBlock).build()
  }

  /**
    * Adds a pair of String -> AttributeValueUpdate to the map
    */
  operator fun Pair<String, AttributeValueUpdate>.unaryPlus() {
    map[this.first] = this.second
  }

  /**
    * Adds all given Pair<String, AttributeValueUpdate> instances to the map
    */
  operator fun Collection<Pair<String, AttributeValueUpdate>>.unaryPlus() {
    this.forEach { map[it.first] = it.second }
  }

  /**
    * Adds all given Pair<String, AttributeValueUpdate> instances to the map
    */
  operator fun Array<Pair<String, AttributeValueUpdate>>.unaryPlus() {
    this.forEach { map[it.first] = it.second }
  }

  /**
    * Adds all entries in the given map
    */
  operator fun Map<String, AttributeValueUpdate>.unaryPlus() {
    map.putAll(this)
  }
}

/**
  * Builds instances of type AttributeValueUpdate:
  * For the UpdateItem operation, represents the attributes to be modified, the action to perform on each,
  *  and the new value for each.
  * 
  *  You cannot use UpdateItem to update any primary key attributes. Instead, you will need to delete the
  *  item, and then use PutItem to create a new item with new attributes.
  * 
  *  Attribute values cannot be null; string and binary type attributes must have lengths greater than zero; and set type
  *  attributes must not be empty. Requests with empty values will be rejected with a ValidationException
  *  exception.
  */
fun buildAttributeValueUpdateMap(dslBlock: AttributeValueUpdateMapDSL.() -> Unit) =
  AttributeValueUpdateMapDSL().apply(dslBlock).build()