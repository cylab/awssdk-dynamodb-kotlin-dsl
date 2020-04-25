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
import software.amazon.awssdk.services.dynamodb.model.ProvisionedThroughputExceededException

/**
  * Builds instances of type ProvisionedThroughputExceededException:
  * Your request rate is too high. The AWS SDKs for DynamoDB automatically retry requests that receive this exception.
  *  Your request is eventually successful, unless your retry queue is too large to finish. Reduce the frequency of
  *  requests and use exponential backoff. For more information, go to Error Retries and Exponential Backoff in the Amazon DynamoDB Developer Guide.
  */
@DynamodbDSL
class ProvisionedThroughputExceededExceptionDSL {
  private val builder = ProvisionedThroughputExceededException.builder()
  internal fun build(): ProvisionedThroughputExceededException = builder.build()
    
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
  * Builds instances of type ProvisionedThroughputExceededException:
  * Your request rate is too high. The AWS SDKs for DynamoDB automatically retry requests that receive this exception.
  *  Your request is eventually successful, unless your retry queue is too large to finish. Reduce the frequency of
  *  requests and use exponential backoff. For more information, go to Error Retries and Exponential Backoff in the Amazon DynamoDB Developer Guide.
  */
fun buildProvisionedThroughputExceededException(dslBlock: ProvisionedThroughputExceededExceptionDSL.() -> Unit) =
  ProvisionedThroughputExceededExceptionDSL().apply(dslBlock).build()