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
import software.amazon.awssdk.services.dynamodb.model.AutoScalingTargetTrackingScalingPolicyConfigurationUpdate

/**
  * Builds instances of type AutoScalingTargetTrackingScalingPolicyConfigurationUpdate:
  * Represents the settings of a target tracking scaling policy that will be modified.
  */
@DynamodbDSLMarker
inline class AutoScalingTargetTrackingScalingPolicyConfigurationUpdateDSL(
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder: AutoScalingTargetTrackingScalingPolicyConfigurationUpdate.Builder
){
  @PublishedApi
  internal fun build(): AutoScalingTargetTrackingScalingPolicyConfigurationUpdate = builder.build()

  /**
    * 
    */
  inline var disableScaleIn: Boolean?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.disableScaleIn(value)
    }

  /**
    * 
    */
  inline var scaleInCooldown: Int?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.scaleInCooldown(value)
    }

  /**
    * 
    */
  inline var scaleOutCooldown: Int?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.scaleOutCooldown(value)
    }

  /**
    * 
    */
  inline var targetValue: Double?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.targetValue(value)
    }

}

/**
  * Builds instances of type AutoScalingTargetTrackingScalingPolicyConfigurationUpdate:
  * Represents the settings of a target tracking scaling policy that will be modified.
  */
inline fun autoScalingTargetTrackingScalingPolicyConfigurationUpdate(dslBlock: AutoScalingTargetTrackingScalingPolicyConfigurationUpdateDSL.() -> Unit) =
  AutoScalingTargetTrackingScalingPolicyConfigurationUpdateDSL(AutoScalingTargetTrackingScalingPolicyConfigurationUpdate.builder()).apply(dslBlock).build()

/**
  * Builds instances of type AutoScalingTargetTrackingScalingPolicyConfigurationUpdate:
  * Represents the settings of a target tracking scaling policy that will be modified.
  */
inline fun DynamodbDSL.Companion.autoScalingTargetTrackingScalingPolicyConfigurationUpdate(dslBlock: AutoScalingTargetTrackingScalingPolicyConfigurationUpdateDSL.() -> Unit) =
  AutoScalingTargetTrackingScalingPolicyConfigurationUpdateDSL(AutoScalingTargetTrackingScalingPolicyConfigurationUpdate.builder()).apply(dslBlock).build()