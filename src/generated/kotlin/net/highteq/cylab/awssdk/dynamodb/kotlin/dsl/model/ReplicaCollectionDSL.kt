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
import software.amazon.awssdk.services.dynamodb.model.Replica

/**
  * Builds instances of type Replica:
  * Represents the properties of a replica.
  */
@DynamodbDSL
inline class ReplicaCollectionDSL(
  @PublishedApi
  @Deprecated("Don't use internal fields!", level = WARNING)
  internal val list : MutableList<Replica>
){
  @PublishedApi
  internal fun build() = list

  /**
    * Builds an object of type Replica from 
    * the given DSL in 'dslBlock' and adds it to the collection
    */
  inline fun o(dslBlock: ReplicaDSL.() -> Unit) {
    list.add(buildReplica(dslBlock))
  }

  /**
    * Adds a Replica to the collection built by this DSL
    */
  inline operator fun Replica.unaryPlus() {
    list.add(this)
  }

  /**
    * Adds all given Replica instances to the collection built by this DSL
    */
  inline operator fun Collection<Replica>.unaryPlus() {
    list.addAll(this)
  }

  /**
    * Adds all given Replica instances to the collection built by this DSL
    */
  inline operator fun Array<Replica>.unaryPlus() {
    list.addAll(this)
  }
}

/**
  * Builds instances of type Replica:
  * Represents the properties of a replica.
  */
inline fun buildReplicaCollection(dslBlock: ReplicaCollectionDSL.() -> Unit) =
  ReplicaCollectionDSL(mutableListOf<Replica>()).apply(dslBlock).build()