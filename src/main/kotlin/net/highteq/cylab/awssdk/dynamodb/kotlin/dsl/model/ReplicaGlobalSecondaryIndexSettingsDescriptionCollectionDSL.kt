/*
  This file was generated from https://github.com/aws/aws-sdk-java-v2 by https://github.com/cylab/aws-kotlin-dsl-builder
  Like the original code, this file and project is licensed under
  Apache License Version 2.0
  See LICENSE.txt for more info
*/
package net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.model

import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSL
import software.amazon.awssdk.services.dynamodb.model.ReplicaGlobalSecondaryIndexSettingsDescription

/**
  * Builds instances of type ReplicaGlobalSecondaryIndexSettingsDescription:
  * Represents the properties of a global secondary index.
  */
@DynamodbDSL
class ReplicaGlobalSecondaryIndexSettingsDescriptionCollectionDSL {
  private val list = ArrayList<ReplicaGlobalSecondaryIndexSettingsDescription>()
  internal fun build() : List<ReplicaGlobalSecondaryIndexSettingsDescription> = list

  /**
    * Receives a sub DSL in 'dslBlock' to build a ReplicaGlobalSecondaryIndexSettingsDescription instance
    * and adds it to the collection built by the enclosing DSL
    */
  fun add(dslBlock: ReplicaGlobalSecondaryIndexSettingsDescriptionDSL.() -> Unit) {
    list.add(ReplicaGlobalSecondaryIndexSettingsDescriptionDSL().apply(dslBlock).build())
  }

  /**
    * Adds a ReplicaGlobalSecondaryIndexSettingsDescription to the collection built by this DSL
    */
  fun add(item: ReplicaGlobalSecondaryIndexSettingsDescription) {
    list.add(item)
  }

  /**
    * Adds all given ReplicaGlobalSecondaryIndexSettingsDescription instances to the collection built by this DSL
    */
  fun addAll(items: Collection<ReplicaGlobalSecondaryIndexSettingsDescription>) {
    list.addAll(items)
  }

  /**
    * Adds all given ReplicaGlobalSecondaryIndexSettingsDescription instances to the collection built by this DSL
    */
  infix fun addAll(items: Array<ReplicaGlobalSecondaryIndexSettingsDescription>) {
    list.addAll(items)
  }

  /**
    * Adds a ReplicaGlobalSecondaryIndexSettingsDescription to the collection built by this DSL
    */
  operator fun ReplicaGlobalSecondaryIndexSettingsDescription.unaryPlus() {
    list.add(this)
  }

  /**
    * Adds all given ReplicaGlobalSecondaryIndexSettingsDescription instances to the collection built by this DSL
    */
  operator fun Collection<ReplicaGlobalSecondaryIndexSettingsDescription>.unaryPlus() {
    list.addAll(this)
  }

  /**
    * Adds all given ReplicaGlobalSecondaryIndexSettingsDescription instances to the collection built by this DSL
    */
  operator fun Array<ReplicaGlobalSecondaryIndexSettingsDescription>.unaryPlus() {
    list.addAll(this)
  }
}

/**
  * Builds instances of type ReplicaGlobalSecondaryIndexSettingsDescription:
  * Represents the properties of a global secondary index.
  */
fun buildReplicaGlobalSecondaryIndexSettingsDescriptionCollection(dslBlock: ReplicaGlobalSecondaryIndexSettingsDescriptionCollectionDSL.() -> Unit) =
  ReplicaGlobalSecondaryIndexSettingsDescriptionCollectionDSL().apply(dslBlock).build()