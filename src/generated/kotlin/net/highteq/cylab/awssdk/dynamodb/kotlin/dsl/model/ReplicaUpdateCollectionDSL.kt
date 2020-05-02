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
import software.amazon.awssdk.services.dynamodb.model.ReplicaUpdate

/**
  * Builds instances of type ReplicaUpdate:
  * Represents one of the following:
  * 
  *  A new replica to be added to an existing global table.
  * 
  *  New parameters for an existing replica.
  * 
  *  An existing replica to be removed from an existing global table.
  */
@DynamodbDSL
inline class ReplicaUpdateCollectionDSL(
  @PublishedApi
  @Deprecated("Don't use internal fields!", level = WARNING)
  internal val list : MutableList<ReplicaUpdate>
){
  @PublishedApi
  internal fun build() = list

  /**
    * Builds an object of type ReplicaUpdate from 
    * the given DSL in 'dslBlock' and adds it to the collection
    */
  inline fun o(dslBlock: ReplicaUpdateDSL.() -> Unit) {
    list.add(buildReplicaUpdate(dslBlock))
  }

  /**
    * Adds a ReplicaUpdate to the collection built by this DSL
    */
  inline operator fun ReplicaUpdate.unaryPlus() {
    list.add(this)
  }

  /**
    * Adds all given ReplicaUpdate instances to the collection built by this DSL
    */
  inline operator fun Collection<ReplicaUpdate>.unaryPlus() {
    list.addAll(this)
  }

  /**
    * Adds all given ReplicaUpdate instances to the collection built by this DSL
    */
  inline operator fun Array<ReplicaUpdate>.unaryPlus() {
    list.addAll(this)
  }
}

/**
  * Builds instances of type ReplicaUpdate:
  * Represents one of the following:
  * 
  *  A new replica to be added to an existing global table.
  * 
  *  New parameters for an existing replica.
  * 
  *  An existing replica to be removed from an existing global table.
  */
inline fun buildReplicaUpdateCollection(dslBlock: ReplicaUpdateCollectionDSL.() -> Unit) =
  ReplicaUpdateCollectionDSL(mutableListOf<ReplicaUpdate>()).apply(dslBlock).build()