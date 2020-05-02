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
import software.amazon.awssdk.services.dynamodb.model.DescribeGlobalTableSettingsResponse
import software.amazon.awssdk.services.dynamodb.model.ReplicaSettingsDescription

/**
  * Builds instances of type DescribeGlobalTableSettingsResponse:
  * 
  */
@DynamodbDSL
inline class DescribeGlobalTableSettingsResponseDSL(
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder: DescribeGlobalTableSettingsResponse.Builder
){
  @PublishedApi
  internal fun build(): DescribeGlobalTableSettingsResponse = builder.build()

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
  inline var replicaSettings: Collection<ReplicaSettingsDescription>?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.replicaSettings(value)
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
  inline fun replicaSettings(dslBlock: ReplicaSettingsDescriptionCollectionDSL.() -> Unit) {
    builder.replicaSettings(buildReplicaSettingsDescriptionCollection(dslBlock))
  }

}

/**
  * Builds instances of type DescribeGlobalTableSettingsResponse:
  * 
  */
inline fun buildDescribeGlobalTableSettingsResponse(dslBlock: DescribeGlobalTableSettingsResponseDSL.() -> Unit) =
  DescribeGlobalTableSettingsResponseDSL(DescribeGlobalTableSettingsResponse.builder()).apply(dslBlock).build()