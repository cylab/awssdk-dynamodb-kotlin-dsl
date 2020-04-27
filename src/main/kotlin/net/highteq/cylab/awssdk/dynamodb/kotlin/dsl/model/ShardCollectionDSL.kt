/*
  This file was generated from https://github.com/aws/aws-sdk-java-v2 by https://github.com/cylab/aws-kotlin-dsl-builder
  Like the original code, this file and project is licensed under
  Apache License Version 2.0
  See LICENSE.txt for more info
*/
package net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.model

import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSL
import software.amazon.awssdk.services.dynamodb.model.Shard

/**
  * Builds instances of type Shard:
  * A uniquely identified group of stream records within a stream.
  */
@DynamodbDSL
class ShardCollectionDSL {
  private val list = ArrayList<Shard>()
  internal fun build() : List<Shard> = list

  /**
    * Receives a sub DSL in 'dslBlock' to build a Shard instance
    * and adds it to the collection built by the enclosing DSL
    */
  fun add(dslBlock: ShardDSL.() -> Unit) {
    list.add(ShardDSL().apply(dslBlock).build())
  }

  /**
    * Adds a Shard to the collection built by this DSL
    */
  fun add(item: Shard) {
    list.add(item)
  }

  /**
    * Adds all given Shard instances to the collection built by this DSL
    */
  fun addAll(items: Collection<Shard>) {
    list.addAll(items)
  }

  /**
    * Adds all given Shard instances to the collection built by this DSL
    */
  infix fun addAll(items: Array<Shard>) {
    list.addAll(items)
  }

  /**
    * Adds a Shard to the collection built by this DSL
    */
  operator fun Shard.unaryPlus() {
    list.add(this)
  }

  /**
    * Adds all given Shard instances to the collection built by this DSL
    */
  operator fun Collection<Shard>.unaryPlus() {
    list.addAll(this)
  }

  /**
    * Adds all given Shard instances to the collection built by this DSL
    */
  operator fun Array<Shard>.unaryPlus() {
    list.addAll(this)
  }
}

/**
  * Builds instances of type Shard:
  * A uniquely identified group of stream records within a stream.
  */
fun buildShardCollection(dslBlock: ShardCollectionDSL.() -> Unit) =
  ShardCollectionDSL().apply(dslBlock).build()