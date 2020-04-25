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
import software.amazon.awssdk.services.dynamodb.model.DescribeEndpointsRequest

/**
  * Builds instances of type DescribeEndpointsRequest:
  * 
  */
@DynamodbDSL
class DescribeEndpointsRequestDSL {
  private val builder = DescribeEndpointsRequest.builder()
  internal fun build(): DescribeEndpointsRequest = builder.build()
    
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
  * Builds instances of type DescribeEndpointsRequest:
  * 
  */
fun buildDescribeEndpointsRequest(dslBlock: DescribeEndpointsRequestDSL.() -> Unit) =
  DescribeEndpointsRequestDSL().apply(dslBlock).build()