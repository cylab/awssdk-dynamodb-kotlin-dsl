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
import java.time.Instant
import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSL
import software.amazon.awssdk.services.dynamodb.model.PointInTimeRecoveryDescription
import software.amazon.awssdk.services.dynamodb.model.PointInTimeRecoveryStatus

/**
  * Builds instances of type PointInTimeRecoveryDescription:
  * The description of the point in time settings applied to the table.
  */
@DynamodbDSL
class PointInTimeRecoveryDescriptionDSL {
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder = PointInTimeRecoveryDescription.builder()
  internal fun build(): PointInTimeRecoveryDescription = builder.build()
    
  /**
    * LatestRestorableDateTime is typically 5 minutes before the current time.
    */
  var latestRestorableDateTime: Instant?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.latestRestorableDateTime(value)
    }


  /**
    * The current state of point in time recovery:
    * 
    *  ENABLING - Point in time recovery is being enabled.
    * 
    *  ENABLED - Point in time recovery is enabled.
    * 
    *  DISABLED - Point in time recovery is disabled.
    */
  var pointInTimeRecoveryStatus: PointInTimeRecoveryStatus?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.pointInTimeRecoveryStatus(value)
    }


  /**
    * Specifies the earliest point in time you can restore your table to. You can restore your table to any point
    *  in time during the last 35 days.
    */
  var earliestRestorableDateTime: Instant?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.earliestRestorableDateTime(value)
    }

    
  /**
    * The current state of point in time recovery:
    * 
    *  ENABLING - Point in time recovery is being enabled.
    * 
    *  ENABLED - Point in time recovery is enabled.
    * 
    *  DISABLED - Point in time recovery is disabled.
    */
  fun pointInTimeRecoveryStatus(value: String?) {
    builder.pointInTimeRecoveryStatus(value)
  }

  
}

/**
  * Builds instances of type PointInTimeRecoveryDescription:
  * The description of the point in time settings applied to the table.
  */
fun buildPointInTimeRecoveryDescription(dslBlock: PointInTimeRecoveryDescriptionDSL.() -> Unit) =
  PointInTimeRecoveryDescriptionDSL().apply(dslBlock).build()