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
import java.time.Duration
import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSL
import software.amazon.awssdk.awscore.exception.AwsErrorDetails
import software.amazon.awssdk.services.dynamodb.model.LimitExceededException

/**
  * Builds instances of type LimitExceededException:
  * There is no limit to the number of daily on-demand backups that can be taken.
  * 
  *  Up to 50 simultaneous table operations are allowed per account. These operations include CreateTable,
  *  UpdateTable, DeleteTable,UpdateTimeToLive, RestoreTableFromBackup
  *  , and RestoreTableToPointInTime.
  * 
  *  The only exception is when you are creating a table with one or more secondary indexes. You can have up to 25 such
  *  requests running at a time; however, if the table or index specifications are complex, DynamoDB might temporarily
  *  reduce the number of concurrent operations.
  * 
  *  There is a soft account limit of 256 tables.
  */
@DynamodbDSL
inline class LimitExceededExceptionDSL(
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder: LimitExceededException.Builder
){
  @PublishedApi
  internal fun build(): LimitExceededException = builder.build()

  /**
    * 
    */
  inline var awsErrorDetails: AwsErrorDetails?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.awsErrorDetails(value)
    }

  /**
    * 
    */
  inline var cause: Throwable?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.cause(value)
    }

  /**
    * 
    */
  inline var clockSkew: Duration?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.clockSkew(value)
    }

  /**
    * 
    */
  inline var message: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.message(value)
    }

  /**
    * 
    */
  inline var requestId: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.requestId(value)
    }

  /**
    * 
    */
  inline var statusCode: Int
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.statusCode(value)
    }

}

/**
  * Builds instances of type LimitExceededException:
  * There is no limit to the number of daily on-demand backups that can be taken.
  * 
  *  Up to 50 simultaneous table operations are allowed per account. These operations include CreateTable,
  *  UpdateTable, DeleteTable,UpdateTimeToLive, RestoreTableFromBackup
  *  , and RestoreTableToPointInTime.
  * 
  *  The only exception is when you are creating a table with one or more secondary indexes. You can have up to 25 such
  *  requests running at a time; however, if the table or index specifications are complex, DynamoDB might temporarily
  *  reduce the number of concurrent operations.
  * 
  *  There is a soft account limit of 256 tables.
  */
inline fun buildLimitExceededException(dslBlock: LimitExceededExceptionDSL.() -> Unit) =
  LimitExceededExceptionDSL(LimitExceededException.builder()).apply(dslBlock).build()