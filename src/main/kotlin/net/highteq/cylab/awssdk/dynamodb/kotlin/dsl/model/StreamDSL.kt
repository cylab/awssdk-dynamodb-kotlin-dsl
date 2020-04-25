/*
  This file was generated from https://github.com/aws/aws-sdk-java-v2 by https://github.com/cylab/aws-kotlin-dsl-builder
  Like the original code, this file and project is licensed under
  Apache License Version 2.0
  See LICENSE.txt for more info
*/
package net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.model

import kotlin.DeprecationLevel.HIDDEN
import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSL
import software.amazon.awssdk.services.dynamodb.model.Stream

/**
  * Builds instances of type Stream:
  * Represents all of the data describing a particular stream.
  */
@DynamodbDSL
class StreamDSL {
  private val builder = Stream.builder()
  internal fun build(): Stream = builder.build()
    
  /**
    * A timestamp, in ISO 8601 format, for this stream.
    * 
    *  Note that LatestStreamLabel is not a unique identifier for the stream, because it is possible
    *  that a stream from another table might have the same timestamp. However, the combination of the following
    *  three elements is guaranteed to be unique:
    * 
    *  the AWS customer ID.
    * 
    *  the table name
    * 
    *  the StreamLabel
    */
  @get:JvmSynthetic // Hide from Java callers
  var streamLabel: String
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.streamLabel(value)
    }


  /**
    * The DynamoDB table with which the stream is associated.
    */
  @get:JvmSynthetic // Hide from Java callers
  var tableName: String
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.tableName(value)
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

  
  
}

/**
  * Builds instances of type Stream:
  * Represents all of the data describing a particular stream.
  */
fun buildStream(dslBlock: StreamDSL.() -> Unit) =
  StreamDSL().apply(dslBlock).build()