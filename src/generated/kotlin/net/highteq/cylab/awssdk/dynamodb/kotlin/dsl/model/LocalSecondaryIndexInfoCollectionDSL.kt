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
import software.amazon.awssdk.services.dynamodb.model.LocalSecondaryIndexInfo

/**
  * Builds a collection of type LocalSecondaryIndexInfo:
  * Represents the properties of a local secondary index for the table when the backup was created.
  */
@DynamodbDSL
inline class LocalSecondaryIndexInfoCollectionDSL(
  @PublishedApi
  @Deprecated("Don't use internal fields!", level = WARNING)
  internal val list : MutableList<LocalSecondaryIndexInfo>
){
  @PublishedApi
  internal fun build() = list

  /**
    * Builds an object of type LocalSecondaryIndexInfo from 
    * the given DSL in 'dslBlock' and adds it to the collection
    */
  inline fun o(dslBlock: LocalSecondaryIndexInfoDSL.() -> Unit) {
    list.add(buildLocalSecondaryIndexInfo(dslBlock))
  }

  /**
    * Adds a LocalSecondaryIndexInfo to the collection built by this DSL
    */
  inline operator fun LocalSecondaryIndexInfo.unaryPlus() {
    list.add(this)
  }

  /**
    * Adds all given LocalSecondaryIndexInfo instances to the collection built by this DSL
    */
  inline operator fun Collection<LocalSecondaryIndexInfo>.unaryPlus() {
    list.addAll(this)
  }

  /**
    * Adds all given LocalSecondaryIndexInfo instances to the collection built by this DSL
    */
  inline operator fun Array<LocalSecondaryIndexInfo>.unaryPlus() {
    list.addAll(this)
  }
}

/**
  * Builds a collection of type LocalSecondaryIndexInfo:
  * Represents the properties of a local secondary index for the table when the backup was created.
  */
inline fun buildLocalSecondaryIndexInfoCollection(dslBlock: LocalSecondaryIndexInfoCollectionDSL.() -> Unit) =
  LocalSecondaryIndexInfoCollectionDSL(mutableListOf<LocalSecondaryIndexInfo>()).apply(dslBlock).build()