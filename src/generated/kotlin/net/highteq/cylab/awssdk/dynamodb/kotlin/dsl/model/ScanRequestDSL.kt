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
import software.amazon.awssdk.services.dynamodb.model.ReturnConsumedCapacity
import software.amazon.awssdk.services.dynamodb.model.ScanRequest
import software.amazon.awssdk.services.dynamodb.model.Select
import software.amazon.awssdk.services.dynamodb.transform.ScanRequestMarshaller

/**
  * Builds instances of type ScanRequest:
  * Represents the input of a Scan operation.
  */
@DynamodbDSLMarker
inline class ScanRequestDSL(
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder: ScanRequest.Builder
){
  @PublishedApi
  internal fun build(): ScanRequest = builder.build()

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
  inline var returnConsumedCapacity: ReturnConsumedCapacity?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.returnConsumedCapacity(value)
    }

  /**
    * 
    */
  inline var scanFilter: Map<String, Condition>?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.scanFilter(value)
    }

  /**
    * 
    */
  inline var segment: Int?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.segment(value)
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
  inline var totalSegments: Int?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.totalSegments(value)
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
  inline fun scanFilter(dslBlock: ConditionMapDSL.() -> Unit) {
    builder.scanFilter(DynamodbDSL.Companion.conditionMap(dslBlock))
  }

}

/**
  * Builds instances of type ScanRequest:
  * Represents the input of a Scan operation.
  */
inline fun scanRequest(dslBlock: ScanRequestDSL.() -> Unit) =
  ScanRequestDSL(ScanRequest.builder()).apply(dslBlock).build()

/**
  * Builds instances of type ScanRequest:
  * Represents the input of a Scan operation.
  */
inline fun DynamodbDSL.Companion.scanRequest(dslBlock: ScanRequestDSL.() -> Unit) =
  ScanRequestDSL(ScanRequest.builder()).apply(dslBlock).build()

/**
  * The Scan operation returns one or more items and item attributes by accessing every item in a table
  *  or a secondary index. To have DynamoDB return fewer items, you can provide a FilterExpression
  *  operation.
  * 
  *  If the total number of scanned items exceeds the maximum data set size limit of 1 MB, the scan stops and results
  *  are returned to the user as a LastEvaluatedKey value to continue the scan in a subsequent operation.
  *  The results also include the number of items exceeding the limit. A scan can result in no table data meeting the
  *  filter criteria.
  * 
  *  A single Scan operation will read up to the maximum number of items set (if using the
  *  Limit parameter) or a maximum of 1 MB of data and then apply any filtering to the results using
  *  FilterExpression. If LastEvaluatedKey is present in the response, you will need to
  *  paginate the result set. For more information, see Paginating the
  *  Results in the Amazon DynamoDB Developer Guide.
  * 
  *  Scan operations proceed sequentially; however, for faster performance on a large table or secondary
  *  index, applications can request a parallel Scan operation by providing the Segment and
  *  TotalSegments parameters. For more information, see Parallel
  *  Scan in the Amazon DynamoDB Developer Guide.
  * 
  *  Scan uses eventually consistent reads when accessing the data in a table; therefore, the result set
  *  might not include the changes to data in the table immediately before the operation began. If you need a
  *  consistent copy of the data, as of the time that the Scan begins, you can set the
  *  ConsistentRead parameter to true.
  */
inline fun DynamoDbAsyncClient.scanBy(dslBlock: ScanRequestDSL.() -> Unit) =
  this.scan(DynamodbDSL.Companion.scanRequest(dslBlock))

/**
  * The Scan operation returns one or more items and item attributes by accessing every item in a table
  *  or a secondary index. To have DynamoDB return fewer items, you can provide a FilterExpression
  *  operation.
  * 
  *  If the total number of scanned items exceeds the maximum data set size limit of 1 MB, the scan stops and results
  *  are returned to the user as a LastEvaluatedKey value to continue the scan in a subsequent operation.
  *  The results also include the number of items exceeding the limit. A scan can result in no table data meeting the
  *  filter criteria.
  * 
  *  A single Scan operation will read up to the maximum number of items set (if using the
  *  Limit parameter) or a maximum of 1 MB of data and then apply any filtering to the results using
  *  FilterExpression. If LastEvaluatedKey is present in the response, you will need to
  *  paginate the result set. For more information, see Paginating the
  *  Results in the Amazon DynamoDB Developer Guide.
  * 
  *  Scan operations proceed sequentially; however, for faster performance on a large table or secondary
  *  index, applications can request a parallel Scan operation by providing the Segment and
  *  TotalSegments parameters. For more information, see Parallel
  *  Scan in the Amazon DynamoDB Developer Guide.
  * 
  *  Scan uses eventually consistent reads when accessing the data in a table; therefore, the result set
  *  might not include the changes to data in the table immediately before the operation began. If you need a
  *  consistent copy of the data, as of the time that the Scan begins, you can set the
  *  ConsistentRead parameter to true.
  * 
  *  This is a variant of {@link #scan(software.amazon.awssdk.services.dynamodb.model.ScanRequest)} operation. The
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
  *  software.amazon.awssdk.services.dynamodb.paginators.ScanPublisher publisher = client.scanPaginator(request);
  *  CompletableFuture future = publisher.subscribe(res -> { // Do something with the response });
  *  future.get();
  *  }
  * 
  *  2) Using a custom subscriber
  * 
  *  {@code
  *  software.amazon.awssdk.services.dynamodb.paginators.ScanPublisher publisher = client.scanPaginator(request);
  *  publisher.subscribe(new Subscriber() {
  * 
  *  public void onSubscribe(org.reactivestreams.Subscriber subscription) { //... };
  * 
  *  public void onNext(software.amazon.awssdk.services.dynamodb.model.ScanResponse response) { //... };
  *  });}
  * 
  *  As the response is a publisher, it can work well with third party reactive streams implementations like RxJava2.
  * 
  *  Note: If you prefer to have control on service calls, use the
  *  {@link #scan(software.amazon.awssdk.services.dynamodb.model.ScanRequest)} operation.
  */
