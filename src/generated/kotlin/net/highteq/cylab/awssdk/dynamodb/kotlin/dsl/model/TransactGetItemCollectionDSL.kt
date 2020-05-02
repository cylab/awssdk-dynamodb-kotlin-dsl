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
import software.amazon.awssdk.services.dynamodb.model.TransactGetItem

/**
  * Builds instances of type TransactGetItem:
  * Specifies an item to be retrieved as part of the transaction.
  */
@DynamodbDSL
inline class TransactGetItemCollectionDSL(
  @PublishedApi
  @Deprecated("Don't use internal fields!", level = WARNING)
  internal val list : MutableList<TransactGetItem>
){
  @PublishedApi
  internal fun build() = list

  /**
    * Builds an object of type TransactGetItem from 
    * the given DSL in 'dslBlock' and adds it to the collection
    */
  inline fun o(dslBlock: TransactGetItemDSL.() -> Unit) {
    list.add(buildTransactGetItem(dslBlock))
  }

  /**
    * Adds a TransactGetItem to the collection built by this DSL
    */
  inline operator fun TransactGetItem.unaryPlus() {
    list.add(this)
  }

  /**
    * Adds all given TransactGetItem instances to the collection built by this DSL
    */
  inline operator fun Collection<TransactGetItem>.unaryPlus() {
    list.addAll(this)
  }

  /**
    * Adds all given TransactGetItem instances to the collection built by this DSL
    */
  inline operator fun Array<TransactGetItem>.unaryPlus() {
    list.addAll(this)
  }
}

/**
  * Builds instances of type TransactGetItem:
  * Specifies an item to be retrieved as part of the transaction.
  */
inline fun buildTransactGetItemCollection(dslBlock: TransactGetItemCollectionDSL.() -> Unit) =
  TransactGetItemCollectionDSL(mutableListOf<TransactGetItem>()).apply(dslBlock).build()