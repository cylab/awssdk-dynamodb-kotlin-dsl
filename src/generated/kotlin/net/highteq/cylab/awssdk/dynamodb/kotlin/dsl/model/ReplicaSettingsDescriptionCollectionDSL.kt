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
import software.amazon.awssdk.services.dynamodb.model.ReplicaSettingsDescription

/**
  * Builds instances of type ReplicaSettingsDescription:
  * Represents the properties of a replica.
  */
@DynamodbDSL
inline class ReplicaSettingsDescriptionCollectionDSL(
  @PublishedApi
  @Deprecated("Don't use internal fields!", level = WARNING)
  internal val list : MutableList<ReplicaSettingsDescription>
){
  @PublishedApi
  internal fun build() = list

  /**
    * Builds an object of type ReplicaSettingsDescription from 
    * the given DSL in 'dslBlock' and adds it to the collection
    */
  inline fun o(dslBlock: ReplicaSettingsDescriptionDSL.() -> Unit) {
    list.add(buildReplicaSettingsDescription(dslBlock))
  }

  /**
    * Adds a ReplicaSettingsDescription to the collection built by this DSL
    */
  inline operator fun ReplicaSettingsDescription.unaryPlus() {
    list.add(this)
  }

  /**
    * Adds all given ReplicaSettingsDescription instances to the collection built by this DSL
    */
  inline operator fun Collection<ReplicaSettingsDescription>.unaryPlus() {
    list.addAll(this)
  }

  /**
    * Adds all given ReplicaSettingsDescription instances to the collection built by this DSL
    */
  inline operator fun Array<ReplicaSettingsDescription>.unaryPlus() {
    list.addAll(this)
  }
}

/**
  * Builds instances of type ReplicaSettingsDescription:
  * Represents the properties of a replica.
  */
inline fun buildReplicaSettingsDescriptionCollection(dslBlock: ReplicaSettingsDescriptionCollectionDSL.() -> Unit) =
  ReplicaSettingsDescriptionCollectionDSL(mutableListOf<ReplicaSettingsDescription>()).apply(dslBlock).build()