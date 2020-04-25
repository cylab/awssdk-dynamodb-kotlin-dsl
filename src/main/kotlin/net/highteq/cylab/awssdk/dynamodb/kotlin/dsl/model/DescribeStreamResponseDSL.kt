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
import software.amazon.awssdk.services.dynamodb.model.DescribeStreamResponse
import software.amazon.awssdk.services.dynamodb.model.StreamDescription

/**
  * Builds instances of type DescribeStreamResponse:
  * Represents the output of a DescribeStream operation.
  */
@DynamodbDSL
class DescribeStreamResponseDSL {
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  internal val builder = DescribeStreamResponse.builder()
  internal fun build(): DescribeStreamResponse = builder.build()
    
  /**
    * A complete description of the stream, including its creation date and time, the DynamoDB table associated
    *  with the stream, the shard IDs within the stream, and the beginning and ending sequence numbers of stream
    *  records within the shards.
    */
  var streamDescription: StreamDescription
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.streamDescription(value)
    }


  /**
    * 
    */
  var responseMetadata: AwsResponseMetadata
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.responseMetadata(value)
    }


  /**
    * 
    */
  var sdkHttpResponse: SdkHttpResponse
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.sdkHttpResponse(value)
    }

  
    
  /**
    * A complete description of the stream, including its creation date and time, the DynamoDB table associated
    *  with the stream, the shard IDs within the stream, and the beginning and ending sequence numbers of stream
    *  records within the shards.
    */
  fun streamDescription(dslBlock: StreamDescriptionDSL.() -> Unit) {
    builder.streamDescription(buildStreamDescription(dslBlock))
  }

}

/**
  * Builds instances of type DescribeStreamResponse:
  * Represents the output of a DescribeStream operation.
  */
fun buildDescribeStreamResponse(dslBlock: DescribeStreamResponseDSL.() -> Unit) =
  DescribeStreamResponseDSL().apply(dslBlock).build()