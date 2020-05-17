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
import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSLMarker
import software.amazon.awssdk.services.dynamodb.model.DeleteRequest
import software.amazon.awssdk.services.dynamodb.model.PutRequest
import software.amazon.awssdk.services.dynamodb.model.WriteRequest

/**
  * Builds instances of type WriteRequest:
  * Represents an operation to perform - either DeleteItem or PutItem. You can only request one
  *  of these operations, not both, in a single WriteRequest. If you do need to perform both of these
  *  operations, you will need to provide two separate WriteRequest objects.
  */
@DynamodbDSLMarker
inline class WriteRequestDSL(
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder: WriteRequest.Builder
){
  @PublishedApi
  internal fun build(): WriteRequest = builder.build()

  /**
    * 
    */
  inline var deleteRequest: DeleteRequest?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.deleteRequest(value)
    }

  /**
    * 
    */
  inline var putRequest: PutRequest?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.putRequest(value)
    }

  /**
    * 
    */
  inline fun deleteRequest(dslBlock: DeleteRequestDSL.() -> Unit) {
    builder.deleteRequest(DynamodbDSL.Companion.deleteRequest(dslBlock))
  }

  /**
    * 
    */
  inline fun putRequest(dslBlock: PutRequestDSL.() -> Unit) {
    builder.putRequest(DynamodbDSL.Companion.putRequest(dslBlock))
  }

}

/**
  * Builds instances of type WriteRequest:
  * Represents an operation to perform - either DeleteItem or PutItem. You can only request one
  *  of these operations, not both, in a single WriteRequest. If you do need to perform both of these
  *  operations, you will need to provide two separate WriteRequest objects.
  */
inline fun writeRequest(dslBlock: WriteRequestDSL.() -> Unit) =
  WriteRequestDSL(WriteRequest.builder()).apply(dslBlock).build()

/**
  * Builds instances of type WriteRequest:
  * Represents an operation to perform - either DeleteItem or PutItem. You can only request one
  *  of these operations, not both, in a single WriteRequest. If you do need to perform both of these
  *  operations, you will need to provide two separate WriteRequest objects.
  */
inline fun DynamodbDSL.Companion.writeRequest(dslBlock: WriteRequestDSL.() -> Unit) =
  WriteRequestDSL(WriteRequest.builder()).apply(dslBlock).build()