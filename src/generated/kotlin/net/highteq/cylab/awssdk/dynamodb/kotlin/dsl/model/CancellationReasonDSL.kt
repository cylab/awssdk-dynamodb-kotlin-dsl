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
import software.amazon.awssdk.services.dynamodb.model.AttributeValue
import software.amazon.awssdk.services.dynamodb.model.CancellationReason

/**
  * Builds instances of type CancellationReason:
  * An ordered list of errors for each item in the request which caused the transaction to get cancelled. The values of
  *  the list are ordered according to the ordering of the TransactWriteItems request parameter. If no error
  *  occurred for the associated item an error with a Null code and Null message will be present.
  */
@DynamodbDSL
inline class CancellationReasonDSL(
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder: CancellationReason.Builder
){
  @PublishedApi
  internal fun build(): CancellationReason = builder.build()

  /**
    * 
    */
  inline var code: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.code(value)
    }

  /**
    * 
    */
  inline var item: Map<String, AttributeValue>?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.item(value)
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
  inline fun item(dslBlock: AttributeValueMapDSL.() -> Unit) {
    builder.item(buildAttributeValueMap(dslBlock))
  }

}

/**
  * Builds instances of type CancellationReason:
  * An ordered list of errors for each item in the request which caused the transaction to get cancelled. The values of
  *  the list are ordered according to the ordering of the TransactWriteItems request parameter. If no error
  *  occurred for the associated item an error with a Null code and Null message will be present.
  */
inline fun buildCancellationReason(dslBlock: CancellationReasonDSL.() -> Unit) =
  CancellationReasonDSL(CancellationReason.builder()).apply(dslBlock).build()