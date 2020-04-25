/*
  This file was generated from https://github.com/aws/aws-sdk-java-v2 by https://github.com/cylab/aws-kotlin-dsl-builder
  Like the original code, this file and project is licensed under
  Apache License Version 2.0
  See LICENSE.txt for more info
*/
package net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.model

import kotlin.DeprecationLevel.HIDDEN
import java.time.Instant
import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSL
import software.amazon.awssdk.services.dynamodb.model.RestoreSummary

/**
  * Builds instances of type RestoreSummary:
  * Contains details for the restore.
  */
@DynamodbDSL
class RestoreSummaryDSL {
  private val builder = RestoreSummary.builder()
  internal fun build(): RestoreSummary = builder.build()
    
  /**
    * The ARN of the source table of the backup that is being restored.
    */
  @get:JvmSynthetic // Hide from Java callers
  var sourceTableArn: String
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.sourceTableArn(value)
    }


  /**
    * Indicates if a restore is in progress or not.
    */
  @get:JvmSynthetic // Hide from Java callers
  var restoreInProgress: Boolean
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.restoreInProgress(value)
    }


  /**
    * The Amazon Resource Name (ARN) of the backup from which the table was restored.
    */
  @get:JvmSynthetic // Hide from Java callers
  var sourceBackupArn: String
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.sourceBackupArn(value)
    }


  /**
    * Point in time or source backup time.
    */
  @get:JvmSynthetic // Hide from Java callers
  var restoreDateTime: Instant
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.restoreDateTime(value)
    }

  
  
}

/**
  * Builds instances of type RestoreSummary:
  * Contains details for the restore.
  */
fun buildRestoreSummary(dslBlock: RestoreSummaryDSL.() -> Unit) =
  RestoreSummaryDSL().apply(dslBlock).build()