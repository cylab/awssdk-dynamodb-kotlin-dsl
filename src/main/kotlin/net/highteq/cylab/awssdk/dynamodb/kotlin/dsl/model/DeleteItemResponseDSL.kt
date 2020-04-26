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
import software.amazon.awssdk.services.dynamodb.model.AttributeValue
import software.amazon.awssdk.services.dynamodb.model.ConsumedCapacity
import software.amazon.awssdk.services.dynamodb.model.DeleteItemResponse
import software.amazon.awssdk.services.dynamodb.model.ItemCollectionMetrics

/**
  * Builds instances of type DeleteItemResponse:
  * Represents the output of a DeleteItem operation.
  */
@DynamodbDSL
class DeleteItemResponseDSL {
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder = DeleteItemResponse.builder()
  internal fun build(): DeleteItemResponse = builder.build()
    
  /**
    * A map of attribute names to AttributeValue objects, representing the item as it appeared before
    *  the DeleteItem operation. This map appears in the response only if ReturnValues was
    *  specified as ALL_OLD in the request.
    */
  var attributes: Map<String, AttributeValue>?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.attributes(value)
    }


  /**
    * The capacity units consumed by the DeleteItem operation. The data returned includes the total
    *  provisioned throughput consumed, along with statistics for the table and any indexes involved in the
    *  operation. ConsumedCapacity is only returned if the ReturnConsumedCapacity
    *  parameter was specified. For more information, see Provisioned Mode in the Amazon DynamoDB Developer Guide.
    */
  var consumedCapacity: ConsumedCapacity?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.consumedCapacity(value)
    }


  /**
    * Information about item collections, if any, that were affected by the DeleteItem operation.
    *  ItemCollectionMetrics is only returned if the ReturnItemCollectionMetrics parameter
    *  was specified. If the table does not have any local secondary indexes, this information is not returned in
    *  the response.
    * 
    *  Each ItemCollectionMetrics element consists of:
    * 
    *  ItemCollectionKey - The partition key value of the item collection. This is the same as the
    *  partition key value of the item itself.
    * 
    *  SizeEstimateRangeGB - An estimate of item collection size, in gigabytes. This value is a
    *  two-element array containing a lower bound and an upper bound for the estimate. The estimate includes the
    *  size of all the items in the table, plus the size of all attributes projected into all of the local secondary
    *  indexes on that table. Use this estimate to measure whether a local secondary index is approaching its size
    *  limit.
    * 
    *  The estimate is subject to change over time; therefore, do not rely on the precision or accuracy of the
    *  estimate.
    */
  var itemCollectionMetrics: ItemCollectionMetrics?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.itemCollectionMetrics(value)
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
    * 
    */
  var sdkHttpResponse: SdkHttpResponse?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.sdkHttpResponse(value)
    }

  
    
  /**
    * The capacity units consumed by the DeleteItem operation. The data returned includes the total
    *  provisioned throughput consumed, along with statistics for the table and any indexes involved in the
    *  operation. ConsumedCapacity is only returned if the ReturnConsumedCapacity
    *  parameter was specified. For more information, see Provisioned Mode in the Amazon DynamoDB Developer Guide.
    */
  fun consumedCapacity(dslBlock: ConsumedCapacityDSL.() -> Unit) {
    builder.consumedCapacity(buildConsumedCapacity(dslBlock))
  }


  /**
    * Information about item collections, if any, that were affected by the DeleteItem operation.
    *  ItemCollectionMetrics is only returned if the ReturnItemCollectionMetrics parameter
    *  was specified. If the table does not have any local secondary indexes, this information is not returned in
    *  the response.
    * 
    *  Each ItemCollectionMetrics element consists of:
    * 
    *  ItemCollectionKey - The partition key value of the item collection. This is the same as the
    *  partition key value of the item itself.
    * 
    *  SizeEstimateRangeGB - An estimate of item collection size, in gigabytes. This value is a
    *  two-element array containing a lower bound and an upper bound for the estimate. The estimate includes the
    *  size of all the items in the table, plus the size of all attributes projected into all of the local secondary
    *  indexes on that table. Use this estimate to measure whether a local secondary index is approaching its size
    *  limit.
    * 
    *  The estimate is subject to change over time; therefore, do not rely on the precision or accuracy of the
    *  estimate.
    */
  fun itemCollectionMetrics(dslBlock: ItemCollectionMetricsDSL.() -> Unit) {
    builder.itemCollectionMetrics(buildItemCollectionMetrics(dslBlock))
  }

}

/**
  * Builds instances of type DeleteItemResponse:
  * Represents the output of a DeleteItem operation.
  */
fun buildDeleteItemResponse(dslBlock: DeleteItemResponseDSL.() -> Unit) =
  DeleteItemResponseDSL().apply(dslBlock).build()