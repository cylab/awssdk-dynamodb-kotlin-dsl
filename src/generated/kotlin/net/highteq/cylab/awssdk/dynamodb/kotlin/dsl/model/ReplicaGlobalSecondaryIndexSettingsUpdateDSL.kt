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
import software.amazon.awssdk.services.dynamodb.model.AutoScalingSettingsUpdate
import software.amazon.awssdk.services.dynamodb.model.ReplicaGlobalSecondaryIndexSettingsUpdate

/**
  * Builds instances of type ReplicaGlobalSecondaryIndexSettingsUpdate:
  * Represents the settings of a global secondary index for a global table that will be modified.
  */
@DynamodbDSL
inline class ReplicaGlobalSecondaryIndexSettingsUpdateDSL(
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder: ReplicaGlobalSecondaryIndexSettingsUpdate.Builder
){
  @PublishedApi
  internal fun build(): ReplicaGlobalSecondaryIndexSettingsUpdate = builder.build()

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
  inline var provisionedReadCapacityAutoScalingSettingsUpdate: AutoScalingSettingsUpdate?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.provisionedReadCapacityAutoScalingSettingsUpdate(value)
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
  inline fun provisionedReadCapacityAutoScalingSettingsUpdate(dslBlock: AutoScalingSettingsUpdateDSL.() -> Unit) {
    builder.provisionedReadCapacityAutoScalingSettingsUpdate(buildAutoScalingSettingsUpdate(dslBlock))
  }

}

/**
  * Builds instances of type ReplicaGlobalSecondaryIndexSettingsUpdate:
  * Represents the settings of a global secondary index for a global table that will be modified.
  */
inline fun buildReplicaGlobalSecondaryIndexSettingsUpdate(dslBlock: ReplicaGlobalSecondaryIndexSettingsUpdateDSL.() -> Unit) =
  ReplicaGlobalSecondaryIndexSettingsUpdateDSL(ReplicaGlobalSecondaryIndexSettingsUpdate.builder()).apply(dslBlock).build()