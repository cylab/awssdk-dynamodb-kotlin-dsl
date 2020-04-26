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
import software.amazon.awssdk.services.dynamodb.model.DeleteRequest
import software.amazon.awssdk.services.dynamodb.model.PutRequest
import software.amazon.awssdk.services.dynamodb.model.WriteRequest

/**
  * Builds instances of type WriteRequest:
  * Represents an operation to perform - either DeleteItem or PutItem. You can only request one
  *  of these operations, not both, in a single WriteRequest. If you do need to perform both of these
  *  operations, you need to provide two separate WriteRequest objects.
  */
@DynamodbDSL
class WriteRequestDSL {
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder = WriteRequest.builder()
  internal fun build(): WriteRequest = builder.build()
    
  /**
    * A request to perform a PutItem operation.
    */
  var putRequest: PutRequest
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.putRequest(value)
    }


  /**
    * A request to perform a DeleteItem operation.
    */
  var deleteRequest: DeleteRequest
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.deleteRequest(value)
    }

  
    
  /**
    * A request to perform a PutItem operation.
    */
  fun putRequest(dslBlock: PutRequestDSL.() -> Unit) {
    builder.putRequest(buildPutRequest(dslBlock))
  }


  /**
    * A request to perform a DeleteItem operation.
    */
  fun deleteRequest(dslBlock: DeleteRequestDSL.() -> Unit) {
    builder.deleteRequest(buildDeleteRequest(dslBlock))
  }

}

/**
  * Builds instances of type WriteRequest:
  * Represents an operation to perform - either DeleteItem or PutItem. You can only request one
  *  of these operations, not both, in a single WriteRequest. If you do need to perform both of these
  *  operations, you need to provide two separate WriteRequest objects.
  */
fun buildWriteRequest(dslBlock: WriteRequestDSL.() -> Unit) =
  WriteRequestDSL().apply(dslBlock).build()