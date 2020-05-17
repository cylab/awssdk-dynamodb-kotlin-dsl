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
import software.amazon.awssdk.awscore.AwsRequestOverrideConfiguration
import software.amazon.awssdk.services.dynamodb.DynamoDbAsyncClient
import software.amazon.awssdk.services.dynamodb.DynamoDbClient
import software.amazon.awssdk.services.dynamodb.model.BatchGetItemRequest
import software.amazon.awssdk.services.dynamodb.model.KeysAndAttributes
import software.amazon.awssdk.services.dynamodb.model.ReturnConsumedCapacity
import software.amazon.awssdk.services.dynamodb.transform.BatchGetItemRequestMarshaller

/**
  * Builds instances of type BatchGetItemRequest:
  * Represents the input of a BatchGetItem operation.
  */
@DynamodbDSLMarker
inline class BatchGetItemRequestDSL(
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder: BatchGetItemRequest.Builder
){
  @PublishedApi
  internal fun build(): BatchGetItemRequest = builder.build()

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
  inline var requestItems: Map<String, KeysAndAttributes>?
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
  inline fun returnConsumedCapacity(value: String?) {
    builder.returnConsumedCapacity(value)
  }

  /**
    * 
    */
  inline fun requestItems(dslBlock: KeysAndAttributesMapDSL.() -> Unit) {
    builder.requestItems(DynamodbDSL.Companion.keysAndAttributesMap(dslBlock))
  }

}

/**
  * Builds instances of type BatchGetItemRequest:
  * Represents the input of a BatchGetItem operation.
  */
inline fun batchGetItemRequest(dslBlock: BatchGetItemRequestDSL.() -> Unit) =
  BatchGetItemRequestDSL(BatchGetItemRequest.builder()).apply(dslBlock).build()

/**
  * Builds instances of type BatchGetItemRequest:
  * Represents the input of a BatchGetItem operation.
  */
inline fun DynamodbDSL.Companion.batchGetItemRequest(dslBlock: BatchGetItemRequestDSL.() -> Unit) =
  BatchGetItemRequestDSL(BatchGetItemRequest.builder()).apply(dslBlock).build()

/**
  * 
  */
inline fun BatchGetItemRequestMarshaller.marshallBy(dslBlock: BatchGetItemRequestDSL.() -> Unit) =
  this.marshall(DynamodbDSL.Companion.batchGetItemRequest(dslBlock))

/**
  * The BatchGetItem operation returns the attributes of one or more items from one or more tables. You
  *  identify requested items by primary key.
  * 
  *  A single operation can retrieve up to 16 MB of data, which can contain as many as 100 items.
  *  BatchGetItem will return a partial result if the response size limit is exceeded, the table's
  *  provisioned throughput is exceeded, or an internal processing failure occurs. If a partial result is returned,
  *  the operation returns a value for UnprocessedKeys. You can use this value to retry the operation
  *  starting with the next item to get.
  * 
  *  If you request more than 100 items BatchGetItem will return a ValidationException with
  *  the message "Too many items requested for the BatchGetItem call".
  * 
  *  For example, if you ask to retrieve 100 items, but each individual item is 300 KB in size, the system returns 52
  *  items (so as not to exceed the 16 MB limit). It also returns an appropriate UnprocessedKeys value so
  *  you can get the next page of results. If desired, your application can include its own logic to assemble the
  *  pages of results into one data set.
  * 
  *  If none of the items can be processed due to insufficient provisioned throughput on all of the tables in
  *  the request, then BatchGetItem will return a ProvisionedThroughputExceededException. If
  *  at least one of the items is successfully processed, then BatchGetItem completes
  *  successfully, while returning the keys of the unread items in UnprocessedKeys.
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
  *  By default, BatchGetItem performs eventually consistent reads on every table in the request. If you
  *  want strongly consistent reads instead, you can set ConsistentRead to true for any or
  *  all tables.
  * 
  *  In order to minimize response latency, BatchGetItem retrieves items in parallel.
  * 
  *  When designing your application, keep in mind that DynamoDB does not return items in any particular order. To
  *  help parse the response by item, include the primary key values for the items in your request in the
  *  ProjectionExpression parameter.
  * 
  *  If a requested item does not exist, it is not returned in the result. Requests for nonexistent items consume the
  *  minimum read capacity units according to the type of read. For more information, see Capacity Units Calculations in the Amazon DynamoDB Developer Guide.
  */
inline fun DynamoDbAsyncClient.batchGetItemBy(dslBlock: BatchGetItemRequestDSL.() -> Unit) =
  this.batchGetItem(DynamodbDSL.Companion.batchGetItemRequest(dslBlock))

