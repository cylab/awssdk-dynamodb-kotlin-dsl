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
import software.amazon.awssdk.awscore.AwsRequestOverrideConfiguration
import software.amazon.awssdk.services.dynamodb.model.RestoreTableToPointInTimeRequest

/**
  * Builds instances of type RestoreTableToPointInTimeRequest:
  * 
  */
@DynamodbDSL
class RestoreTableToPointInTimeRequestDSL {
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder = RestoreTableToPointInTimeRequest.builder()
  internal fun build(): RestoreTableToPointInTimeRequest = builder.build()
    
  /**
    * 
    */
  var overrideConfiguration: AwsRequestOverrideConfiguration
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.overrideConfiguration(value)
    }


  /**
    * Name of the source table that is being restored.
    */
  var sourceTableName: String
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.sourceTableName(value)
    }


  /**
    * The name of the new table to which it must be restored to.
    */
  var targetTableName: String
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.targetTableName(value)
    }


  /**
    * Restore the table to the latest possible time. LatestRestorableDateTime is typically 5 minutes
    *  before the current time.
    */
  var useLatestRestorableTime: Boolean
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.useLatestRestorableTime(value)
    }


  /**
    * Time in the past to restore the table to.
    */
  var restoreDateTime: Instant
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.restoreDateTime(value)
    }

  
  
}

/**
  * Builds instances of type RestoreTableToPointInTimeRequest:
  * 
  */
fun buildRestoreTableToPointInTimeRequest(dslBlock: RestoreTableToPointInTimeRequestDSL.() -> Unit) =
  RestoreTableToPointInTimeRequestDSL().apply(dslBlock).build()