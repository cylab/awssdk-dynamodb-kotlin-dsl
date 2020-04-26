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
import software.amazon.awssdk.awscore.AwsResponseMetadata
import software.amazon.awssdk.http.SdkHttpResponse
import software.amazon.awssdk.services.dynamodb.model.ConsumedCapacity
import software.amazon.awssdk.services.dynamodb.model.ItemCollectionMetrics
import software.amazon.awssdk.services.dynamodb.model.TransactWriteItemsResponse

/**
  * Builds instances of type TransactWriteItemsResponse:
  * 
  */
@DynamodbDSL
class TransactWriteItemsResponseDSL {
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder = TransactWriteItemsResponse.builder()
  internal fun build(): TransactWriteItemsResponse = builder.build()
    
  /**
    * The capacity units consumed by the entire TransactWriteItems operation. The values of the list
    *  are ordered according to the ordering of the TransactItems request parameter.
    */
  var consumedCapacity: Collection<ConsumedCapacity>
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.consumedCapacity(value)
    }


  /**
    * A list of tables that were processed by TransactWriteItems and, for each table, information
    *  about any item collections that were affected by individual UpdateItem, PutItem, or
    *  DeleteItem operations.
    */
  var itemCollectionMetrics: Map<String, Collection<ItemCollectionMetrics>>
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.itemCollectionMetrics(value)
    }


  /**
    * 
    */
  var responseMetadata: AwsResponseMetadata
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.responseMetadata(value)
    }


  /**
    * 
    */
  var sdkHttpResponse: SdkHttpResponse
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.sdkHttpResponse(value)
    }

  
    
  /**
    * The capacity units consumed by the entire TransactWriteItems operation. The values of the list
    *  are ordered according to the ordering of the TransactItems request parameter.
    */
  fun consumedCapacity(dslBlock: ConsumedCapacityCollectionDSL.() -> Unit) {
    builder.consumedCapacity(buildConsumedCapacityCollection(dslBlock))
  }

}

/**
  * Builds instances of type TransactWriteItemsResponse:
  * 
  */
fun buildTransactWriteItemsResponse(dslBlock: TransactWriteItemsResponseDSL.() -> Unit) =
  TransactWriteItemsResponseDSL().apply(dslBlock).build()