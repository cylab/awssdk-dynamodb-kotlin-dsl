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
import software.amazon.awssdk.services.dynamodb.model.AttributeValue
import software.amazon.awssdk.services.dynamodb.model.ItemCollectionMetrics

/**
  * Builds instances of type ItemCollectionMetrics:
  * Information about item collections, if any, that were affected by the operation. ItemCollectionMetrics
  *  is only returned if the request asked for it. If the table does not have any local secondary indexes, this
  *  information is not returned in the response.
  */
@DynamodbDSL
inline class ItemCollectionMetricsDSL(
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder: ItemCollectionMetrics.Builder
){
  @PublishedApi
  internal fun build(): ItemCollectionMetrics = builder.build()

  /**
    * 
    */
  inline var itemCollectionKey: Map<String, AttributeValue>?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.itemCollectionKey(value)
    }

  /**
    * 
    */
  inline var sizeEstimateRangeGB: Collection<Double>?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.sizeEstimateRangeGB(value)
    }

  /**
    * 
    */
  inline fun itemCollectionKey(dslBlock: AttributeValueMapDSL.() -> Unit) {
    builder.itemCollectionKey(buildAttributeValueMap(dslBlock))
  }

}

/**
  * Builds instances of type ItemCollectionMetrics:
  * Information about item collections, if any, that were affected by the operation. ItemCollectionMetrics
  *  is only returned if the request asked for it. If the table does not have any local secondary indexes, this
  *  information is not returned in the response.
  */
inline fun buildItemCollectionMetrics(dslBlock: ItemCollectionMetricsDSL.() -> Unit) =
  ItemCollectionMetricsDSL(ItemCollectionMetrics.builder()).apply(dslBlock).build()