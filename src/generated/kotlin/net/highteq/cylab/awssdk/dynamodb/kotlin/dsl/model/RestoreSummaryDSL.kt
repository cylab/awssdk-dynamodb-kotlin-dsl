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
import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSLMarker
import software.amazon.awssdk.services.dynamodb.model.RestoreSummary

/**
  * Builds instances of type RestoreSummary:
  * Contains details for the restore.
  */
@DynamodbDSLMarker
inline class RestoreSummaryDSL(
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder: RestoreSummary.Builder
){
  @PublishedApi
  internal fun build(): RestoreSummary = builder.build()

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
  inline var restoreInProgress: Boolean?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.restoreInProgress(value)
    }

  /**
    * 
    */
  inline var sourceBackupArn: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.sourceBackupArn(value)
    }

  /**
    * 
    */
  inline var sourceTableArn: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.sourceTableArn(value)
    }

}

/**
  * Builds instances of type RestoreSummary:
  * Contains details for the restore.
  */
inline fun restoreSummary(dslBlock: RestoreSummaryDSL.() -> Unit) =
  RestoreSummaryDSL(RestoreSummary.builder()).apply(dslBlock).build()

/**
  * Builds instances of type RestoreSummary:
  * Contains details for the restore.
  */
inline fun DynamodbDSL.Companion.restoreSummary(dslBlock: RestoreSummaryDSL.() -> Unit) =
  RestoreSummaryDSL(RestoreSummary.builder()).apply(dslBlock).build()