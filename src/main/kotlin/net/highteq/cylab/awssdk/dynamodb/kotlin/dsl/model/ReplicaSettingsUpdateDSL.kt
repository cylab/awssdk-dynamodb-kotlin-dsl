/*
  This file was generated from https://github.com/aws/aws-sdk-java-v2 by https://github.com/cylab/aws-kotlin-dsl-builder
  Like the original code, this file and project is licensed under
  Apache License Version 2.0
  See LICENSE.txt for more info
*/
package net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.model

import kotlin.DeprecationLevel.HIDDEN
import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSL
import software.amazon.awssdk.services.dynamodb.model.AutoScalingSettingsUpdate
import software.amazon.awssdk.services.dynamodb.model.ReplicaGlobalSecondaryIndexSettingsUpdate
import software.amazon.awssdk.services.dynamodb.model.ReplicaSettingsUpdate

/**
  * Builds instances of type ReplicaSettingsUpdate:
  * Represents the settings for a global table in a Region that will be modified.
  */
@DynamodbDSL
class ReplicaSettingsUpdateDSL {
  private val builder = ReplicaSettingsUpdate.builder()
  internal fun build(): ReplicaSettingsUpdate = builder.build()
    
  /**
    * Auto scaling settings for managing a global table replica's read capacity units.
    */
  @get:JvmSynthetic // Hide from Java callers
  var replicaProvisionedReadCapacityAutoScalingSettingsUpdate: AutoScalingSettingsUpdate
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.replicaProvisionedReadCapacityAutoScalingSettingsUpdate(value)
    }


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
    * Represents the settings of a global secondary index for a global table that will be modified.
    */
  @get:JvmSynthetic // Hide from Java callers
  var replicaGlobalSecondaryIndexSettingsUpdate: Collection<ReplicaGlobalSecondaryIndexSettingsUpdate>
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.replicaGlobalSecondaryIndexSettingsUpdate(value)
    }


  /**
    * The Region of the replica to be added.
    */
  @get:JvmSynthetic // Hide from Java callers
  var regionName: String
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.regionName(value)
    }

  
    
  /**
    * Auto scaling settings for managing a global table replica's read capacity units.
    */
  fun replicaProvisionedReadCapacityAutoScalingSettingsUpdate(dslBlock: AutoScalingSettingsUpdateDSL.() -> Unit) {
    builder.replicaProvisionedReadCapacityAutoScalingSettingsUpdate(buildAutoScalingSettingsUpdate(dslBlock))
  }


  /**
    * Represents the settings of a global secondary index for a global table that will be modified.
    */
  fun replicaGlobalSecondaryIndexSettingsUpdate(dslBlock: ReplicaGlobalSecondaryIndexSettingsUpdateCollectionDSL.() -> Unit) {
    builder.replicaGlobalSecondaryIndexSettingsUpdate(buildReplicaGlobalSecondaryIndexSettingsUpdateCollection(dslBlock))
  }

}

/**
  * Builds instances of type ReplicaSettingsUpdate:
  * Represents the settings for a global table in a Region that will be modified.
  */
fun buildReplicaSettingsUpdate(dslBlock: ReplicaSettingsUpdateDSL.() -> Unit) =
  ReplicaSettingsUpdateDSL().apply(dslBlock).build()