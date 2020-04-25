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
import software.amazon.awssdk.services.dynamodb.model.AutoScalingSettingsUpdate

/**
  * Builds instances of type AutoScalingSettingsUpdate:
  * Represents the auto scaling settings to be modified for a global table or global secondary index.
  */
@DynamodbDSL
class AutoScalingSettingsUpdateDSL {
  private val builder = AutoScalingSettingsUpdate.builder()
  internal fun build(): AutoScalingSettingsUpdate = builder.build()
    
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
    * Role ARN used for configuring auto scaling policy.
    */
  @get:JvmSynthetic // Hide from Java callers
  var autoScalingRoleArn: String
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.autoScalingRoleArn(value)
    }


  /**
    * The scaling policy to apply for scaling target global table or global secondary index capacity units.
    */
  @get:JvmSynthetic // Hide from Java callers
  var scalingPolicyUpdate: AutoScalingPolicyUpdate
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.scalingPolicyUpdate(value)
    }

  
    
  /**
    * The scaling policy to apply for scaling target global table or global secondary index capacity units.
    */
  fun scalingPolicyUpdate(dslBlock: AutoScalingPolicyUpdateDSL.() -> Unit) {
    builder.scalingPolicyUpdate(buildAutoScalingPolicyUpdate(dslBlock))
  }

}

/**
  * Builds instances of type AutoScalingSettingsUpdate:
  * Represents the auto scaling settings to be modified for a global table or global secondary index.
  */
fun buildAutoScalingSettingsUpdate(dslBlock: AutoScalingSettingsUpdateDSL.() -> Unit) =
  AutoScalingSettingsUpdateDSL().apply(dslBlock).build()