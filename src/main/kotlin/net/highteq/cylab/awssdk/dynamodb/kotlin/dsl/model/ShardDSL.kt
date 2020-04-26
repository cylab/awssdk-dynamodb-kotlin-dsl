/*
  This file was generated from https://github.com/aws/aws-sdk-java-v2 by https://github.com/cylab/aws-kotlin-dsl-builder
  Like the original code, this file and project is licensed under
  Apache License Version 2.0
  See LICENSE.txt for more info
*/
@file:Suppress("DEPRECATION")
package net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.model

import kotlin.DeprecationLevel.HIDDEN
import kotlin.DeprecationLevel.WARNING
import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSL
import software.amazon.awssdk.services.dynamodb.model.SequenceNumberRange
import software.amazon.awssdk.services.dynamodb.model.Shard

/**
  * Builds instances of type Shard:
  * A uniquely identified group of stream records within a stream.
  */
@DynamodbDSL
class ShardDSL {
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder = Shard.builder()
  internal fun build(): Shard = builder.build()
    
  /**
    * The system-generated identifier for this shard.
    */
  var shardId: String
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.shardId(value)
    }


  /**
    * The shard ID of the current shard's parent.
    */
  var parentShardId: String
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.parentShardId(value)
    }


  /**
    * The range of possible sequence numbers for the shard.
    */
  var sequenceNumberRange: SequenceNumberRange
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.sequenceNumberRange(value)
    }

  
    
  /**
    * The range of possible sequence numbers for the shard.
    */
  fun sequenceNumberRange(dslBlock: SequenceNumberRangeDSL.() -> Unit) {
    builder.sequenceNumberRange(buildSequenceNumberRange(dslBlock))
  }

}

/**
  * Builds instances of type Shard:
  * A uniquely identified group of stream records within a stream.
  */
fun buildShard(dslBlock: ShardDSL.() -> Unit) =
  ShardDSL().apply(dslBlock).build()