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
import software.amazon.awssdk.services.dynamodb.model.RestoreTableToPointInTimeRequest

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