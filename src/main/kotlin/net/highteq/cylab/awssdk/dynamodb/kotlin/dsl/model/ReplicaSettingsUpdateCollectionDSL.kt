/*
  This file was generated from https://github.com/aws/aws-sdk-java-v2 by https://github.com/cylab/aws-kotlin-dsl-builder
  Like the original code, this file and project is licensed under
  Apache License Version 2.0
  See LICENSE.txt for more info
*/
package net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.model

import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSL
import software.amazon.awssdk.services.dynamodb.model.ReplicaSettingsUpdate

/**
  * Builds instances of type ReplicaSettingsUpdate:
  * Represents the settings for a global table in a Region that will be modified.
  */
@DynamodbDSL
class ReplicaSettingsUpdateCollectionDSL {
  private val list = ArrayList<ReplicaSettingsUpdate>()
  internal fun build() : List<ReplicaSettingsUpdate> = list

  /**
    * Receives a sub DSL in 'dslBlock' to build a ReplicaSettingsUpdate instance
    * and adds it to the collection built by the enclosing DSL
    */
  fun add(dslBlock: ReplicaSettingsUpdateDSL.() -> Unit) {
    list.add(ReplicaSettingsUpdateDSL().apply(dslBlock).build())
  }

  /**
    * Adds a ReplicaSettingsUpdate to the collection built by this DSL
    */
  fun add(item: ReplicaSettingsUpdate) {
    list.add(item)
  }

  /**
    * Adds all given ReplicaSettingsUpdate instances to the collection built by this DSL
    */
  fun addAll(items: Collection<ReplicaSettingsUpdate>) {
    list.addAll(items)
  }

  /**
    * Adds all given ReplicaSettingsUpdate instances to the collection built by this DSL
    */
  infix fun addAll(items: Array<ReplicaSettingsUpdate>) {
    list.addAll(items)
  }

  /**
    * Adds a ReplicaSettingsUpdate to the collection built by this DSL
    */
  operator fun ReplicaSettingsUpdate.unaryPlus() {
    list.add(this)
  }

  /**
    * Adds all given ReplicaSettingsUpdate instances to the collection built by this DSL
    */
  operator fun Collection<ReplicaSettingsUpdate>.unaryPlus() {
    list.addAll(this)
  }

  /**
    * Adds all given ReplicaSettingsUpdate instances to the collection built by this DSL
    */
  operator fun Array<ReplicaSettingsUpdate>.unaryPlus() {
    list.addAll(this)
  }
}

/**
  * Builds instances of type ReplicaSettingsUpdate:
  * Represents the settings for a global table in a Region that will be modified.
  */
fun buildReplicaSettingsUpdateCollection(dslBlock: ReplicaSettingsUpdateCollectionDSL.() -> Unit) =
  ReplicaSettingsUpdateCollectionDSL().apply(dslBlock).build()