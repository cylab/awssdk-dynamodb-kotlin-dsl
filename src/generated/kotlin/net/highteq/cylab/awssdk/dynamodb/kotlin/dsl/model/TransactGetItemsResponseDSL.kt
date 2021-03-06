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
import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSLMarker
import software.amazon.awssdk.awscore.AwsResponseMetadata
import software.amazon.awssdk.http.SdkHttpResponse
import software.amazon.awssdk.services.dynamodb.model.ConsumedCapacity
import software.amazon.awssdk.services.dynamodb.model.ItemResponse
import software.amazon.awssdk.services.dynamodb.model.TransactGetItemsResponse

/**
  * Builds instances of type TransactGetItemsResponse:
  * 
  */
@DynamodbDSLMarker
inline class TransactGetItemsResponseDSL(
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder: TransactGetItemsResponse.Builder
){
  @PublishedApi
  internal fun build(): TransactGetItemsResponse = builder.build()

  /**
    * 
    */
  inline var consumedCapacity: Collection<ConsumedCapacity>?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.consumedCapacity(value)
    }

  /**
    * 
    */
  inline var responseMetadata: AwsResponseMetadata?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.responseMetadata(value)
    }

  /**
    * 
    */
  inline var responses: Collection<ItemResponse>?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.responses(value)
    }

  /**
    * 
    */
  inline var sdkHttpResponse: SdkHttpResponse?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.sdkHttpResponse(value)
    }

  /**
    * 
    */
  inline fun consumedCapacity(dslBlock: ConsumedCapacityCollectionDSL.() -> Unit) {
    builder.consumedCapacity(DynamodbDSL.Companion.consumedCapacityCollection(dslBlock))
  }

  /**
    * 
    */
  inline fun responses(dslBlock: ItemResponseCollectionDSL.() -> Unit) {
    builder.responses(DynamodbDSL.Companion.itemResponseCollection(dslBlock))
  }

}

/**
  * Builds instances of type TransactGetItemsResponse:
  * 
  */
inline fun transactGetItemsResponse(dslBlock: TransactGetItemsResponseDSL.() -> Unit) =
  TransactGetItemsResponseDSL(TransactGetItemsResponse.builder()).apply(dslBlock).build()

/**
  * Builds instances of type TransactGetItemsResponse:
  * 
  */
inline fun DynamodbDSL.Companion.transactGetItemsResponse(dslBlock: TransactGetItemsResponseDSL.() -> Unit) =
  TransactGetItemsResponseDSL(TransactGetItemsResponse.builder()).apply(dslBlock).build()