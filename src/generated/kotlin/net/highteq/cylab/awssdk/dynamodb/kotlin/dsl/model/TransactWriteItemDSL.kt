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
import software.amazon.awssdk.services.dynamodb.model.ConditionCheck
import software.amazon.awssdk.services.dynamodb.model.Delete
import software.amazon.awssdk.services.dynamodb.model.Put
import software.amazon.awssdk.services.dynamodb.model.TransactWriteItem
import software.amazon.awssdk.services.dynamodb.model.Update

/**
  * Builds instances of type TransactWriteItem:
  * A list of requests that can perform update, put, delete, or check operations on multiple items in one or more tables
  *  atomically.
  */
@DynamodbDSL
inline class TransactWriteItemDSL(
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder: TransactWriteItem.Builder
){
  @PublishedApi
  internal fun build(): TransactWriteItem = builder.build()

  /**
    * 
    */
  inline var conditionCheck: ConditionCheck?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.conditionCheck(value)
    }

  /**
    * 
    */
  inline var delete: Delete?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.delete(value)
    }

  /**
    * 
    */
  inline var put: Put?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.put(value)
    }

  /**
    * 
    */
  inline var update: Update?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.update(value)
    }

  /**
    * 
    */
  inline fun conditionCheck(dslBlock: ConditionCheckDSL.() -> Unit) {
    builder.conditionCheck(buildConditionCheck(dslBlock))
  }

  /**
    * 
    */
  inline fun delete(dslBlock: DeleteDSL.() -> Unit) {
    builder.delete(buildDelete(dslBlock))
  }

  /**
    * 
    */
  inline fun put(dslBlock: PutDSL.() -> Unit) {
    builder.put(buildPut(dslBlock))
  }

  /**
    * 
    */
  inline fun update(dslBlock: UpdateDSL.() -> Unit) {
    builder.update(buildUpdate(dslBlock))
  }

}

/**
  * Builds instances of type TransactWriteItem:
  * A list of requests that can perform update, put, delete, or check operations on multiple items in one or more tables
  *  atomically.
  */
inline fun buildTransactWriteItem(dslBlock: TransactWriteItemDSL.() -> Unit) =
  TransactWriteItemDSL(TransactWriteItem.builder()).apply(dslBlock).build()