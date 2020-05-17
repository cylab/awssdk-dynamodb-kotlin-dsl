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
import software.amazon.awssdk.services.dynamodb.model.AttributeValue
import software.amazon.awssdk.services.dynamodb.model.Condition
import software.amazon.awssdk.services.dynamodb.model.ConditionalOperator
import software.amazon.awssdk.services.dynamodb.model.QueryRequest
import software.amazon.awssdk.services.dynamodb.model.ReturnConsumedCapacity
import software.amazon.awssdk.services.dynamodb.model.Select
import software.amazon.awssdk.services.dynamodb.transform.QueryRequestMarshaller

/**
  * Builds instances of type QueryRequest:
  * Represents the input of a Query operation.
  */
@DynamodbDSLMarker
inline class QueryRequestDSL(
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder: QueryRequest.Builder
){
  @PublishedApi
  internal fun build(): QueryRequest = builder.build()

  /**
    * 
    */
  inline var attributesToGet: Collection<String>?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.attributesToGet(value)
    }

  /**
    * 
    */
  inline var conditionalOperator: ConditionalOperator?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.conditionalOperator(value)
    }

  /**
    * 
    */
  inline var consistentRead: Boolean?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.consistentRead(value)
    }

  /**
    * 
    */
  inline var exclusiveStartKey: Map<String, AttributeValue>?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.exclusiveStartKey(value)
    }

  /**
    * 
    */
  inline var expressionAttributeNames: Map<String, String>?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.expressionAttributeNames(value)
    }

  /**
    * 
    */
  inline var expressionAttributeValues: Map<String, AttributeValue>?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.expressionAttributeValues(value)
    }

  /**
    * 
    */
  inline var filterExpression: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.filterExpression(value)
    }

  /**
    * 
    */
  inline var indexName: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.indexName(value)
    }

  /**
    * 
    */
  inline var keyConditionExpression: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.keyConditionExpression(value)
    }

  /**
    * 
    */
  inline var keyConditions: Map<String, Condition>?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.keyConditions(value)
    }

  /**
    * 
    */
  inline var limit: Int?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.limit(value)
    }

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
  inline var projectionExpression: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.projectionExpression(value)
    }

  /**
    * 
    */
  inline var queryFilter: Map<String, Condition>?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.queryFilter(value)
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
  inline var scanIndexForward: Boolean?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.scanIndexForward(value)
    }

  /**
    * 
    */
  inline var select: Select?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.select(value)
    }

  /**
    * 
    */
  inline var tableName: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.tableName(value)
    }

  /**
    * 
    */
  inline fun conditionalOperator(value: String?) {
    builder.conditionalOperator(value)
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
  inline fun select(value: String?) {
    builder.select(value)
  }

  /**
    * 
    */
  inline fun exclusiveStartKey(dslBlock: AttributeValueMapDSL.() -> Unit) {
    builder.exclusiveStartKey(DynamodbDSL.Companion.attributeValueMap(dslBlock))
  }

  /**
    * 
    */
  inline fun expressionAttributeValues(dslBlock: AttributeValueMapDSL.() -> Unit) {
    builder.expressionAttributeValues(DynamodbDSL.Companion.attributeValueMap(dslBlock))
  }

  /**
    * 
    */
  inline fun keyConditions(dslBlock: ConditionMapDSL.() -> Unit) {
    builder.keyConditions(DynamodbDSL.Companion.conditionMap(dslBlock))
  }

  /**
    * 
    */
  inline fun queryFilter(dslBlock: ConditionMapDSL.() -> Unit) {
    builder.queryFilter(DynamodbDSL.Companion.conditionMap(dslBlock))
  }

}

/**
  * Builds instances of type QueryRequest:
  * Represents the input of a Query operation.
  */
inline fun queryRequest(dslBlock: QueryRequestDSL.() -> Unit) =
  QueryRequestDSL(QueryRequest.builder()).apply(dslBlock).build()

/**
  * Builds instances of type QueryRequest:
  * Represents the input of a Query operation.
  */
inline fun DynamodbDSL.Companion.queryRequest(dslBlock: QueryRequestDSL.() -> Unit) =
  QueryRequestDSL(QueryRequest.builder()).apply(dslBlock).build()