inline fun DynamoDbAsyncClient.scanPaginatorBy(dslBlock: ScanRequestDSL.() -> Unit) =
  this.scanPaginator(DynamodbDSL.Companion.scanRequest(dslBlock))

/**
  * The Scan operation returns one or more items and item attributes by accessing every item in a table
  *  or a secondary index. To have DynamoDB return fewer items, you can provide a FilterExpression
  *  operation.
  * 
  *  If the total number of scanned items exceeds the maximum data set size limit of 1 MB, the scan stops and results
  *  are returned to the user as a LastEvaluatedKey value to continue the scan in a subsequent operation.
  *  The results also include the number of items exceeding the limit. A scan can result in no table data meeting the
  *  filter criteria.
  * 
  *  A single Scan operation will read up to the maximum number of items set (if using the
  *  Limit parameter) or a maximum of 1 MB of data and then apply any filtering to the results using
  *  FilterExpression. If LastEvaluatedKey is present in the response, you will need to
  *  paginate the result set. For more information, see Paginating the
  *  Results in the Amazon DynamoDB Developer Guide.
  * 
  *  Scan operations proceed sequentially; however, for faster performance on a large table or secondary
  *  index, applications can request a parallel Scan operation by providing the Segment and
  *  TotalSegments parameters. For more information, see Parallel
  *  Scan in the Amazon DynamoDB Developer Guide.
  * 
  *  Scan uses eventually consistent reads when accessing the data in a table; therefore, the result set
  *  might not include the changes to data in the table immediately before the operation began. If you need a
  *  consistent copy of the data, as of the time that the Scan begins, you can set the
  *  ConsistentRead parameter to true.
  */
inline fun DynamoDbClient.scanBy(dslBlock: ScanRequestDSL.() -> Unit) =
  this.scan(DynamodbDSL.Companion.scanRequest(dslBlock))

/**
  * The Scan operation returns one or more items and item attributes by accessing every item in a table
  *  or a secondary index. To have DynamoDB return fewer items, you can provide a FilterExpression
  *  operation.
  * 
  *  If the total number of scanned items exceeds the maximum data set size limit of 1 MB, the scan stops and results
  *  are returned to the user as a LastEvaluatedKey value to continue the scan in a subsequent operation.
  *  The results also include the number of items exceeding the limit. A scan can result in no table data meeting the
  *  filter criteria.
  * 
  *  A single Scan operation will read up to the maximum number of items set (if using the
  *  Limit parameter) or a maximum of 1 MB of data and then apply any filtering to the results using
  *  FilterExpression. If LastEvaluatedKey is present in the response, you will need to
  *  paginate the result set. For more information, see Paginating the
  *  Results in the Amazon DynamoDB Developer Guide.
  * 
  *  Scan operations proceed sequentially; however, for faster performance on a large table or secondary
  *  index, applications can request a parallel Scan operation by providing the Segment and
  *  TotalSegments parameters. For more information, see Parallel
  *  Scan in the Amazon DynamoDB Developer Guide.
  * 
  *  Scan uses eventually consistent reads when accessing the data in a table; therefore, the result set
  *  might not include the changes to data in the table immediately before the operation began. If you need a
  *  consistent copy of the data, as of the time that the Scan begins, you can set the
  *  ConsistentRead parameter to true.
  * 
  *  This is a variant of {@link #scan(software.amazon.awssdk.services.dynamodb.model.ScanRequest)} operation. The
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
  *  software.amazon.awssdk.services.dynamodb.paginators.ScanIterable responses = client.scanPaginator(request);
  *  responses.stream().forEach(....);
  *  }
  * 
  *  2) Using For loop
  * 
  *  {
  *      &#064;code
  *      software.amazon.awssdk.services.dynamodb.paginators.ScanIterable responses = client.scanPaginator(request);
  *      for (software.amazon.awssdk.services.dynamodb.model.ScanResponse response : responses) {
  *          // do something;
  *      }
  *  }
  * 
  *  3) Use iterator directly
  * 
  *  {@code
  *  software.amazon.awssdk.services.dynamodb.paginators.ScanIterable responses = client.scanPaginator(request);
  *  responses.iterator().forEachRemaining(....);
  *  }
  * 
  *  Note: If you prefer to have control on service calls, use the
  *  {@link #scan(software.amazon.awssdk.services.dynamodb.model.ScanRequest)} operation.
  */
inline fun DynamoDbClient.scanPaginatorBy(dslBlock: ScanRequestDSL.() -> Unit) =
  this.scanPaginator(DynamodbDSL.Companion.scanRequest(dslBlock))

/**
  * 
  */
inline fun ScanRequestMarshaller.marshallBy(dslBlock: ScanRequestDSL.() -> Unit) =
  this.marshall(DynamodbDSL.Companion.scanRequest(dslBlock))