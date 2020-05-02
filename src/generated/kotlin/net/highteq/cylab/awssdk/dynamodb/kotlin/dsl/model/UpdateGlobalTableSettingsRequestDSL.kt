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
import software.amazon.awssdk.services.dynamodb.model.AutoScalingSettingsUpdate
import software.amazon.awssdk.services.dynamodb.model.BillingMode
import software.amazon.awssdk.services.dynamodb.model.GlobalTableGlobalSecondaryIndexSettingsUpdate
import software.amazon.awssdk.services.dynamodb.model.ReplicaSettingsUpdate
import software.amazon.awssdk.services.dynamodb.model.UpdateGlobalTableSettingsRequest

/**
  * Builds instances of type UpdateGlobalTableSettingsRequest:
  * 
  */
@DynamodbDSL
inline class UpdateGlobalTableSettingsRequestDSL(
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder: UpdateGlobalTableSettingsRequest.Builder
){
  @PublishedApi
  internal fun build(): UpdateGlobalTableSettingsRequest = builder.build()

  /**
    * 
    */
  inline var globalTableBillingMode: BillingMode?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.globalTableBillingMode(value)
    }

  /**
    * 
    */
  inline var globalTableGlobalSecondaryIndexSettingsUpdate: Collection<GlobalTableGlobalSecondaryIndexSettingsUpdate>?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.globalTableGlobalSecondaryIndexSettingsUpdate(value)
    }

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
  inline var globalTableProvisionedWriteCapacityAutoScalingSettingsUpdate: AutoScalingSettingsUpdate?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.globalTableProvisionedWriteCapacityAutoScalingSettingsUpdate(value)
    }

  /**
    * 
    */
  inline var globalTableProvisionedWriteCapacityUnits: Long?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.globalTableProvisionedWriteCapacityUnits(value)
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

  /**
    * 
    */
  inline var replicaSettingsUpdate: Collection<ReplicaSettingsUpdate>?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.replicaSettingsUpdate(value)
    }

  /**
    * 
    */
  inline fun globalTableBillingMode(value: String?) {
    builder.globalTableBillingMode(value)
  }

  /**
    * 
    */
  inline fun globalTableGlobalSecondaryIndexSettingsUpdate(dslBlock: GlobalTableGlobalSecondaryIndexSettingsUpdateCollectionDSL.() -> Unit) {
    builder.globalTableGlobalSecondaryIndexSettingsUpdate(buildGlobalTableGlobalSecondaryIndexSettingsUpdateCollection(dslBlock))
  }

  /**
    * 
    */
  inline fun globalTableProvisionedWriteCapacityAutoScalingSettingsUpdate(dslBlock: AutoScalingSettingsUpdateDSL.() -> Unit) {
    builder.globalTableProvisionedWriteCapacityAutoScalingSettingsUpdate(buildAutoScalingSettingsUpdate(dslBlock))
  }

  /**
    * 
    */
  inline fun replicaSettingsUpdate(dslBlock: ReplicaSettingsUpdateCollectionDSL.() -> Unit) {
    builder.replicaSettingsUpdate(buildReplicaSettingsUpdateCollection(dslBlock))
  }

}

/**
  * Builds instances of type UpdateGlobalTableSettingsRequest:
  * 
  */
inline fun buildUpdateGlobalTableSettingsRequest(dslBlock: UpdateGlobalTableSettingsRequestDSL.() -> Unit) =
  UpdateGlobalTableSettingsRequestDSL(UpdateGlobalTableSettingsRequest.builder()).apply(dslBlock).build()