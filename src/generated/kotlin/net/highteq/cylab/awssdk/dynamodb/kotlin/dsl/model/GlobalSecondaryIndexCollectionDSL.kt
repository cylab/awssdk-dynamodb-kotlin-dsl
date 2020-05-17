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
import software.amazon.awssdk.services.dynamodb.model.GlobalSecondaryIndex

/**
  * Builds a collection of type GlobalSecondaryIndex:
  * Represents the properties of a global secondary index.
  */
@DynamodbDSLMarker
inline class GlobalSecondaryIndexCollectionDSL(
  @PublishedApi
  @Deprecated("Don't use internal fields!", level = WARNING)
  internal val list : MutableList<GlobalSecondaryIndex>
){
  @PublishedApi
  internal fun build() = list

  /**
    * Builds an object of type GlobalSecondaryIndex from 
    * the given DSL in 'dslBlock' and adds it to the collection
    */
  inline fun o(dslBlock: GlobalSecondaryIndexDSL.() -> Unit) {
    list.add(DynamodbDSL.globalSecondaryIndex(dslBlock))
  }

  /**
    * Adds a GlobalSecondaryIndex to the collection built by this DSL
    */
  inline operator fun GlobalSecondaryIndex.unaryPlus() {
    list.add(this)
  }

  /**
    * Adds all given GlobalSecondaryIndex instances to the collection built by this DSL
    */
  inline operator fun Collection<GlobalSecondaryIndex>.unaryPlus() {
    list.addAll(this)
  }

  /**
    * Adds all given GlobalSecondaryIndex instances to the collection built by this DSL
    */
  inline operator fun Array<GlobalSecondaryIndex>.unaryPlus() {
    list.addAll(this)
  }
}

/**
  * Builds a collection of type GlobalSecondaryIndex:
  * Represents the properties of a global secondary index.
  */
inline fun globalSecondaryIndexCollection(dslBlock: GlobalSecondaryIndexCollectionDSL.() -> Unit) =
  GlobalSecondaryIndexCollectionDSL(mutableListOf<GlobalSecondaryIndex>()).apply(dslBlock).build()

/**
  * Builds a collection of type GlobalSecondaryIndex:
  * Represents the properties of a global secondary index.
  */
inline fun DynamodbDSL.Companion.globalSecondaryIndexCollection(dslBlock: GlobalSecondaryIndexCollectionDSL.() -> Unit) =
  GlobalSecondaryIndexCollectionDSL(mutableListOf<GlobalSecondaryIndex>()).apply(dslBlock).build()