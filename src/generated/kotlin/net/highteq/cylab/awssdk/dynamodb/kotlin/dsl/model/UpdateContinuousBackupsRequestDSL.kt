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
import software.amazon.awssdk.services.dynamodb.model.PointInTimeRecoverySpecification
import software.amazon.awssdk.services.dynamodb.model.UpdateContinuousBackupsRequest
import software.amazon.awssdk.services.dynamodb.transform.UpdateContinuousBackupsRequestMarshaller

/**
  * Builds instances of type UpdateContinuousBackupsRequest:
  * 
  */
@DynamodbDSLMarker
inline class UpdateContinuousBackupsRequestDSL(
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder: UpdateContinuousBackupsRequest.Builder
){
  @PublishedApi
  internal fun build(): UpdateContinuousBackupsRequest = builder.build()

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
  inline var pointInTimeRecoverySpecification: PointInTimeRecoverySpecification?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.pointInTimeRecoverySpecification(value)
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
  inline fun pointInTimeRecoverySpecification(dslBlock: PointInTimeRecoverySpecificationDSL.() -> Unit) {
    builder.pointInTimeRecoverySpecification(DynamodbDSL.Companion.pointInTimeRecoverySpecification(dslBlock))
  }

}

/**
  * Builds instances of type UpdateContinuousBackupsRequest:
  * 
  */
inline fun updateContinuousBackupsRequest(dslBlock: UpdateContinuousBackupsRequestDSL.() -> Unit) =
  UpdateContinuousBackupsRequestDSL(UpdateContinuousBackupsRequest.builder()).apply(dslBlock).build()

/**
  * Builds instances of type UpdateContinuousBackupsRequest:
  * 
  */
inline fun DynamodbDSL.Companion.updateContinuousBackupsRequest(dslBlock: UpdateContinuousBackupsRequestDSL.() -> Unit) =
  UpdateContinuousBackupsRequestDSL(UpdateContinuousBackupsRequest.builder()).apply(dslBlock).build()

/**
  * UpdateContinuousBackups enables or disables point in time recovery for the specified table. A
  *  successful UpdateContinuousBackups call returns the current
  *  ContinuousBackupsDescription. Continuous backups are ENABLED on all tables at table
  *  creation. If point in time recovery is enabled, PointInTimeRecoveryStatus will be set to ENABLED.
  * 
  *  Once continuous backups and point in time recovery are enabled, you can restore to any point in time within
  *  EarliestRestorableDateTime and LatestRestorableDateTime.
  * 
  *  LatestRestorableDateTime is typically 5 minutes before the current time. You can restore your table
  *  to any point in time during the last 35 days..
  */
inline fun DynamoDbAsyncClient.updateContinuousBackupsBy(dslBlock: UpdateContinuousBackupsRequestDSL.() -> Unit) =
  this.updateContinuousBackups(DynamodbDSL.Companion.updateContinuousBackupsRequest(dslBlock))

/**
  * UpdateContinuousBackups enables or disables point in time recovery for the specified table. A
  *  successful UpdateContinuousBackups call returns the current
  *  ContinuousBackupsDescription. Continuous backups are ENABLED on all tables at table
  *  creation. If point in time recovery is enabled, PointInTimeRecoveryStatus will be set to ENABLED.
  * 
  *  Once continuous backups and point in time recovery are enabled, you can restore to any point in time within
  *  EarliestRestorableDateTime and LatestRestorableDateTime.
  * 
  *  LatestRestorableDateTime is typically 5 minutes before the current time. You can restore your table
  *  to any point in time during the last 35 days..
  */
inline fun DynamoDbClient.updateContinuousBackupsBy(dslBlock: UpdateContinuousBackupsRequestDSL.() -> Unit) =
  this.updateContinuousBackups(DynamodbDSL.Companion.updateContinuousBackupsRequest(dslBlock))

/**
  * 
  */
inline fun UpdateContinuousBackupsRequestMarshaller.marshallBy(dslBlock: UpdateContinuousBackupsRequestDSL.() -> Unit) =
  this.marshall(DynamodbDSL.Companion.updateContinuousBackupsRequest(dslBlock))