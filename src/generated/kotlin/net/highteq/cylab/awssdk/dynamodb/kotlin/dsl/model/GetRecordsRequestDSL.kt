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
import software.amazon.awssdk.awscore.AwsRequestOverrideConfiguration
import software.amazon.awssdk.services.dynamodb.model.GetRecordsRequest
import software.amazon.awssdk.services.dynamodb.streams.DynamoDbStreamsAsyncClient
import software.amazon.awssdk.services.dynamodb.streams.DynamoDbStreamsClient
import software.amazon.awssdk.services.dynamodb.streams.transform.GetRecordsRequestMarshaller

/**
  * Builds instances of type GetRecordsRequest:
  * Represents the input of a GetRecords operation.
  */
@DynamodbDSL
inline class GetRecordsRequestDSL(
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder: GetRecordsRequest.Builder
){
  @PublishedApi
  internal fun build(): GetRecordsRequest = builder.build()

  /**
    * 
    */
  inline var limit: Int?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.limit(value)
    }

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
  inline var shardIterator: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.shardIterator(value)
    }

}

/**
  * Builds instances of type GetRecordsRequest:
  * Represents the input of a GetRecords operation.
  */
inline fun buildGetRecordsRequest(dslBlock: GetRecordsRequestDSL.() -> Unit) =
  GetRecordsRequestDSL(GetRecordsRequest.builder()).apply(dslBlock).build()

/**
  * Retrieves the stream records from a given shard.
  * 
  *  Specify a shard iterator using the ShardIterator parameter. The shard iterator specifies the
  *  position in the shard from which you want to start reading stream records sequentially. If there are no stream
  *  records available in the portion of the shard that the iterator points to, GetRecords returns an
  *  empty list. Note that it might take multiple calls to get to a portion of the shard that contains stream records.
  * 
  *  GetRecords can retrieve a maximum of 1 MB of data or 1000 stream records, whichever comes first.
  */
inline fun DynamoDbStreamsAsyncClient.getRecordsBy(dslBlock: GetRecordsRequestDSL.() -> Unit) =
  this.getRecords(buildGetRecordsRequest(dslBlock))

/**
  * Retrieves the stream records from a given shard.
  * 
  *  Specify a shard iterator using the ShardIterator parameter. The shard iterator specifies the
  *  position in the shard from which you want to start reading stream records sequentially. If there are no stream
  *  records available in the portion of the shard that the iterator points to, GetRecords returns an
  *  empty list. Note that it might take multiple calls to get to a portion of the shard that contains stream records.
  * 
  *  GetRecords can retrieve a maximum of 1 MB of data or 1000 stream records, whichever comes first.
  */
inline fun DynamoDbStreamsClient.getRecordsBy(dslBlock: GetRecordsRequestDSL.() -> Unit) =
  this.getRecords(buildGetRecordsRequest(dslBlock))

/**
  * 
  */
inline fun GetRecordsRequestMarshaller.marshallBy(dslBlock: GetRecordsRequestDSL.() -> Unit) =
  this.marshall(buildGetRecordsRequest(dslBlock))