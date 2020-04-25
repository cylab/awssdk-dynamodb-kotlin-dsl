/*
  This file was generated from https://github.com/aws/aws-sdk-java-v2 by https://github.com/cylab/aws-kotlin-dsl-builder
  Like the original code, this file and project is licensed under
  Apache License Version 2.0
  See LICENSE.txt for more info
*/
package net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.model

import kotlin.DeprecationLevel.HIDDEN
import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSL
import software.amazon.awssdk.services.dynamodb.model.AutoScalingTargetTrackingScalingPolicyConfigurationUpdate

/**
  * Builds instances of type AutoScalingTargetTrackingScalingPolicyConfigurationUpdate:
  * Represents the settings of a target tracking scaling policy that will be modified.
  */
@DynamodbDSL
class AutoScalingTargetTrackingScalingPolicyConfigurationUpdateDSL {
  private val builder = AutoScalingTargetTrackingScalingPolicyConfigurationUpdate.builder()
  internal fun build(): AutoScalingTargetTrackingScalingPolicyConfigurationUpdate = builder.build()
    
  /**
    * The target value for the metric. The range is 8.515920e-109 to 1.174271e+108 (Base 10) or 2e-360 to 2e360
    *  (Base 2).
    */
  @get:JvmSynthetic // Hide from Java callers
  var targetValue: Double
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.targetValue(value)
    }


  /**
    * Indicates whether scale in by the target tracking policy is disabled. If the value is true, scale in is
    *  disabled and the target tracking policy won't remove capacity from the scalable resource. Otherwise, scale in
    *  is enabled and the target tracking policy can remove capacity from the scalable resource. The default value
    *  is false.
    */
  @get:JvmSynthetic // Hide from Java callers
  var disableScaleIn: Boolean
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.disableScaleIn(value)
    }


  /**
    * The amount of time, in seconds, after a scale in activity completes before another scale in activity can
    *  start. The cooldown period is used to block subsequent scale in requests until it has expired. You should
    *  scale in conservatively to protect your application's availability. However, if another alarm triggers a
    *  scale out policy during the cooldown period after a scale-in, application auto scaling scales out your
    *  scalable target immediately.
    */
  @get:JvmSynthetic // Hide from Java callers
  var scaleInCooldown: Int
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.scaleInCooldown(value)
    }


  /**
    * The amount of time, in seconds, after a scale out activity completes before another scale out activity can
    *  start. While the cooldown period is in effect, the capacity that has been added by the previous scale out
    *  event that initiated the cooldown is calculated as part of the desired capacity for the next scale out. You
    *  should continuously (but not excessively) scale out.
    */
  @get:JvmSynthetic // Hide from Java callers
  var scaleOutCooldown: Int
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.scaleOutCooldown(value)
    }

  
  
}

/**
  * Builds instances of type AutoScalingTargetTrackingScalingPolicyConfigurationUpdate:
  * Represents the settings of a target tracking scaling policy that will be modified.
  */
fun buildAutoScalingTargetTrackingScalingPolicyConfigurationUpdate(dslBlock: AutoScalingTargetTrackingScalingPolicyConfigurationUpdateDSL.() -> Unit) =
  AutoScalingTargetTrackingScalingPolicyConfigurationUpdateDSL().apply(dslBlock).build()