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
import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSL
import software.amazon.awssdk.awscore.AwsResponseMetadata
import software.amazon.awssdk.http.SdkHttpResponse
import software.amazon.awssdk.services.dynamodb.model.DescribeLimitsResponse

/**
  * Builds instances of type DescribeLimitsResponse:
  * Represents the output of a DescribeLimits operation.
  */
@DynamodbDSL
class DescribeLimitsResponseDSL {
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder = DescribeLimitsResponse.builder()
  internal fun build(): DescribeLimitsResponse = builder.build()
    
  /**
    * The maximum total read capacity units that your account allows you to provision across all of your tables in
    *  this Region.
    */
  var accountMaxReadCapacityUnits: Long?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.accountMaxReadCapacityUnits(value)
    }


  /**
    * The maximum total write capacity units that your account allows you to provision across all of your tables in
    *  this Region.
    */
  var accountMaxWriteCapacityUnits: Long?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.accountMaxWriteCapacityUnits(value)
    }


  /**
    * The maximum read capacity units that your account allows you to provision for a new table that you are
    *  creating in this Region, including the read capacity units provisioned for its global secondary indexes
    *  (GSIs).
    */
  var tableMaxReadCapacityUnits: Long?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.tableMaxReadCapacityUnits(value)
    }


  /**
    * The maximum write capacity units that your account allows you to provision for a new table that you are
    *  creating in this Region, including the write capacity units provisioned for its global secondary indexes
    *  (GSIs).
    */
  var tableMaxWriteCapacityUnits: Long?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.tableMaxWriteCapacityUnits(value)
    }


  /**
    * 
    */
  var responseMetadata: AwsResponseMetadata?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.responseMetadata(value)
    }


  /**
    * 
    */
  var sdkHttpResponse: SdkHttpResponse?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.sdkHttpResponse(value)
    }

  
  
}

/**
  * Builds instances of type DescribeLimitsResponse:
  * Represents the output of a DescribeLimits operation.
  */
fun buildDescribeLimitsResponse(dslBlock: DescribeLimitsResponseDSL.() -> Unit) =
  DescribeLimitsResponseDSL().apply(dslBlock).build()