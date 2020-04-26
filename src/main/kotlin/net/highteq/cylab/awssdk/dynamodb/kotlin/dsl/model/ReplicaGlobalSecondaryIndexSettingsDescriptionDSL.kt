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
import software.amazon.awssdk.services.dynamodb.model.IndexStatus
import software.amazon.awssdk.services.dynamodb.model.ReplicaGlobalSecondaryIndexSettingsDescription

/**
  * Builds instances of type ReplicaGlobalSecondaryIndexSettingsDescription:
  * Represents the properties of a global secondary index.
  */
@DynamodbDSL
class ReplicaGlobalSecondaryIndexSettingsDescriptionDSL {
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder = ReplicaGlobalSecondaryIndexSettingsDescription.builder()
  internal fun build(): ReplicaGlobalSecondaryIndexSettingsDescription = builder.build()
    
  /**
    * The maximum number of strongly consistent reads consumed per second before DynamoDB returns a
    *  ThrottlingException.
    */
  var provisionedReadCapacityUnits: Long
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.provisionedReadCapacityUnits(value)
    }


  /**
    * Auto scaling settings for a global secondary index replica's read capacity units.
    */
  var provisionedReadCapacityAutoScalingSettings: AutoScalingSettingsDescription
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.provisionedReadCapacityAutoScalingSettings(value)
    }


  /**
    * The maximum number of writes consumed per second before DynamoDB returns a ThrottlingException.
    */
  var provisionedWriteCapacityUnits: Long
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.provisionedWriteCapacityUnits(value)
    }


  /**
    * Auto scaling settings for a global secondary index replica's write capacity units.
    */
  var provisionedWriteCapacityAutoScalingSettings: AutoScalingSettingsDescription
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.provisionedWriteCapacityAutoScalingSettings(value)
    }


  /**
    * The name of the global secondary index. The name must be unique among all other indexes on this table.
    */
  var indexName: String
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.indexName(value)
    }


  /**
    * The current status of the global secondary index:
    * 
    *  CREATING - The global secondary index is being created.
    * 
    *  UPDATING - The global secondary index is being updated.
    * 
    *  DELETING - The global secondary index is being deleted.
    * 
    *  ACTIVE - The global secondary index is ready for use.
    */
  var indexStatus: IndexStatus
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.indexStatus(value)
    }

    
  /**
    * The current status of the global secondary index:
    * 
    *  CREATING - The global secondary index is being created.
    * 
    *  UPDATING - The global secondary index is being updated.
    * 
    *  DELETING - The global secondary index is being deleted.
    * 
    *  ACTIVE - The global secondary index is ready for use.
    */
  fun indexStatus(value: String) {
    builder.indexStatus(value)
  }

    
  /**
    * Auto scaling settings for a global secondary index replica's read capacity units.
    */
  fun provisionedReadCapacityAutoScalingSettings(dslBlock: AutoScalingSettingsDescriptionDSL.() -> Unit) {
    builder.provisionedReadCapacityAutoScalingSettings(buildAutoScalingSettingsDescription(dslBlock))
  }


  /**
    * Auto scaling settings for a global secondary index replica's write capacity units.
    */
  fun provisionedWriteCapacityAutoScalingSettings(dslBlock: AutoScalingSettingsDescriptionDSL.() -> Unit) {
    builder.provisionedWriteCapacityAutoScalingSettings(buildAutoScalingSettingsDescription(dslBlock))
  }

}

/**
  * Builds instances of type ReplicaGlobalSecondaryIndexSettingsDescription:
  * Represents the properties of a global secondary index.
  */
fun buildReplicaGlobalSecondaryIndexSettingsDescription(dslBlock: ReplicaGlobalSecondaryIndexSettingsDescriptionDSL.() -> Unit) =
  ReplicaGlobalSecondaryIndexSettingsDescriptionDSL().apply(dslBlock).build()