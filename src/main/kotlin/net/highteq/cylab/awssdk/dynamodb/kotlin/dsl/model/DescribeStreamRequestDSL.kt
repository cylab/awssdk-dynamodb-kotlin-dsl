/*
  This file was generated from https://github.com/aws/aws-sdk-java-v2 by https://github.com/cylab/aws-kotlin-dsl-builder
  Like the original code, this file and project is licensed under
  Apache License Version 2.0
  See LICENSE.txt for more info
*/
package net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.model

import kotlin.DeprecationLevel.HIDDEN
import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSL
import software.amazon.awssdk.awscore.AwsRequestOverrideConfiguration
import software.amazon.awssdk.services.dynamodb.model.DescribeStreamRequest

/**
  * Builds instances of type DescribeStreamRequest:
  * Represents the input of a DescribeStream operation.
  */
@DynamodbDSL
class DescribeStreamRequestDSL {
  private val builder = DescribeStreamRequest.builder()
  internal fun build(): DescribeStreamRequest = builder.build()
    
  /**
    * 
    */
  @get:JvmSynthetic // Hide from Java callers
  var overrideConfiguration: AwsRequestOverrideConfiguration
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.overrideConfiguration(value)
    }


  /**
    * The Amazon Resource Name (ARN) for the stream.
    */
  @get:JvmSynthetic // Hide from Java callers
  var streamArn: String
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.streamArn(value)
    }


  /**
    * The shard ID of the first item that this operation will evaluate. Use the value that was returned for
    *  LastEvaluatedShardId in the previous operation.
    */
  @get:JvmSynthetic // Hide from Java callers
  var exclusiveStartShardId: String
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.exclusiveStartShardId(value)
    }


  /**
    * The maximum number of shard objects to return. The upper limit is 100.
    */
  @get:JvmSynthetic // Hide from Java callers
  var limit: Int
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.limit(value)
    }

  
  
}

/**
  * Builds instances of type DescribeStreamRequest:
  * Represents the input of a DescribeStream operation.
  */
fun buildDescribeStreamRequest(dslBlock: DescribeStreamRequestDSL.() -> Unit) =
  DescribeStreamRequestDSL().apply(dslBlock).build()