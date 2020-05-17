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
import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSLMarker
import software.amazon.awssdk.services.dynamodb.model.AutoScalingSettingsDescription
import software.amazon.awssdk.services.dynamodb.model.BillingModeSummary
import software.amazon.awssdk.services.dynamodb.model.ReplicaGlobalSecondaryIndexSettingsDescription
import software.amazon.awssdk.services.dynamodb.model.ReplicaSettingsDescription
import software.amazon.awssdk.services.dynamodb.model.ReplicaStatus

/**
  * Builds instances of type ReplicaSettingsDescription:
  * Represents the properties of a replica.
  */
@DynamodbDSLMarker
inline class ReplicaSettingsDescriptionDSL(
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder: ReplicaSettingsDescription.Builder
){
  @PublishedApi
  internal fun build(): ReplicaSettingsDescription = builder.build()

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
  inline var replicaBillingModeSummary: BillingModeSummary?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.replicaBillingModeSummary(value)
    }

  /**
    * 
    */
  inline var replicaGlobalSecondaryIndexSettings: Collection<ReplicaGlobalSecondaryIndexSettingsDescription>?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.replicaGlobalSecondaryIndexSettings(value)
    }

  /**
    * 
    */
  inline var replicaProvisionedReadCapacityAutoScalingSettings: AutoScalingSettingsDescription?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.replicaProvisionedReadCapacityAutoScalingSettings(value)
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
  inline var replicaProvisionedWriteCapacityAutoScalingSettings: AutoScalingSettingsDescription?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.replicaProvisionedWriteCapacityAutoScalingSettings(value)
    }

  /**
    * 
    */
  inline var replicaProvisionedWriteCapacityUnits: Long?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.replicaProvisionedWriteCapacityUnits(value)
    }

  /**
    * 
    */
  inline var replicaStatus: ReplicaStatus?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.replicaStatus(value)
    }

  /**
    * 
    */
  inline fun replicaStatus(value: String?) {
    builder.replicaStatus(value)
  }

  /**
    * 
    */
  inline fun replicaBillingModeSummary(dslBlock: BillingModeSummaryDSL.() -> Unit) {
    builder.replicaBillingModeSummary(DynamodbDSL.Companion.billingModeSummary(dslBlock))
  }

  /**
    * 
    */
  inline fun replicaGlobalSecondaryIndexSettings(dslBlock: ReplicaGlobalSecondaryIndexSettingsDescriptionCollectionDSL.() -> Unit) {
    builder.replicaGlobalSecondaryIndexSettings(DynamodbDSL.Companion.replicaGlobalSecondaryIndexSettingsDescriptionCollection(dslBlock))
  }

  /**
    * 
    */
  inline fun replicaProvisionedReadCapacityAutoScalingSettings(dslBlock: AutoScalingSettingsDescriptionDSL.() -> Unit) {
    builder.replicaProvisionedReadCapacityAutoScalingSettings(DynamodbDSL.Companion.autoScalingSettingsDescription(dslBlock))
  }

  /**
    * 
    */
  inline fun replicaProvisionedWriteCapacityAutoScalingSettings(dslBlock: AutoScalingSettingsDescriptionDSL.() -> Unit) {
    builder.replicaProvisionedWriteCapacityAutoScalingSettings(DynamodbDSL.Companion.autoScalingSettingsDescription(dslBlock))
  }

}

/**
  * Builds instances of type ReplicaSettingsDescription:
  * Represents the properties of a replica.
  */
inline fun replicaSettingsDescription(dslBlock: ReplicaSettingsDescriptionDSL.() -> Unit) =
  ReplicaSettingsDescriptionDSL(ReplicaSettingsDescription.builder()).apply(dslBlock).build()

/**
  * Builds instances of type ReplicaSettingsDescription:
  * Represents the properties of a replica.
  */
inline fun DynamodbDSL.Companion.replicaSettingsDescription(dslBlock: ReplicaSettingsDescriptionDSL.() -> Unit) =
  ReplicaSettingsDescriptionDSL(ReplicaSettingsDescription.builder()).apply(dslBlock).build()