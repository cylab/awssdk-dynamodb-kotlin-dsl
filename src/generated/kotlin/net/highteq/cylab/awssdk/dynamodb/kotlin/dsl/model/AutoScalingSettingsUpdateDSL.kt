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
import software.amazon.awssdk.services.dynamodb.model.AutoScalingPolicyUpdate
import software.amazon.awssdk.services.dynamodb.model.AutoScalingSettingsUpdate

/**
  * Builds instances of type AutoScalingSettingsUpdate:
  * Represents the autoscaling settings to be modified for a global table or global secondary index.
  */
@DynamodbDSL
inline class AutoScalingSettingsUpdateDSL(
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder: AutoScalingSettingsUpdate.Builder
){
  @PublishedApi
  internal fun build(): AutoScalingSettingsUpdate = builder.build()

  /**
    * 
    */
  inline var autoScalingDisabled: Boolean?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.autoScalingDisabled(value)
    }

  /**
    * 
    */
  inline var autoScalingRoleArn: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.autoScalingRoleArn(value)
    }

  /**
    * 
    */
  inline var maximumUnits: Long?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.maximumUnits(value)
    }

  /**
    * 
    */
  inline var minimumUnits: Long?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.minimumUnits(value)
    }

  /**
    * 
    */
  inline var scalingPolicyUpdate: AutoScalingPolicyUpdate?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.scalingPolicyUpdate(value)
    }

  /**
    * 
    */
  inline fun scalingPolicyUpdate(dslBlock: AutoScalingPolicyUpdateDSL.() -> Unit) {
    builder.scalingPolicyUpdate(buildAutoScalingPolicyUpdate(dslBlock))
  }

}

/**
  * Builds instances of type AutoScalingSettingsUpdate:
  * Represents the autoscaling settings to be modified for a global table or global secondary index.
  */
inline fun buildAutoScalingSettingsUpdate(dslBlock: AutoScalingSettingsUpdateDSL.() -> Unit) =
  AutoScalingSettingsUpdateDSL(AutoScalingSettingsUpdate.builder()).apply(dslBlock).build()