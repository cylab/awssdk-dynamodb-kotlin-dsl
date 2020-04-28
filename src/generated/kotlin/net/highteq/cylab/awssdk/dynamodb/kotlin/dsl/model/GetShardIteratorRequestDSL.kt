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
import software.amazon.awssdk.awscore.AwsRequestOverrideConfiguration
import software.amazon.awssdk.services.dynamodb.model.GetShardIteratorRequest
import software.amazon.awssdk.services.dynamodb.model.ShardIteratorType

/**
  * Builds instances of type GetShardIteratorRequest:
  * Represents the input of a GetShardIterator operation.
  */
@DynamodbDSL
class GetShardIteratorRequestDSL {
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder = GetShardIteratorRequest.builder()
  internal fun build(): GetShardIteratorRequest = builder.build()
    
  /**
    * 
    */
  var overrideConfiguration: AwsRequestOverrideConfiguration?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.overrideConfiguration(value)
    }


  /**
    * The sequence number of a stream record in the shard from which to start reading.
    */
  var sequenceNumber: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.sequenceNumber(value)
    }


  /**
    * The identifier of the shard. The iterator will be returned for this shard ID.
    */
  var shardId: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.shardId(value)
    }


  /**
    * Determines how the shard iterator is used to start reading stream records from the shard:
    * 
    *  AT_SEQUENCE_NUMBER - Start reading exactly from the position denoted by a specific sequence
    *  number.
    * 
    *  AFTER_SEQUENCE_NUMBER - Start reading right after the position denoted by a specific sequence
    *  number.
    * 
    *  TRIM_HORIZON - Start reading at the last (untrimmed) stream record, which is the oldest record
    *  in the shard. In DynamoDB Streams, there is a 24 hour limit on data retention. Stream records whose age
    *  exceeds this limit are subject to removal (trimming) from the stream.
    * 
    *  LATEST - Start reading just after the most recent stream record in the shard, so that you always
    *  read the most recent data in the shard.
    */
  var shardIteratorType: ShardIteratorType?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.shardIteratorType(value)
    }


  /**
    * The Amazon Resource Name (ARN) for the stream.
    */
  var streamArn: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.streamArn(value)
    }

    
  /**
    * Determines how the shard iterator is used to start reading stream records from the shard:
    * 
    *  AT_SEQUENCE_NUMBER - Start reading exactly from the position denoted by a specific sequence
    *  number.
    * 
    *  AFTER_SEQUENCE_NUMBER - Start reading right after the position denoted by a specific sequence
    *  number.
    * 
    *  TRIM_HORIZON - Start reading at the last (untrimmed) stream record, which is the oldest record
    *  in the shard. In DynamoDB Streams, there is a 24 hour limit on data retention. Stream records whose age
    *  exceeds this limit are subject to removal (trimming) from the stream.
    * 
    *  LATEST - Start reading just after the most recent stream record in the shard, so that you always
    *  read the most recent data in the shard.
    */
  fun shardIteratorType(value: String?) {
    builder.shardIteratorType(value)
  }

  
}

/**
  * Builds instances of type GetShardIteratorRequest:
  * Represents the input of a GetShardIterator operation.
  */
fun buildGetShardIteratorRequest(dslBlock: GetShardIteratorRequestDSL.() -> Unit) =
  GetShardIteratorRequestDSL().apply(dslBlock).build()