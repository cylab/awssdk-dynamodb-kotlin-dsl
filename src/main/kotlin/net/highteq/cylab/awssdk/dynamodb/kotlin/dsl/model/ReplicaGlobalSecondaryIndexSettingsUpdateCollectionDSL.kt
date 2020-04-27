/*
  This file was generated from https://github.com/aws/aws-sdk-java-v2 by https://github.com/cylab/aws-kotlin-dsl-builder
  Like the original code, this file and project is licensed under
  Apache License Version 2.0
  See LICENSE.txt for more info
*/
package net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.model

import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSL
import software.amazon.awssdk.services.dynamodb.model.ReplicaGlobalSecondaryIndexSettingsUpdate

/**
  * Builds instances of type ReplicaGlobalSecondaryIndexSettingsUpdate:
  * Represents the settings of a global secondary index for a global table that will be modified.
  */
@DynamodbDSL
class ReplicaGlobalSecondaryIndexSettingsUpdateCollectionDSL {
  private val list = ArrayList<ReplicaGlobalSecondaryIndexSettingsUpdate>()
  internal fun build() : List<ReplicaGlobalSecondaryIndexSettingsUpdate> = list

  /**
    * Receives a sub DSL in 'dslBlock' to build a ReplicaGlobalSecondaryIndexSettingsUpdate instance
    * and adds it to the collection built by the enclosing DSL
    */
  fun add(dslBlock: ReplicaGlobalSecondaryIndexSettingsUpdateDSL.() -> Unit) {
    list.add(ReplicaGlobalSecondaryIndexSettingsUpdateDSL().apply(dslBlock).build())
  }

  /**
    * Adds a ReplicaGlobalSecondaryIndexSettingsUpdate to the collection built by this DSL
    */
  fun add(item: ReplicaGlobalSecondaryIndexSettingsUpdate) {
    list.add(item)
  }

  /**
    * Adds all given ReplicaGlobalSecondaryIndexSettingsUpdate instances to the collection built by this DSL
    */
  fun addAll(items: Collection<ReplicaGlobalSecondaryIndexSettingsUpdate>) {
    list.addAll(items)
  }

  /**
    * Adds all given ReplicaGlobalSecondaryIndexSettingsUpdate instances to the collection built by this DSL
    */
  infix fun addAll(items: Array<ReplicaGlobalSecondaryIndexSettingsUpdate>) {
    list.addAll(items)
  }

  /**
    * Adds a ReplicaGlobalSecondaryIndexSettingsUpdate to the collection built by this DSL
    */
  operator fun ReplicaGlobalSecondaryIndexSettingsUpdate.unaryPlus() {
    list.add(this)
  }

  /**
    * Adds all given ReplicaGlobalSecondaryIndexSettingsUpdate instances to the collection built by this DSL
    */
  operator fun Collection<ReplicaGlobalSecondaryIndexSettingsUpdate>.unaryPlus() {
    list.addAll(this)
  }

  /**
    * Adds all given ReplicaGlobalSecondaryIndexSettingsUpdate instances to the collection built by this DSL
    */
  operator fun Array<ReplicaGlobalSecondaryIndexSettingsUpdate>.unaryPlus() {
    list.addAll(this)
  }
}

/**
  * Builds instances of type ReplicaGlobalSecondaryIndexSettingsUpdate:
  * Represents the settings of a global secondary index for a global table that will be modified.
  */
fun buildReplicaGlobalSecondaryIndexSettingsUpdateCollection(dslBlock: ReplicaGlobalSecondaryIndexSettingsUpdateCollectionDSL.() -> Unit) =
  ReplicaGlobalSecondaryIndexSettingsUpdateCollectionDSL().apply(dslBlock).build()