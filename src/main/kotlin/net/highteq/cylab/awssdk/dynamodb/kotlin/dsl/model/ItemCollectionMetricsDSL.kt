/*
  This file was generated from https://github.com/aws/aws-sdk-java-v2 by https://github.com/cylab/aws-kotlin-dsl-builder
  Like the original code, this file and project is licensed under
  Apache License Version 2.0
  See LICENSE.txt for more info
*/
package net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.model

import kotlin.DeprecationLevel.HIDDEN
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
class ItemCollectionMetricsDSL {
  private val builder = ItemCollectionMetrics.builder()
  internal fun build(): ItemCollectionMetrics = builder.build()
    
  /**
    * The partition key value of the item collection. This value is the same as the partition key value of the
    *  item.
    */
  @get:JvmSynthetic // Hide from Java callers
  var itemCollectionKey: Map<String, AttributeValue>
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.itemCollectionKey(value)
    }


  /**
    * An estimate of item collection size, in gigabytes. This value is a two-element array containing a lower bound
    *  and an upper bound for the estimate. The estimate includes the size of all the items in the table, plus the
    *  size of all attributes projected into all of the local secondary indexes on that table. Use this estimate to
    *  measure whether a local secondary index is approaching its size limit.
    * 
    *  The estimate is subject to change over time; therefore, do not rely on the precision or accuracy of the
    *  estimate.
    */
  @get:JvmSynthetic // Hide from Java callers
  var sizeEstimateRangeGB: Collection<Double>
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.sizeEstimateRangeGB(value)
    }

  
  
}

/**
  * Builds instances of type ItemCollectionMetrics:
  * Information about item collections, if any, that were affected by the operation. ItemCollectionMetrics
  *  is only returned if the request asked for it. If the table does not have any local secondary indexes, this
  *  information is not returned in the response.
  */
fun buildItemCollectionMetrics(dslBlock: ItemCollectionMetricsDSL.() -> Unit) =
  ItemCollectionMetricsDSL().apply(dslBlock).build()