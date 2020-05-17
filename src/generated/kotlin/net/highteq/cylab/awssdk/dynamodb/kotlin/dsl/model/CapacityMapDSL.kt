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
import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSLMarker
import software.amazon.awssdk.services.dynamodb.model.Capacity

/**
  * Builds a maps of type Capacity:
  * Represents the amount of provisioned throughput capacity consumed on a table or an index.
  */
@DynamodbDSLMarker
inline class CapacityMapDSL(
  @PublishedApi
  @Deprecated("Don't use internal fields!", level = WARNING)
  internal val map : MutableMap<String, Capacity>
) {
  @PublishedApi
  internal fun build() : Map<String, Capacity> = map

  /**
    * Builds an object of type Capacity from 
    * the given DSL in 'dslBlock' and adds it to the map at ['key']
    */
  inline fun o(key: String, dslBlock: CapacityDSL.() -> Unit) {
    map[key] = DynamodbDSL.capacity(dslBlock)
  }

  /**
    * Adds a pair of String -> Capacity to the map
    */
  inline operator fun Pair<String, Capacity>.unaryPlus() {
    map[this.first] = this.second
  }

  /**
    * Adds all given Pair<String, Capacity> instances to the map
    */
  inline operator fun Collection<Pair<String, Capacity>>.unaryPlus() {
    this.forEach { map[it.first] = it.second }
  }

  /**
    * Adds all given Pair<String, Capacity> instances to the map
    */
  inline operator fun Array<Pair<String, Capacity>>.unaryPlus() {
    this.forEach { map[it.first] = it.second }
  }

  /**
    * Adds all entries in the given map
    */
  inline operator fun Map<String, Capacity>.unaryPlus() {
    map.putAll(this)
  }
}

/**
  * Builds a maps of type Capacity:
  * Represents the amount of provisioned throughput capacity consumed on a table or an index.
  */
inline fun capacityMap(dslBlock: CapacityMapDSL.() -> Unit) =
  CapacityMapDSL(mutableMapOf<String, Capacity>()).apply(dslBlock).build()

/**
  * Builds a maps of type Capacity:
  * Represents the amount of provisioned throughput capacity consumed on a table or an index.
  */
inline fun DynamodbDSL.Companion.capacityMap(dslBlock: CapacityMapDSL.() -> Unit) =
  CapacityMapDSL(mutableMapOf<String, Capacity>()).apply(dslBlock).build()