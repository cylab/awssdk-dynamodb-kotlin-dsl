/*
  This file was generated from https://github.com/aws/aws-sdk-java-v2 by https://github.com/cylab/aws-kotlin-dsl-builder
  Like the original code, this file and project is licensed under
  Apache License Version 2.0
  See LICENSE.txt for more info
*/
package net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.model

import kotlin.DeprecationLevel.HIDDEN
import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSL
import software.amazon.awssdk.services.dynamodb.model.AttributeValue
import software.amazon.awssdk.services.dynamodb.model.CancellationReason

/**
  * Builds instances of type CancellationReason:
  * An ordered list of errors for each item in the request which caused the transaction to get cancelled. The values of
  *  the list are ordered according to the ordering of the TransactWriteItems request parameter. If no error
  *  occurred for the associated item an error with a Null code and Null message will be present.
  */
@DynamodbDSL
class CancellationReasonDSL {
  private val builder = CancellationReason.builder()
  internal fun build(): CancellationReason = builder.build()
    
  /**
    * Item in the request which caused the transaction to get cancelled.
    */
  @get:JvmSynthetic // Hide from Java callers
  var item: Map<String, AttributeValue>
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.item(value)
    }


  /**
    * Status code for the result of the cancelled transaction.
    */
  @get:JvmSynthetic // Hide from Java callers
  var code: String
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.code(value)
    }


  /**
    * Cancellation reason message description.
    */
  @get:JvmSynthetic // Hide from Java callers
  var message: String
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.message(value)
    }

  
  
}

/**
  * Builds instances of type CancellationReason:
  * An ordered list of errors for each item in the request which caused the transaction to get cancelled. The values of
  *  the list are ordered according to the ordering of the TransactWriteItems request parameter. If no error
  *  occurred for the associated item an error with a Null code and Null message will be present.
  */
fun buildCancellationReason(dslBlock: CancellationReasonDSL.() -> Unit) =
  CancellationReasonDSL().apply(dslBlock).build()