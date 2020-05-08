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
import software.amazon.awssdk.services.dynamodb.model.ReplicaDescription

/**
  * Builds a collection of type ReplicaDescription:
  * Contains the details of the replica.
  */
@DynamodbDSL
inline class ReplicaDescriptionCollectionDSL(
  @PublishedApi
  @Deprecated("Don't use internal fields!", level = WARNING)
  internal val list : MutableList<ReplicaDescription>
){
  @PublishedApi
  internal fun build() = list

  /**
    * Builds an object of type ReplicaDescription from 
    * the given DSL in 'dslBlock' and adds it to the collection
    */
  inline fun o(dslBlock: ReplicaDescriptionDSL.() -> Unit) {
    list.add(buildReplicaDescription(dslBlock))
  }

  /**
    * Adds a ReplicaDescription to the collection built by this DSL
    */
  inline operator fun ReplicaDescription.unaryPlus() {
    list.add(this)
  }

  /**
    * Adds all given ReplicaDescription instances to the collection built by this DSL
    */
  inline operator fun Collection<ReplicaDescription>.unaryPlus() {
    list.addAll(this)
  }

  /**
    * Adds all given ReplicaDescription instances to the collection built by this DSL
    */
  inline operator fun Array<ReplicaDescription>.unaryPlus() {
    list.addAll(this)
  }
}

/**
  * Builds a collection of type ReplicaDescription:
  * Contains the details of the replica.
  */
inline fun buildReplicaDescriptionCollection(dslBlock: ReplicaDescriptionCollectionDSL.() -> Unit) =
  ReplicaDescriptionCollectionDSL(mutableListOf<ReplicaDescription>()).apply(dslBlock).build()