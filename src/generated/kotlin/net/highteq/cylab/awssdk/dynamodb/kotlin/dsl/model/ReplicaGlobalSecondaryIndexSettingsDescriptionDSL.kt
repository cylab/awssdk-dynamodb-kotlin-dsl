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
import software.amazon.awssdk.services.dynamodb.model.AutoScalingSettingsDescription
import software.amazon.awssdk.services.dynamodb.model.IndexStatus
import software.amazon.awssdk.services.dynamodb.model.ReplicaGlobalSecondaryIndexSettingsDescription

/**
  * Builds instances of type ReplicaGlobalSecondaryIndexSettingsDescription:
  * Represents the properties of a global secondary index.
  */
@DynamodbDSL
inline class ReplicaGlobalSecondaryIndexSettingsDescriptionDSL(
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder: ReplicaGlobalSecondaryIndexSettingsDescription.Builder
){
  @PublishedApi
  internal fun build(): ReplicaGlobalSecondaryIndexSettingsDescription = builder.build()
    
  /**
    * 
    */
  inline var indexName: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.indexName(value)
    }


  /**
    * 
    */
  inline var indexStatus: IndexStatus?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.indexStatus(value)
    }


  /**
    * 
    */
  inline var provisionedReadCapacityAutoScalingSettings: AutoScalingSettingsDescription?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.provisionedReadCapacityAutoScalingSettings(value)
    }


  /**
    * 
    */
  inline var provisionedReadCapacityUnits: Long?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.provisionedReadCapacityUnits(value)
    }


  /**
    * 
    */
  inline var provisionedWriteCapacityAutoScalingSettings: AutoScalingSettingsDescription?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.provisionedWriteCapacityAutoScalingSettings(value)
    }


  /**
    * 
    */
  inline var provisionedWriteCapacityUnits: Long?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.provisionedWriteCapacityUnits(value)
    }

    
  /**
    * 
    */
  inline fun indexStatus(value: String?) {
    builder.indexStatus(value)
  }

  
    
  /**
    * 
    */
  inline fun provisionedReadCapacityAutoScalingSettings(dslBlock: AutoScalingSettingsDescriptionDSL.() -> Unit) {
    builder.provisionedReadCapacityAutoScalingSettings(buildAutoScalingSettingsDescription(dslBlock))
  }


  /**
    * 
    */
  inline fun provisionedWriteCapacityAutoScalingSettings(dslBlock: AutoScalingSettingsDescriptionDSL.() -> Unit) {
    builder.provisionedWriteCapacityAutoScalingSettings(buildAutoScalingSettingsDescription(dslBlock))
  }

}

/**
  * Builds instances of type ReplicaGlobalSecondaryIndexSettingsDescription:
  * Represents the properties of a global secondary index.
  */
inline fun buildReplicaGlobalSecondaryIndexSettingsDescription(dslBlock: ReplicaGlobalSecondaryIndexSettingsDescriptionDSL.() -> Unit) =
  ReplicaGlobalSecondaryIndexSettingsDescriptionDSL(ReplicaGlobalSecondaryIndexSettingsDescription.builder()).apply(dslBlock).build()