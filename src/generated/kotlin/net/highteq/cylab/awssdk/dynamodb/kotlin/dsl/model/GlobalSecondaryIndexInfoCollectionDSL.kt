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
import software.amazon.awssdk.services.dynamodb.model.GlobalSecondaryIndexInfo

/**
  * Builds a collection of type GlobalSecondaryIndexInfo:
  * Represents the properties of a global secondary index for the table when the backup was created.
  */
@DynamodbDSLMarker
inline class GlobalSecondaryIndexInfoCollectionDSL(
  @PublishedApi
  @Deprecated("Don't use internal fields!", level = WARNING)
  internal val list : MutableList<GlobalSecondaryIndexInfo>
){
  @PublishedApi
  internal fun build() = list

  /**
    * Builds an object of type GlobalSecondaryIndexInfo from 
    * the given DSL in 'dslBlock' and adds it to the collection
    */
  inline fun o(dslBlock: GlobalSecondaryIndexInfoDSL.() -> Unit) {
    list.add(DynamodbDSL.globalSecondaryIndexInfo(dslBlock))
  }

  /**
    * Adds a GlobalSecondaryIndexInfo to the collection built by this DSL
    */
  inline operator fun GlobalSecondaryIndexInfo.unaryPlus() {
    list.add(this)
  }

  /**
    * Adds all given GlobalSecondaryIndexInfo instances to the collection built by this DSL
    */
  inline operator fun Collection<GlobalSecondaryIndexInfo>.unaryPlus() {
    list.addAll(this)
  }

  /**
    * Adds all given GlobalSecondaryIndexInfo instances to the collection built by this DSL
    */
  inline operator fun Array<GlobalSecondaryIndexInfo>.unaryPlus() {
    list.addAll(this)
  }
}

/**
  * Builds a collection of type GlobalSecondaryIndexInfo:
  * Represents the properties of a global secondary index for the table when the backup was created.
  */
inline fun globalSecondaryIndexInfoCollection(dslBlock: GlobalSecondaryIndexInfoCollectionDSL.() -> Unit) =
  GlobalSecondaryIndexInfoCollectionDSL(mutableListOf<GlobalSecondaryIndexInfo>()).apply(dslBlock).build()

/**
  * Builds a collection of type GlobalSecondaryIndexInfo:
  * Represents the properties of a global secondary index for the table when the backup was created.
  */
inline fun DynamodbDSL.Companion.globalSecondaryIndexInfoCollection(dslBlock: GlobalSecondaryIndexInfoCollectionDSL.() -> Unit) =
  GlobalSecondaryIndexInfoCollectionDSL(mutableListOf<GlobalSecondaryIndexInfo>()).apply(dslBlock).build()