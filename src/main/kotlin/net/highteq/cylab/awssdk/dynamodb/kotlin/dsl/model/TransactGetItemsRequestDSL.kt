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
import software.amazon.awssdk.services.dynamodb.model.TransactGetItem
import software.amazon.awssdk.services.dynamodb.model.TransactGetItemsRequest

/**
  * Builds instances of type TransactGetItemsRequest:
  * 
  */
@DynamodbDSL
class TransactGetItemsRequestDSL {
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder = TransactGetItemsRequest.builder()
  internal fun build(): TransactGetItemsRequest = builder.build()
    
  /**
    * A value of TOTAL causes consumed capacity information to be returned, and a value of
    *  NONE prevents that information from being returned. No other value is valid.
    */
  var returnConsumedCapacity: ReturnConsumedCapacity?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.returnConsumedCapacity(value)
    }


  /**
    * An ordered array of up to 25 TransactGetItem objects, each of which contains a Get
    *  structure.
    */
  var transactItems: Collection<TransactGetItem>?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.transactItems(value)
    }


  /**
    * 
    */
  var overrideConfiguration: AwsRequestOverrideConfiguration?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.overrideConfiguration(value)
    }

    
  /**
    * A value of TOTAL causes consumed capacity information to be returned, and a value of
    *  NONE prevents that information from being returned. No other value is valid.
    */
  fun returnConsumedCapacity(value: String?) {
    builder.returnConsumedCapacity(value)
  }

    
  /**
    * An ordered array of up to 25 TransactGetItem objects, each of which contains a Get
    *  structure.
    */
  fun transactItems(dslBlock: TransactGetItemCollectionDSL.() -> Unit) {
    builder.transactItems(buildTransactGetItemCollection(dslBlock))
  }

}

/**
  * Builds instances of type TransactGetItemsRequest:
  * 
  */
fun buildTransactGetItemsRequest(dslBlock: TransactGetItemsRequestDSL.() -> Unit) =
  TransactGetItemsRequestDSL().apply(dslBlock).build()