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
import software.amazon.awssdk.services.dynamodb.model.AutoScalingPolicyDescription
import software.amazon.awssdk.services.dynamodb.model.AutoScalingTargetTrackingScalingPolicyConfigurationDescription

/**
  * Builds instances of type AutoScalingPolicyDescription:
  * Represents the properties of the scaling policy.
  */
@DynamodbDSL
class AutoScalingPolicyDescriptionDSL {
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder = AutoScalingPolicyDescription.builder()
  internal fun build(): AutoScalingPolicyDescription = builder.build()
    
  /**
    * Represents a target tracking scaling policy configuration.
    */
  var targetTrackingScalingPolicyConfiguration: AutoScalingTargetTrackingScalingPolicyConfigurationDescription
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.targetTrackingScalingPolicyConfiguration(value)
    }


  /**
    * The name of the scaling policy.
    */
  var policyName: String
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.policyName(value)
    }

  
    
  /**
    * Represents a target tracking scaling policy configuration.
    */
  fun targetTrackingScalingPolicyConfiguration(dslBlock: AutoScalingTargetTrackingScalingPolicyConfigurationDescriptionDSL.() -> Unit) {
    builder.targetTrackingScalingPolicyConfiguration(buildAutoScalingTargetTrackingScalingPolicyConfigurationDescription(dslBlock))
  }

}

/**
  * Builds instances of type AutoScalingPolicyDescription:
  * Represents the properties of the scaling policy.
  */
fun buildAutoScalingPolicyDescription(dslBlock: AutoScalingPolicyDescriptionDSL.() -> Unit) =
  AutoScalingPolicyDescriptionDSL().apply(dslBlock).build()