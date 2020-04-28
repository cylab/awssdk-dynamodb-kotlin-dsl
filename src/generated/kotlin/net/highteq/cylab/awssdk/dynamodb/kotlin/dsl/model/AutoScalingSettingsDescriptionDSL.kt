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
import software.amazon.awssdk.services.dynamodb.model.AutoScalingSettingsDescription

/**
  * Builds instances of type AutoScalingSettingsDescription:
  * Represents the auto scaling settings for a global table or global secondary index.
  */
@DynamodbDSL
class AutoScalingSettingsDescriptionDSL {
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder = AutoScalingSettingsDescription.builder()
  internal fun build(): AutoScalingSettingsDescription = builder.build()
    
  /**
    * Disabled auto scaling for this global table or global secondary index.
    */
  var autoScalingDisabled: Boolean?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.autoScalingDisabled(value)
    }


  /**
    * Role ARN used for configuring the auto scaling policy.
    */
  var autoScalingRoleArn: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.autoScalingRoleArn(value)
    }


  /**
    * The maximum capacity units that a global table or global secondary index should be scaled up to.
    */
  var maximumUnits: Long?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.maximumUnits(value)
    }


  /**
    * The minimum capacity units that a global table or global secondary index should be scaled down to.
    */
  var minimumUnits: Long?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.minimumUnits(value)
    }


  /**
    * Information about the scaling policies.
    */
  var scalingPolicies: Collection<AutoScalingPolicyDescription>?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.scalingPolicies(value)
    }

  
    
  /**
    * Information about the scaling policies.
    */
  fun scalingPolicies(dslBlock: AutoScalingPolicyDescriptionCollectionDSL.() -> Unit) {
    builder.scalingPolicies(buildAutoScalingPolicyDescriptionCollection(dslBlock))
  }

}

/**
  * Builds instances of type AutoScalingSettingsDescription:
  * Represents the auto scaling settings for a global table or global secondary index.
  */
fun buildAutoScalingSettingsDescription(dslBlock: AutoScalingSettingsDescriptionDSL.() -> Unit) =
  AutoScalingSettingsDescriptionDSL().apply(dslBlock).build()