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
import software.amazon.awssdk.services.dynamodb.model.ReplicaSettingsUpdate

/**
  * Builds instances of type ReplicaSettingsUpdate:
  * Represents the settings for a global table in a region that will be modified.
  */
@DynamodbDSL
inline class ReplicaSettingsUpdateCollectionDSL(
  @PublishedApi
  @Deprecated("Don't use internal fields!", level = WARNING)
  internal val list : MutableList<ReplicaSettingsUpdate>
){
  @PublishedApi
  internal fun build() = list

  /**
    * Builds an object of type ReplicaSettingsUpdate from 
    * the given DSL in 'dslBlock' and adds it to the collection
    */
  inline fun o(dslBlock: ReplicaSettingsUpdateDSL.() -> Unit) {
    list.add(buildReplicaSettingsUpdate(dslBlock))
  }

  /**
    * Adds a ReplicaSettingsUpdate to the collection built by this DSL
    */
  inline operator fun ReplicaSettingsUpdate.unaryPlus() {
    list.add(this)
  }

  /**
    * Adds all given ReplicaSettingsUpdate instances to the collection built by this DSL
    */
  inline operator fun Collection<ReplicaSettingsUpdate>.unaryPlus() {
    list.addAll(this)
  }

  /**
    * Adds all given ReplicaSettingsUpdate instances to the collection built by this DSL
    */
  inline operator fun Array<ReplicaSettingsUpdate>.unaryPlus() {
    list.addAll(this)
  }
}

/**
  * Builds instances of type ReplicaSettingsUpdate:
  * Represents the settings for a global table in a region that will be modified.
  */
inline fun buildReplicaSettingsUpdateCollection(dslBlock: ReplicaSettingsUpdateCollectionDSL.() -> Unit) =
  ReplicaSettingsUpdateCollectionDSL(mutableListOf<ReplicaSettingsUpdate>()).apply(dslBlock).build()