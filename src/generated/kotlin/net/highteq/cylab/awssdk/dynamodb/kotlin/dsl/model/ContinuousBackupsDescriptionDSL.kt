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
import software.amazon.awssdk.services.dynamodb.model.ContinuousBackupsDescription
import software.amazon.awssdk.services.dynamodb.model.ContinuousBackupsStatus
import software.amazon.awssdk.services.dynamodb.model.PointInTimeRecoveryDescription

/**
  * Builds instances of type ContinuousBackupsDescription:
  * Represents the continuous backups and point in time recovery settings on the table.
  */
@DynamodbDSLMarker
inline class ContinuousBackupsDescriptionDSL(
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder: ContinuousBackupsDescription.Builder
){
  @PublishedApi
  internal fun build(): ContinuousBackupsDescription = builder.build()

  /**
    * 
    */
  inline var continuousBackupsStatus: ContinuousBackupsStatus?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.continuousBackupsStatus(value)
    }

  /**
    * 
    */
  inline var pointInTimeRecoveryDescription: PointInTimeRecoveryDescription?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.pointInTimeRecoveryDescription(value)
    }

  /**
    * 
    */
  inline fun continuousBackupsStatus(value: String?) {
    builder.continuousBackupsStatus(value)
  }

  /**
    * 
    */
  inline fun pointInTimeRecoveryDescription(dslBlock: PointInTimeRecoveryDescriptionDSL.() -> Unit) {
    builder.pointInTimeRecoveryDescription(DynamodbDSL.Companion.pointInTimeRecoveryDescription(dslBlock))
  }

}

/**
  * Builds instances of type ContinuousBackupsDescription:
  * Represents the continuous backups and point in time recovery settings on the table.
  */
inline fun continuousBackupsDescription(dslBlock: ContinuousBackupsDescriptionDSL.() -> Unit) =
  ContinuousBackupsDescriptionDSL(ContinuousBackupsDescription.builder()).apply(dslBlock).build()

/**
  * Builds instances of type ContinuousBackupsDescription:
  * Represents the continuous backups and point in time recovery settings on the table.
  */
inline fun DynamodbDSL.Companion.continuousBackupsDescription(dslBlock: ContinuousBackupsDescriptionDSL.() -> Unit) =
  ContinuousBackupsDescriptionDSL(ContinuousBackupsDescription.builder()).apply(dslBlock).build()