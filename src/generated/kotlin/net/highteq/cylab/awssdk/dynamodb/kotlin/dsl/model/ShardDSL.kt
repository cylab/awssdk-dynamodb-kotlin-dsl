/*
  This file was generated from https://github.com/aws/aws-sdk-java-v2 by https://github.com/cylab/aws-kotlin-dsl-builder
  Like the original code, this file and project is licensed under
  Apache License Version 2.0
  See LICENSE.txt for more info
*/
@file:Suppress("DEPRECATION", "NOTHING_TO_INLINE")
package net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.model

import kotlin.DeprecationLevel.HIDDEN
import kotlin.DeprecationLevel.WARNING
import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSL
import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSLMarker
import software.amazon.awssdk.services.dynamodb.model.SequenceNumberRange
import software.amazon.awssdk.services.dynamodb.model.Shard

/**
  * Builds instances of type Shard:
  * A uniquely identified group of stream records within a stream.
  */
@DynamodbDSLMarker
inline class ShardDSL(
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder: Shard.Builder
){
  @PublishedApi
  internal fun build(): Shard = builder.build()

  /**
    * 
    */
  inline var parentShardId: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.parentShardId(value)
    }

  /**
    * 
    */
  inline var sequenceNumberRange: SequenceNumberRange?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.sequenceNumberRange(value)
    }

  /**
    * 
    */
  inline var shardId: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.shardId(value)
    }

  /**
    * 
    */
  inline fun sequenceNumberRange(dslBlock: SequenceNumberRangeDSL.() -> Unit) {
    builder.sequenceNumberRange(DynamodbDSL.Companion.sequenceNumberRange(dslBlock))
  }

}

/**
  * Builds instances of type Shard:
  * A uniquely identified group of stream records within a stream.
  */
inline fun shard(dslBlock: ShardDSL.() -> Unit) =
  ShardDSL(Shard.builder()).apply(dslBlock).build()

/**
  * Builds instances of type Shard:
  * A uniquely identified group of stream records within a stream.
  */
inline fun DynamodbDSL.Companion.shard(dslBlock: ShardDSL.() -> Unit) =
  ShardDSL(Shard.builder()).apply(dslBlock).build()