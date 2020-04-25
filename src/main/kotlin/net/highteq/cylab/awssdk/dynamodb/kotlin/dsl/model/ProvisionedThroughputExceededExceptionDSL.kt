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
import java.time.Duration
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
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  internal val builder = ProvisionedThroughputExceededException.builder()
  internal fun build(): ProvisionedThroughputExceededException = builder.build()
    
  /**
    * 
    */
  var cause: Throwable
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.cause(value)
    }


  /**
    * 
    */
  var message: String
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.message(value)
    }


  /**
    * 
    */
  var awsErrorDetails: AwsErrorDetails
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.awsErrorDetails(value)
    }


  /**
    * 
    */
  var requestId: String
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.requestId(value)
    }


  /**
    * 
    */
  var statusCode: Int
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.statusCode(value)
    }


  /**
    * 
    */
  var clockSkew: Duration
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.clockSkew(value)
    }

    
  /**
    * 
    */
  fun cause(value: Throwable) {
    builder.cause(value)
  }


  /**
    * 
    */
  fun message(value: String) {
    builder.message(value)
  }


  /**
    * 
    */
  fun requestId(value: String) {
    builder.requestId(value)
  }


  /**
    * 
    */
  fun statusCode(value: Int) {
    builder.statusCode(value)
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