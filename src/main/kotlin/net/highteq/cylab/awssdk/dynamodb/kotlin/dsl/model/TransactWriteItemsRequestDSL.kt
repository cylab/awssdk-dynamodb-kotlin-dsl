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
import software.amazon.awssdk.awscore.AwsRequestOverrideConfiguration
import software.amazon.awssdk.services.dynamodb.model.ReturnConsumedCapacity
import software.amazon.awssdk.services.dynamodb.model.ReturnItemCollectionMetrics
import software.amazon.awssdk.services.dynamodb.model.TransactWriteItem
import software.amazon.awssdk.services.dynamodb.model.TransactWriteItemsRequest

/**
  * Builds instances of type TransactWriteItemsRequest:
  * 
  */
@DynamodbDSL
class TransactWriteItemsRequestDSL {
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder = TransactWriteItemsRequest.builder()
  internal fun build(): TransactWriteItemsRequest = builder.build()
    
  /**
    * 
    */
  var overrideConfiguration: AwsRequestOverrideConfiguration
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.overrideConfiguration(value)
    }


  /**
    * Sets the value of the ReturnConsumedCapacity property for this object.
    */
  var returnConsumedCapacity: ReturnConsumedCapacity
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.returnConsumedCapacity(value)
    }


  /**
    * Determines whether item collection metrics are returned. If set to SIZE, the response includes
    *  statistics about item collections (if any), that were modified during the operation and are returned in the
    *  response. If set to NONE (the default), no statistics are returned.
    */
  var returnItemCollectionMetrics: ReturnItemCollectionMetrics
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.returnItemCollectionMetrics(value)
    }


  /**
    * An ordered array of up to 25 TransactWriteItem objects, each of which contains a
    *  ConditionCheck, Put, Update, or Delete object. These can
    *  operate on items in different tables, but the tables must reside in the same AWS account and Region, and no
    *  two of them can operate on the same item.
    */
  var transactItems: Collection<TransactWriteItem>
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.transactItems(value)
    }


  /**
    * Providing a ClientRequestToken makes the call to TransactWriteItems idempotent,
    *  meaning that multiple identical calls have the same effect as one single call.
    * 
    *  Although multiple identical calls using the same client request token produce the same result on the server
    *  (no side effects), the responses to the calls might not be the same. If the
    *  ReturnConsumedCapacity&gt; parameter is set, then the initial TransactWriteItems
    *  call returns the amount of write capacity units consumed in making the changes. Subsequent
    *  TransactWriteItems calls with the same client token return the number of read capacity units
    *  consumed in reading the item.
    * 
    *  A client request token is valid for 10 minutes after the first request that uses it is completed. After 10
    *  minutes, any request with the same client token is treated as a new request. Do not resubmit the same request
    *  with the same client token for more than 10 minutes, or the result might not be idempotent.
    * 
    *  If you submit a request with the same client token but a change in other parameters within the 10-minute
    *  idempotency window, DynamoDB returns an IdempotentParameterMismatch exception.
    */
  var clientRequestToken: String
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.clientRequestToken(value)
    }

    
  /**
    * Sets the value of the ReturnConsumedCapacity property for this object.
    */
  fun returnConsumedCapacity(value: String) {
    builder.returnConsumedCapacity(value)
  }


  /**
    * Determines whether item collection metrics are returned. If set to SIZE, the response includes
    *  statistics about item collections (if any), that were modified during the operation and are returned in the
    *  response. If set to NONE (the default), no statistics are returned.
    */
  fun returnItemCollectionMetrics(value: String) {
    builder.returnItemCollectionMetrics(value)
  }

    
  /**
    * An ordered array of up to 25 TransactWriteItem objects, each of which contains a
    *  ConditionCheck, Put, Update, or Delete object. These can
    *  operate on items in different tables, but the tables must reside in the same AWS account and Region, and no
    *  two of them can operate on the same item.
    */
  fun transactItems(dslBlock: TransactWriteItemCollectionDSL.() -> Unit) {
    builder.transactItems(buildTransactWriteItemCollection(dslBlock))
  }

}

/**
  * Builds instances of type TransactWriteItemsRequest:
  * 
  */
fun buildTransactWriteItemsRequest(dslBlock: TransactWriteItemsRequestDSL.() -> Unit) =
  TransactWriteItemsRequestDSL().apply(dslBlock).build()