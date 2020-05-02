/*
  This file was generated from https://github.com/aws/aws-sdk-java-v2 by https://github.com/cylab/aws-kotlin-dsl-builder
  Like the original code, this file and project is licensed under
  Apache License Version 2.0
  See LICENSE.txt for more info
*/
@file:Suppress("DEPRECATION", "NOTHING_TO_INLINE")
package net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.model

import kotlin.DeprecationLevel.HIDDEN
import kotlin.DeprecationLevel.WARNING
import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSL
import software.amazon.awssdk.services.dynamodb.model.Get
import software.amazon.awssdk.services.dynamodb.model.TransactGetItem

/**
  * Builds instances of type TransactGetItem:
  * Specifies an item to be retrieved as part of the transaction.
  */
@DynamodbDSL
inline class TransactGetItemDSL(
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder: TransactGetItem.Builder
){
  @PublishedApi
  internal fun build(): TransactGetItem = builder.build()

  /**
    * 
    */
  inline var get: Get?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.get(value)
    }

  /**
    * 
    */
  inline fun get(dslBlock: GetDSL.() -> Unit) {
    builder.get(buildGet(dslBlock))
  }

}

/**
  * Builds instances of type TransactGetItem:
  * Specifies an item to be retrieved as part of the transaction.
  */
inline fun buildTransactGetItem(dslBlock: TransactGetItemDSL.() -> Unit) =
  TransactGetItemDSL(TransactGetItem.builder()).apply(dslBlock).build()