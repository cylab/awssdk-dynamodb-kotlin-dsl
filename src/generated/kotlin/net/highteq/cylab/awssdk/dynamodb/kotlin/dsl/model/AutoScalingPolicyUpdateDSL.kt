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
import software.amazon.awssdk.services.dynamodb.model.AutoScalingTargetTrackingScalingPolicyConfigurationUpdate

/**
  * Builds instances of type AutoScalingPolicyUpdate:
  * Represents the autoscaling policy to be modified.
  */
@DynamodbDSL
inline class AutoScalingPolicyUpdateDSL(
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder: AutoScalingPolicyUpdate.Builder
){
  @PublishedApi
  internal fun build(): AutoScalingPolicyUpdate = builder.build()
    
  /**
    * 
    */
  inline var policyName: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.policyName(value)
    }


  /**
    * 
    */
  inline var targetTrackingScalingPolicyConfiguration: AutoScalingTargetTrackingScalingPolicyConfigurationUpdate?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.targetTrackingScalingPolicyConfiguration(value)
    }

  
  
    
  /**
    * 
    */
  inline fun targetTrackingScalingPolicyConfiguration(dslBlock: AutoScalingTargetTrackingScalingPolicyConfigurationUpdateDSL.() -> Unit) {
    builder.targetTrackingScalingPolicyConfiguration(buildAutoScalingTargetTrackingScalingPolicyConfigurationUpdate(dslBlock))
  }

}

/**
  * Builds instances of type AutoScalingPolicyUpdate:
  * Represents the autoscaling policy to be modified.
  */
inline fun buildAutoScalingPolicyUpdate(dslBlock: AutoScalingPolicyUpdateDSL.() -> Unit) =
  AutoScalingPolicyUpdateDSL(AutoScalingPolicyUpdate.builder()).apply(dslBlock).build()