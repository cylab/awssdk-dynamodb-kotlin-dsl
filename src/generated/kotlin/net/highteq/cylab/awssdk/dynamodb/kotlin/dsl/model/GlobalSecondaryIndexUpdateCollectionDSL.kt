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
import software.amazon.awssdk.services.dynamodb.model.GlobalSecondaryIndexUpdate

/**
  * Builds a collection of type GlobalSecondaryIndexUpdate:
  * Represents one of the following:
  * 
  *  A new global secondary index to be added to an existing table.
  * 
  *  New provisioned throughput parameters for an existing global secondary index.
  * 
  *  An existing global secondary index to be removed from an existing table.
  */
@DynamodbDSLMarker
inline class GlobalSecondaryIndexUpdateCollectionDSL(
  @PublishedApi
  @Deprecated("Don't use internal fields!", level = WARNING)
  internal val list : MutableList<GlobalSecondaryIndexUpdate>
){
  @PublishedApi
  internal fun build() = list

  /**
    * Builds an object of type GlobalSecondaryIndexUpdate from 
    * the given DSL in 'dslBlock' and adds it to the collection
    */
  inline fun o(dslBlock: GlobalSecondaryIndexUpdateDSL.() -> Unit) {
    list.add(DynamodbDSL.globalSecondaryIndexUpdate(dslBlock))
  }

  /**
    * Adds a GlobalSecondaryIndexUpdate to the collection built by this DSL
    */
  inline operator fun GlobalSecondaryIndexUpdate.unaryPlus() {
    list.add(this)
  }

  /**
    * Adds all given GlobalSecondaryIndexUpdate instances to the collection built by this DSL
    */
  inline operator fun Collection<GlobalSecondaryIndexUpdate>.unaryPlus() {
    list.addAll(this)
  }

  /**
    * Adds all given GlobalSecondaryIndexUpdate instances to the collection built by this DSL
    */
  inline operator fun Array<GlobalSecondaryIndexUpdate>.unaryPlus() {
    list.addAll(this)
  }
}

/**
  * Builds a collection of type GlobalSecondaryIndexUpdate:
  * Represents one of the following:
  * 
  *  A new global secondary index to be added to an existing table.
  * 
  *  New provisioned throughput parameters for an existing global secondary index.
  * 
  *  An existing global secondary index to be removed from an existing table.
  */
inline fun globalSecondaryIndexUpdateCollection(dslBlock: GlobalSecondaryIndexUpdateCollectionDSL.() -> Unit) =
  GlobalSecondaryIndexUpdateCollectionDSL(mutableListOf<GlobalSecondaryIndexUpdate>()).apply(dslBlock).build()

/**
  * Builds a collection of type GlobalSecondaryIndexUpdate:
  * Represents one of the following:
  * 
  *  A new global secondary index to be added to an existing table.
  * 
  *  New provisioned throughput parameters for an existing global secondary index.
  * 
  *  An existing global secondary index to be removed from an existing table.
  */
inline fun DynamodbDSL.Companion.globalSecondaryIndexUpdateCollection(dslBlock: GlobalSecondaryIndexUpdateCollectionDSL.() -> Unit) =
  GlobalSecondaryIndexUpdateCollectionDSL(mutableListOf<GlobalSecondaryIndexUpdate>()).apply(dslBlock).build()