/**
  * The Query operation finds items based on primary key values. You can query any table or secondary
  *  index that has a composite primary key (a partition key and a sort key).
  * 
  *  Use the KeyConditionExpression parameter to provide a specific value for the partition key. The
  *  Query operation will return all of the items from the table or index with that partition key value.
  *  You can optionally narrow the scope of the Query operation by specifying a sort key value and a
  *  comparison operator in KeyConditionExpression. To further refine the Query results, you
  *  can optionally provide a FilterExpression. A FilterExpression determines which items
  *  within the results should be returned to you. All of the other results are discarded.
  * 
  *  A Query operation always returns a result set. If no matching items are found, the result set will
  *  be empty. Queries that do not return results consume the minimum number of read capacity units for that type of
  *  read operation.
  * 
  *  DynamoDB calculates the number of read capacity units consumed based on item size, not on the amount of data that
  *  is returned to an application. The number of capacity units consumed will be the same whether you request all of
  *  the attributes (the default behavior) or just some of them (using a projection expression). The number will also
  *  be the same whether or not you use a FilterExpression.
  * 
  *  Query results are always sorted by the sort key value. If the data type of the sort key is Number,
  *  the results are returned in numeric order; otherwise, the results are returned in order of UTF-8 bytes. By
  *  default, the sort order is ascending. To reverse the order, set the ScanIndexForward parameter to
  *  false.
  * 
  *  A single Query operation will read up to the maximum number of items set (if using the
  *  Limit parameter) or a maximum of 1 MB of data and then apply any filtering to the results using
  *  FilterExpression. If LastEvaluatedKey is present in the response, you will need to
  *  paginate the result set. For more information, see Paginating
  *  the Results in the Amazon DynamoDB Developer Guide.
  * 
  *  FilterExpression is applied after a Query finishes, but before the results are
  *  returned. A FilterExpression cannot contain partition key or sort key attributes. You need to
  *  specify those attributes in the KeyConditionExpression.
  * 
  *  A Query operation can return an empty result set and a LastEvaluatedKey if all the
  *  items read for the page of results are filtered out.
  * 
  *  You can query a table, a local secondary index, or a global secondary index. For a query on a table or on a local
  *  secondary index, you can set the ConsistentRead parameter to true and obtain a strongly
  *  consistent result. Global secondary indexes support eventually consistent reads only, so do not specify
  *  ConsistentRead when querying a global secondary index.
  */
inline fun DynamoDbAsyncClient.queryBy(dslBlock: QueryRequestDSL.() -> Unit) =
  this.query(DynamodbDSL.Companion.queryRequest(dslBlock))

/**
  * The Query operation finds items based on primary key values. You can query any table or secondary
  *  index that has a composite primary key (a partition key and a sort key).
  * 
  *  Use the KeyConditionExpression parameter to provide a specific value for the partition key. The
  *  Query operation will return all of the items from the table or index with that partition key value.
  *  You can optionally narrow the scope of the Query operation by specifying a sort key value and a
  *  comparison operator in KeyConditionExpression. To further refine the Query results, you
  *  can optionally provide a FilterExpression. A FilterExpression determines which items
  *  within the results should be returned to you. All of the other results are discarded.
  * 
  *  A Query operation always returns a result set. If no matching items are found, the result set will
  *  be empty. Queries that do not return results consume the minimum number of read capacity units for that type of
  *  read operation.
  * 
  *  DynamoDB calculates the number of read capacity units consumed based on item size, not on the amount of data that
  *  is returned to an application. The number of capacity units consumed will be the same whether you request all of
  *  the attributes (the default behavior) or just some of them (using a projection expression). The number will also
  *  be the same whether or not you use a FilterExpression.
  * 
  *  Query results are always sorted by the sort key value. If the data type of the sort key is Number,
  *  the results are returned in numeric order; otherwise, the results are returned in order of UTF-8 bytes. By
  *  default, the sort order is ascending. To reverse the order, set the ScanIndexForward parameter to
  *  false.
  * 
  *  A single Query operation will read up to the maximum number of items set (if using the
  *  Limit parameter) or a maximum of 1 MB of data and then apply any filtering to the results using
  *  FilterExpression. If LastEvaluatedKey is present in the response, you will need to
  *  paginate the result set. For more information, see Paginating
  *  the Results in the Amazon DynamoDB Developer Guide.
  * 
  *  FilterExpression is applied after a Query finishes, but before the results are
  *  returned. A FilterExpression cannot contain partition key or sort key attributes. You need to
  *  specify those attributes in the KeyConditionExpression.
  * 
  *  A Query operation can return an empty result set and a LastEvaluatedKey if all the
  *  items read for the page of results are filtered out.
  * 
  *  You can query a table, a local secondary index, or a global secondary index. For a query on a table or on a local
  *  secondary index, you can set the ConsistentRead parameter to true and obtain a strongly
  *  consistent result. Global secondary indexes support eventually consistent reads only, so do not specify
  *  ConsistentRead when querying a global secondary index.
  * 
  *  This is a variant of {@link #query(software.amazon.awssdk.services.dynamodb.model.QueryRequest)} operation. The
  *  return type is a custom publisher that can be subscribed to request a stream of response pages. SDK will
  *  internally handle making service calls for you.
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
  *  software.amazon.awssdk.services.dynamodb.paginators.QueryPublisher publisher = client.queryPaginator(request);
  *  CompletableFuture future = publisher.subscribe(res -> { // Do something with the response });
  *  future.get();
  *  }
  * 
  *  2) Using a custom subscriber
  * 
  *  {@code
  *  software.amazon.awssdk.services.dynamodb.paginators.QueryPublisher publisher = client.queryPaginator(request);
  *  publisher.subscribe(new Subscriber() {
  * 
  *  public void onSubscribe(org.reactivestreams.Subscriber subscription) { //... };
  * 
  *  public void onNext(software.amazon.awssdk.services.dynamodb.model.QueryResponse response) { //... };
  *  });}
  * 
  *  As the response is a publisher, it can work well with third party reactive streams implementations like RxJava2.
  * 
  *  Note: If you prefer to have control on service calls, use the
  *  {@link #query(software.amazon.awssdk.services.dynamodb.model.QueryRequest)} operation.
  */
