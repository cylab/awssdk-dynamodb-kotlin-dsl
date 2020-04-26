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
import software.amazon.awssdk.services.dynamodb.model.ListStreamsResponse
import software.amazon.awssdk.services.dynamodb.model.Stream

/**
  * Builds instances of type ListStreamsResponse:
  * Represents the output of a ListStreams operation.
  */
@DynamodbDSL
class ListStreamsResponseDSL {
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder = ListStreamsResponse.builder()
  internal fun build(): ListStreamsResponse = builder.build()
    
  /**
    * A list of stream descriptors associated with the current account and endpoint.
    */
  var streams: Collection<Stream>?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.streams(value)
    }


  /**
    * The stream ARN of the item where the operation stopped, inclusive of the previous result set. Use this value
    *  to start a new operation, excluding this value in the new request.
    * 
    *  If LastEvaluatedStreamArn is empty, then the "last page" of results has been processed and there
    *  is no more data to be retrieved.
    * 
    *  If LastEvaluatedStreamArn is not empty, it does not necessarily mean that there is more data in
    *  the result set. The only way to know when you have reached the end of the result set is when
    *  LastEvaluatedStreamArn is empty.
    */
  var lastEvaluatedStreamArn: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.lastEvaluatedStreamArn(value)
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
    * A list of stream descriptors associated with the current account and endpoint.
    */
  fun streams(dslBlock: StreamCollectionDSL.() -> Unit) {
    builder.streams(buildStreamCollection(dslBlock))
  }

}

/**
  * Builds instances of type ListStreamsResponse:
  * Represents the output of a ListStreams operation.
  */
fun buildListStreamsResponse(dslBlock: ListStreamsResponseDSL.() -> Unit) =
  ListStreamsResponseDSL().apply(dslBlock).build()