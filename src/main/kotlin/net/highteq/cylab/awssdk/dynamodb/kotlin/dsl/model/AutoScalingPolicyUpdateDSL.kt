/*
  This file was generated from https://github.com/aws/aws-sdk-java-v2 by https://github.com/cylab/aws-kotlin-dsl-builder
  Like the original code, this file and project is licensed under
  Apache License Version 2.0
  See LICENSE.txt for more info
*/
package net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.model

import kotlin.DeprecationLevel.HIDDEN
import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSL
import software.amazon.awssdk.services.dynamodb.model.AutoScalingPolicyUpdate
import software.amazon.awssdk.services.dynamodb.model.AutoScalingTargetTrackingScalingPolicyConfigurationUpdate

/**
  * Builds instances of type AutoScalingPolicyUpdate:
  * Represents the auto scaling policy to be modified.
  */
@DynamodbDSL
class AutoScalingPolicyUpdateDSL {
  private val builder = AutoScalingPolicyUpdate.builder()
  internal fun build(): AutoScalingPolicyUpdate = builder.build()
    
  /**
    * The name of the scaling policy.
    */
  @get:JvmSynthetic // Hide from Java callers
  var policyName: String
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.policyName(value)
    }


  /**
    * Represents a target tracking scaling policy configuration.
    */
  @get:JvmSynthetic // Hide from Java callers
  var targetTrackingScalingPolicyConfiguration: AutoScalingTargetTrackingScalingPolicyConfigurationUpdate
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.targetTrackingScalingPolicyConfiguration(value)
    }

  
    
  /**
    * Represents a target tracking scaling policy configuration.
    */
  fun targetTrackingScalingPolicyConfiguration(dslBlock: AutoScalingTargetTrackingScalingPolicyConfigurationUpdateDSL.() -> Unit) {
    builder.targetTrackingScalingPolicyConfiguration(buildAutoScalingTargetTrackingScalingPolicyConfigurationUpdate(dslBlock))
  }

}

/**
  * Builds instances of type AutoScalingPolicyUpdate:
  * Represents the auto scaling policy to be modified.
  */
fun buildAutoScalingPolicyUpdate(dslBlock: AutoScalingPolicyUpdateDSL.() -> Unit) =
  AutoScalingPolicyUpdateDSL().apply(dslBlock).build()