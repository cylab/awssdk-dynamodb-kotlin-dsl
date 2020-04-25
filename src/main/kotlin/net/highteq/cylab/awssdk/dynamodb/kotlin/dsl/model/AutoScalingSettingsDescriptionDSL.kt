/*
  This file was generated from https://github.com/aws/aws-sdk-java-v2 by https://github.com/cylab/aws-kotlin-dsl-builder
  Like the original code, this file and project is licensed under
  Apache License Version 2.0
  See LICENSE.txt for more info
*/
package net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.model

import kotlin.DeprecationLevel.HIDDEN
import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSL
import software.amazon.awssdk.services.dynamodb.model.AutoScalingPolicyDescription
import software.amazon.awssdk.services.dynamodb.model.AutoScalingSettingsDescription

/**
  * Builds instances of type AutoScalingSettingsDescription:
  * Represents the auto scaling settings for a global table or global secondary index.
  */
@DynamodbDSL
class AutoScalingSettingsDescriptionDSL {
  private val builder = AutoScalingSettingsDescription.builder()
  internal fun build(): AutoScalingSettingsDescription = builder.build()
    
  /**
    * Information about the scaling policies.
    */
  @get:JvmSynthetic // Hide from Java callers
  var scalingPolicies: Collection<AutoScalingPolicyDescription>
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.scalingPolicies(value)
    }


  /**
    * The minimum capacity units that a global table or global secondary index should be scaled down to.
    */
  @get:JvmSynthetic // Hide from Java callers
  var minimumUnits: Long
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.minimumUnits(value)
    }


  /**
    * The maximum capacity units that a global table or global secondary index should be scaled up to.
    */
  @get:JvmSynthetic // Hide from Java callers
  var maximumUnits: Long
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.maximumUnits(value)
    }


  /**
    * Disabled auto scaling for this global table or global secondary index.
    */
  @get:JvmSynthetic // Hide from Java callers
  var autoScalingDisabled: Boolean
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.autoScalingDisabled(value)
    }


  /**
    * Role ARN used for configuring the auto scaling policy.
    */
  @get:JvmSynthetic // Hide from Java callers
  var autoScalingRoleArn: String
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.autoScalingRoleArn(value)
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