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
import software.amazon.awssdk.services.dynamodb.model.ContinuousBackupsDescription
import software.amazon.awssdk.services.dynamodb.model.ContinuousBackupsStatus
import software.amazon.awssdk.services.dynamodb.model.PointInTimeRecoveryDescription

/**
  * Builds instances of type ContinuousBackupsDescription:
  * Represents the continuous backups and point in time recovery settings on the table.
  */
@DynamodbDSL
class ContinuousBackupsDescriptionDSL {
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder = ContinuousBackupsDescription.builder()
  internal fun build(): ContinuousBackupsDescription = builder.build()
    
  /**
    * ContinuousBackupsStatus can be one of the following states: ENABLED, DISABLED
    */
  var continuousBackupsStatus: ContinuousBackupsStatus?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.continuousBackupsStatus(value)
    }


  /**
    * The description of the point in time recovery settings applied to the table.
    */
  var pointInTimeRecoveryDescription: PointInTimeRecoveryDescription?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.pointInTimeRecoveryDescription(value)
    }

    
  /**
    * ContinuousBackupsStatus can be one of the following states: ENABLED, DISABLED
    */
  fun continuousBackupsStatus(value: String?) {
    builder.continuousBackupsStatus(value)
  }

    
  /**
    * The description of the point in time recovery settings applied to the table.
    */
  fun pointInTimeRecoveryDescription(dslBlock: PointInTimeRecoveryDescriptionDSL.() -> Unit) {
    builder.pointInTimeRecoveryDescription(buildPointInTimeRecoveryDescription(dslBlock))
  }

}

/**
  * Builds instances of type ContinuousBackupsDescription:
  * Represents the continuous backups and point in time recovery settings on the table.
  */
fun buildContinuousBackupsDescription(dslBlock: ContinuousBackupsDescriptionDSL.() -> Unit) =
  ContinuousBackupsDescriptionDSL().apply(dslBlock).build()