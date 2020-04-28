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
import software.amazon.awssdk.services.dynamodb.model.DescribeGlobalTableSettingsResponse
import software.amazon.awssdk.services.dynamodb.model.ReplicaSettingsDescription

/**
  * Builds instances of type DescribeGlobalTableSettingsResponse:
  * 
  */
@DynamodbDSL
class DescribeGlobalTableSettingsResponseDSL {
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder = DescribeGlobalTableSettingsResponse.builder()
  internal fun build(): DescribeGlobalTableSettingsResponse = builder.build()
    
  /**
    * The name of the global table.
    */
  var globalTableName: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.globalTableName(value)
    }


  /**
    * The Region-specific settings for the global table.
    */
  var replicaSettings: Collection<ReplicaSettingsDescription>?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.replicaSettings(value)
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

  
    
  /**
    * The Region-specific settings for the global table.
    */
  fun replicaSettings(dslBlock: ReplicaSettingsDescriptionCollectionDSL.() -> Unit) {
    builder.replicaSettings(buildReplicaSettingsDescriptionCollection(dslBlock))
  }

}

/**
  * Builds instances of type DescribeGlobalTableSettingsResponse:
  * 
  */
fun buildDescribeGlobalTableSettingsResponse(dslBlock: DescribeGlobalTableSettingsResponseDSL.() -> Unit) =
  DescribeGlobalTableSettingsResponseDSL().apply(dslBlock).build()