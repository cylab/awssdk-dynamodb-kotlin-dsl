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
import software.amazon.awssdk.services.dynamodb.model.LocalSecondaryIndex

/**
  * Builds instances of type LocalSecondaryIndex:
  * Represents the properties of a local secondary index.
  */
@DynamodbDSL
inline class LocalSecondaryIndexCollectionDSL(
  @PublishedApi
  @Deprecated("Don't use internal fields!", level = WARNING)
  internal val list : MutableList<LocalSecondaryIndex>
){
  @PublishedApi
  internal fun build() = list

  /**
    * Builds an object of type LocalSecondaryIndex from 
    * the given DSL in 'dslBlock' and adds it to the collection
    */
  inline fun o(dslBlock: LocalSecondaryIndexDSL.() -> Unit) {
    list.add(buildLocalSecondaryIndex(dslBlock))
  }

  /**
    * Adds a LocalSecondaryIndex to the collection built by this DSL
    */
  inline operator fun LocalSecondaryIndex.unaryPlus() {
    list.add(this)
  }

  /**
    * Adds all given LocalSecondaryIndex instances to the collection built by this DSL
    */
  inline operator fun Collection<LocalSecondaryIndex>.unaryPlus() {
    list.addAll(this)
  }

  /**
    * Adds all given LocalSecondaryIndex instances to the collection built by this DSL
    */
  inline operator fun Array<LocalSecondaryIndex>.unaryPlus() {
    list.addAll(this)
  }
}

/**
  * Builds instances of type LocalSecondaryIndex:
  * Represents the properties of a local secondary index.
  */
inline fun buildLocalSecondaryIndexCollection(dslBlock: LocalSecondaryIndexCollectionDSL.() -> Unit) =
  LocalSecondaryIndexCollectionDSL(mutableListOf<LocalSecondaryIndex>()).apply(dslBlock).build()