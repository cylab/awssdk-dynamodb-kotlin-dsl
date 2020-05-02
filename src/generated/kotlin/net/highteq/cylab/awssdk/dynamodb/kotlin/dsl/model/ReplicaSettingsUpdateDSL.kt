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
import software.amazon.awssdk.services.dynamodb.model.ReplicaSettingsUpdate

/**
  * Builds instances of type ReplicaSettingsUpdate:
  * Represents the settings for a global table in a region that will be modified.
  */
@DynamodbDSL
inline class ReplicaSettingsUpdateDSL(
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder: ReplicaSettingsUpdate.Builder
){
  @PublishedApi
  internal fun build(): ReplicaSettingsUpdate = builder.build()
    
  /**
    * 
    */
  inline var regionName: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.regionName(value)
    }


  /**
    * 
    */
  inline var replicaGlobalSecondaryIndexSettingsUpdate: Collection<ReplicaGlobalSecondaryIndexSettingsUpdate>?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.replicaGlobalSecondaryIndexSettingsUpdate(value)
    }


  /**
    * 
    */
  inline var replicaProvisionedReadCapacityAutoScalingSettingsUpdate: AutoScalingSettingsUpdate?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.replicaProvisionedReadCapacityAutoScalingSettingsUpdate(value)
    }


  /**
    * 
    */
  inline var replicaProvisionedReadCapacityUnits: Long?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.replicaProvisionedReadCapacityUnits(value)
    }

  
  
    
  /**
    * 
    */
  inline fun replicaGlobalSecondaryIndexSettingsUpdate(dslBlock: ReplicaGlobalSecondaryIndexSettingsUpdateCollectionDSL.() -> Unit) {
    builder.replicaGlobalSecondaryIndexSettingsUpdate(buildReplicaGlobalSecondaryIndexSettingsUpdateCollection(dslBlock))
  }


  /**
    * 
    */
  inline fun replicaProvisionedReadCapacityAutoScalingSettingsUpdate(dslBlock: AutoScalingSettingsUpdateDSL.() -> Unit) {
    builder.replicaProvisionedReadCapacityAutoScalingSettingsUpdate(buildAutoScalingSettingsUpdate(dslBlock))
  }

}

/**
  * Builds instances of type ReplicaSettingsUpdate:
  * Represents the settings for a global table in a region that will be modified.
  */
inline fun buildReplicaSettingsUpdate(dslBlock: ReplicaSettingsUpdateDSL.() -> Unit) =
  ReplicaSettingsUpdateDSL(ReplicaSettingsUpdate.builder()).apply(dslBlock).build()