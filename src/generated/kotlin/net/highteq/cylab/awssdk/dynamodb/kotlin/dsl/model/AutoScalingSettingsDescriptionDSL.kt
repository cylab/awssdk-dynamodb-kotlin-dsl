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
import software.amazon.awssdk.services.dynamodb.model.AutoScalingPolicyDescription
import software.amazon.awssdk.services.dynamodb.model.AutoScalingSettingsDescription

/**
  * Builds instances of type AutoScalingSettingsDescription:
  * Represents the autoscaling settings for a global table or global secondary index.
  */
@DynamodbDSL
inline class AutoScalingSettingsDescriptionDSL(
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder: AutoScalingSettingsDescription.Builder
){
  @PublishedApi
  internal fun build(): AutoScalingSettingsDescription = builder.build()
    
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
  inline var scalingPolicies: Collection<AutoScalingPolicyDescription>?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.scalingPolicies(value)
    }

  
  
    
  /**
    * 
    */
  inline fun scalingPolicies(dslBlock: AutoScalingPolicyDescriptionCollectionDSL.() -> Unit) {
    builder.scalingPolicies(buildAutoScalingPolicyDescriptionCollection(dslBlock))
  }

}

/**
  * Builds instances of type AutoScalingSettingsDescription:
  * Represents the autoscaling settings for a global table or global secondary index.
  */
inline fun buildAutoScalingSettingsDescription(dslBlock: AutoScalingSettingsDescriptionDSL.() -> Unit) =
  AutoScalingSettingsDescriptionDSL(AutoScalingSettingsDescription.builder()).apply(dslBlock).build()