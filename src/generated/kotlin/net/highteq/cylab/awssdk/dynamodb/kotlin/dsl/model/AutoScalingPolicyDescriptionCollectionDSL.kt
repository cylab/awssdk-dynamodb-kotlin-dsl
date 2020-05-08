/*
  This file was generated from https://github.com/aws/aws-sdk-java-v2 by https://github.com/cylab/aws-kotlin-dsl-builder
  Like the original code, this file and project is licensed under
  Apache License Version 2.0
  See LICENSE.txt for more info
*/
@file:Suppress("DEPRECATION", "NOTHING_TO_INLINE")
package net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.model

import kotlin.DeprecationLevel.WARNING
import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSL
import software.amazon.awssdk.services.dynamodb.model.AutoScalingPolicyDescription

/**
  * Builds a collection of type AutoScalingPolicyDescription:
  * Represents the properties of the scaling policy.
  */
@DynamodbDSL
inline class AutoScalingPolicyDescriptionCollectionDSL(
  @PublishedApi
  @Deprecated("Don't use internal fields!", level = WARNING)
  internal val list : MutableList<AutoScalingPolicyDescription>
){
  @PublishedApi
  internal fun build() = list

  /**
    * Builds an object of type AutoScalingPolicyDescription from 
    * the given DSL in 'dslBlock' and adds it to the collection
    */
  inline fun o(dslBlock: AutoScalingPolicyDescriptionDSL.() -> Unit) {
    list.add(buildAutoScalingPolicyDescription(dslBlock))
  }

  /**
    * Adds a AutoScalingPolicyDescription to the collection built by this DSL
    */
  inline operator fun AutoScalingPolicyDescription.unaryPlus() {
    list.add(this)
  }

  /**
    * Adds all given AutoScalingPolicyDescription instances to the collection built by this DSL
    */
  inline operator fun Collection<AutoScalingPolicyDescription>.unaryPlus() {
    list.addAll(this)
  }

  /**
    * Adds all given AutoScalingPolicyDescription instances to the collection built by this DSL
    */
  inline operator fun Array<AutoScalingPolicyDescription>.unaryPlus() {
    list.addAll(this)
  }
}

/**
  * Builds a collection of type AutoScalingPolicyDescription:
  * Represents the properties of the scaling policy.
  */
inline fun buildAutoScalingPolicyDescriptionCollection(dslBlock: AutoScalingPolicyDescriptionCollectionDSL.() -> Unit) =
  AutoScalingPolicyDescriptionCollectionDSL(mutableListOf<AutoScalingPolicyDescription>()).apply(dslBlock).build()