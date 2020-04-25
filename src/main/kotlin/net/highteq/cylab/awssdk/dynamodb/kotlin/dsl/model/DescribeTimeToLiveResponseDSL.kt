/*
  This file was generated from https://github.com/aws/aws-sdk-java-v2 by https://github.com/cylab/aws-kotlin-dsl-builder
  Like the original code, this file and project is licensed under
  Apache License Version 2.0
  See LICENSE.txt for more info
*/
package net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.model

import kotlin.DeprecationLevel.HIDDEN
import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSL
import software.amazon.awssdk.services.dynamodb.model.DescribeTimeToLiveResponse
import software.amazon.awssdk.services.dynamodb.model.TimeToLiveDescription

/**
  * Builds instances of type DescribeTimeToLiveResponse:
  * 
  */
@DynamodbDSL
class DescribeTimeToLiveResponseDSL {
  private val builder = DescribeTimeToLiveResponse.builder()
  internal fun build(): DescribeTimeToLiveResponse = builder.build()
    
  /**
    * 
    */
  @get:JvmSynthetic // Hide from Java callers
  var timeToLiveDescription: TimeToLiveDescription
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.timeToLiveDescription(value)
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