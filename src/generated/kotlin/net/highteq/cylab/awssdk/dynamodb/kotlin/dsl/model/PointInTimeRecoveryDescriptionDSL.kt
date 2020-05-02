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
import software.amazon.awssdk.services.dynamodb.model.PointInTimeRecoveryDescription
import software.amazon.awssdk.services.dynamodb.model.PointInTimeRecoveryStatus

/**
  * Builds instances of type PointInTimeRecoveryDescription:
  * The description of the point in time settings applied to the table.
  */
@DynamodbDSL
inline class PointInTimeRecoveryDescriptionDSL(
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder: PointInTimeRecoveryDescription.Builder
){
  @PublishedApi
  internal fun build(): PointInTimeRecoveryDescription = builder.build()

  /**
    * 
    */
  inline var earliestRestorableDateTime: Instant?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.earliestRestorableDateTime(value)
    }

  /**
    * 
    */
  inline var latestRestorableDateTime: Instant?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.latestRestorableDateTime(value)
    }

  /**
    * 
    */
  inline var pointInTimeRecoveryStatus: PointInTimeRecoveryStatus?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.pointInTimeRecoveryStatus(value)
    }

  /**
    * 
    */
  inline fun pointInTimeRecoveryStatus(value: String?) {
    builder.pointInTimeRecoveryStatus(value)
  }

}

/**
  * Builds instances of type PointInTimeRecoveryDescription:
  * The description of the point in time settings applied to the table.
  */
inline fun buildPointInTimeRecoveryDescription(dslBlock: PointInTimeRecoveryDescriptionDSL.() -> Unit) =
  PointInTimeRecoveryDescriptionDSL(PointInTimeRecoveryDescription.builder()).apply(dslBlock).build()