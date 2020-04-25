/*
  This file was generated from https://github.com/aws/aws-sdk-java-v2 by https://github.com/cylab/aws-kotlin-dsl-builder
  Like the original code, this file and project is licensed under
  Apache License Version 2.0
  See LICENSE.txt for more info
*/
package net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.model

import kotlin.DeprecationLevel.HIDDEN
import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSL
import software.amazon.awssdk.services.dynamodb.model.AutoScalingSettingsDescription
import software.amazon.awssdk.services.dynamodb.model.BillingModeSummary
import software.amazon.awssdk.services.dynamodb.model.ReplicaGlobalSecondaryIndexSettingsDescription
import software.amazon.awssdk.services.dynamodb.model.ReplicaSettingsDescription
import software.amazon.awssdk.services.dynamodb.model.ReplicaStatus

/**
  * Builds instances of type ReplicaSettingsDescription:
  * Represents the properties of a replica.
  */
@DynamodbDSL
class ReplicaSettingsDescriptionDSL {
  private val builder = ReplicaSettingsDescription.builder()
  internal fun build(): ReplicaSettingsDescription = builder.build()
    
  /**
    * The maximum number of strongly consistent reads consumed per second before DynamoDB returns a
    *  ThrottlingException. For more information, see Specifying Read and Write Requirements in the Amazon DynamoDB Developer Guide.
    */
  @get:JvmSynthetic // Hide from Java callers
  var replicaProvisionedReadCapacityUnits: Long
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.replicaProvisionedReadCapacityUnits(value)
    }


  /**
    * The current state of the Region:
    * 
    *  CREATING - The Region is being created.
    * 
    *  UPDATING - The Region is being updated.
    * 
    *  DELETING - The Region is being deleted.
    * 
    *  ACTIVE - The Region is ready for use.
    */
  @get:JvmSynthetic // Hide from Java callers
  var replicaStatus: ReplicaStatus
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.replicaStatus(value)
    }


  /**
    * The read/write capacity mode of the replica.
    */
  @get:JvmSynthetic // Hide from Java callers
  var replicaBillingModeSummary: BillingModeSummary
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.replicaBillingModeSummary(value)
    }


  /**
    * Auto scaling settings for a global table replica's read capacity units.
    */
  @get:JvmSynthetic // Hide from Java callers
  var replicaProvisionedReadCapacityAutoScalingSettings: AutoScalingSettingsDescription
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.replicaProvisionedReadCapacityAutoScalingSettings(value)
    }


  /**
    * The maximum number of writes consumed per second before DynamoDB returns a ThrottlingException.
    *  For more information, see Specifying Read and Write Requirements in the Amazon DynamoDB Developer Guide.
    */
  @get:JvmSynthetic // Hide from Java callers
  var replicaProvisionedWriteCapacityUnits: Long
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.replicaProvisionedWriteCapacityUnits(value)
    }


  /**
    * Auto scaling settings for a global table replica's write capacity units.
    */
  @get:JvmSynthetic // Hide from Java callers
  var replicaProvisionedWriteCapacityAutoScalingSettings: AutoScalingSettingsDescription
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.replicaProvisionedWriteCapacityAutoScalingSettings(value)
    }


  /**
    * Replica global secondary index settings for the global table.
    */
  @get:JvmSynthetic // Hide from Java callers
  var replicaGlobalSecondaryIndexSettings: Collection<ReplicaGlobalSecondaryIndexSettingsDescription>
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.replicaGlobalSecondaryIndexSettings(value)
    }


  /**
    * The Region name of the replica.
    */
  @get:JvmSynthetic // Hide from Java callers
  var regionName: String
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.regionName(value)
    }

    
  /**
    * The current state of the Region:
    * 
    *  CREATING - The Region is being created.
    * 
    *  UPDATING - The Region is being updated.
    * 
    *  DELETING - The Region is being deleted.
    * 
    *  ACTIVE - The Region is ready for use.
    */
  fun replicaStatus(value: String) {
    builder.replicaStatus(value)
  }

    
  /**
    * The read/write capacity mode of the replica.
    */
  fun replicaBillingModeSummary(dslBlock: BillingModeSummaryDSL.() -> Unit) {
    builder.replicaBillingModeSummary(buildBillingModeSummary(dslBlock))
  }


  /**
    * Auto scaling settings for a global table replica's read capacity units.
    */
  fun replicaProvisionedReadCapacityAutoScalingSettings(dslBlock: AutoScalingSettingsDescriptionDSL.() -> Unit) {
    builder.replicaProvisionedReadCapacityAutoScalingSettings(buildAutoScalingSettingsDescription(dslBlock))
  }


  /**
    * Auto scaling settings for a global table replica's write capacity units.
    */
  fun replicaProvisionedWriteCapacityAutoScalingSettings(dslBlock: AutoScalingSettingsDescriptionDSL.() -> Unit) {
    builder.replicaProvisionedWriteCapacityAutoScalingSettings(buildAutoScalingSettingsDescription(dslBlock))
  }


  /**
    * Replica global secondary index settings for the global table.
    */
  fun replicaGlobalSecondaryIndexSettings(dslBlock: ReplicaGlobalSecondaryIndexSettingsDescriptionCollectionDSL.() -> Unit) {
    builder.replicaGlobalSecondaryIndexSettings(buildReplicaGlobalSecondaryIndexSettingsDescriptionCollection(dslBlock))
  }

}

/**
  * Builds instances of type ReplicaSettingsDescription:
  * Represents the properties of a replica.
  */
fun buildReplicaSettingsDescription(dslBlock: ReplicaSettingsDescriptionDSL.() -> Unit) =
  ReplicaSettingsDescriptionDSL().apply(dslBlock).build()