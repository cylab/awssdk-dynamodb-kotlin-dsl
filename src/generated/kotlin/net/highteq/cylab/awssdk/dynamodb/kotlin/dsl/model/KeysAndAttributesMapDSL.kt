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
import software.amazon.awssdk.services.dynamodb.model.KeysAndAttributes

/**
  * Builds instances of type KeysAndAttributes:
  * Represents a set of primary keys and, for each key, the attributes to retrieve from the table.
  * 
  *  For each primary key, you must provide all of the key attributes. For example, with a simple primary key, you
  *  only need to provide the partition key. For a composite primary key, you must provide both the partition key
  *  and the sort key.
  */
@DynamodbDSL
inline class KeysAndAttributesMapDSL(
  @PublishedApi
  @Deprecated("Don't use internal fields!", level = WARNING)
  internal val map : MutableMap<String, KeysAndAttributes>
) {
  @PublishedApi
  internal fun build() : Map<String, KeysAndAttributes> = map

  /**
    * Builds an object of type KeysAndAttributes from 
    * the given DSL in 'dslBlock' and adds it to the map at ['key']
    */
  inline fun o(key: String, dslBlock: KeysAndAttributesDSL.() -> Unit) {
    map[key] = buildKeysAndAttributes(dslBlock)
  }

  /**
    * Adds a pair of String -> KeysAndAttributes to the map
    */
  inline operator fun Pair<String, KeysAndAttributes>.unaryPlus() {
    map[this.first] = this.second
  }

  /**
    * Adds all given Pair<String, KeysAndAttributes> instances to the map
    */
  inline operator fun Collection<Pair<String, KeysAndAttributes>>.unaryPlus() {
    this.forEach { map[it.first] = it.second }
  }

  /**
    * Adds all given Pair<String, KeysAndAttributes> instances to the map
    */
  inline operator fun Array<Pair<String, KeysAndAttributes>>.unaryPlus() {
    this.forEach { map[it.first] = it.second }
  }

  /**
    * Adds all entries in the given map
    */
  inline operator fun Map<String, KeysAndAttributes>.unaryPlus() {
    map.putAll(this)
  }
}

/**
  * Builds instances of type KeysAndAttributes:
  * Represents a set of primary keys and, for each key, the attributes to retrieve from the table.
  * 
  *  For each primary key, you must provide all of the key attributes. For example, with a simple primary key, you
  *  only need to provide the partition key. For a composite primary key, you must provide both the partition key
  *  and the sort key.
  */
inline fun buildKeysAndAttributesMap(dslBlock: KeysAndAttributesMapDSL.() -> Unit) =
  KeysAndAttributesMapDSL(mutableMapOf<String, KeysAndAttributes>()).apply(dslBlock).build()