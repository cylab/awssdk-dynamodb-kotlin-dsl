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
import software.amazon.awssdk.services.dynamodb.model.GetShardIteratorResponse

/**
  * Builds instances of type GetShardIteratorResponse:
  * Represents the output of a GetShardIterator operation.
  */
@DynamodbDSL
class GetShardIteratorResponseDSL {
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  internal val builder = GetShardIteratorResponse.builder()
  internal fun build(): GetShardIteratorResponse = builder.build()
    
  /**
    * The position in the shard from which to start reading stream records sequentially. A shard iterator specifies
    *  this position using the sequence number of a stream record in a shard.
    */
  var shardIterator: String
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.shardIterator(value)
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

  
  
}

/**
  * Builds instances of type GetShardIteratorResponse:
  * Represents the output of a GetShardIterator operation.
  */
fun buildGetShardIteratorResponse(dslBlock: GetShardIteratorResponseDSL.() -> Unit) =
  GetShardIteratorResponseDSL().apply(dslBlock).build()