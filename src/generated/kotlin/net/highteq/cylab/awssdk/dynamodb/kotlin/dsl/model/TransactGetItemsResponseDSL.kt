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
import software.amazon.awssdk.services.dynamodb.model.ItemResponse
import software.amazon.awssdk.services.dynamodb.model.TransactGetItemsResponse

/**
  * Builds instances of type TransactGetItemsResponse:
  * 
  */
@DynamodbDSL
class TransactGetItemsResponseDSL {
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder = TransactGetItemsResponse.builder()
  internal fun build(): TransactGetItemsResponse = builder.build()
    
  /**
    * If the ReturnConsumedCapacity value was TOTAL, this is an array of
    *  ConsumedCapacity objects, one for each table addressed by TransactGetItem objects
    *  in the TransactItems parameter. These ConsumedCapacity objects report the read-capacity
    *  units consumed by the TransactGetItems call in that table.
    */
  var consumedCapacity: Collection<ConsumedCapacity>?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.consumedCapacity(value)
    }


  /**
    * 
    */
  var responseMetadata: AwsResponseMetadata?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.responseMetadata(value)
    }


  /**
    * An ordered array of up to 25 ItemResponse objects, each of which corresponds to the
    *  TransactGetItem object in the same position in the TransactItems array. Each
    *  ItemResponse object contains a Map of the name-value pairs that are the projected attributes of
    *  the requested item.
    * 
    *  If a requested item could not be retrieved, the corresponding ItemResponse object is Null, or if
    *  the requested item has no projected attributes, the corresponding ItemResponse object is an
    *  empty Map.
    */
  var responses: Collection<ItemResponse>?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.responses(value)
    }


  /**
    * 
    */
  var sdkHttpResponse: SdkHttpResponse?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.sdkHttpResponse(value)
    }

  
  
    
  /**
    * If the ReturnConsumedCapacity value was TOTAL, this is an array of
    *  ConsumedCapacity objects, one for each table addressed by TransactGetItem objects
    *  in the TransactItems parameter. These ConsumedCapacity objects report the read-capacity
    *  units consumed by the TransactGetItems call in that table.
    */
  fun consumedCapacity(dslBlock: ConsumedCapacityCollectionDSL.() -> Unit) {
    builder.consumedCapacity(buildConsumedCapacityCollection(dslBlock))
  }


  /**
    * An ordered array of up to 25 ItemResponse objects, each of which corresponds to the
    *  TransactGetItem object in the same position in the TransactItems array. Each
    *  ItemResponse object contains a Map of the name-value pairs that are the projected attributes of
    *  the requested item.
    * 
    *  If a requested item could not be retrieved, the corresponding ItemResponse object is Null, or if
    *  the requested item has no projected attributes, the corresponding ItemResponse object is an
    *  empty Map.
    */
  fun responses(dslBlock: ItemResponseCollectionDSL.() -> Unit) {
    builder.responses(buildItemResponseCollection(dslBlock))
  }

}

/**
  * Builds instances of type TransactGetItemsResponse:
  * 
  */
fun buildTransactGetItemsResponse(dslBlock: TransactGetItemsResponseDSL.() -> Unit) =
  TransactGetItemsResponseDSL().apply(dslBlock).build()