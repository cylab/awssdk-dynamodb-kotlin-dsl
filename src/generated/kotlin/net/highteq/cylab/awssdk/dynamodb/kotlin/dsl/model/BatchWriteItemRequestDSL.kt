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
import software.amazon.awssdk.awscore.AwsRequestOverrideConfiguration
import software.amazon.awssdk.services.dynamodb.DynamoDbAsyncClient
import software.amazon.awssdk.services.dynamodb.DynamoDbClient
import software.amazon.awssdk.services.dynamodb.model.BatchWriteItemRequest
import software.amazon.awssdk.services.dynamodb.model.ReturnConsumedCapacity
import software.amazon.awssdk.services.dynamodb.model.ReturnItemCollectionMetrics
import software.amazon.awssdk.services.dynamodb.model.WriteRequest
import software.amazon.awssdk.services.dynamodb.transform.BatchWriteItemRequestMarshaller

/**
  * Builds instances of type BatchWriteItemRequest:
  * Represents the input of a BatchWriteItem operation.
  */
@DynamodbDSL
inline class BatchWriteItemRequestDSL(
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder: BatchWriteItemRequest.Builder
){
  @PublishedApi
  internal fun build(): BatchWriteItemRequest = builder.build()

  /**
    * 
    */
  inline var overrideConfiguration: AwsRequestOverrideConfiguration?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.overrideConfiguration(value)
    }

  /**
    * 
    */
  inline var requestItems: Map<String, Collection<WriteRequest>>?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.requestItems(value)
    }

  /**
    * 
    */
  inline var returnConsumedCapacity: ReturnConsumedCapacity?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.returnConsumedCapacity(value)
    }

  /**
    * 
    */
  inline var returnItemCollectionMetrics: ReturnItemCollectionMetrics?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.returnItemCollectionMetrics(value)
    }

  /**
    * 
    */
  inline fun returnConsumedCapacity(value: String?) {
    builder.returnConsumedCapacity(value)
  }

  /**
    * 
    */
  inline fun returnItemCollectionMetrics(value: String?) {
    builder.returnItemCollectionMetrics(value)
  }

}

/**
  * Builds instances of type BatchWriteItemRequest:
  * Represents the input of a BatchWriteItem operation.
  */
inline fun buildBatchWriteItemRequest(dslBlock: BatchWriteItemRequestDSL.() -> Unit) =
  BatchWriteItemRequestDSL(BatchWriteItemRequest.builder()).apply(dslBlock).build()

/**
  * 
  */
inline fun BatchWriteItemRequestMarshaller.marshallBy(dslBlock: BatchWriteItemRequestDSL.() -> Unit) =
  this.marshall(buildBatchWriteItemRequest(dslBlock))

/**
  * The BatchWriteItem operation puts or deletes multiple items in one or more tables. A single call to
  *  BatchWriteItem can write up to 16 MB of data, which can comprise as many as 25 put or delete
  *  requests. Individual items to be written can be as large as 400 KB.
  * 
  *  BatchWriteItem cannot update items. To update items, use the UpdateItem action.
  * 
  *  The individual PutItem and DeleteItem operations specified in
  *  BatchWriteItem are atomic; however BatchWriteItem as a whole is not. If any requested
  *  operations fail because the table's provisioned throughput is exceeded or an internal processing failure occurs,
  *  the failed operations are returned in the UnprocessedItems response parameter. You can investigate
  *  and optionally resend the requests. Typically, you would call BatchWriteItem in a loop. Each
  *  iteration would check for unprocessed items and submit a new BatchWriteItem request with those
  *  unprocessed items until all items have been processed.
  * 
  *  Note that if none of the items can be processed due to insufficient provisioned throughput on all of the
  *  tables in the request, then BatchWriteItem will return a
  *  ProvisionedThroughputExceededException.
  * 
  *  If DynamoDB returns any unprocessed items, you should retry the batch operation on those items. However, we
  *  strongly recommend that you use an exponential backoff algorithm. If you retry the batch operation
  *  immediately, the underlying read or write requests can still fail due to throttling on the individual tables. If
  *  you delay the batch operation using exponential backoff, the individual requests in the batch are much more
  *  likely to succeed.
  * 
  *  For more information, see Batch
  *  Operations and Error Handling in the Amazon DynamoDB Developer Guide.
  * 
  *  With BatchWriteItem, you can efficiently write or delete large amounts of data, such as from Amazon
  *  Elastic MapReduce (EMR), or copy data from another database into DynamoDB. In order to improve performance with
  *  these large-scale operations, BatchWriteItem does not behave in the same way as individual
  *  PutItem and DeleteItem calls would. For example, you cannot specify conditions on
  *  individual put and delete requests, and BatchWriteItem does not return deleted items in the
  *  response.
  * 
  *  If you use a programming language that supports concurrency, you can use threads to write items in parallel. Your
  *  application must include the necessary logic to manage the threads. With languages that don't support threading,
  *  you must update or delete the specified items one at a time. In both situations, BatchWriteItem
  *  performs the specified put and delete operations in parallel, giving you the power of the thread pool approach
  *  without having to introduce complexity into your application.
  * 
  *  Parallel processing reduces latency, but each specified put and delete request consumes the same number of write
  *  capacity units whether it is processed in parallel or not. Delete operations on nonexistent items consume one
  *  write capacity unit.
  * 
  *  If one or more of the following is true, DynamoDB rejects the entire batch write operation:
  * 
  *  One or more tables specified in the BatchWriteItem request does not exist.
  * 
  *  Primary key attributes specified on an item in the request do not match those in the corresponding table's
  *  primary key schema.
  * 
  *  You try to perform multiple operations on the same item in the same BatchWriteItem request. For
  *  example, you cannot put and delete the same item in the same BatchWriteItem request.
  * 
  *  Your request contains at least two items with identical hash and range keys (which essentially is two put
  *  operations).
  * 
  *  There are more than 25 requests in the batch.
  * 
  *  Any individual item in a batch exceeds 400 KB.
  * 
  *  The total request size exceeds 16 MB.
  */
