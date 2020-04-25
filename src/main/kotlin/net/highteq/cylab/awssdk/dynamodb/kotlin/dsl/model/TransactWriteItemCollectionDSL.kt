/*
  This file was generated from https://github.com/aws/aws-sdk-java-v2 by https://github.com/cylab/aws-kotlin-dsl-builder
  Like the original code, this file and project is licensed under
  Apache License Version 2.0
  See LICENSE.txt for more info
*/
package net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.model

import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSL
import software.amazon.awssdk.services.dynamodb.model.TransactWriteItem

/**
  * Builds instances of type TransactWriteItem:
  * A list of requests that can perform update, put, delete, or check operations on multiple items in one or more tables
  *  atomically.
  */
@DynamodbDSL
class TransactWriteItemCollectionDSL {
  private val list = ArrayList<TransactWriteItem>()
  internal fun build() : List<TransactWriteItem> = list

  fun item(init: TransactWriteItemDSL.() -> Unit) {
    list.add(TransactWriteItemDSL().apply(init).build())
  }

  operator fun TransactWriteItem.unaryPlus() {
    list.add(this)
  }

  operator fun Collection<TransactWriteItem>.unaryPlus() {
    list.addAll(this)
  }

  operator fun Array<TransactWriteItem>.unaryPlus() {
    list.addAll(this)
  }
}

/**
  * Builds instances of type TransactWriteItem:
  * A list of requests that can perform update, put, delete, or check operations on multiple items in one or more tables
  *  atomically.
  */
fun buildTransactWriteItemCollection(dslBlock: TransactWriteItemCollectionDSL.() -> Unit) =
  TransactWriteItemCollectionDSL().apply(dslBlock).build()