inline fun DynamoDbAsyncClient.queryPaginatorBy(dslBlock: QueryRequestDSL.() -> Unit) =
  this.queryPaginator(DynamodbDSL.Companion.queryRequest(dslBlock))

/**
  * The Query operation finds items based on primary key values. You can query any table or secondary
  *  index that has a composite primary key (a partition key and a sort key).
  * 
  *  Use the KeyConditionExpression parameter to provide a specific value for the partition key. The
  *  Query operation will return all of the items from the table or index with that partition key value.
  *  You can optionally narrow the scope of the Query operation by specifying a sort key value and a
  *  comparison operator in KeyConditionExpression. To further refine the Query results, you
  *  can optionally provide a FilterExpression. A FilterExpression determines which items
  *  within the results should be returned to you. All of the other results are discarded.
  * 
  *  A Query operation always returns a result set. If no matching items are found, the result set will
  *  be empty. Queries that do not return results consume the minimum number of read capacity units for that type of
  *  read operation.
  * 
  *  DynamoDB calculates the number of read capacity units consumed based on item size, not on the amount of data that
  *  is returned to an application. The number of capacity units consumed will be the same whether you request all of
  *  the attributes (the default behavior) or just some of them (using a projection expression). The number will also
  *  be the same whether or not you use a FilterExpression.
  * 
  *  Query results are always sorted by the sort key value. If the data type of the sort key is Number,
  *  the results are returned in numeric order; otherwise, the results are returned in order of UTF-8 bytes. By
  *  default, the sort order is ascending. To reverse the order, set the ScanIndexForward parameter to
  *  false.
  * 
  *  A single Query operation will read up to the maximum number of items set (if using the
  *  Limit parameter) or a maximum of 1 MB of data and then apply any filtering to the results using
  *  FilterExpression. If LastEvaluatedKey is present in the response, you will need to
  *  paginate the result set. For more information, see Paginating
  *  the Results in the Amazon DynamoDB Developer Guide.
  * 
  *  FilterExpression is applied after a Query finishes, but before the results are
  *  returned. A FilterExpression cannot contain partition key or sort key attributes. You need to
  *  specify those attributes in the KeyConditionExpression.
  * 
  *  A Query operation can return an empty result set and a LastEvaluatedKey if all the
  *  items read for the page of results are filtered out.
  * 
  *  You can query a table, a local secondary index, or a global secondary index. For a query on a table or on a local
  *  secondary index, you can set the ConsistentRead parameter to true and obtain a strongly
  *  consistent result. Global secondary indexes support eventually consistent reads only, so do not specify
  *  ConsistentRead when querying a global secondary index.
  */
