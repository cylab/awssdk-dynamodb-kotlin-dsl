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
import software.amazon.awssdk.awscore.AwsRequestOverrideConfiguration
import software.amazon.awssdk.services.dynamodb.model.GetShardIteratorRequest
import software.amazon.awssdk.services.dynamodb.model.ShardIteratorType
import software.amazon.awssdk.services.dynamodb.streams.DynamoDbStreamsAsyncClient
import software.amazon.awssdk.services.dynamodb.streams.DynamoDbStreamsClient
import software.amazon.awssdk.services.dynamodb.streams.transform.GetShardIteratorRequestMarshaller

/**
  * Builds instances of type GetShardIteratorRequest:
  * Represents the input of a GetShardIterator operation.
  */
@DynamodbDSLMarker
inline class GetShardIteratorRequestDSL(
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder: GetShardIteratorRequest.Builder
){
  @PublishedApi
  internal fun build(): GetShardIteratorRequest = builder.build()

  /**
    * 
    */
  inline var overrideConfiguration: AwsRequestOverrideConfiguration?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.overrideConfiguration(value)
    }

  /**
    * 
    */
  inline var sequenceNumber: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.sequenceNumber(value)
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
  inline var shardIteratorType: ShardIteratorType?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.shardIteratorType(value)
    }

  /**
    * 
    */
  inline var streamArn: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.streamArn(value)
    }

  /**
    * 
    */
  inline fun shardIteratorType(value: String?) {
    builder.shardIteratorType(value)
  }

}

/**
  * Builds instances of type GetShardIteratorRequest:
  * Represents the input of a GetShardIterator operation.
  */
inline fun getShardIteratorRequest(dslBlock: GetShardIteratorRequestDSL.() -> Unit) =
  GetShardIteratorRequestDSL(GetShardIteratorRequest.builder()).apply(dslBlock).build()

/**
  * Builds instances of type GetShardIteratorRequest:
  * Represents the input of a GetShardIterator operation.
  */
inline fun DynamodbDSL.Companion.getShardIteratorRequest(dslBlock: GetShardIteratorRequestDSL.() -> Unit) =
  GetShardIteratorRequestDSL(GetShardIteratorRequest.builder()).apply(dslBlock).build()

/**
  * Returns a shard iterator. A shard iterator provides information about how to retrieve the stream records from
  *  within a shard. Use the shard iterator in a subsequent GetRecords request to read the stream records
  *  from the shard.
  * 
  *  A shard iterator expires 15 minutes after it is returned to the requester.
  */
inline fun DynamoDbStreamsAsyncClient.getShardIteratorBy(dslBlock: GetShardIteratorRequestDSL.() -> Unit) =
  this.getShardIterator(DynamodbDSL.Companion.getShardIteratorRequest(dslBlock))

/**
  * Returns a shard iterator. A shard iterator provides information about how to retrieve the stream records from
  *  within a shard. Use the shard iterator in a subsequent GetRecords request to read the stream records
  *  from the shard.
  * 
  *  A shard iterator expires 15 minutes after it is returned to the requester.
  */
inline fun DynamoDbStreamsClient.getShardIteratorBy(dslBlock: GetShardIteratorRequestDSL.() -> Unit) =
  this.getShardIterator(DynamodbDSL.Companion.getShardIteratorRequest(dslBlock))

/**
  * 
  */
inline fun GetShardIteratorRequestMarshaller.marshallBy(dslBlock: GetShardIteratorRequestDSL.() -> Unit) =
  this.marshall(DynamodbDSL.Companion.getShardIteratorRequest(dslBlock))