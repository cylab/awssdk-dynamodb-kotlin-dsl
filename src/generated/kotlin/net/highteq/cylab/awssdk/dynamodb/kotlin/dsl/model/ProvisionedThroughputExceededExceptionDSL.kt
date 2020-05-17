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
import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSLMarker
import software.amazon.awssdk.awscore.exception.AwsErrorDetails
import software.amazon.awssdk.services.dynamodb.model.ProvisionedThroughputExceededException

/**
  * Builds instances of type ProvisionedThroughputExceededException:
  * Your request rate is too high. The AWS SDKs for DynamoDB automatically retry requests that receive this exception.
  *  Your request is eventually successful, unless your retry queue is too large to finish. Reduce the frequency of
  *  requests and use exponential backoff. For more information, go to Error Retries and Exponential Backoff in the Amazon DynamoDB Developer Guide.
  */
@DynamodbDSLMarker
inline class ProvisionedThroughputExceededExceptionDSL(
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder: ProvisionedThroughputExceededException.Builder
){
  @PublishedApi
  internal fun build(): ProvisionedThroughputExceededException = builder.build()

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
  * Builds instances of type ProvisionedThroughputExceededException:
  * Your request rate is too high. The AWS SDKs for DynamoDB automatically retry requests that receive this exception.
  *  Your request is eventually successful, unless your retry queue is too large to finish. Reduce the frequency of
  *  requests and use exponential backoff. For more information, go to Error Retries and Exponential Backoff in the Amazon DynamoDB Developer Guide.
  */
inline fun provisionedThroughputExceededException(dslBlock: ProvisionedThroughputExceededExceptionDSL.() -> Unit) =
  ProvisionedThroughputExceededExceptionDSL(ProvisionedThroughputExceededException.builder()).apply(dslBlock).build()

/**
  * Builds instances of type ProvisionedThroughputExceededException:
  * Your request rate is too high. The AWS SDKs for DynamoDB automatically retry requests that receive this exception.
  *  Your request is eventually successful, unless your retry queue is too large to finish. Reduce the frequency of
  *  requests and use exponential backoff. For more information, go to Error Retries and Exponential Backoff in the Amazon DynamoDB Developer Guide.
  */
inline fun DynamodbDSL.Companion.provisionedThroughputExceededException(dslBlock: ProvisionedThroughputExceededExceptionDSL.() -> Unit) =
  ProvisionedThroughputExceededExceptionDSL(ProvisionedThroughputExceededException.builder()).apply(dslBlock).build()