/*
  This file was generated from https://github.com/aws/aws-sdk-java-v2 by https://github.com/cylab/aws-kotlin-dsl-builder
  Like the original code, this file and project is licensed under
  Apache License Version 2.0
  See LICENSE.txt for more info
*/
package net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.model

import kotlin.DeprecationLevel.HIDDEN
import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSL
import software.amazon.awssdk.services.dynamodb.model.GetShardIteratorResponse

/**
  * Builds instances of type GetShardIteratorResponse:
  * Represents the output of a GetShardIterator operation.
  */
@DynamodbDSL
class GetShardIteratorResponseDSL {
  private val builder = GetShardIteratorResponse.builder()
  internal fun build(): GetShardIteratorResponse = builder.build()
    
  /**
    * The position in the shard from which to start reading stream records sequentially. A shard iterator specifies
    *  this position using the sequence number of a stream record in a shard.
    */
  @get:JvmSynthetic // Hide from Java callers
  var shardIterator: String
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.shardIterator(value)
    }

  
  
}

/**
  * Builds instances of type GetShardIteratorResponse:
  * Represents the output of a GetShardIterator operation.
  */
fun buildGetShardIteratorResponse(dslBlock: GetShardIteratorResponseDSL.() -> Unit) =
  GetShardIteratorResponseDSL().apply(dslBlock).build()