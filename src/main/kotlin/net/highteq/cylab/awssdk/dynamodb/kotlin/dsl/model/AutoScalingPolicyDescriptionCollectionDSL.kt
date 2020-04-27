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

  /**
    * Receives a sub DSL in 'dslBlock' to build a AutoScalingPolicyDescription instance
    * and adds it to the collection built by the enclosing DSL
    */
  fun add(dslBlock: AutoScalingPolicyDescriptionDSL.() -> Unit) {
    list.add(AutoScalingPolicyDescriptionDSL().apply(dslBlock).build())
  }

  /**
    * Adds a AutoScalingPolicyDescription to the collection built by this DSL
    */
  fun add(item: AutoScalingPolicyDescription) {
    list.add(item)
  }

  /**
    * Adds all given AutoScalingPolicyDescription instances to the collection built by this DSL
    */
  fun addAll(items: Collection<AutoScalingPolicyDescription>) {
    list.addAll(items)
  }

  /**
    * Adds all given AutoScalingPolicyDescription instances to the collection built by this DSL
    */
  infix fun addAll(items: Array<AutoScalingPolicyDescription>) {
    list.addAll(items)
  }

  /**
    * Adds a AutoScalingPolicyDescription to the collection built by this DSL
    */
  operator fun AutoScalingPolicyDescription.unaryPlus() {
    list.add(this)
  }

  /**
    * Adds all given AutoScalingPolicyDescription instances to the collection built by this DSL
    */
  operator fun Collection<AutoScalingPolicyDescription>.unaryPlus() {
    list.addAll(this)
  }

  /**
    * Adds all given AutoScalingPolicyDescription instances to the collection built by this DSL
    */
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