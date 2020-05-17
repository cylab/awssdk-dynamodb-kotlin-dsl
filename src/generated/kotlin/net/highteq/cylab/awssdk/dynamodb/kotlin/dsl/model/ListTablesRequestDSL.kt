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
import software.amazon.awssdk.services.dynamodb.model.ListTablesRequest
import software.amazon.awssdk.services.dynamodb.transform.ListTablesRequestMarshaller

/**
  * Builds instances of type ListTablesRequest:
  * Represents the input of a ListTables operation.
  */
@DynamodbDSLMarker
inline class ListTablesRequestDSL(
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder: ListTablesRequest.Builder
){
  @PublishedApi
  internal fun build(): ListTablesRequest = builder.build()

  /**
    * 
    */
  inline var exclusiveStartTableName: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.exclusiveStartTableName(value)
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

}

/**
  * Builds instances of type ListTablesRequest:
  * Represents the input of a ListTables operation.
  */
inline fun listTablesRequest(dslBlock: ListTablesRequestDSL.() -> Unit) =
  ListTablesRequestDSL(ListTablesRequest.builder()).apply(dslBlock).build()

/**
  * Builds instances of type ListTablesRequest:
  * Represents the input of a ListTables operation.
  */
inline fun DynamodbDSL.Companion.listTablesRequest(dslBlock: ListTablesRequestDSL.() -> Unit) =
  ListTablesRequestDSL(ListTablesRequest.builder()).apply(dslBlock).build()

/**
  * Returns an array of table names associated with the current account and endpoint. The output from
  *  ListTables is paginated, with each page returning a maximum of 100 table names.
  */
inline fun DynamoDbAsyncClient.listTablesBy(dslBlock: ListTablesRequestDSL.() -> Unit) =
  this.listTables(DynamodbDSL.Companion.listTablesRequest(dslBlock))

/**
  * Returns an array of table names associated with the current account and endpoint. The output from
  *  ListTables is paginated, with each page returning a maximum of 100 table names.
  * 
  *  This is a variant of {@link #listTables(software.amazon.awssdk.services.dynamodb.model.ListTablesRequest)}
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
  *  software.amazon.awssdk.services.dynamodb.paginators.ListTablesPublisher publisher = client.listTablesPaginator(request);
  *  CompletableFuture future = publisher.subscribe(res -> { // Do something with the response });
  *  future.get();
  *  }
  * 
  *  2) Using a custom subscriber
  * 
  *  {@code
  *  software.amazon.awssdk.services.dynamodb.paginators.ListTablesPublisher publisher = client.listTablesPaginator(request);
  *  publisher.subscribe(new Subscriber() {
  * 
  *  public void onSubscribe(org.reactivestreams.Subscriber subscription) { //... };
  * 
  *  public void onNext(software.amazon.awssdk.services.dynamodb.model.ListTablesResponse response) { //... };
  *  });}
  * 
  *  As the response is a publisher, it can work well with third party reactive streams implementations like RxJava2.
  * 
  *  Note: If you prefer to have control on service calls, use the
  *  {@link #listTables(software.amazon.awssdk.services.dynamodb.model.ListTablesRequest)} operation.
  */
inline fun DynamoDbAsyncClient.listTablesPaginatorBy(dslBlock: ListTablesRequestDSL.() -> Unit) =
  this.listTablesPaginator(DynamodbDSL.Companion.listTablesRequest(dslBlock))

/**
  * Returns an array of table names associated with the current account and endpoint. The output from
  *  ListTables is paginated, with each page returning a maximum of 100 table names.
  */
inline fun DynamoDbClient.listTablesBy(dslBlock: ListTablesRequestDSL.() -> Unit) =
  this.listTables(DynamodbDSL.Companion.listTablesRequest(dslBlock))

/**
  * Returns an array of table names associated with the current account and endpoint. The output from
  *  ListTables is paginated, with each page returning a maximum of 100 table names.
  * 
  *  This is a variant of {@link #listTables(software.amazon.awssdk.services.dynamodb.model.ListTablesRequest)}
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
  *  software.amazon.awssdk.services.dynamodb.paginators.ListTablesIterable responses = client.listTablesPaginator(request);
  *  responses.stream().forEach(....);
  *  }
  * 
  *  2) Using For loop
  * 
  *  {
  *      &#064;code
  *      software.amazon.awssdk.services.dynamodb.paginators.ListTablesIterable responses = client.listTablesPaginator(request);
  *      for (software.amazon.awssdk.services.dynamodb.model.ListTablesResponse response : responses) {
  *          // do something;
  *      }
  *  }
  * 
  *  3) Use iterator directly
  * 
  *  {@code
  *  software.amazon.awssdk.services.dynamodb.paginators.ListTablesIterable responses = client.listTablesPaginator(request);
  *  responses.iterator().forEachRemaining(....);
  *  }
  * 
  *  Note: If you prefer to have control on service calls, use the
  *  {@link #listTables(software.amazon.awssdk.services.dynamodb.model.ListTablesRequest)} operation.
  */
inline fun DynamoDbClient.listTablesPaginatorBy(dslBlock: ListTablesRequestDSL.() -> Unit) =
  this.listTablesPaginator(DynamodbDSL.Companion.listTablesRequest(dslBlock))

/**
  * 
  */
inline fun ListTablesRequestMarshaller.marshallBy(dslBlock: ListTablesRequestDSL.() -> Unit) =
  this.marshall(DynamodbDSL.Companion.listTablesRequest(dslBlock))