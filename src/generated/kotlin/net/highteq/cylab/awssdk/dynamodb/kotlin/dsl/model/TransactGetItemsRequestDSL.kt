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
import software.amazon.awssdk.services.dynamodb.model.TransactGetItem
import software.amazon.awssdk.services.dynamodb.model.TransactGetItemsRequest
import software.amazon.awssdk.services.dynamodb.transform.TransactGetItemsRequestMarshaller

/**
  * Builds instances of type TransactGetItemsRequest:
  * 
  */
@DynamodbDSL
inline class TransactGetItemsRequestDSL(
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder: TransactGetItemsRequest.Builder
){
  @PublishedApi
  internal fun build(): TransactGetItemsRequest = builder.build()

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
  inline var transactItems: Collection<TransactGetItem>?
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
  inline fun transactItems(dslBlock: TransactGetItemCollectionDSL.() -> Unit) {
    builder.transactItems(buildTransactGetItemCollection(dslBlock))
  }

}

/**
  * Builds instances of type TransactGetItemsRequest:
  * 
  */
inline fun buildTransactGetItemsRequest(dslBlock: TransactGetItemsRequestDSL.() -> Unit) =
  TransactGetItemsRequestDSL(TransactGetItemsRequest.builder()).apply(dslBlock).build()

/**
  * TransactGetItems is a synchronous operation that atomically retrieves multiple items from one or
  *  more tables (but not from indexes) in a single account and region. A TransactGetItems call can
  *  contain up to 10 TransactGetItem objects, each of which contains a Get structure that
  *  specifies an item to retrieve from a table in the account and region. A call to TransactGetItems
  *  cannot retrieve items from tables in more than one AWS account or region.
  * 
  *  DynamoDB rejects the entire TransactGetItems request if any of the following is true:
  * 
  *  A conflicting operation is in the process of updating an item to be read.
  * 
  *  There is insufficient provisioned capacity for the transaction to be completed.
  * 
  *  There is a user error, such as an invalid data format.
  */
inline fun DynamoDbAsyncClient.transactGetItemsBy(dslBlock: TransactGetItemsRequestDSL.() -> Unit) =
  this.transactGetItems(buildTransactGetItemsRequest(dslBlock))

/**
  * TransactGetItems is a synchronous operation that atomically retrieves multiple items from one or
  *  more tables (but not from indexes) in a single account and region. A TransactGetItems call can
  *  contain up to 10 TransactGetItem objects, each of which contains a Get structure that
  *  specifies an item to retrieve from a table in the account and region. A call to TransactGetItems
  *  cannot retrieve items from tables in more than one AWS account or region.
  * 
  *  DynamoDB rejects the entire TransactGetItems request if any of the following is true:
  * 
  *  A conflicting operation is in the process of updating an item to be read.
  * 
  *  There is insufficient provisioned capacity for the transaction to be completed.
  * 
  *  There is a user error, such as an invalid data format.
  */
inline fun DynamoDbClient.transactGetItemsBy(dslBlock: TransactGetItemsRequestDSL.() -> Unit) =
  this.transactGetItems(buildTransactGetItemsRequest(dslBlock))

/**
  * 
  */
inline fun TransactGetItemsRequestMarshaller.marshallBy(dslBlock: TransactGetItemsRequestDSL.() -> Unit) =
  this.marshall(buildTransactGetItemsRequest(dslBlock))