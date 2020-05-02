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
import software.amazon.awssdk.services.dynamodb.model.Shard

/**
  * Builds instances of type Shard:
  * A uniquely identified group of stream records within a stream.
  */
@DynamodbDSL
inline class ShardCollectionDSL(
  @PublishedApi
  @Deprecated("Don't use internal fields!", level = WARNING)
  internal val list : MutableList<Shard>
){
  @PublishedApi
  internal fun build() = list

  /**
    * Builds an object of type Shard from 
    * the given DSL in 'dslBlock' and adds it to the collection
    */
  inline fun o(dslBlock: ShardDSL.() -> Unit) {
    list.add(buildShard(dslBlock))
  }

  /**
    * Adds a Shard to the collection built by this DSL
    */
  inline operator fun Shard.unaryPlus() {
    list.add(this)
  }

  /**
    * Adds all given Shard instances to the collection built by this DSL
    */
  inline operator fun Collection<Shard>.unaryPlus() {
    list.addAll(this)
  }

  /**
    * Adds all given Shard instances to the collection built by this DSL
    */
  inline operator fun Array<Shard>.unaryPlus() {
    list.addAll(this)
  }
}

/**
  * Builds instances of type Shard:
  * A uniquely identified group of stream records within a stream.
  */
inline fun buildShardCollection(dslBlock: ShardCollectionDSL.() -> Unit) =
  ShardCollectionDSL(mutableListOf<Shard>()).apply(dslBlock).build()