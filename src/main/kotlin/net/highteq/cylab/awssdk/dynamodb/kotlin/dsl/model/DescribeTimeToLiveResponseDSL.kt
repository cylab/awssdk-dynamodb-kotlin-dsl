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
import software.amazon.awssdk.services.dynamodb.model.DescribeTimeToLiveResponse
import software.amazon.awssdk.services.dynamodb.model.TimeToLiveDescription

/**
  * Builds instances of type DescribeTimeToLiveResponse:
  * 
  */
@DynamodbDSL
class DescribeTimeToLiveResponseDSL {
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  internal val builder = DescribeTimeToLiveResponse.builder()
  internal fun build(): DescribeTimeToLiveResponse = builder.build()
    
  /**
    * 
    */
  var timeToLiveDescription: TimeToLiveDescription
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.timeToLiveDescription(value)
    }


  /**
    * 
    */
  var responseMetadata: AwsResponseMetadata
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.responseMetadata(value)
    }


  /**
    * 
    */
  var sdkHttpResponse: SdkHttpResponse
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.sdkHttpResponse(value)
    }

  
    
  /**
    * 
    */
  fun timeToLiveDescription(dslBlock: TimeToLiveDescriptionDSL.() -> Unit) {
    builder.timeToLiveDescription(buildTimeToLiveDescription(dslBlock))
  }

}

/**
  * Builds instances of type DescribeTimeToLiveResponse:
  * 
  */
fun buildDescribeTimeToLiveResponse(dslBlock: DescribeTimeToLiveResponseDSL.() -> Unit) =
  DescribeTimeToLiveResponseDSL().apply(dslBlock).build()