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
import software.amazon.awssdk.services.dynamodb.model.GlobalTableGlobalSecondaryIndexSettingsUpdate

/**
  * Builds a collection of type GlobalTableGlobalSecondaryIndexSettingsUpdate:
  * Represents the settings of a global secondary index for a global table that will be modified.
  */
@DynamodbDSLMarker
inline class GlobalTableGlobalSecondaryIndexSettingsUpdateCollectionDSL(
  @PublishedApi
  @Deprecated("Don't use internal fields!", level = WARNING)
  internal val list : MutableList<GlobalTableGlobalSecondaryIndexSettingsUpdate>
){
  @PublishedApi
  internal fun build() = list

  /**
    * Builds an object of type GlobalTableGlobalSecondaryIndexSettingsUpdate from 
    * the given DSL in 'dslBlock' and adds it to the collection
    */
  inline fun o(dslBlock: GlobalTableGlobalSecondaryIndexSettingsUpdateDSL.() -> Unit) {
    list.add(DynamodbDSL.globalTableGlobalSecondaryIndexSettingsUpdate(dslBlock))
  }

  /**
    * Adds a GlobalTableGlobalSecondaryIndexSettingsUpdate to the collection built by this DSL
    */
  inline operator fun GlobalTableGlobalSecondaryIndexSettingsUpdate.unaryPlus() {
    list.add(this)
  }

  /**
    * Adds all given GlobalTableGlobalSecondaryIndexSettingsUpdate instances to the collection built by this DSL
    */
  inline operator fun Collection<GlobalTableGlobalSecondaryIndexSettingsUpdate>.unaryPlus() {
    list.addAll(this)
  }

  /**
    * Adds all given GlobalTableGlobalSecondaryIndexSettingsUpdate instances to the collection built by this DSL
    */
  inline operator fun Array<GlobalTableGlobalSecondaryIndexSettingsUpdate>.unaryPlus() {
    list.addAll(this)
  }
}

/**
  * Builds a collection of type GlobalTableGlobalSecondaryIndexSettingsUpdate:
  * Represents the settings of a global secondary index for a global table that will be modified.
  */
inline fun globalTableGlobalSecondaryIndexSettingsUpdateCollection(dslBlock: GlobalTableGlobalSecondaryIndexSettingsUpdateCollectionDSL.() -> Unit) =
  GlobalTableGlobalSecondaryIndexSettingsUpdateCollectionDSL(mutableListOf<GlobalTableGlobalSecondaryIndexSettingsUpdate>()).apply(dslBlock).build()

/**
  * Builds a collection of type GlobalTableGlobalSecondaryIndexSettingsUpdate:
  * Represents the settings of a global secondary index for a global table that will be modified.
  */
inline fun DynamodbDSL.Companion.globalTableGlobalSecondaryIndexSettingsUpdateCollection(dslBlock: GlobalTableGlobalSecondaryIndexSettingsUpdateCollectionDSL.() -> Unit) =
  GlobalTableGlobalSecondaryIndexSettingsUpdateCollectionDSL(mutableListOf<GlobalTableGlobalSecondaryIndexSettingsUpdate>()).apply(dslBlock).build()