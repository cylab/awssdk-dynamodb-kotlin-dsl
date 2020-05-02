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
import java.time.Duration
import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSL
import software.amazon.awssdk.awscore.exception.AwsErrorDetails
import software.amazon.awssdk.services.dynamodb.model.TransactionConflictException

/**
  * Builds instances of type TransactionConflictException:
  * Operation was rejected because there is an ongoing transaction for the item.
  */
@DynamodbDSL
inline class TransactionConflictExceptionDSL(
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder: TransactionConflictException.Builder
){
  @PublishedApi
  internal fun build(): TransactionConflictException = builder.build()

  /**
    * 
    */
  inline var awsErrorDetails: AwsErrorDetails?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.awsErrorDetails(value)
    }

  /**
    * 
    */
  inline var cause: Throwable?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.cause(value)
    }

  /**
    * 
    */
  inline var clockSkew: Duration?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.clockSkew(value)
    }

  /**
    * 
    */
  inline var message: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.message(value)
    }

  /**
    * 
    */
  inline var requestId: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.requestId(value)
    }

  /**
    * 
    */
  inline var statusCode: Int
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.statusCode(value)
    }

  /**
    * 
    */
  inline fun cause(value: Throwable?) {
    builder.cause(value)
  }

  /**
    * 
    */
  inline fun message(value: String?) {
    builder.message(value)
  }

  /**
    * 
    */
  inline fun requestId(value: String?) {
    builder.requestId(value)
  }

  /**
    * 
    */
  inline fun statusCode(value: Int) {
    builder.statusCode(value)
  }

}

/**
  * Builds instances of type TransactionConflictException:
  * Operation was rejected because there is an ongoing transaction for the item.
  */
inline fun buildTransactionConflictException(dslBlock: TransactionConflictExceptionDSL.() -> Unit) =
  TransactionConflictExceptionDSL(TransactionConflictException.builder()).apply(dslBlock).build()