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
import software.amazon.awssdk.services.dynamodb.model.GlobalTableGlobalSecondaryIndexSettingsUpdate

/**
  * Builds instances of type GlobalTableGlobalSecondaryIndexSettingsUpdate:
  * Represents the settings of a global secondary index for a global table that will be modified.
  */
@DynamodbDSL
inline class GlobalTableGlobalSecondaryIndexSettingsUpdateDSL(
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder: GlobalTableGlobalSecondaryIndexSettingsUpdate.Builder
){
  @PublishedApi
  internal fun build(): GlobalTableGlobalSecondaryIndexSettingsUpdate = builder.build()

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
  inline var provisionedWriteCapacityAutoScalingSettingsUpdate: AutoScalingSettingsUpdate?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.provisionedWriteCapacityAutoScalingSettingsUpdate(value)
    }

  /**
    * 
    */
  inline var provisionedWriteCapacityUnits: Long?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.provisionedWriteCapacityUnits(value)
    }

  /**
    * 
    */
  inline fun provisionedWriteCapacityAutoScalingSettingsUpdate(dslBlock: AutoScalingSettingsUpdateDSL.() -> Unit) {
    builder.provisionedWriteCapacityAutoScalingSettingsUpdate(buildAutoScalingSettingsUpdate(dslBlock))
  }

}

/**
  * Builds instances of type GlobalTableGlobalSecondaryIndexSettingsUpdate:
  * Represents the settings of a global secondary index for a global table that will be modified.
  */
inline fun buildGlobalTableGlobalSecondaryIndexSettingsUpdate(dslBlock: GlobalTableGlobalSecondaryIndexSettingsUpdateDSL.() -> Unit) =
  GlobalTableGlobalSecondaryIndexSettingsUpdateDSL(GlobalTableGlobalSecondaryIndexSettingsUpdate.builder()).apply(dslBlock).build()