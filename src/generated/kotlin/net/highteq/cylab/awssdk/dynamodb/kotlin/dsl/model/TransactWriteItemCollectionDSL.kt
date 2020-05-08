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
import software.amazon.awssdk.services.dynamodb.model.TransactWriteItem

/**
  * Builds a collection of type TransactWriteItem:
  * A list of requests that can perform update, put, delete, or check operations on multiple items in one or more tables
  *  atomically.
  */
@DynamodbDSL
inline class TransactWriteItemCollectionDSL(
  @PublishedApi
  @Deprecated("Don't use internal fields!", level = WARNING)
  internal val list : MutableList<TransactWriteItem>
){
  @PublishedApi
  internal fun build() = list

  /**
    * Builds an object of type TransactWriteItem from 
    * the given DSL in 'dslBlock' and adds it to the collection
    */
  inline fun o(dslBlock: TransactWriteItemDSL.() -> Unit) {
    list.add(buildTransactWriteItem(dslBlock))
  }

  /**
    * Adds a TransactWriteItem to the collection built by this DSL
    */
  inline operator fun TransactWriteItem.unaryPlus() {
    list.add(this)
  }

  /**
    * Adds all given TransactWriteItem instances to the collection built by this DSL
    */
  inline operator fun Collection<TransactWriteItem>.unaryPlus() {
    list.addAll(this)
  }

  /**
    * Adds all given TransactWriteItem instances to the collection built by this DSL
    */
  inline operator fun Array<TransactWriteItem>.unaryPlus() {
    list.addAll(this)
  }
}

/**
  * Builds a collection of type TransactWriteItem:
  * A list of requests that can perform update, put, delete, or check operations on multiple items in one or more tables
  *  atomically.
  */
inline fun buildTransactWriteItemCollection(dslBlock: TransactWriteItemCollectionDSL.() -> Unit) =
  TransactWriteItemCollectionDSL(mutableListOf<TransactWriteItem>()).apply(dslBlock).build()