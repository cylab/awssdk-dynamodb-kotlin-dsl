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
class UpdateGlobalTableSettingsRequestDSL {
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder = UpdateGlobalTableSettingsRequest.builder()
  internal fun build(): UpdateGlobalTableSettingsRequest = builder.build()
    
  /**
    * The name of the global table
    */
  var globalTableName: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.globalTableName(value)
    }


  /**
    * The billing mode of the global table. If GlobalTableBillingMode is not specified, the global
    *  table defaults to PROVISIONED capacity billing mode.
    * 
    *  PROVISIONED - We recommend using PROVISIONED for predictable workloads.
    *  PROVISIONED sets the billing mode to Provisioned Mode.
    * 
    *  PAY_PER_REQUEST - We recommend using PAY_PER_REQUEST for unpredictable workloads.
    *  PAY_PER_REQUEST sets the billing mode to On-Demand Mode.
    */
  var globalTableBillingMode: BillingMode?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.globalTableBillingMode(value)
    }


  /**
    * The maximum number of writes consumed per second before DynamoDB returns a ThrottlingException.
    */
  var globalTableProvisionedWriteCapacityUnits: Long?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.globalTableProvisionedWriteCapacityUnits(value)
    }


  /**
    * Auto scaling settings for managing provisioned write capacity for the global table.
    */
  var globalTableProvisionedWriteCapacityAutoScalingSettingsUpdate: AutoScalingSettingsUpdate?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.globalTableProvisionedWriteCapacityAutoScalingSettingsUpdate(value)
    }


  /**
    * Represents the settings of a global secondary index for a global table that will be modified.
    */
  var globalTableGlobalSecondaryIndexSettingsUpdate: Collection<GlobalTableGlobalSecondaryIndexSettingsUpdate>?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.globalTableGlobalSecondaryIndexSettingsUpdate(value)
    }


  /**
    * Represents the settings for a global table in a Region that will be modified.
    */
  var replicaSettingsUpdate: Collection<ReplicaSettingsUpdate>?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.replicaSettingsUpdate(value)
    }


  /**
    * 
    */
  var overrideConfiguration: AwsRequestOverrideConfiguration?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.overrideConfiguration(value)
    }

    
  /**
    * The billing mode of the global table. If GlobalTableBillingMode is not specified, the global
    *  table defaults to PROVISIONED capacity billing mode.
    * 
    *  PROVISIONED - We recommend using PROVISIONED for predictable workloads.
    *  PROVISIONED sets the billing mode to Provisioned Mode.
    * 
    *  PAY_PER_REQUEST - We recommend using PAY_PER_REQUEST for unpredictable workloads.
    *  PAY_PER_REQUEST sets the billing mode to On-Demand Mode.
    */
  fun globalTableBillingMode(value: String?) {
    builder.globalTableBillingMode(value)
  }

    
  /**
    * Auto scaling settings for managing provisioned write capacity for the global table.
    */
  fun globalTableProvisionedWriteCapacityAutoScalingSettingsUpdate(dslBlock: AutoScalingSettingsUpdateDSL.() -> Unit) {
    builder.globalTableProvisionedWriteCapacityAutoScalingSettingsUpdate(buildAutoScalingSettingsUpdate(dslBlock))
  }


  /**
    * Represents the settings of a global secondary index for a global table that will be modified.
    */
  fun globalTableGlobalSecondaryIndexSettingsUpdate(dslBlock: GlobalTableGlobalSecondaryIndexSettingsUpdateCollectionDSL.() -> Unit) {
    builder.globalTableGlobalSecondaryIndexSettingsUpdate(buildGlobalTableGlobalSecondaryIndexSettingsUpdateCollection(dslBlock))
  }


  /**
    * Represents the settings for a global table in a Region that will be modified.
    */
  fun replicaSettingsUpdate(dslBlock: ReplicaSettingsUpdateCollectionDSL.() -> Unit) {
    builder.replicaSettingsUpdate(buildReplicaSettingsUpdateCollection(dslBlock))
  }

}

/**
  * Builds instances of type UpdateGlobalTableSettingsRequest:
  * 
  */
fun buildUpdateGlobalTableSettingsRequest(dslBlock: UpdateGlobalTableSettingsRequestDSL.() -> Unit) =
  UpdateGlobalTableSettingsRequestDSL().apply(dslBlock).build()