/*
  This file was generated from https://github.com/aws/aws-sdk-java-v2 by https://github.com/cylab/aws-kotlin-dsl-builder
  Like the original code, this file and project is licensed under
  Apache License Version 2.0
  See LICENSE.txt for more info
*/
package net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.model

import kotlin.DeprecationLevel.HIDDEN
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
class LimitExceededExceptionDSL {
  private val builder = LimitExceededException.builder()
  internal fun build(): LimitExceededException = builder.build()
    
  /**
    * 
    */
  @get:JvmSynthetic // Hide from Java callers
  var awsErrorDetails: AwsErrorDetails
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.awsErrorDetails(value)
    }


  /**
    * 
    */
  @get:JvmSynthetic // Hide from Java callers
  var requestId: String
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.requestId(value)
    }


  /**
    * 
    */
  @get:JvmSynthetic // Hide from Java callers
  var statusCode: Int
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.statusCode(value)
    }


  /**
    * 
    */
  @get:JvmSynthetic // Hide from Java callers
  var cause: Throwable
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.cause(value)
    }


  /**
    * 
    */
  @get:JvmSynthetic // Hide from Java callers
  var message: String
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.message(value)
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
fun buildLimitExceededException(dslBlock: LimitExceededExceptionDSL.() -> Unit) =
  LimitExceededExceptionDSL().apply(dslBlock).build()