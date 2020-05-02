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
import software.amazon.awssdk.services.dynamodb.model.CancellationReason
import software.amazon.awssdk.services.dynamodb.model.TransactionCanceledException

/**
  * Builds instances of type TransactionCanceledException:
  * The entire transaction request was rejected.
  * 
  *  DynamoDB rejects a TransactWriteItems request under the following circumstances:
  * 
  *  A condition in one of the condition expressions is not met.
  * 
  *  A table in the TransactWriteItems request is in a different account or region.
  * 
  *  More than one action in the TransactWriteItems operation targets the same item.
  * 
  *  There is insufficient provisioned capacity for the transaction to be completed.
  * 
  *  An item size becomes too large (larger than 400 KB), or a local secondary index (LSI) becomes too large, or a similar
  *  validation error occurs because of changes made by the transaction.
  * 
  *  There is a user error, such as an invalid data format.
  * 
  *  DynamoDB rejects a TransactGetItems request under the following circumstances:
  * 
  *  There is an ongoing TransactGetItems operation that conflicts with a concurrent PutItem,
  *  UpdateItem, DeleteItem or TransactWriteItems request. In this case the
  *  TransactGetItems operation fails with a TransactionCanceledException.
  * 
  *  A table in the TransactGetItems request is in a different account or region.
  * 
  *  There is insufficient provisioned capacity for the transaction to be completed.
  * 
  *  There is a user error, such as an invalid data format.
  */
@DynamodbDSL
inline class TransactionCanceledExceptionDSL(
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder: TransactionCanceledException.Builder
){
  @PublishedApi
  internal fun build(): TransactionCanceledException = builder.build()
    
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
  inline var cancellationReasons: Collection<CancellationReason>?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.cancellationReasons(value)
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

  
    
  /**
    * 
    */
  inline fun cancellationReasons(dslBlock: CancellationReasonCollectionDSL.() -> Unit) {
    builder.cancellationReasons(buildCancellationReasonCollection(dslBlock))
  }

}

/**
  * Builds instances of type TransactionCanceledException:
  * The entire transaction request was rejected.
  * 
  *  DynamoDB rejects a TransactWriteItems request under the following circumstances:
  * 
  *  A condition in one of the condition expressions is not met.
  * 
  *  A table in the TransactWriteItems request is in a different account or region.
  * 
  *  More than one action in the TransactWriteItems operation targets the same item.
  * 
  *  There is insufficient provisioned capacity for the transaction to be completed.
  * 
  *  An item size becomes too large (larger than 400 KB), or a local secondary index (LSI) becomes too large, or a similar
  *  validation error occurs because of changes made by the transaction.
  * 
  *  There is a user error, such as an invalid data format.
  * 
  *  DynamoDB rejects a TransactGetItems request under the following circumstances:
  * 
  *  There is an ongoing TransactGetItems operation that conflicts with a concurrent PutItem,
  *  UpdateItem, DeleteItem or TransactWriteItems request. In this case the
  *  TransactGetItems operation fails with a TransactionCanceledException.
  * 
  *  A table in the TransactGetItems request is in a different account or region.
  * 
  *  There is insufficient provisioned capacity for the transaction to be completed.
  * 
  *  There is a user error, such as an invalid data format.
  */
inline fun buildTransactionCanceledException(dslBlock: TransactionCanceledExceptionDSL.() -> Unit) =
  TransactionCanceledExceptionDSL(TransactionCanceledException.builder()).apply(dslBlock).build()