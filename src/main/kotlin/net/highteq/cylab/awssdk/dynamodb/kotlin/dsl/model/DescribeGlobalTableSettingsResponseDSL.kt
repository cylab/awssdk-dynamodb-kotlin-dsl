/*
  This file was generated from https://github.com/aws/aws-sdk-java-v2 by https://github.com/cylab/aws-kotlin-dsl-builder
  Like the original code, this file and project is licensed under
  Apache License Version 2.0
  See LICENSE.txt for more info
*/
package net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.model

import kotlin.DeprecationLevel.HIDDEN
import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSL
import software.amazon.awssdk.services.dynamodb.model.DescribeGlobalTableSettingsResponse
import software.amazon.awssdk.services.dynamodb.model.ReplicaSettingsDescription

/**
  * Builds instances of type DescribeGlobalTableSettingsResponse:
  * 
  */
@DynamodbDSL
class DescribeGlobalTableSettingsResponseDSL {
  private val builder = DescribeGlobalTableSettingsResponse.builder()
  internal fun build(): DescribeGlobalTableSettingsResponse = builder.build()
    
  /**
    * The name of the global table.
    */
  @get:JvmSynthetic // Hide from Java callers
  var globalTableName: String
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.globalTableName(value)
    }


  /**
    * The Region-specific settings for the global table.
    */
  @get:JvmSynthetic // Hide from Java callers
  var replicaSettings: Collection<ReplicaSettingsDescription>
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.replicaSettings(value)
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