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
import software.amazon.awssdk.awscore.AwsRequestOverrideConfiguration
import software.amazon.awssdk.services.dynamodb.DynamoDbAsyncClient
import software.amazon.awssdk.services.dynamodb.DynamoDbClient
import software.amazon.awssdk.services.dynamodb.model.ReturnConsumedCapacity
import software.amazon.awssdk.services.dynamodb.model.ReturnItemCollectionMetrics
import software.amazon.awssdk.services.dynamodb.model.TransactWriteItem
import software.amazon.awssdk.services.dynamodb.model.TransactWriteItemsRequest
import software.amazon.awssdk.services.dynamodb.transform.TransactWriteItemsRequestMarshaller

/**
  * Builds instances of type TransactWriteItemsRequest:
  * 
  */
@DynamodbDSL
inline class TransactWriteItemsRequestDSL(
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder: TransactWriteItemsRequest.Builder
){
  @PublishedApi
  internal fun build(): TransactWriteItemsRequest = builder.build()

  /**
    * 
    */
  inline var clientRequestToken: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.clientRequestToken(value)
    }

  /**
    * 
    */
  inline var overrideConfiguration: AwsRequestOverrideConfiguration?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.overrideConfiguration(value)
    }

  /**
    * 
    */
  inline var returnConsumedCapacity: ReturnConsumedCapacity?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.returnConsumedCapacity(value)
    }

  /**
    * 
    */
  inline var returnItemCollectionMetrics: ReturnItemCollectionMetrics?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.returnItemCollectionMetrics(value)
    }

  /**
    * 
    */
  inline var transactItems: Collection<TransactWriteItem>?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.transactItems(value)
    }

  /**
    * 
    */
  inline fun returnConsumedCapacity(value: String?) {
    builder.returnConsumedCapacity(value)
  }

  /**
    * 
    */
  inline fun returnItemCollectionMetrics(value: String?) {
    builder.returnItemCollectionMetrics(value)
  }

  /**
    * 
    */
  inline fun transactItems(dslBlock: TransactWriteItemCollectionDSL.() -> Unit) {
    builder.transactItems(buildTransactWriteItemCollection(dslBlock))
  }

}

/**
  * Builds instances of type TransactWriteItemsRequest:
  * 
  */
inline fun buildTransactWriteItemsRequest(dslBlock: TransactWriteItemsRequestDSL.() -> Unit) =
  TransactWriteItemsRequestDSL(TransactWriteItemsRequest.builder()).apply(dslBlock).build()

/**
  * TransactWriteItems is a synchronous write operation that groups up to 10 action requests. These
  *  actions can target items in different tables, but not in different AWS accounts or regions, and no two actions
  *  can target the same item. For example, you cannot both ConditionCheck and Update the
  *  same item.
  * 
  *  The actions are completed atomically so that either all of them succeed, or all of them fail. They are defined by
  *  the following objects:
  * 
  *  Put  &#x97;   Initiates a PutItem operation to write a new item. This structure
  *  specifies the primary key of the item to be written, the name of the table to write it in, an optional condition
  *  expression that must be satisfied for the write to succeed, a list of the item's attributes, and a field
  *  indicating whether or not to retrieve the item's attributes if the condition is not met.
  * 
  *  Update  &#x97;   Initiates an UpdateItem operation to update an existing item. This
  *  structure specifies the primary key of the item to be updated, the name of the table where it resides, an
  *  optional condition expression that must be satisfied for the update to succeed, an expression that defines one or
  *  more attributes to be updated, and a field indicating whether or not to retrieve the item's attributes if the
  *  condition is not met.
  * 
  *  Delete  &#x97;   Initiates a DeleteItem operation to delete an existing item. This
  *  structure specifies the primary key of the item to be deleted, the name of the table where it resides, an
  *  optional condition expression that must be satisfied for the deletion to succeed, and a field indicating whether
  *  or not to retrieve the item's attributes if the condition is not met.
  * 
  *  ConditionCheck  &#x97;   Applies a condition to an item that is not being modified by the
  *  transaction. This structure specifies the primary key of the item to be checked, the name of the table where it
  *  resides, a condition expression that must be satisfied for the transaction to succeed, and a field indicating
  *  whether or not to retrieve the item's attributes if the condition is not met.
  * 
  *  DynamoDB rejects the entire TransactWriteItems request if any of the following is true:
  * 
  *  A condition in one of the condition expressions is not met.
  * 
  *  A conflicting operation is in the process of updating the same item.
  * 
  *  There is insufficient provisioned capacity for the transaction to be completed.
  * 
  *  An item size becomes too large (bigger than 400 KB), a Local Secondary Index (LSI) becomes too large, or a
  *  similar validation error occurs because of changes made by the transaction.
  * 
  *  There is a user error, such as an invalid data format.
  */
