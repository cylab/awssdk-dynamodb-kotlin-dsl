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
import software.amazon.awssdk.services.dynamodb.model.GlobalTable

/**
  * Builds a collection of type GlobalTable:
  * Represents the properties of a global table.
  */
@DynamodbDSLMarker
inline class GlobalTableCollectionDSL(
  @PublishedApi
  @Deprecated("Don't use internal fields!", level = WARNING)
  internal val list : MutableList<GlobalTable>
){
  @PublishedApi
  internal fun build() = list

  /**
    * Builds an object of type GlobalTable from 
    * the given DSL in 'dslBlock' and adds it to the collection
    */
  inline fun o(dslBlock: GlobalTableDSL.() -> Unit) {
    list.add(DynamodbDSL.globalTable(dslBlock))
  }

  /**
    * Adds a GlobalTable to the collection built by this DSL
    */
  inline operator fun GlobalTable.unaryPlus() {
    list.add(this)
  }

  /**
    * Adds all given GlobalTable instances to the collection built by this DSL
    */
  inline operator fun Collection<GlobalTable>.unaryPlus() {
    list.addAll(this)
  }

  /**
    * Adds all given GlobalTable instances to the collection built by this DSL
    */
  inline operator fun Array<GlobalTable>.unaryPlus() {
    list.addAll(this)
  }
}

/**
  * Builds a collection of type GlobalTable:
  * Represents the properties of a global table.
  */
inline fun globalTableCollection(dslBlock: GlobalTableCollectionDSL.() -> Unit) =
  GlobalTableCollectionDSL(mutableListOf<GlobalTable>()).apply(dslBlock).build()

/**
  * Builds a collection of type GlobalTable:
  * Represents the properties of a global table.
  */
inline fun DynamodbDSL.Companion.globalTableCollection(dslBlock: GlobalTableCollectionDSL.() -> Unit) =
  GlobalTableCollectionDSL(mutableListOf<GlobalTable>()).apply(dslBlock).build()