/*
  This file was generated from https://github.com/aws/aws-sdk-java-v2 by https://github.com/cylab/aws-kotlin-dsl-builder
  Like the original code, this file and project is licensed under
  Apache License Version 2.0
  See LICENSE.txt for more info
*/
package net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.model

import kotlin.DeprecationLevel.HIDDEN
import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSL
import software.amazon.awssdk.services.dynamodb.model.Get
import software.amazon.awssdk.services.dynamodb.model.TransactGetItem

/**
  * Builds instances of type TransactGetItem:
  * Specifies an item to be retrieved as part of the transaction.
  */
@DynamodbDSL
class TransactGetItemDSL {
  private val builder = TransactGetItem.builder()
  internal fun build(): TransactGetItem = builder.build()
    
  /**
    * Contains the primary key that identifies the item to get, together with the name of the table that contains
    *  the item, and optionally the specific attributes of the item to retrieve.
    */
  @get:JvmSynthetic // Hide from Java callers
  var get: Get
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.get(value)
    }

  
    
  /**
    * Contains the primary key that identifies the item to get, together with the name of the table that contains
    *  the item, and optionally the specific attributes of the item to retrieve.
    */
  fun get(dslBlock: GetDSL.() -> Unit) {
    builder.get(buildGet(dslBlock))
  }

}

/**
  * Builds instances of type TransactGetItem:
  * Specifies an item to be retrieved as part of the transaction.
  */
fun buildTransactGetItem(dslBlock: TransactGetItemDSL.() -> Unit) =
  TransactGetItemDSL().apply(dslBlock).build()