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
import software.amazon.awssdk.services.dynamodb.model.DescribeGlobalTableSettingsRequest

/**
  * Builds instances of type DescribeGlobalTableSettingsRequest:
  * 
  */
@DynamodbDSL
inline class DescribeGlobalTableSettingsRequestDSL(
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder: DescribeGlobalTableSettingsRequest.Builder
){
  @PublishedApi
  internal fun build(): DescribeGlobalTableSettingsRequest = builder.build()

  /**
    * 
    */
  inline var globalTableName: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.globalTableName(value)
    }

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
  * Builds instances of type DescribeGlobalTableSettingsRequest:
  * 
  */
inline fun buildDescribeGlobalTableSettingsRequest(dslBlock: DescribeGlobalTableSettingsRequestDSL.() -> Unit) =
  DescribeGlobalTableSettingsRequestDSL(DescribeGlobalTableSettingsRequest.builder()).apply(dslBlock).build()