/*
  This file was generated from https://github.com/aws/aws-sdk-java-v2 by https://github.com/cylab/aws-kotlin-dsl-builder
  Like the original code, this file and project is licensed under
  Apache License Version 2.0
  See LICENSE.txt for more info
*/
package net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.model

import kotlin.DeprecationLevel.HIDDEN
import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSL
import software.amazon.awssdk.awscore.AwsRequestOverrideConfiguration
import software.amazon.awssdk.services.dynamodb.model.DescribeLimitsRequest

/**
  * Builds instances of type DescribeLimitsRequest:
  * Represents the input of a DescribeLimits operation. Has no content.
  */
@DynamodbDSL
class DescribeLimitsRequestDSL {
  private val builder = DescribeLimitsRequest.builder()
  internal fun build(): DescribeLimitsRequest = builder.build()
    
  /**
    * 
    */
  @get:JvmSynthetic // Hide from Java callers
  var overrideConfiguration: AwsRequestOverrideConfiguration
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.overrideConfiguration(value)
    }

  
  
}

/**
  * Builds instances of type DescribeLimitsRequest:
  * Represents the input of a DescribeLimits operation. Has no content.
  */
fun buildDescribeLimitsRequest(dslBlock: DescribeLimitsRequestDSL.() -> Unit) =
  DescribeLimitsRequestDSL().apply(dslBlock).build()