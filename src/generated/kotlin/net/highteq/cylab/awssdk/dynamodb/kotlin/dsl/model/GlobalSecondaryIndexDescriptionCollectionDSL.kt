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
import software.amazon.awssdk.services.dynamodb.model.GlobalSecondaryIndexDescription

/**
  * Builds a collection of type GlobalSecondaryIndexDescription:
  * Represents the properties of a global secondary index.
  */
@DynamodbDSLMarker
inline class GlobalSecondaryIndexDescriptionCollectionDSL(
  @PublishedApi
  @Deprecated("Don't use internal fields!", level = WARNING)
  internal val list : MutableList<GlobalSecondaryIndexDescription>
){
  @PublishedApi
  internal fun build() = list

  /**
    * Builds an object of type GlobalSecondaryIndexDescription from 
    * the given DSL in 'dslBlock' and adds it to the collection
    */
  inline fun o(dslBlock: GlobalSecondaryIndexDescriptionDSL.() -> Unit) {
    list.add(DynamodbDSL.globalSecondaryIndexDescription(dslBlock))
  }

  /**
    * Adds a GlobalSecondaryIndexDescription to the collection built by this DSL
    */
  inline operator fun GlobalSecondaryIndexDescription.unaryPlus() {
    list.add(this)
  }

  /**
    * Adds all given GlobalSecondaryIndexDescription instances to the collection built by this DSL
    */
  inline operator fun Collection<GlobalSecondaryIndexDescription>.unaryPlus() {
    list.addAll(this)
  }

  /**
    * Adds all given GlobalSecondaryIndexDescription instances to the collection built by this DSL
    */
  inline operator fun Array<GlobalSecondaryIndexDescription>.unaryPlus() {
    list.addAll(this)
  }
}

/**
  * Builds a collection of type GlobalSecondaryIndexDescription:
  * Represents the properties of a global secondary index.
  */
inline fun globalSecondaryIndexDescriptionCollection(dslBlock: GlobalSecondaryIndexDescriptionCollectionDSL.() -> Unit) =
  GlobalSecondaryIndexDescriptionCollectionDSL(mutableListOf<GlobalSecondaryIndexDescription>()).apply(dslBlock).build()

/**
  * Builds a collection of type GlobalSecondaryIndexDescription:
  * Represents the properties of a global secondary index.
  */
inline fun DynamodbDSL.Companion.globalSecondaryIndexDescriptionCollection(dslBlock: GlobalSecondaryIndexDescriptionCollectionDSL.() -> Unit) =
  GlobalSecondaryIndexDescriptionCollectionDSL(mutableListOf<GlobalSecondaryIndexDescription>()).apply(dslBlock).build()