inline fun DynamoDbClient.queryBy(dslBlock: QueryRequestDSL.() -> Unit) =
  this.query(DynamodbDSL.Companion.queryRequest(dslBlock))

/**
  * The Query operation finds items based on primary key values. You can query any table or secondary
  *  index that has a composite primary key (a partition key and a sort key).
  * 
  *  Use the KeyConditionExpression parameter to provide a specific value for the partition key. The
  *  Query operation will return all of the items from the table or index with that partition key value.
  *  You can optionally narrow the scope of the Query operation by specifying a sort key value and a
  *  comparison operator in KeyConditionExpression. To further refine the Query results, you
  *  can optionally provide a FilterExpression. A FilterExpression determines which items
  *  within the results should be returned to you. All of the other results are discarded.
  * 
  *  A Query operation always returns a result set. If no matching items are found, the result set will
  *  be empty. Queries that do not return results consume the minimum number of read capacity units for that type of
  *  read operation.
  * 
  *  DynamoDB calculates the number of read capacity units consumed based on item size, not on the amount of data that
  *  is returned to an application. The number of capacity units consumed will be the same whether you request all of
  *  the attributes (the default behavior) or just some of them (using a projection expression). The number will also
  *  be the same whether or not you use a FilterExpression.
  * 
  *  Query results are always sorted by the sort key value. If the data type of the sort key is Number,
  *  the results are returned in numeric order; otherwise, the results are returned in order of UTF-8 bytes. By
  *  default, the sort order is ascending. To reverse the order, set the ScanIndexForward parameter to
  *  false.
  * 
  *  A single Query operation will read up to the maximum number of items set (if using the
  *  Limit parameter) or a maximum of 1 MB of data and then apply any filtering to the results using
  *  FilterExpression. If LastEvaluatedKey is present in the response, you will need to
  *  paginate the result set. For more information, see Paginating
  *  the Results in the Amazon DynamoDB Developer Guide.
  * 
  *  FilterExpression is applied after a Query finishes, but before the results are
  *  returned. A FilterExpression cannot contain partition key or sort key attributes. You need to
  *  specify those attributes in the KeyConditionExpression.
  * 
  *  A Query operation can return an empty result set and a LastEvaluatedKey if all the
  *  items read for the page of results are filtered out.
  * 
  *  You can query a table, a local secondary index, or a global secondary index. For a query on a table or on a local
  *  secondary index, you can set the ConsistentRead parameter to true and obtain a strongly
  *  consistent result. Global secondary indexes support eventually consistent reads only, so do not specify
  *  ConsistentRead when querying a global secondary index.
  * 
  *  This is a variant of {@link #query(software.amazon.awssdk.services.dynamodb.model.QueryRequest)} operation. The
  *  return type is a custom iterable that can be used to iterate through all the pages. SDK will internally handle
  *  making service calls for you.
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
  *  software.amazon.awssdk.services.dynamodb.paginators.QueryIterable responses = client.queryPaginator(request);
  *  responses.stream().forEach(....);
  *  }
  * 
  *  2) Using For loop
  * 
  *  {
  *      &#064;code
  *      software.amazon.awssdk.services.dynamodb.paginators.QueryIterable responses = client.queryPaginator(request);
  *      for (software.amazon.awssdk.services.dynamodb.model.QueryResponse response : responses) {
  *          // do something;
  *      }
  *  }
  * 
  *  3) Use iterator directly
  * 
  *  {@code
  *  software.amazon.awssdk.services.dynamodb.paginators.QueryIterable responses = client.queryPaginator(request);
  *  responses.iterator().forEachRemaining(....);
  *  }
  * 
  *  Note: If you prefer to have control on service calls, use the
  *  {@link #query(software.amazon.awssdk.services.dynamodb.model.QueryRequest)} operation.
  */
inline fun DynamoDbClient.queryPaginatorBy(dslBlock: QueryRequestDSL.() -> Unit) =
  this.queryPaginator(DynamodbDSL.Companion.queryRequest(dslBlock))

/**
  * 
  */
inline fun QueryRequestMarshaller.marshallBy(dslBlock: QueryRequestDSL.() -> Unit) =
  this.marshall(DynamodbDSL.Companion.queryRequest(dslBlock))