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
import java.time.Instant
import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSL
import software.amazon.awssdk.awscore.AwsRequestOverrideConfiguration
import software.amazon.awssdk.services.dynamodb.DynamoDbAsyncClient
import software.amazon.awssdk.services.dynamodb.DynamoDbClient
import software.amazon.awssdk.services.dynamodb.model.RestoreTableToPointInTimeRequest
import software.amazon.awssdk.services.dynamodb.transform.RestoreTableToPointInTimeRequestMarshaller

/**
  * Builds instances of type RestoreTableToPointInTimeRequest:
  * 
  */
@DynamodbDSL
inline class RestoreTableToPointInTimeRequestDSL(
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder: RestoreTableToPointInTimeRequest.Builder
){
  @PublishedApi
  internal fun build(): RestoreTableToPointInTimeRequest = builder.build()

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
  inline var restoreDateTime: Instant?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.restoreDateTime(value)
    }

  /**
    * 
    */
  inline var sourceTableName: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.sourceTableName(value)
    }

  /**
    * 
    */
  inline var targetTableName: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.targetTableName(value)
    }

  /**
    * 
    */
  inline var useLatestRestorableTime: Boolean?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.useLatestRestorableTime(value)
    }

}

/**
  * Builds instances of type RestoreTableToPointInTimeRequest:
  * 
  */
inline fun buildRestoreTableToPointInTimeRequest(dslBlock: RestoreTableToPointInTimeRequestDSL.() -> Unit) =
  RestoreTableToPointInTimeRequestDSL(RestoreTableToPointInTimeRequest.builder()).apply(dslBlock).build()

/**
  * Restores the specified table to the specified point in time within EarliestRestorableDateTime and
  *  LatestRestorableDateTime. You can restore your table to any point in time during the last 35 days.
  *  Any number of users can execute up to 4 concurrent restores (any type of restore) in a given account.
  * 
  *  When you restore using point in time recovery, DynamoDB restores your table data to the state based on the
  *  selected date and time (day:hour:minute:second) to a new table.
  * 
  *  Along with data, the following are also included on the new restored table using point in time recovery:
  * 
  *  Global secondary indexes (GSIs)
  * 
  *  Local secondary indexes (LSIs)
  * 
  *  Provisioned read and write capacity
  * 
  *  Encryption settings
  * 
  *  All these settings come from the current settings of the source table at the time of restore.
  * 
  *  You must manually set up the following on the restored table:
  * 
  *  Auto scaling policies
  * 
  *  IAM policies
  * 
  *  Cloudwatch metrics and alarms
  * 
  *  Tags
  * 
  *  Stream settings
  * 
  *  Time to Live (TTL) settings
  * 
  *  Point in time recovery settings
  */
inline fun DynamoDbAsyncClient.restoreTableToPointInTimeBy(dslBlock: RestoreTableToPointInTimeRequestDSL.() -> Unit) =
  this.restoreTableToPointInTime(buildRestoreTableToPointInTimeRequest(dslBlock))

/**
  * Restores the specified table to the specified point in time within EarliestRestorableDateTime and
  *  LatestRestorableDateTime. You can restore your table to any point in time during the last 35 days.
  *  Any number of users can execute up to 4 concurrent restores (any type of restore) in a given account.
  * 
  *  When you restore using point in time recovery, DynamoDB restores your table data to the state based on the
  *  selected date and time (day:hour:minute:second) to a new table.
  * 
  *  Along with data, the following are also included on the new restored table using point in time recovery:
  * 
  *  Global secondary indexes (GSIs)
  * 
  *  Local secondary indexes (LSIs)
  * 
  *  Provisioned read and write capacity
  * 
  *  Encryption settings
  * 
  *  All these settings come from the current settings of the source table at the time of restore.
  * 
  *  You must manually set up the following on the restored table:
  * 
  *  Auto scaling policies
  * 
  *  IAM policies
  * 
  *  Cloudwatch metrics and alarms
  * 
  *  Tags
  * 
  *  Stream settings
  * 
  *  Time to Live (TTL) settings
  * 
  *  Point in time recovery settings
  */
inline fun DynamoDbClient.restoreTableToPointInTimeBy(dslBlock: RestoreTableToPointInTimeRequestDSL.() -> Unit) =
  this.restoreTableToPointInTime(buildRestoreTableToPointInTimeRequest(dslBlock))

/**
  * 
  */
inline fun RestoreTableToPointInTimeRequestMarshaller.marshallBy(dslBlock: RestoreTableToPointInTimeRequestDSL.() -> Unit) =
  this.marshall(buildRestoreTableToPointInTimeRequest(dslBlock))