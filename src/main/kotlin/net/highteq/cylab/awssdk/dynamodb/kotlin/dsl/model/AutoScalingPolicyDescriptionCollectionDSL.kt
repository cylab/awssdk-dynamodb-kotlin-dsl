/*
  This file was generated from https://github.com/aws/aws-sdk-java-v2 by https://github.com/cylab/aws-kotlin-dsl-builder
  Like the original code, this file and project is licensed under
  Apache License Version 2.0
  See LICENSE.txt for more info
*/
package net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.model

import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSL
import software.amazon.awssdk.services.dynamodb.model.AutoScalingPolicyDescription

/**
  * Builds instances of type AutoScalingPolicyDescription:
  * Represents the properties of the scaling policy.
  */
@DynamodbDSL
class AutoScalingPolicyDescriptionCollectionDSL {
  private val list = ArrayList<AutoScalingPolicyDescription>()
  internal fun build() : List<AutoScalingPolicyDescription> = list

  fun item(init: AutoScalingPolicyDescriptionDSL.() -> Unit) {
    list.add(AutoScalingPolicyDescriptionDSL().apply(init).build())
  }

  operator fun AutoScalingPolicyDescription.unaryPlus() {
    list.add(this)
  }

  operator fun Collection<AutoScalingPolicyDescription>.unaryPlus() {
    list.addAll(this)
  }

  operator fun Array<AutoScalingPolicyDescription>.unaryPlus() {
    list.addAll(this)
  }
}

/**
  * Builds instances of type AutoScalingPolicyDescription:
  * Represents the properties of the scaling policy.
  */
fun buildAutoScalingPolicyDescriptionCollection(dslBlock: AutoScalingPolicyDescriptionCollectionDSL.() -> Unit) =
  AutoScalingPolicyDescriptionCollectionDSL().apply(dslBlock).build()