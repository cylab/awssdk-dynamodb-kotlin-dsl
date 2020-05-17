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
import software.amazon.awssdk.services.dynamodb.DynamoDbAsyncClient
import software.amazon.awssdk.services.dynamodb.DynamoDbClient
import software.amazon.awssdk.services.dynamodb.model.TimeToLiveSpecification
import software.amazon.awssdk.services.dynamodb.model.UpdateTimeToLiveRequest
import software.amazon.awssdk.services.dynamodb.transform.UpdateTimeToLiveRequestMarshaller

/**
  * Builds instances of type UpdateTimeToLiveRequest:
  * Represents the input of an UpdateTimeToLive operation.
  */
@DynamodbDSLMarker
inline class UpdateTimeToLiveRequestDSL(
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder: UpdateTimeToLiveRequest.Builder
){
  @PublishedApi
  internal fun build(): UpdateTimeToLiveRequest = builder.build()

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
  inline var tableName: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.tableName(value)
    }

  /**
    * 
    */
  inline var timeToLiveSpecification: TimeToLiveSpecification?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.timeToLiveSpecification(value)
    }

  /**
    * 
    */
  inline fun timeToLiveSpecification(dslBlock: TimeToLiveSpecificationDSL.() -> Unit) {
    builder.timeToLiveSpecification(DynamodbDSL.Companion.timeToLiveSpecification(dslBlock))
  }

}

/**
  * Builds instances of type UpdateTimeToLiveRequest:
  * Represents the input of an UpdateTimeToLive operation.
  */
inline fun updateTimeToLiveRequest(dslBlock: UpdateTimeToLiveRequestDSL.() -> Unit) =
  UpdateTimeToLiveRequestDSL(UpdateTimeToLiveRequest.builder()).apply(dslBlock).build()

/**
  * Builds instances of type UpdateTimeToLiveRequest:
  * Represents the input of an UpdateTimeToLive operation.
  */
inline fun DynamodbDSL.Companion.updateTimeToLiveRequest(dslBlock: UpdateTimeToLiveRequestDSL.() -> Unit) =
  UpdateTimeToLiveRequestDSL(UpdateTimeToLiveRequest.builder()).apply(dslBlock).build()

/**
  * The UpdateTimeToLive method will enable or disable TTL for the specified table. A successful
  *  UpdateTimeToLive call returns the current TimeToLiveSpecification; it may take up to
  *  one hour for the change to fully process. Any additional UpdateTimeToLive calls for the same table
  *  during this one hour duration result in a ValidationException.
  * 
  *  TTL compares the current time in epoch time format to the time stored in the TTL attribute of an item. If the
  *  epoch time value stored in the attribute is less than the current time, the item is marked as expired and
  *  subsequently deleted.
  * 
  *  The epoch time format is the number of seconds elapsed since 12:00:00 AM January 1st, 1970 UTC.
  * 
  *  DynamoDB deletes expired items on a best-effort basis to ensure availability of throughput for other data
  *  operations.
  * 
  *  DynamoDB typically deletes expired items within two days of expiration. The exact duration within which an item
  *  gets deleted after expiration is specific to the nature of the workload. Items that have expired and not been
  *  deleted will still show up in reads, queries, and scans.
  * 
  *  As items are deleted, they are removed from any Local Secondary Index and Global Secondary Index immediately in
  *  the same eventually consistent way as a standard delete operation.
  * 
  *  For more information, see Time To Live in the Amazon
  *  DynamoDB Developer Guide.
  */
inline fun DynamoDbAsyncClient.updateTimeToLiveBy(dslBlock: UpdateTimeToLiveRequestDSL.() -> Unit) =
  this.updateTimeToLive(DynamodbDSL.Companion.updateTimeToLiveRequest(dslBlock))

/**
  * The UpdateTimeToLive method will enable or disable TTL for the specified table. A successful
  *  UpdateTimeToLive call returns the current TimeToLiveSpecification; it may take up to
  *  one hour for the change to fully process. Any additional UpdateTimeToLive calls for the same table
  *  during this one hour duration result in a ValidationException.
  * 
  *  TTL compares the current time in epoch time format to the time stored in the TTL attribute of an item. If the
  *  epoch time value stored in the attribute is less than the current time, the item is marked as expired and
  *  subsequently deleted.
  * 
  *  The epoch time format is the number of seconds elapsed since 12:00:00 AM January 1st, 1970 UTC.
  * 
  *  DynamoDB deletes expired items on a best-effort basis to ensure availability of throughput for other data
  *  operations.
  * 
  *  DynamoDB typically deletes expired items within two days of expiration. The exact duration within which an item
  *  gets deleted after expiration is specific to the nature of the workload. Items that have expired and not been
  *  deleted will still show up in reads, queries, and scans.
  * 
  *  As items are deleted, they are removed from any Local Secondary Index and Global Secondary Index immediately in
  *  the same eventually consistent way as a standard delete operation.
  * 
  *  For more information, see Time To Live in the Amazon
  *  DynamoDB Developer Guide.
  */
inline fun DynamoDbClient.updateTimeToLiveBy(dslBlock: UpdateTimeToLiveRequestDSL.() -> Unit) =
  this.updateTimeToLive(DynamodbDSL.Companion.updateTimeToLiveRequest(dslBlock))

/**
  * 
  */
inline fun UpdateTimeToLiveRequestMarshaller.marshallBy(dslBlock: UpdateTimeToLiveRequestDSL.() -> Unit) =
  this.marshall(DynamodbDSL.Companion.updateTimeToLiveRequest(dslBlock))