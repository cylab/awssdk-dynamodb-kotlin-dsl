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
import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSL
import software.amazon.awssdk.awscore.AwsResponseMetadata
import software.amazon.awssdk.http.SdkHttpResponse
import software.amazon.awssdk.services.dynamodb.model.DescribeLimitsResponse

/**
  * Builds instances of type DescribeLimitsResponse:
  * Represents the output of a DescribeLimits operation.
  */
@DynamodbDSL
inline class DescribeLimitsResponseDSL(
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder: DescribeLimitsResponse.Builder
){
  @PublishedApi
  internal fun build(): DescribeLimitsResponse = builder.build()

  /**
    * 
    */
  inline var accountMaxReadCapacityUnits: Long?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.accountMaxReadCapacityUnits(value)
    }

  /**
    * 
    */
  inline var accountMaxWriteCapacityUnits: Long?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.accountMaxWriteCapacityUnits(value)
    }

  /**
    * 
    */
  inline var responseMetadata: AwsResponseMetadata?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.responseMetadata(value)
    }

  /**
    * 
    */
  inline var sdkHttpResponse: SdkHttpResponse?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.sdkHttpResponse(value)
    }

  /**
    * 
    */
  inline var tableMaxReadCapacityUnits: Long?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.tableMaxReadCapacityUnits(value)
    }

  /**
    * 
    */
  inline var tableMaxWriteCapacityUnits: Long?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.tableMaxWriteCapacityUnits(value)
    }

}

/**
  * Builds instances of type DescribeLimitsResponse:
  * Represents the output of a DescribeLimits operation.
  */
inline fun buildDescribeLimitsResponse(dslBlock: DescribeLimitsResponseDSL.() -> Unit) =
  DescribeLimitsResponseDSL(DescribeLimitsResponse.builder()).apply(dslBlock).build()