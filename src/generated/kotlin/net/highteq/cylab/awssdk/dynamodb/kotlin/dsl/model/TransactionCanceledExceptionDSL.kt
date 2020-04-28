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
import software.amazon.awssdk.services.dynamodb.model.CancellationReason
import software.amazon.awssdk.services.dynamodb.model.TransactionCanceledException

/**
  * Builds instances of type TransactionCanceledException:
  * The entire transaction request was canceled.
  * 
  *  DynamoDB cancels a TransactWriteItems request under the following circumstances:
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
  *  DynamoDB cancels a TransactGetItems request under the following circumstances:
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
  * 
  *  If using Java, DynamoDB lists the cancellation reasons on the CancellationReasons property. This
  *  property is not set for other languages. Transaction cancellation reasons are ordered in the order of requested
  *  items, if an item has no error it will have NONE code and Null message.
  * 
  *  Cancellation reason codes and possible error messages:
  * 
  *  No Errors:
  * 
  *  Code: NONE
  * 
  *  Message: null
  * 
  *  Conditional Check Failed:
  * 
  *  Code: ConditionalCheckFailed
  * 
  *  Message: The conditional request failed.
  * 
  *  Item Collection Size Limit Exceeded:
  * 
  *  Code: ItemCollectionSizeLimitExceeded
  * 
  *  Message: Collection size exceeded.
  * 
  *  Transaction Conflict:
  * 
  *  Code: TransactionConflict
  * 
  *  Message: Transaction is ongoing for the item.
  * 
  *  Provisioned Throughput Exceeded:
  * 
  *  Code: ProvisionedThroughputExceeded
  * 
  *  Messages:
  * 
  *  The level of configured provisioned throughput for the table was exceeded. Consider increasing your provisioning
  *  level with the UpdateTable API.
  * 
  *  This Message is received when provisioned throughput is exceeded is on a provisioned DynamoDB table.
  * 
  *  The level of configured provisioned throughput for one or more global secondary indexes of the table was exceeded.
  *  Consider increasing your provisioning level for the under-provisioned global secondary indexes with the UpdateTable
  *  API.
  * 
  *  This message is returned when provisioned throughput is exceeded is on a provisioned GSI.
  * 
  *  Throttling Error:
  * 
  *  Code: ThrottlingError
  * 
  *  Messages:
  * 
  *  Throughput exceeds the current capacity of your table or index. DynamoDB is automatically scaling your table or index
  *  so please try again shortly. If exceptions persist, check if you have a hot key:
  *  https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/bp-partition-key-design.html.
  * 
  *  This message is returned when writes get throttled on an On-Demand table as DynamoDB is automatically scaling the
  *  table.
  * 
  *  Throughput exceeds the current capacity for one or more global secondary indexes. DynamoDB is automatically scaling
  *  your index so please try again shortly.
  * 
  *  This message is returned when when writes get throttled on an On-Demand GSI as DynamoDB is automatically scaling the
  *  GSI.
  * 
  *  Validation Error:
  * 
  *  Code: ValidationError
  * 
  *  Messages:
  * 
  *  One or more parameter values were invalid.
  * 
  *  The update expression attempted to update the secondary index key beyond allowed size limits.
  * 
  *  The update expression attempted to update the secondary index key to unsupported type.
  * 
  *  An operand in the update expression has an incorrect data type.
  * 
  *  Item size to update has exceeded the maximum allowed size.
  * 
  *  Number overflow. Attempting to store a number with magnitude larger than supported range.
  * 
  *  Type mismatch for attribute to update.
  * 
  *  Nesting Levels have exceeded supported limits.
  * 
  *  The document path provided in the update expression is invalid for update.
  * 
  *  The provided expression refers to an attribute that does not exist in the item.
  */
