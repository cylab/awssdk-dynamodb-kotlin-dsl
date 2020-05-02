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
import software.amazon.awssdk.services.dynamodb.model.LocalSecondaryIndexDescription

/**
  * Builds instances of type LocalSecondaryIndexDescription:
  * Represents the properties of a local secondary index.
  */
@DynamodbDSL
inline class LocalSecondaryIndexDescriptionCollectionDSL(
  @PublishedApi
  @Deprecated("Don't use internal fields!", level = WARNING)
  internal val list : MutableList<LocalSecondaryIndexDescription>
){
  @PublishedApi
  internal fun build() = list

  /**
    * Builds an object of type LocalSecondaryIndexDescription from 
    * the given DSL in 'dslBlock' and adds it to the collection
    */
  inline fun o(dslBlock: LocalSecondaryIndexDescriptionDSL.() -> Unit) {
    list.add(buildLocalSecondaryIndexDescription(dslBlock))
  }

  /**
    * Adds a LocalSecondaryIndexDescription to the collection built by this DSL
    */
  inline operator fun LocalSecondaryIndexDescription.unaryPlus() {
    list.add(this)
  }

  /**
    * Adds all given LocalSecondaryIndexDescription instances to the collection built by this DSL
    */
  inline operator fun Collection<LocalSecondaryIndexDescription>.unaryPlus() {
    list.addAll(this)
  }

  /**
    * Adds all given LocalSecondaryIndexDescription instances to the collection built by this DSL
    */
  inline operator fun Array<LocalSecondaryIndexDescription>.unaryPlus() {
    list.addAll(this)
  }
}

/**
  * Builds instances of type LocalSecondaryIndexDescription:
  * Represents the properties of a local secondary index.
  */
inline fun buildLocalSecondaryIndexDescriptionCollection(dslBlock: LocalSecondaryIndexDescriptionCollectionDSL.() -> Unit) =
  LocalSecondaryIndexDescriptionCollectionDSL(mutableListOf<LocalSecondaryIndexDescription>()).apply(dslBlock).build()