/**
  * The BatchGetItem operation returns the attributes of one or more items from one or more tables. You
  *  identify requested items by primary key.
  * 
  *  A single operation can retrieve up to 16 MB of data, which can contain as many as 100 items.
  *  BatchGetItem will return a partial result if the response size limit is exceeded, the table's
  *  provisioned throughput is exceeded, or an internal processing failure occurs. If a partial result is returned,
  *  the operation returns a value for UnprocessedKeys. You can use this value to retry the operation
  *  starting with the next item to get.
  * 
  *  If you request more than 100 items BatchGetItem will return a ValidationException with
  *  the message "Too many items requested for the BatchGetItem call".
  * 
  *  For example, if you ask to retrieve 100 items, but each individual item is 300 KB in size, the system returns 52
  *  items (so as not to exceed the 16 MB limit). It also returns an appropriate UnprocessedKeys value so
  *  you can get the next page of results. If desired, your application can include its own logic to assemble the
  *  pages of results into one data set.
  * 
  *  If none of the items can be processed due to insufficient provisioned throughput on all of the tables in
  *  the request, then BatchGetItem will return a ProvisionedThroughputExceededException. If
  *  at least one of the items is successfully processed, then BatchGetItem completes
  *  successfully, while returning the keys of the unread items in UnprocessedKeys.
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
  *  By default, BatchGetItem performs eventually consistent reads on every table in the request. If you
  *  want strongly consistent reads instead, you can set ConsistentRead to true for any or
  *  all tables.
  * 
  *  In order to minimize response latency, BatchGetItem retrieves items in parallel.
  * 
  *  When designing your application, keep in mind that DynamoDB does not return items in any particular order. To
  *  help parse the response by item, include the primary key values for the items in your request in the
  *  ProjectionExpression parameter.
  * 
  *  If a requested item does not exist, it is not returned in the result. Requests for nonexistent items consume the
  *  minimum read capacity units according to the type of read. For more information, see Capacity Units Calculations in the Amazon DynamoDB Developer Guide.
  * 
  *  This is a variant of {@link #batchGetItem(software.amazon.awssdk.services.dynamodb.model.BatchGetItemRequest)}
  *  operation. The return type is a custom publisher that can be subscribed to request a stream of response pages.
  *  SDK will internally handle making service calls for you.
  * 
  *  When the operation is called, an instance of this class is returned. At this point, no service calls are made yet
  *  and so there is no guarantee that the request is valid. If there are errors in your request, you will see the
  *  failures only after you start streaming the data. The subscribe method should be called as a request to start
  *  streaming data. For more info, see
  *  {@link org.reactivestreams.Publisher#subscribe(org.reactivestreams.Subscriber)}. Each call to the subscribe
  *  method will result in a new {@link org.reactivestreams.Subscription} i.e., a new contract to stream data from the
  *  starting request.
  * 
  *  The following are few ways to use the response class:
  * 
  *  1) Using the subscribe helper method
  * 
  *  {@code
  *  software.amazon.awssdk.services.dynamodb.paginators.BatchGetItemPublisher publisher = client.batchGetItemPaginator(request);
  *  CompletableFuture future = publisher.subscribe(res -> { // Do something with the response });
  *  future.get();
  *  }
  * 
  *  2) Using a custom subscriber
  * 
  *  {@code
  *  software.amazon.awssdk.services.dynamodb.paginators.BatchGetItemPublisher publisher = client.batchGetItemPaginator(request);
  *  publisher.subscribe(new Subscriber() {
  * 
  *  public void onSubscribe(org.reactivestreams.Subscriber subscription) { //... };
  * 
  *  public void onNext(software.amazon.awssdk.services.dynamodb.model.BatchGetItemResponse response) { //... };
  *  });}
  * 
  *  As the response is a publisher, it can work well with third party reactive streams implementations like RxJava2.
  * 
  *  Note: If you prefer to have control on service calls, use the
  *  {@link #batchGetItem(software.amazon.awssdk.services.dynamodb.model.BatchGetItemRequest)} operation.
  */
inline fun DynamoDbAsyncClient.batchGetItemPaginatorBy(dslBlock: BatchGetItemRequestDSL.() -> Unit) =
  this.batchGetItemPaginator(DynamodbDSL.Companion.batchGetItemRequest(dslBlock))

/**
  * The BatchGetItem operation returns the attributes of one or more items from one or more tables. You
  *  identify requested items by primary key.
  * 
  *  A single operation can retrieve up to 16 MB of data, which can contain as many as 100 items.
  *  BatchGetItem will return a partial result if the response size limit is exceeded, the table's
  *  provisioned throughput is exceeded, or an internal processing failure occurs. If a partial result is returned,
  *  the operation returns a value for UnprocessedKeys. You can use this value to retry the operation
  *  starting with the next item to get.
  * 
  *  If you request more than 100 items BatchGetItem will return a ValidationException with
  *  the message "Too many items requested for the BatchGetItem call".
  * 
  *  For example, if you ask to retrieve 100 items, but each individual item is 300 KB in size, the system returns 52
  *  items (so as not to exceed the 16 MB limit). It also returns an appropriate UnprocessedKeys value so
  *  you can get the next page of results. If desired, your application can include its own logic to assemble the
  *  pages of results into one data set.
  * 
  *  If none of the items can be processed due to insufficient provisioned throughput on all of the tables in
  *  the request, then BatchGetItem will return a ProvisionedThroughputExceededException. If
  *  at least one of the items is successfully processed, then BatchGetItem completes
  *  successfully, while returning the keys of the unread items in UnprocessedKeys.
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
  *  By default, BatchGetItem performs eventually consistent reads on every table in the request. If you
  *  want strongly consistent reads instead, you can set ConsistentRead to true for any or
  *  all tables.
  * 
  *  In order to minimize response latency, BatchGetItem retrieves items in parallel.
  * 
  *  When designing your application, keep in mind that DynamoDB does not return items in any particular order. To
  *  help parse the response by item, include the primary key values for the items in your request in the
  *  ProjectionExpression parameter.
  * 
  *  If a requested item does not exist, it is not returned in the result. Requests for nonexistent items consume the
  *  minimum read capacity units according to the type of read. For more information, see Capacity Units Calculations in the Amazon DynamoDB Developer Guide.
  */
