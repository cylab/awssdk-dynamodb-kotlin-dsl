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
import software.amazon.awssdk.services.dynamodb.model.GlobalTableGlobalSecondaryIndexSettingsUpdate

/**
  * Builds instances of type GlobalTableGlobalSecondaryIndexSettingsUpdate:
  * Represents the settings of a global secondary index for a global table that will be modified.
  */
@DynamodbDSL
class GlobalTableGlobalSecondaryIndexSettingsUpdateDSL {
  private val builder = GlobalTableGlobalSecondaryIndexSettingsUpdate.builder()
  internal fun build(): GlobalTableGlobalSecondaryIndexSettingsUpdate = builder.build()
    
  /**
    * Auto scaling settings for managing a global secondary index's write capacity units.
    */
  @get:JvmSynthetic // Hide from Java callers
  var provisionedWriteCapacityAutoScalingSettingsUpdate: AutoScalingSettingsUpdate
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.provisionedWriteCapacityAutoScalingSettingsUpdate(value)
    }


  /**
    * The maximum number of writes consumed per second before DynamoDB returns a ThrottlingException.
    */
  @get:JvmSynthetic // Hide from Java callers
  var provisionedWriteCapacityUnits: Long
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.provisionedWriteCapacityUnits(value)
    }


  /**
    * The name of the global secondary index. The name must be unique among all other indexes on this table.
    */
  @get:JvmSynthetic // Hide from Java callers
  var indexName: String
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.indexName(value)
    }

  
    
  /**
    * Auto scaling settings for managing a global secondary index's write capacity units.
    */
  fun provisionedWriteCapacityAutoScalingSettingsUpdate(dslBlock: AutoScalingSettingsUpdateDSL.() -> Unit) {
    builder.provisionedWriteCapacityAutoScalingSettingsUpdate(buildAutoScalingSettingsUpdate(dslBlock))
  }

}

/**
  * Builds instances of type GlobalTableGlobalSecondaryIndexSettingsUpdate:
  * Represents the settings of a global secondary index for a global table that will be modified.
  */
fun buildGlobalTableGlobalSecondaryIndexSettingsUpdate(dslBlock: GlobalTableGlobalSecondaryIndexSettingsUpdateDSL.() -> Unit) =
  GlobalTableGlobalSecondaryIndexSettingsUpdateDSL().apply(dslBlock).build()