@DynamodbDSL
class TransactionCanceledExceptionDSL {
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder = TransactionCanceledException.builder()
  internal fun build(): TransactionCanceledException = builder.build()
    
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
    * A list of cancellation reasons.
    */
  var cancellationReasons: Collection<CancellationReason>?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.cancellationReasons(value)
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

    
  /**
    * A list of cancellation reasons.
    */
  fun cancellationReasons(dslBlock: CancellationReasonCollectionDSL.() -> Unit) {
    builder.cancellationReasons(buildCancellationReasonCollection(dslBlock))
  }

}

/**
  * Builds instances of type TransactionCanceledException:
  * The entire transaction request was canceled.
  * 
  *  DynamoDB cancels a TransactWriteItems request under the following circumstances:
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
  *  DynamoDB cancels a TransactGetItems request under the following circumstances:
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
  * 
  *  If using Java, DynamoDB lists the cancellation reasons on the CancellationReasons property. This
  *  property is not set for other languages. Transaction cancellation reasons are ordered in the order of requested
  *  items, if an item has no error it will have NONE code and Null message.
  * 
  *  Cancellation reason codes and possible error messages:
  * 
  *  No Errors:
  * 
  *  Code: NONE
  * 
  *  Message: null
  * 
  *  Conditional Check Failed:
  * 
  *  Code: ConditionalCheckFailed
  * 
  *  Message: The conditional request failed.
  * 
  *  Item Collection Size Limit Exceeded:
  * 
  *  Code: ItemCollectionSizeLimitExceeded
  * 
  *  Message: Collection size exceeded.
  * 
  *  Transaction Conflict:
  * 
  *  Code: TransactionConflict
  * 
  *  Message: Transaction is ongoing for the item.
  * 
  *  Provisioned Throughput Exceeded:
  * 
  *  Code: ProvisionedThroughputExceeded
  * 
  *  Messages:
  * 
  *  The level of configured provisioned throughput for the table was exceeded. Consider increasing your provisioning
  *  level with the UpdateTable API.
  * 
  *  This Message is received when provisioned throughput is exceeded is on a provisioned DynamoDB table.
  * 
  *  The level of configured provisioned throughput for one or more global secondary indexes of the table was exceeded.
  *  Consider increasing your provisioning level for the under-provisioned global secondary indexes with the UpdateTable
  *  API.
  * 
  *  This message is returned when provisioned throughput is exceeded is on a provisioned GSI.
  * 
  *  Throttling Error:
  * 
  *  Code: ThrottlingError
  * 
  *  Messages:
  * 
  *  Throughput exceeds the current capacity of your table or index. DynamoDB is automatically scaling your table or index
  *  so please try again shortly. If exceptions persist, check if you have a hot key:
  *  https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/bp-partition-key-design.html.
  * 
  *  This message is returned when writes get throttled on an On-Demand table as DynamoDB is automatically scaling the
  *  table.
  * 
  *  Throughput exceeds the current capacity for one or more global secondary indexes. DynamoDB is automatically scaling
  *  your index so please try again shortly.
  * 
  *  This message is returned when when writes get throttled on an On-Demand GSI as DynamoDB is automatically scaling the
  *  GSI.
  * 
  *  Validation Error:
  * 
  *  Code: ValidationError
  * 
  *  Messages:
  * 
  *  One or more parameter values were invalid.
  * 
  *  The update expression attempted to update the secondary index key beyond allowed size limits.
  * 
  *  The update expression attempted to update the secondary index key to unsupported type.
  * 
  *  An operand in the update expression has an incorrect data type.
  * 
  *  Item size to update has exceeded the maximum allowed size.
  * 
  *  Number overflow. Attempting to store a number with magnitude larger than supported range.
  * 
  *  Type mismatch for attribute to update.
  * 
  *  Nesting Levels have exceeded supported limits.
  * 
  *  The document path provided in the update expression is invalid for update.
  * 
  *  The provided expression refers to an attribute that does not exist in the item.
  */
fun buildTransactionCanceledException(dslBlock: TransactionCanceledExceptionDSL.() -> Unit) =
  TransactionCanceledExceptionDSL().apply(dslBlock).build()