inline fun DynamoDbAsyncClient.transactWriteItemsBy(dslBlock: TransactWriteItemsRequestDSL.() -> Unit) =
  this.transactWriteItems(buildTransactWriteItemsRequest(dslBlock))

/**
  * TransactWriteItems is a synchronous write operation that groups up to 10 action requests. These
  *  actions can target items in different tables, but not in different AWS accounts or regions, and no two actions
  *  can target the same item. For example, you cannot both ConditionCheck and Update the
  *  same item.
  * 
  *  The actions are completed atomically so that either all of them succeed, or all of them fail. They are defined by
  *  the following objects:
  * 
  *  Put  &#x97;   Initiates a PutItem operation to write a new item. This structure
  *  specifies the primary key of the item to be written, the name of the table to write it in, an optional condition
  *  expression that must be satisfied for the write to succeed, a list of the item's attributes, and a field
  *  indicating whether or not to retrieve the item's attributes if the condition is not met.
  * 
  *  Update  &#x97;   Initiates an UpdateItem operation to update an existing item. This
  *  structure specifies the primary key of the item to be updated, the name of the table where it resides, an
  *  optional condition expression that must be satisfied for the update to succeed, an expression that defines one or
  *  more attributes to be updated, and a field indicating whether or not to retrieve the item's attributes if the
  *  condition is not met.
  * 
  *  Delete  &#x97;   Initiates a DeleteItem operation to delete an existing item. This
  *  structure specifies the primary key of the item to be deleted, the name of the table where it resides, an
  *  optional condition expression that must be satisfied for the deletion to succeed, and a field indicating whether
  *  or not to retrieve the item's attributes if the condition is not met.
  * 
  *  ConditionCheck  &#x97;   Applies a condition to an item that is not being modified by the
  *  transaction. This structure specifies the primary key of the item to be checked, the name of the table where it
  *  resides, a condition expression that must be satisfied for the transaction to succeed, and a field indicating
  *  whether or not to retrieve the item's attributes if the condition is not met.
  * 
  *  DynamoDB rejects the entire TransactWriteItems request if any of the following is true:
  * 
  *  A condition in one of the condition expressions is not met.
  * 
  *  A conflicting operation is in the process of updating the same item.
  * 
  *  There is insufficient provisioned capacity for the transaction to be completed.
  * 
  *  An item size becomes too large (bigger than 400 KB), a Local Secondary Index (LSI) becomes too large, or a
  *  similar validation error occurs because of changes made by the transaction.
  * 
  *  There is a user error, such as an invalid data format.
  */
inline fun DynamoDbClient.transactWriteItemsBy(dslBlock: TransactWriteItemsRequestDSL.() -> Unit) =
  this.transactWriteItems(buildTransactWriteItemsRequest(dslBlock))

/**
  * 
  */
inline fun TransactWriteItemsRequestMarshaller.marshallBy(dslBlock: TransactWriteItemsRequestDSL.() -> Unit) =
  this.marshall(buildTransactWriteItemsRequest(dslBlock))