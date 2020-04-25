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
import software.amazon.awssdk.services.dynamodb.model.DescribeGlobalTableSettingsRequest

/**
  * Builds instances of type DescribeGlobalTableSettingsRequest:
  * 
  */
@DynamodbDSL
class DescribeGlobalTableSettingsRequestDSL {
  private val builder = DescribeGlobalTableSettingsRequest.builder()
  internal fun build(): DescribeGlobalTableSettingsRequest = builder.build()
    
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


  /**
    * The name of the global table to describe.
    */
  @get:JvmSynthetic // Hide from Java callers
  var globalTableName: String
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.globalTableName(value)
    }

  
  
}

/**
  * Builds instances of type DescribeGlobalTableSettingsRequest:
  * 
  */
fun buildDescribeGlobalTableSettingsRequest(dslBlock: DescribeGlobalTableSettingsRequestDSL.() -> Unit) =
  DescribeGlobalTableSettingsRequestDSL().apply(dslBlock).build()