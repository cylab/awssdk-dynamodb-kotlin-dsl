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
import software.amazon.awssdk.services.dynamodb.DynamoDbAsyncClient
import software.amazon.awssdk.services.dynamodb.DynamoDbClient
import software.amazon.awssdk.services.dynamodb.model.DescribeContinuousBackupsRequest
import software.amazon.awssdk.services.dynamodb.transform.DescribeContinuousBackupsRequestMarshaller

/**
  * Builds instances of type DescribeContinuousBackupsRequest:
  * 
  */
@DynamodbDSL
inline class DescribeContinuousBackupsRequestDSL(
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder: DescribeContinuousBackupsRequest.Builder
){
  @PublishedApi
  internal fun build(): DescribeContinuousBackupsRequest = builder.build()

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

}

/**
  * Builds instances of type DescribeContinuousBackupsRequest:
  * 
  */
inline fun buildDescribeContinuousBackupsRequest(dslBlock: DescribeContinuousBackupsRequestDSL.() -> Unit) =
  DescribeContinuousBackupsRequestDSL(DescribeContinuousBackupsRequest.builder()).apply(dslBlock).build()

/**
  * 
  */
inline fun DescribeContinuousBackupsRequestMarshaller.marshallBy(dslBlock: DescribeContinuousBackupsRequestDSL.() -> Unit) =
  this.marshall(buildDescribeContinuousBackupsRequest(dslBlock))

/**
  * Checks the status of continuous backups and point in time recovery on the specified table. Continuous backups are
  *  ENABLED on all tables at table creation. If point in time recovery is enabled,
  *  PointInTimeRecoveryStatus will be set to ENABLED.
  * 
  *  Once continuous backups and point in time recovery are enabled, you can restore to any point in time within
  *  EarliestRestorableDateTime and LatestRestorableDateTime.
  * 
  *  LatestRestorableDateTime is typically 5 minutes before the current time. You can restore your table
  *  to any point in time during the last 35 days.
  * 
  *  You can call DescribeContinuousBackups at a maximum rate of 10 times per second.
  */
inline fun DynamoDbAsyncClient.describeContinuousBackupsBy(dslBlock: DescribeContinuousBackupsRequestDSL.() -> Unit) =
  this.describeContinuousBackups(buildDescribeContinuousBackupsRequest(dslBlock))

/**
  * Checks the status of continuous backups and point in time recovery on the specified table. Continuous backups are
  *  ENABLED on all tables at table creation. If point in time recovery is enabled,
  *  PointInTimeRecoveryStatus will be set to ENABLED.
  * 
  *  Once continuous backups and point in time recovery are enabled, you can restore to any point in time within
  *  EarliestRestorableDateTime and LatestRestorableDateTime.
  * 
  *  LatestRestorableDateTime is typically 5 minutes before the current time. You can restore your table
  *  to any point in time during the last 35 days.
  * 
  *  You can call DescribeContinuousBackups at a maximum rate of 10 times per second.
  */
inline fun DynamoDbClient.describeContinuousBackupsBy(dslBlock: DescribeContinuousBackupsRequestDSL.() -> Unit) =
  this.describeContinuousBackups(buildDescribeContinuousBackupsRequest(dslBlock))