inline fun DynamoDbAsyncClient.batchWriteItemBy(dslBlock: BatchWriteItemRequestDSL.() -> Unit) =
  this.batchWriteItem(buildBatchWriteItemRequest(dslBlock))

/**
  * The BatchWriteItem operation puts or deletes multiple items in one or more tables. A single call to
  *  BatchWriteItem can write up to 16 MB of data, which can comprise as many as 25 put or delete
  *  requests. Individual items to be written can be as large as 400 KB.
  * 
  *  BatchWriteItem cannot update items. To update items, use the UpdateItem action.
  * 
  *  The individual PutItem and DeleteItem operations specified in
  *  BatchWriteItem are atomic; however BatchWriteItem as a whole is not. If any requested
  *  operations fail because the table's provisioned throughput is exceeded or an internal processing failure occurs,
  *  the failed operations are returned in the UnprocessedItems response parameter. You can investigate
  *  and optionally resend the requests. Typically, you would call BatchWriteItem in a loop. Each
  *  iteration would check for unprocessed items and submit a new BatchWriteItem request with those
  *  unprocessed items until all items have been processed.
  * 
  *  Note that if none of the items can be processed due to insufficient provisioned throughput on all of the
  *  tables in the request, then BatchWriteItem will return a
  *  ProvisionedThroughputExceededException.
  * 
  *  If DynamoDB returns any unprocessed items, you should retry the batch operation on those items. However, we
  *  strongly recommend that you use an exponential backoff algorithm. If you retry the batch operation
  *  immediately, the underlying read or write requests can still fail due to throttling on the individual tables. If
  *  you delay the batch operation using exponential backoff, the individual requests in the batch are much more
  *  likely to succeed.
  * 
  *  For more information, see Batch
  *  Operations and Error Handling in the Amazon DynamoDB Developer Guide.
  * 
  *  With BatchWriteItem, you can efficiently write or delete large amounts of data, such as from Amazon
  *  Elastic MapReduce (EMR), or copy data from another database into DynamoDB. In order to improve performance with
  *  these large-scale operations, BatchWriteItem does not behave in the same way as individual
  *  PutItem and DeleteItem calls would. For example, you cannot specify conditions on
  *  individual put and delete requests, and BatchWriteItem does not return deleted items in the
  *  response.
  * 
  *  If you use a programming language that supports concurrency, you can use threads to write items in parallel. Your
  *  application must include the necessary logic to manage the threads. With languages that don't support threading,
  *  you must update or delete the specified items one at a time. In both situations, BatchWriteItem
  *  performs the specified put and delete operations in parallel, giving you the power of the thread pool approach
  *  without having to introduce complexity into your application.
  * 
  *  Parallel processing reduces latency, but each specified put and delete request consumes the same number of write
  *  capacity units whether it is processed in parallel or not. Delete operations on nonexistent items consume one
  *  write capacity unit.
  * 
  *  If one or more of the following is true, DynamoDB rejects the entire batch write operation:
  * 
  *  One or more tables specified in the BatchWriteItem request does not exist.
  * 
  *  Primary key attributes specified on an item in the request do not match those in the corresponding table's
  *  primary key schema.
  * 
  *  You try to perform multiple operations on the same item in the same BatchWriteItem request. For
  *  example, you cannot put and delete the same item in the same BatchWriteItem request.
  * 
  *  Your request contains at least two items with identical hash and range keys (which essentially is two put
  *  operations).
  * 
  *  There are more than 25 requests in the batch.
  * 
  *  Any individual item in a batch exceeds 400 KB.
  * 
  *  The total request size exceeds 16 MB.
  */
inline fun DynamoDbClient.batchWriteItemBy(dslBlock: BatchWriteItemRequestDSL.() -> Unit) =
  this.batchWriteItem(buildBatchWriteItemRequest(dslBlock))