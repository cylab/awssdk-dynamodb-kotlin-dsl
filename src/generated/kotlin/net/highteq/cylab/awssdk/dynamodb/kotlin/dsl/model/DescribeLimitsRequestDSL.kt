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
import software.amazon.awssdk.awscore.AwsRequestOverrideConfiguration
import software.amazon.awssdk.services.dynamodb.model.DescribeLimitsRequest

/**
  * Builds instances of type DescribeLimitsRequest:
  * Represents the input of a DescribeLimits operation. Has no content.
  */
@DynamodbDSL
inline class DescribeLimitsRequestDSL(
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder: DescribeLimitsRequest.Builder
){
  @PublishedApi
  internal fun build(): DescribeLimitsRequest = builder.build()
    
  /**
    * 
    */
  inline var overrideConfiguration: AwsRequestOverrideConfiguration?
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
inline fun buildDescribeLimitsRequest(dslBlock: DescribeLimitsRequestDSL.() -> Unit) =
  DescribeLimitsRequestDSL(DescribeLimitsRequest.builder()).apply(dslBlock).build()