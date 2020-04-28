/*
  This file was generated from https://github.com/aws/aws-sdk-java-v2 by https://github.com/cylab/aws-kotlin-dsl-builder
  Like the original code, this file and project is licensed under
  Apache License Version 2.0
  See LICENSE.txt for more info
*/
package net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.model

import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSL
import software.amazon.awssdk.services.dynamodb.model.AttributeValue

/**
  * Builds instances of type AttributeValue:
  * Represents the data for an attribute.
  * 
  *  Each attribute value is described as a name-value pair. The name is the data type, and the value is the data itself.
  * 
  *  For more information, see Data Types in the Amazon DynamoDB Developer Guide.
  */
@DynamodbDSL
class AttributeValueMapDSL {
  private val map = mutableMapOf<String, AttributeValue>()
  internal fun build() : Map<String, AttributeValue> = map

  /**
    * Builds an object of type AttributeValue from 
    * the given DSL in 'dslBlock' and adds it to the map at ['key']
    */
  fun o(key: String, dslBlock: AttributeValueDSL.() -> Unit) {
    map[key] = AttributeValueDSL().apply(dslBlock).build()
  }

  /**
    * Adds a pair of String -> AttributeValue to the map
    */
  operator fun Pair<String, AttributeValue>.unaryPlus() {
    map[this.first] = this.second
  }

  /**
    * Adds all given Pair<String, AttributeValue> instances to the map
    */
  operator fun Collection<Pair<String, AttributeValue>>.unaryPlus() {
    this.forEach { map[it.first] = it.second }
  }

  /**
    * Adds all given Pair<String, AttributeValue> instances to the map
    */
  operator fun Array<Pair<String, AttributeValue>>.unaryPlus() {
    this.forEach { map[it.first] = it.second }
  }

  /**
    * Adds all entries in the given map
    */
  operator fun Map<String, AttributeValue>.unaryPlus() {
    map.putAll(this)
  }
}

/**
  * Builds instances of type AttributeValue:
  * Represents the data for an attribute.
  * 
  *  Each attribute value is described as a name-value pair. The name is the data type, and the value is the data itself.
  * 
  *  For more information, see Data Types in the Amazon DynamoDB Developer Guide.
  */
fun buildAttributeValueMap(dslBlock: AttributeValueMapDSL.() -> Unit) =
  AttributeValueMapDSL().apply(dslBlock).build()