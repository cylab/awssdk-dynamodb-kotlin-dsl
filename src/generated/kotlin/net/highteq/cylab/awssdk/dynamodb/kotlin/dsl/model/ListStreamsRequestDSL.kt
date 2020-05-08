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
import software.amazon.awssdk.services.dynamodb.model.ListStreamsRequest
import software.amazon.awssdk.services.dynamodb.streams.DynamoDbStreamsAsyncClient
import software.amazon.awssdk.services.dynamodb.streams.DynamoDbStreamsClient
import software.amazon.awssdk.services.dynamodb.streams.transform.ListStreamsRequestMarshaller

/**
  * Builds instances of type ListStreamsRequest:
  * Represents the input of a ListStreams operation.
  */
@DynamodbDSL
inline class ListStreamsRequestDSL(
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder: ListStreamsRequest.Builder
){
  @PublishedApi
  internal fun build(): ListStreamsRequest = builder.build()

  /**
    * 
    */
  inline var exclusiveStartStreamArn: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.exclusiveStartStreamArn(value)
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
  inline var tableName: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.tableName(value)
    }

}

/**
  * Builds instances of type ListStreamsRequest:
  * Represents the input of a ListStreams operation.
  */
inline fun buildListStreamsRequest(dslBlock: ListStreamsRequestDSL.() -> Unit) =
  ListStreamsRequestDSL(ListStreamsRequest.builder()).apply(dslBlock).build()

/**
  * Returns an array of stream ARNs associated with the current account and endpoint. If the TableName
  *  parameter is present, then ListStreams will return only the streams ARNs for that table.
  * 
  *  You can call ListStreams at a maximum rate of 5 times per second.
  */
inline fun DynamoDbStreamsAsyncClient.listStreamsBy(dslBlock: ListStreamsRequestDSL.() -> Unit) =
  this.listStreams(buildListStreamsRequest(dslBlock))

/**
  * Returns an array of stream ARNs associated with the current account and endpoint. If the TableName
  *  parameter is present, then ListStreams will return only the streams ARNs for that table.
  * 
  *  You can call ListStreams at a maximum rate of 5 times per second.
  * 
  *  This is a variant of {@link #listStreams(software.amazon.awssdk.services.dynamodb.model.ListStreamsRequest)}
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
  *  software.amazon.awssdk.services.dynamodb.streams.paginators.ListStreamsPublisher publisher = client.listStreamsPaginator(request);
  *  CompletableFuture future = publisher.subscribe(res -> { // Do something with the response });
  *  future.get();
  *  }
  * 
  *  2) Using a custom subscriber
  * 
  *  {@code
  *  software.amazon.awssdk.services.dynamodb.streams.paginators.ListStreamsPublisher publisher = client.listStreamsPaginator(request);
  *  publisher.subscribe(new Subscriber() {
  * 
  *  public void onSubscribe(org.reactivestreams.Subscriber subscription) { //... };
  * 
  *  public void onNext(software.amazon.awssdk.services.dynamodb.model.ListStreamsResponse response) { //... };
  *  });}
  * 
  *  As the response is a publisher, it can work well with third party reactive streams implementations like RxJava2.
  * 
  *  Note: If you prefer to have control on service calls, use the
  *  {@link #listStreams(software.amazon.awssdk.services.dynamodb.model.ListStreamsRequest)} operation.
  */
inline fun DynamoDbStreamsAsyncClient.listStreamsPaginatorBy(dslBlock: ListStreamsRequestDSL.() -> Unit) =
  this.listStreamsPaginator(buildListStreamsRequest(dslBlock))

/**
  * Returns an array of stream ARNs associated with the current account and endpoint. If the TableName
  *  parameter is present, then ListStreams will return only the streams ARNs for that table.
  * 
  *  You can call ListStreams at a maximum rate of 5 times per second.
  */
inline fun DynamoDbStreamsClient.listStreamsBy(dslBlock: ListStreamsRequestDSL.() -> Unit) =
  this.listStreams(buildListStreamsRequest(dslBlock))

/**
  * Returns an array of stream ARNs associated with the current account and endpoint. If the TableName
  *  parameter is present, then ListStreams will return only the streams ARNs for that table.
  * 
  *  You can call ListStreams at a maximum rate of 5 times per second.
  * 
  *  This is a variant of {@link #listStreams(software.amazon.awssdk.services.dynamodb.model.ListStreamsRequest)}
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
  *  software.amazon.awssdk.services.dynamodb.streams.paginators.ListStreamsIterable responses = client.listStreamsPaginator(request);
  *  responses.stream().forEach(....);
  *  }
  * 
  *  2) Using For loop
  * 
  *  {
  *      &#064;code
  *      software.amazon.awssdk.services.dynamodb.streams.paginators.ListStreamsIterable responses = client
  *              .listStreamsPaginator(request);
  *      for (software.amazon.awssdk.services.dynamodb.model.ListStreamsResponse response : responses) {
  *          // do something;
  *      }
  *  }
  * 
  *  3) Use iterator directly
  * 
  *  {@code
  *  software.amazon.awssdk.services.dynamodb.streams.paginators.ListStreamsIterable responses = client.listStreamsPaginator(request);
  *  responses.iterator().forEachRemaining(....);
  *  }
  * 
  *  Note: If you prefer to have control on service calls, use the
  *  {@link #listStreams(software.amazon.awssdk.services.dynamodb.model.ListStreamsRequest)} operation.
  */
inline fun DynamoDbStreamsClient.listStreamsPaginatorBy(dslBlock: ListStreamsRequestDSL.() -> Unit) =
  this.listStreamsPaginator(buildListStreamsRequest(dslBlock))

/**
  * 
  */
inline fun ListStreamsRequestMarshaller.marshallBy(dslBlock: ListStreamsRequestDSL.() -> Unit) =
  this.marshall(buildListStreamsRequest(dslBlock))