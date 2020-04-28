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
import java.time.Duration
import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSL
import software.amazon.awssdk.awscore.exception.AwsErrorDetails
import software.amazon.awssdk.services.dynamodb.model.TrimmedDataAccessException

/**
  * Builds instances of type TrimmedDataAccessException:
  * The operation attempted to read past the oldest stream record in a shard.
  * 
  *  In DynamoDB Streams, there is a 24 hour limit on data retention. Stream records whose age exceeds this limit are
  *  subject to removal (trimming) from the stream. You might receive a TrimmedDataAccessException if:
  * 
  *  You request a shard iterator with a sequence number older than the trim point (24 hours).
  * 
  *  You obtain a shard iterator, but before you use the iterator in a GetRecords request, a stream record in
  *  the shard exceeds the 24 hour period and is trimmed. This causes the iterator to access a record that no longer
  *  exists.
  */
@DynamodbDSL
class TrimmedDataAccessExceptionDSL {
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder = TrimmedDataAccessException.builder()
  internal fun build(): TrimmedDataAccessException = builder.build()
    
  /**
    * 
    */
  var awsErrorDetails: AwsErrorDetails?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.awsErrorDetails(value)
    }


  /**
    * 
    */
  var cause: Throwable?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.cause(value)
    }


  /**
    * 
    */
  var clockSkew: Duration?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.clockSkew(value)
    }


  /**
    * 
    */
  var message: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.message(value)
    }


  /**
    * 
    */
  var requestId: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.requestId(value)
    }


  /**
    * 
    */
  var statusCode: Int
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.statusCode(value)
    }

    
  /**
    * 
    */
  fun cause(value: Throwable?) {
    builder.cause(value)
  }


  /**
    * 
    */
  fun message(value: String?) {
    builder.message(value)
  }


  /**
    * 
    */
  fun requestId(value: String?) {
    builder.requestId(value)
  }


  /**
    * 
    */
  fun statusCode(value: Int) {
    builder.statusCode(value)
  }

  
}

/**
  * Builds instances of type TrimmedDataAccessException:
  * The operation attempted to read past the oldest stream record in a shard.
  * 
  *  In DynamoDB Streams, there is a 24 hour limit on data retention. Stream records whose age exceeds this limit are
  *  subject to removal (trimming) from the stream. You might receive a TrimmedDataAccessException if:
  * 
  *  You request a shard iterator with a sequence number older than the trim point (24 hours).
  * 
  *  You obtain a shard iterator, but before you use the iterator in a GetRecords request, a stream record in
  *  the shard exceeds the 24 hour period and is trimmed. This causes the iterator to access a record that no longer
  *  exists.
  */
fun buildTrimmedDataAccessException(dslBlock: TrimmedDataAccessExceptionDSL.() -> Unit) =
  TrimmedDataAccessExceptionDSL().apply(dslBlock).build()