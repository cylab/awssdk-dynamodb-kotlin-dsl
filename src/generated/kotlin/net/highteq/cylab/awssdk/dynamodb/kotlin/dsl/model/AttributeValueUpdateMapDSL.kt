/*
  This file was generated from https://github.com/aws/aws-sdk-java-v2 by https://github.com/cylab/aws-kotlin-dsl-builder
  Like the original code, this file and project is licensed under
  Apache License Version 2.0
  See LICENSE.txt for more info
*/
@file:Suppress("DEPRECATION", "NOTHING_TO_INLINE")
package net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.model

import kotlin.DeprecationLevel.WARNING
import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSL
import software.amazon.awssdk.services.dynamodb.model.AttributeValueUpdate

/**
  * Builds a maps of type AttributeValueUpdate:
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
inline class AttributeValueUpdateMapDSL(
  @PublishedApi
  @Deprecated("Don't use internal fields!", level = WARNING)
  internal val map : MutableMap<String, AttributeValueUpdate>
) {
  @PublishedApi
  internal fun build() : Map<String, AttributeValueUpdate> = map

  /**
    * Builds an object of type AttributeValueUpdate from 
    * the given DSL in 'dslBlock' and adds it to the map at ['key']
    */
  inline fun o(key: String, dslBlock: AttributeValueUpdateDSL.() -> Unit) {
    map[key] = buildAttributeValueUpdate(dslBlock)
  }

  /**
    * Adds a pair of String -> AttributeValueUpdate to the map
    */
  inline operator fun Pair<String, AttributeValueUpdate>.unaryPlus() {
    map[this.first] = this.second
  }

  /**
    * Adds all given Pair<String, AttributeValueUpdate> instances to the map
    */
  inline operator fun Collection<Pair<String, AttributeValueUpdate>>.unaryPlus() {
    this.forEach { map[it.first] = it.second }
  }

  /**
    * Adds all given Pair<String, AttributeValueUpdate> instances to the map
    */
  inline operator fun Array<Pair<String, AttributeValueUpdate>>.unaryPlus() {
    this.forEach { map[it.first] = it.second }
  }

  /**
    * Adds all entries in the given map
    */
  inline operator fun Map<String, AttributeValueUpdate>.unaryPlus() {
    map.putAll(this)
  }
}

/**
  * Builds a maps of type AttributeValueUpdate:
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
inline fun buildAttributeValueUpdateMap(dslBlock: AttributeValueUpdateMapDSL.() -> Unit) =
  AttributeValueUpdateMapDSL(mutableMapOf<String, AttributeValueUpdate>()).apply(dslBlock).build()