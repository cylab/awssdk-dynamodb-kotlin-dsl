/*
  This file was generated from https://github.com/aws/aws-sdk-java-v2 by https://github.com/cylab/aws-kotlin-dsl-builder
  Like the original code, this file and project is licensed under
  Apache License Version 2.0
  See LICENSE.txt for more info
*/
@file:Suppress("DEPRECATION")
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
class TransactWriteItemDSL {
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder = TransactWriteItem.builder()
  internal fun build(): TransactWriteItem = builder.build()
    
  /**
    * A request to perform a PutItem operation.
    */
  var put: Put?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.put(value)
    }


  /**
    * A request to perform an UpdateItem operation.
    */
  var update: Update?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.update(value)
    }


  /**
    * A request to perform a DeleteItem operation.
    */
  var delete: Delete?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.delete(value)
    }


  /**
    * A request to perform a check item operation.
    */
  var conditionCheck: ConditionCheck?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.conditionCheck(value)
    }

  
    
  /**
    * A request to perform a PutItem operation.
    */
  fun put(dslBlock: PutDSL.() -> Unit) {
    builder.put(buildPut(dslBlock))
  }


  /**
    * A request to perform an UpdateItem operation.
    */
  fun update(dslBlock: UpdateDSL.() -> Unit) {
    builder.update(buildUpdate(dslBlock))
  }


  /**
    * A request to perform a DeleteItem operation.
    */
  fun delete(dslBlock: DeleteDSL.() -> Unit) {
    builder.delete(buildDelete(dslBlock))
  }


  /**
    * A request to perform a check item operation.
    */
  fun conditionCheck(dslBlock: ConditionCheckDSL.() -> Unit) {
    builder.conditionCheck(buildConditionCheck(dslBlock))
  }

}

/**
  * Builds instances of type TransactWriteItem:
  * A list of requests that can perform update, put, delete, or check operations on multiple items in one or more tables
  *  atomically.
  */
fun buildTransactWriteItem(dslBlock: TransactWriteItemDSL.() -> Unit) =
  TransactWriteItemDSL().apply(dslBlock).build()