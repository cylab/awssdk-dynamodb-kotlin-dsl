/*
  This file was generated from https://github.com/aws/aws-sdk-java-v2 by https://github.com/cylab/aws-kotlin-dsl-builder
  Like the original code, this file and project is licensed under
  Apache License Version 2.0
  See LICENSE.txt for more info
*/
package net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.model

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
class KeysAndAttributesMapDSL {
  private val map = mutableMapOf<String, KeysAndAttributes>()
  internal fun build() : Map<String, KeysAndAttributes> = map

  /**
    * Builds an object of type KeysAndAttributes from 
    * the given DSL in 'dslBlock' and adds it to the map at ['key']
    */
  fun o(key: String, dslBlock: KeysAndAttributesDSL.() -> Unit) {
    map[key] = KeysAndAttributesDSL().apply(dslBlock).build()
  }

  /**
    * Adds a pair of String -> KeysAndAttributes to the map
    */
  operator fun Pair<String, KeysAndAttributes>.unaryPlus() {
    map[this.first] = this.second
  }

  /**
    * Adds all given Pair<String, KeysAndAttributes> instances to the map
    */
  operator fun Collection<Pair<String, KeysAndAttributes>>.unaryPlus() {
    this.forEach { map[it.first] = it.second }
  }

  /**
    * Adds all given Pair<String, KeysAndAttributes> instances to the map
    */
  operator fun Array<Pair<String, KeysAndAttributes>>.unaryPlus() {
    this.forEach { map[it.first] = it.second }
  }

  /**
    * Adds all entries in the given map
    */
  operator fun Map<String, KeysAndAttributes>.unaryPlus() {
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
fun buildKeysAndAttributesMap(dslBlock: KeysAndAttributesMapDSL.() -> Unit) =
  KeysAndAttributesMapDSL().apply(dslBlock).build()