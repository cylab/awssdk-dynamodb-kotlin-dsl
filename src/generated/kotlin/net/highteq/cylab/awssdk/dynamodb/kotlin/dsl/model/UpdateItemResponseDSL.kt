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
import software.amazon.awssdk.awscore.AwsResponseMetadata
import software.amazon.awssdk.http.SdkHttpResponse
import software.amazon.awssdk.services.dynamodb.model.AttributeValue
import software.amazon.awssdk.services.dynamodb.model.ConsumedCapacity
import software.amazon.awssdk.services.dynamodb.model.ItemCollectionMetrics
import software.amazon.awssdk.services.dynamodb.model.UpdateItemResponse

/**
  * Builds instances of type UpdateItemResponse:
  * Represents the output of an UpdateItem operation.
  */
@DynamodbDSL
inline class UpdateItemResponseDSL(
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder: UpdateItemResponse.Builder
){
  @PublishedApi
  internal fun build(): UpdateItemResponse = builder.build()

  /**
    * 
    */
  inline var attributes: Map<String, AttributeValue>?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.attributes(value)
    }

  /**
    * 
    */
  inline var consumedCapacity: ConsumedCapacity?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.consumedCapacity(value)
    }

  /**
    * 
    */
  inline var itemCollectionMetrics: ItemCollectionMetrics?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.itemCollectionMetrics(value)
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
  inline var sdkHttpResponse: SdkHttpResponse?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.sdkHttpResponse(value)
    }

  /**
    * 
    */
  inline fun attributes(dslBlock: AttributeValueMapDSL.() -> Unit) {
    builder.attributes(buildAttributeValueMap(dslBlock))
  }

  /**
    * 
    */
  inline fun consumedCapacity(dslBlock: ConsumedCapacityDSL.() -> Unit) {
    builder.consumedCapacity(buildConsumedCapacity(dslBlock))
  }

  /**
    * 
    */
  inline fun itemCollectionMetrics(dslBlock: ItemCollectionMetricsDSL.() -> Unit) {
    builder.itemCollectionMetrics(buildItemCollectionMetrics(dslBlock))
  }

}

/**
  * Builds instances of type UpdateItemResponse:
  * Represents the output of an UpdateItem operation.
  */
inline fun buildUpdateItemResponse(dslBlock: UpdateItemResponseDSL.() -> Unit) =
  UpdateItemResponseDSL(UpdateItemResponse.builder()).apply(dslBlock).build()