/*
  This file was generated from https://github.com/aws/aws-sdk-java-v2 by https://github.com/cylab/aws-kotlin-dsl-builder
  Like the original code, this file and project is licensed under
  Apache License Version 2.0
  See LICENSE.txt for more info
*/
package net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.model

import kotlin.DeprecationLevel.HIDDEN
import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSL
import software.amazon.awssdk.services.dynamodb.model.ConsumedCapacity
import software.amazon.awssdk.services.dynamodb.model.ItemCollectionMetrics
import software.amazon.awssdk.services.dynamodb.model.TransactWriteItemsResponse

/**
  * Builds instances of type TransactWriteItemsResponse:
  * 
  */
@DynamodbDSL
class TransactWriteItemsResponseDSL {
  private val builder = TransactWriteItemsResponse.builder()
  internal fun build(): TransactWriteItemsResponse = builder.build()
    
  /**
    * A list of tables that were processed by TransactWriteItems and, for each table, information
    *  about any item collections that were affected by individual UpdateItem, PutItem, or
    *  DeleteItem operations.
    */
  @get:JvmSynthetic // Hide from Java callers
  var itemCollectionMetrics: Map<String, Collection<ItemCollectionMetrics>>
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.itemCollectionMetrics(value)
    }


  /**
    * The capacity units consumed by the entire TransactWriteItems operation. The values of the list
    *  are ordered according to the ordering of the TransactItems request parameter.
    */
  @get:JvmSynthetic // Hide from Java callers
  var consumedCapacity: Collection<ConsumedCapacity>
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.consumedCapacity(value)
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