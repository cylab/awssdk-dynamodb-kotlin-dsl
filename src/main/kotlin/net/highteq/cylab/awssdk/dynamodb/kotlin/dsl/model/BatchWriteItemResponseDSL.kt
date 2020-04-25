/*
  This file was generated from https://github.com/aws/aws-sdk-java-v2 by https://github.com/cylab/aws-kotlin-dsl-builder
  Like the original code, this file and project is licensed under
  Apache License Version 2.0
  See LICENSE.txt for more info
*/
package net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.model

import kotlin.DeprecationLevel.HIDDEN
import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSL
import software.amazon.awssdk.services.dynamodb.model.BatchWriteItemResponse
import software.amazon.awssdk.services.dynamodb.model.ConsumedCapacity
import software.amazon.awssdk.services.dynamodb.model.ItemCollectionMetrics
import software.amazon.awssdk.services.dynamodb.model.WriteRequest

/**
  * Builds instances of type BatchWriteItemResponse:
  * Represents the output of a BatchWriteItem operation.
  */
@DynamodbDSL
class BatchWriteItemResponseDSL {
  private val builder = BatchWriteItemResponse.builder()
  internal fun build(): BatchWriteItemResponse = builder.build()
    
  /**
    * A list of tables that were processed by BatchWriteItem and, for each table, information about
    *  any item collections that were affected by individual DeleteItem or PutItem
    *  operations.
    * 
    *  Each entry consists of the following subelements:
    * 
    *  ItemCollectionKey - The partition key value of the item collection. This is the same as the
    *  partition key value of the item.
    * 
    *  SizeEstimateRangeGB - An estimate of item collection size, expressed in GB. This is a
    *  two-element array containing a lower bound and an upper bound for the estimate. The estimate includes the
    *  size of all the items in the table, plus the size of all attributes projected into all of the local secondary
    *  indexes on the table. Use this estimate to measure whether a local secondary index is approaching its size
    *  limit.
    * 
    *  The estimate is subject to change over time; therefore, do not rely on the precision or accuracy of the
    *  estimate.
    */
  @get:JvmSynthetic // Hide from Java callers
  var itemCollectionMetrics: Map<String, Collection<ItemCollectionMetrics>>
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.itemCollectionMetrics(value)
    }


  /**
    * A map of tables and requests against those tables that were not processed. The UnprocessedItems
    *  value is in the same form as RequestItems, so you can provide this value directly to a
    *  subsequent BatchGetItem operation. For more information, see RequestItems in the
    *  Request Parameters section.
    * 
    *  Each UnprocessedItems entry consists of a table name and, for that table, a list of operations
    *  to perform (DeleteRequest or PutRequest).
    * 
    *  DeleteRequest - Perform a DeleteItem operation on the specified item. The item to
    *  be deleted is identified by a Key subelement:
    * 
    *  Key - A map of primary key attribute values that uniquely identify the item. Each entry in this
    *  map consists of an attribute name and an attribute value.
    * 
    *  PutRequest - Perform a PutItem operation on the specified item. The item to be put
    *  is identified by an Item subelement:
    * 
    *  Item - A map of attributes and their values. Each entry in this map consists of an attribute
    *  name and an attribute value. Attribute values must not be null; string and binary type attributes must have
    *  lengths greater than zero; and set type attributes must not be empty. Requests that contain empty values will
    *  be rejected with a ValidationException exception.
    * 
    *  If you specify any attributes that are part of an index key, then the data types for those attributes must
    *  match those of the schema in the table's attribute definition.
    * 
    *  If there are no unprocessed items remaining, the response contains an empty UnprocessedItems
    *  map.
    */
  @get:JvmSynthetic // Hide from Java callers
  var unprocessedItems: Map<String, Collection<WriteRequest>>
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.unprocessedItems(value)
    }


  /**
    * The capacity units consumed by the entire BatchWriteItem operation.
    * 
    *  Each element consists of:
    * 
    *  TableName - The table that consumed the provisioned throughput.
    * 
    *  CapacityUnits - The total number of capacity units consumed.
    */
  @get:JvmSynthetic // Hide from Java callers
  var consumedCapacity: Collection<ConsumedCapacity>
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.consumedCapacity(value)
    }

  
    
  /**
    * The capacity units consumed by the entire BatchWriteItem operation.
    * 
    *  Each element consists of:
    * 
    *  TableName - The table that consumed the provisioned throughput.
    * 
    *  CapacityUnits - The total number of capacity units consumed.
    */
  fun consumedCapacity(dslBlock: ConsumedCapacityCollectionDSL.() -> Unit) {
    builder.consumedCapacity(buildConsumedCapacityCollection(dslBlock))
  }

}

/**
  * Builds instances of type BatchWriteItemResponse:
  * Represents the output of a BatchWriteItem operation.
  */
fun buildBatchWriteItemResponse(dslBlock: BatchWriteItemResponseDSL.() -> Unit) =
  BatchWriteItemResponseDSL().apply(dslBlock).build()