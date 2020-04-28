/*
  This file was generated from https://github.com/aws/aws-sdk-java-v2 by https://github.com/cylab/aws-kotlin-dsl-builder
  Like the original code, this file and project is licensed under
  Apache License Version 2.0
  See LICENSE.txt for more info
*/
package net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.model

import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSL
import software.amazon.awssdk.services.dynamodb.model.Capacity

/**
  * Builds instances of type Capacity:
  * Represents the amount of provisioned throughput capacity consumed on a table or an index.
  */
@DynamodbDSL
class CapacityMapDSL {
  private val map = mutableMapOf<String, Capacity>()
  internal fun build() : Map<String, Capacity> = map

  /**
    * Builds an object of type Capacity from 
    * the given DSL in 'dslBlock' and adds it to the map at ['key']
    */
  fun o(key: String, dslBlock: CapacityDSL.() -> Unit) {
    map[key] = CapacityDSL().apply(dslBlock).build()
  }

  /**
    * Adds a pair of String -> Capacity to the map
    */
  operator fun Pair<String, Capacity>.unaryPlus() {
    map[this.first] = this.second
  }

  /**
    * Adds all given Pair<String, Capacity> instances to the map
    */
  operator fun Collection<Pair<String, Capacity>>.unaryPlus() {
    this.forEach { map[it.first] = it.second }
  }

  /**
    * Adds all given Pair<String, Capacity> instances to the map
    */
  operator fun Array<Pair<String, Capacity>>.unaryPlus() {
    this.forEach { map[it.first] = it.second }
  }

  /**
    * Adds all entries in the given map
    */
  operator fun Map<String, Capacity>.unaryPlus() {
    map.putAll(this)
  }
}

/**
  * Builds instances of type Capacity:
  * Represents the amount of provisioned throughput capacity consumed on a table or an index.
  */
fun buildCapacityMap(dslBlock: CapacityMapDSL.() -> Unit) =
  CapacityMapDSL().apply(dslBlock).build()