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
import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSLMarker
import software.amazon.awssdk.services.dynamodb.model.ReplicaGlobalSecondaryIndexSettingsDescription

/**
  * Builds a collection of type ReplicaGlobalSecondaryIndexSettingsDescription:
  * Represents the properties of a global secondary index.
  */
@DynamodbDSLMarker
inline class ReplicaGlobalSecondaryIndexSettingsDescriptionCollectionDSL(
  @PublishedApi
  @Deprecated("Don't use internal fields!", level = WARNING)
  internal val list : MutableList<ReplicaGlobalSecondaryIndexSettingsDescription>
){
  @PublishedApi
  internal fun build() = list

  /**
    * Builds an object of type ReplicaGlobalSecondaryIndexSettingsDescription from 
    * the given DSL in 'dslBlock' and adds it to the collection
    */
  inline fun o(dslBlock: ReplicaGlobalSecondaryIndexSettingsDescriptionDSL.() -> Unit) {
    list.add(DynamodbDSL.replicaGlobalSecondaryIndexSettingsDescription(dslBlock))
  }

  /**
    * Adds a ReplicaGlobalSecondaryIndexSettingsDescription to the collection built by this DSL
    */
  inline operator fun ReplicaGlobalSecondaryIndexSettingsDescription.unaryPlus() {
    list.add(this)
  }

  /**
    * Adds all given ReplicaGlobalSecondaryIndexSettingsDescription instances to the collection built by this DSL
    */
  inline operator fun Collection<ReplicaGlobalSecondaryIndexSettingsDescription>.unaryPlus() {
    list.addAll(this)
  }

  /**
    * Adds all given ReplicaGlobalSecondaryIndexSettingsDescription instances to the collection built by this DSL
    */
  inline operator fun Array<ReplicaGlobalSecondaryIndexSettingsDescription>.unaryPlus() {
    list.addAll(this)
  }
}

/**
  * Builds a collection of type ReplicaGlobalSecondaryIndexSettingsDescription:
  * Represents the properties of a global secondary index.
  */
inline fun replicaGlobalSecondaryIndexSettingsDescriptionCollection(dslBlock: ReplicaGlobalSecondaryIndexSettingsDescriptionCollectionDSL.() -> Unit) =
  ReplicaGlobalSecondaryIndexSettingsDescriptionCollectionDSL(mutableListOf<ReplicaGlobalSecondaryIndexSettingsDescription>()).apply(dslBlock).build()

/**
  * Builds a collection of type ReplicaGlobalSecondaryIndexSettingsDescription:
  * Represents the properties of a global secondary index.
  */
inline fun DynamodbDSL.Companion.replicaGlobalSecondaryIndexSettingsDescriptionCollection(dslBlock: ReplicaGlobalSecondaryIndexSettingsDescriptionCollectionDSL.() -> Unit) =
  ReplicaGlobalSecondaryIndexSettingsDescriptionCollectionDSL(mutableListOf<ReplicaGlobalSecondaryIndexSettingsDescription>()).apply(dslBlock).build()