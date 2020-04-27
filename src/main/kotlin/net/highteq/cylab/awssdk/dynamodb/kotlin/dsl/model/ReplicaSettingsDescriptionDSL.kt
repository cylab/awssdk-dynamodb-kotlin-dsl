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
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder = ReplicaSettingsDescription.builder()
  internal fun build(): ReplicaSettingsDescription = builder.build()
    
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
  var replicaStatus: ReplicaStatus?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.replicaStatus(value)
    }


  /**
    * The read/write capacity mode of the replica.
    */
  var replicaBillingModeSummary: BillingModeSummary?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.replicaBillingModeSummary(value)
    }


  /**
    * Auto scaling settings for a global table replica's read capacity units.
    */
  var replicaProvisionedReadCapacityAutoScalingSettings: AutoScalingSettingsDescription?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.replicaProvisionedReadCapacityAutoScalingSettings(value)
    }


  /**
    * The maximum number of writes consumed per second before DynamoDB returns a ThrottlingException.
    *  For more information, see Specifying Read and Write Requirements in the Amazon DynamoDB Developer Guide.
    */
  var replicaProvisionedWriteCapacityUnits: Long?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.replicaProvisionedWriteCapacityUnits(value)
    }


  /**
    * Auto scaling settings for a global table replica's write capacity units.
    */
  var replicaProvisionedWriteCapacityAutoScalingSettings: AutoScalingSettingsDescription?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.replicaProvisionedWriteCapacityAutoScalingSettings(value)
    }


  /**
    * Replica global secondary index settings for the global table.
    */
  var replicaGlobalSecondaryIndexSettings: Collection<ReplicaGlobalSecondaryIndexSettingsDescription>?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.replicaGlobalSecondaryIndexSettings(value)
    }


  /**
    * The maximum number of strongly consistent reads consumed per second before DynamoDB returns a
    *  ThrottlingException. For more information, see Specifying Read and Write Requirements in the Amazon DynamoDB Developer Guide.
    */
  var replicaProvisionedReadCapacityUnits: Long?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.replicaProvisionedReadCapacityUnits(value)
    }


  /**
    * The Region name of the replica.
    */
  var regionName: String?
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
  fun replicaStatus(value: String?) {
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