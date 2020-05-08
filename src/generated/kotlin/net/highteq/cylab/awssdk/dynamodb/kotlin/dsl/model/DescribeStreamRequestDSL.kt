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
import software.amazon.awssdk.services.dynamodb.model.DescribeStreamRequest
import software.amazon.awssdk.services.dynamodb.streams.DynamoDbStreamsAsyncClient
import software.amazon.awssdk.services.dynamodb.streams.DynamoDbStreamsClient
import software.amazon.awssdk.services.dynamodb.streams.transform.DescribeStreamRequestMarshaller

/**
  * Builds instances of type DescribeStreamRequest:
  * Represents the input of a DescribeStream operation.
  */
@DynamodbDSL
inline class DescribeStreamRequestDSL(
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder: DescribeStreamRequest.Builder
){
  @PublishedApi
  internal fun build(): DescribeStreamRequest = builder.build()

  /**
    * 
    */
  inline var exclusiveStartShardId: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.exclusiveStartShardId(value)
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
  inline var streamArn: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.streamArn(value)
    }

}

/**
  * Builds instances of type DescribeStreamRequest:
  * Represents the input of a DescribeStream operation.
  */
inline fun buildDescribeStreamRequest(dslBlock: DescribeStreamRequestDSL.() -> Unit) =
  DescribeStreamRequestDSL(DescribeStreamRequest.builder()).apply(dslBlock).build()

/**
  * 
  */
inline fun DescribeStreamRequestMarshaller.marshallBy(dslBlock: DescribeStreamRequestDSL.() -> Unit) =
  this.marshall(buildDescribeStreamRequest(dslBlock))

/**
  * Returns information about a stream, including the current status of the stream, its Amazon Resource Name (ARN),
  *  the composition of its shards, and its corresponding DynamoDB table.
  * 
  *  You can call DescribeStream at a maximum rate of 10 times per second.
  * 
  *  Each shard in the stream has a SequenceNumberRange associated with it. If the
  *  SequenceNumberRange has a StartingSequenceNumber but no
  *  EndingSequenceNumber, then the shard is still open (able to receive more stream records). If both
  *  StartingSequenceNumber and EndingSequenceNumber are present, then that shard is closed
  *  and can no longer receive more data.
  */
inline fun DynamoDbStreamsAsyncClient.describeStreamBy(dslBlock: DescribeStreamRequestDSL.() -> Unit) =
  this.describeStream(buildDescribeStreamRequest(dslBlock))

/**
  * Returns information about a stream, including the current status of the stream, its Amazon Resource Name (ARN),
  *  the composition of its shards, and its corresponding DynamoDB table.
  * 
  *  You can call DescribeStream at a maximum rate of 10 times per second.
  * 
  *  Each shard in the stream has a SequenceNumberRange associated with it. If the
  *  SequenceNumberRange has a StartingSequenceNumber but no
  *  EndingSequenceNumber, then the shard is still open (able to receive more stream records). If both
  *  StartingSequenceNumber and EndingSequenceNumber are present, then that shard is closed
  *  and can no longer receive more data.
  * 
  *  This is a variant of
  *  {@link #describeStream(software.amazon.awssdk.services.dynamodb.model.DescribeStreamRequest)} operation. The
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
  *  software.amazon.awssdk.services.dynamodb.streams.paginators.DescribeStreamPublisher publisher = client.describeStreamPaginator(request);
  *  CompletableFuture future = publisher.subscribe(res -> { // Do something with the response });
  *  future.get();
  *  }
  * 
  *  2) Using a custom subscriber
  * 
  *  {@code
  *  software.amazon.awssdk.services.dynamodb.streams.paginators.DescribeStreamPublisher publisher = client.describeStreamPaginator(request);
  *  publisher.subscribe(new Subscriber() {
  * 
  *  public void onSubscribe(org.reactivestreams.Subscriber subscription) { //... };
  * 
  *  public void onNext(software.amazon.awssdk.services.dynamodb.model.DescribeStreamResponse response) { //... };
  *  });}
  * 
  *  As the response is a publisher, it can work well with third party reactive streams implementations like RxJava2.
  * 
  *  Note: If you prefer to have control on service calls, use the
  *  {@link #describeStream(software.amazon.awssdk.services.dynamodb.model.DescribeStreamRequest)} operation.
  */
inline fun DynamoDbStreamsAsyncClient.describeStreamPaginatorBy(dslBlock: DescribeStreamRequestDSL.() -> Unit) =
  this.describeStreamPaginator(buildDescribeStreamRequest(dslBlock))

/**
  * Returns information about a stream, including the current status of the stream, its Amazon Resource Name (ARN),
  *  the composition of its shards, and its corresponding DynamoDB table.
  * 
  *  You can call DescribeStream at a maximum rate of 10 times per second.
  * 
  *  Each shard in the stream has a SequenceNumberRange associated with it. If the
  *  SequenceNumberRange has a StartingSequenceNumber but no
  *  EndingSequenceNumber, then the shard is still open (able to receive more stream records). If both
  *  StartingSequenceNumber and EndingSequenceNumber are present, then that shard is closed
  *  and can no longer receive more data.
  */
inline fun DynamoDbStreamsClient.describeStreamBy(dslBlock: DescribeStreamRequestDSL.() -> Unit) =
  this.describeStream(buildDescribeStreamRequest(dslBlock))

/**
  * Returns information about a stream, including the current status of the stream, its Amazon Resource Name (ARN),
  *  the composition of its shards, and its corresponding DynamoDB table.
  * 
  *  You can call DescribeStream at a maximum rate of 10 times per second.
  * 
  *  Each shard in the stream has a SequenceNumberRange associated with it. If the
  *  SequenceNumberRange has a StartingSequenceNumber but no
  *  EndingSequenceNumber, then the shard is still open (able to receive more stream records). If both
  *  StartingSequenceNumber and EndingSequenceNumber are present, then that shard is closed
  *  and can no longer receive more data.
  * 
  *  This is a variant of
  *  {@link #describeStream(software.amazon.awssdk.services.dynamodb.model.DescribeStreamRequest)} operation. The
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
  *  software.amazon.awssdk.services.dynamodb.streams.paginators.DescribeStreamIterable responses = client.describeStreamPaginator(request);
  *  responses.stream().forEach(....);
  *  }
  * 
  *  2) Using For loop
  * 
  *  {
  *      &#064;code
  *      software.amazon.awssdk.services.dynamodb.streams.paginators.DescribeStreamIterable responses = client
  *              .describeStreamPaginator(request);
  *      for (software.amazon.awssdk.services.dynamodb.model.DescribeStreamResponse response : responses) {
  *          // do something;
  *      }
  *  }
  * 
  *  3) Use iterator directly
  * 
  *  {@code
  *  software.amazon.awssdk.services.dynamodb.streams.paginators.DescribeStreamIterable responses = client.describeStreamPaginator(request);
  *  responses.iterator().forEachRemaining(....);
  *  }
  * 
  *  Note: If you prefer to have control on service calls, use the
  *  {@link #describeStream(software.amazon.awssdk.services.dynamodb.model.DescribeStreamRequest)} operation.
  */
inline fun DynamoDbStreamsClient.describeStreamPaginatorBy(dslBlock: DescribeStreamRequestDSL.() -> Unit) =
  this.describeStreamPaginator(buildDescribeStreamRequest(dslBlock))