inline fun DynamoDbClient.batchGetItemBy(dslBlock: BatchGetItemRequestDSL.() -> Unit) =
  this.batchGetItem(DynamodbDSL.Companion.batchGetItemRequest(dslBlock))

/**
  * The BatchGetItem operation returns the attributes of one or more items from one or more tables. You
  *  identify requested items by primary key.
  * 
  *  A single operation can retrieve up to 16 MB of data, which can contain as many as 100 items.
  *  BatchGetItem will return a partial result if the response size limit is exceeded, the table's
  *  provisioned throughput is exceeded, or an internal processing failure occurs. If a partial result is returned,
  *  the operation returns a value for UnprocessedKeys. You can use this value to retry the operation
  *  starting with the next item to get.
  * 
  *  If you request more than 100 items BatchGetItem will return a ValidationException with
  *  the message "Too many items requested for the BatchGetItem call".
  * 
  *  For example, if you ask to retrieve 100 items, but each individual item is 300 KB in size, the system returns 52
  *  items (so as not to exceed the 16 MB limit). It also returns an appropriate UnprocessedKeys value so
  *  you can get the next page of results. If desired, your application can include its own logic to assemble the
  *  pages of results into one data set.
  * 
  *  If none of the items can be processed due to insufficient provisioned throughput on all of the tables in
  *  the request, then BatchGetItem will return a ProvisionedThroughputExceededException. If
  *  at least one of the items is successfully processed, then BatchGetItem completes
  *  successfully, while returning the keys of the unread items in UnprocessedKeys.
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
  *  By default, BatchGetItem performs eventually consistent reads on every table in the request. If you
  *  want strongly consistent reads instead, you can set ConsistentRead to true for any or
  *  all tables.
  * 
  *  In order to minimize response latency, BatchGetItem retrieves items in parallel.
  * 
  *  When designing your application, keep in mind that DynamoDB does not return items in any particular order. To
  *  help parse the response by item, include the primary key values for the items in your request in the
  *  ProjectionExpression parameter.
  * 
  *  If a requested item does not exist, it is not returned in the result. Requests for nonexistent items consume the
  *  minimum read capacity units according to the type of read. For more information, see Capacity Units Calculations in the Amazon DynamoDB Developer Guide.
  * 
  *  This is a variant of {@link #batchGetItem(software.amazon.awssdk.services.dynamodb.model.BatchGetItemRequest)}
  *  operation. The return type is a custom iterable that can be used to iterate through all the pages. SDK will
  *  internally handle making service calls for you.
  * 
  *  When this operation is called, a custom iterable is returned but no service calls are made yet. So there is no
  *  guarantee that the request is valid. As you iterate through the iterable, SDK will start lazily loading response
  *  pages by making service calls until there are no pages left or your iteration stops. If there are errors in your
  *  request, you will see the failures only after you start iterating through the iterable.
  * 
  *  The following are few ways to iterate through the response pages:
  * 
  *  1) Using a Stream
  * 
  *  {@code
  *  software.amazon.awssdk.services.dynamodb.paginators.BatchGetItemIterable responses = client.batchGetItemPaginator(request);
  *  responses.stream().forEach(....);
  *  }
  * 
  *  2) Using For loop
  * 
  *  {
  *      &#064;code
  *      software.amazon.awssdk.services.dynamodb.paginators.BatchGetItemIterable responses = client.batchGetItemPaginator(request);
  *      for (software.amazon.awssdk.services.dynamodb.model.BatchGetItemResponse response : responses) {
  *          // do something;
  *      }
  *  }
  * 
  *  3) Use iterator directly
  * 
  *  {@code
  *  software.amazon.awssdk.services.dynamodb.paginators.BatchGetItemIterable responses = client.batchGetItemPaginator(request);
  *  responses.iterator().forEachRemaining(....);
  *  }
  * 
  *  Note: If you prefer to have control on service calls, use the
  *  {@link #batchGetItem(software.amazon.awssdk.services.dynamodb.model.BatchGetItemRequest)} operation.
  */
inline fun DynamoDbClient.batchGetItemPaginatorBy(dslBlock: BatchGetItemRequestDSL.() -> Unit) =
  this.batchGetItemPaginator(DynamodbDSL.Companion.batchGetItemRequest(dslBlock))