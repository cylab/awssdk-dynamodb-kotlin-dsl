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
import software.amazon.awssdk.awscore.AwsResponseMetadata
import software.amazon.awssdk.http.SdkHttpResponse
import software.amazon.awssdk.services.dynamodb.model.ListStreamsResponse
import software.amazon.awssdk.services.dynamodb.model.Stream

/**
  * Builds instances of type ListStreamsResponse:
  * Represents the output of a ListStreams operation.
  */
@DynamodbDSLMarker
inline class ListStreamsResponseDSL(
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder: ListStreamsResponse.Builder
){
  @PublishedApi
  internal fun build(): ListStreamsResponse = builder.build()

  /**
    * 
    */
  inline var lastEvaluatedStreamArn: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.lastEvaluatedStreamArn(value)
    }

  /**
    * 
    */
  inline var responseMetadata: AwsResponseMetadata?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.responseMetadata(value)
    }

  /**
    * 
    */
  inline var sdkHttpResponse: SdkHttpResponse?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.sdkHttpResponse(value)
    }

  /**
    * 
    */
  inline var streams: Collection<Stream>?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.streams(value)
    }

  /**
    * 
    */
  inline fun streams(dslBlock: StreamCollectionDSL.() -> Unit) {
    builder.streams(DynamodbDSL.Companion.streamCollection(dslBlock))
  }

}

/**
  * Builds instances of type ListStreamsResponse:
  * Represents the output of a ListStreams operation.
  */
inline fun listStreamsResponse(dslBlock: ListStreamsResponseDSL.() -> Unit) =
  ListStreamsResponseDSL(ListStreamsResponse.builder()).apply(dslBlock).build()

/**
  * Builds instances of type ListStreamsResponse:
  * Represents the output of a ListStreams operation.
  */
inline fun DynamodbDSL.Companion.listStreamsResponse(dslBlock: ListStreamsResponseDSL.() -> Unit) =
  ListStreamsResponseDSL(ListStreamsResponse.builder()).apply(dslBlock).build()