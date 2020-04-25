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

  fun item(init: ShardDSL.() -> Unit) {
    list.add(ShardDSL().apply(init).build())
  }

  operator fun Shard.unaryPlus() {
    list.add(this)
  }

  operator fun Collection<Shard>.unaryPlus() {
    list.addAll(this)
  }

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