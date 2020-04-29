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
import software.amazon.awssdk.services.dynamodb.model.ItemCollectionMetrics
import software.amazon.awssdk.services.dynamodb.model.UpdateItemResponse

/**
  * Builds instances of type UpdateItemResponse:
  * Represents the output of an UpdateItem operation.
  */
@DynamodbDSL
class UpdateItemResponseDSL {
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder = UpdateItemResponse.builder()
  internal fun build(): UpdateItemResponse = builder.build()
    
  /**
    * A map of attribute values as they appear before or after the UpdateItem operation, as determined
    *  by the ReturnValues parameter.
    * 
    *  The Attributes map is only present if ReturnValues was specified as something other
    *  than NONE in the request. Each element represents one attribute.
    */
  var attributes: Map<String, AttributeValue>?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.attributes(value)
    }


  /**
    * The capacity units consumed by the UpdateItem operation. The data returned includes the total
    *  provisioned throughput consumed, along with statistics for the table and any indexes involved in the
    *  operation. ConsumedCapacity is only returned if the ReturnConsumedCapacity
    *  parameter was specified. For more information, see Provisioned Throughput in the Amazon DynamoDB Developer Guide.
    */
  var consumedCapacity: ConsumedCapacity?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.consumedCapacity(value)
    }


  /**
    * Information about item collections, if any, that were affected by the UpdateItem operation.
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
    * A map of attribute values as they appear before or after the UpdateItem operation, as determined
    *  by the ReturnValues parameter.
    * 
    *  The Attributes map is only present if ReturnValues was specified as something other
    *  than NONE in the request. Each element represents one attribute.
    */
  fun attributes(dslBlock: AttributeValueMapDSL.() -> Unit) {
    builder.attributes(buildAttributeValueMap(dslBlock))
  }


  /**
    * The capacity units consumed by the UpdateItem operation. The data returned includes the total
    *  provisioned throughput consumed, along with statistics for the table and any indexes involved in the
    *  operation. ConsumedCapacity is only returned if the ReturnConsumedCapacity
    *  parameter was specified. For more information, see Provisioned Throughput in the Amazon DynamoDB Developer Guide.
    */
  fun consumedCapacity(dslBlock: ConsumedCapacityDSL.() -> Unit) {
    builder.consumedCapacity(buildConsumedCapacity(dslBlock))
  }


  /**
    * Information about item collections, if any, that were affected by the UpdateItem operation.
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
  * Builds instances of type UpdateItemResponse:
  * Represents the output of an UpdateItem operation.
  */
fun buildUpdateItemResponse(dslBlock: UpdateItemResponseDSL.() -> Unit) =
  UpdateItemResponseDSL().apply(dslBlock).build()