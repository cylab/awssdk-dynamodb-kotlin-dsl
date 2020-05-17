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
import software.amazon.awssdk.services.dynamodb.model.AttributeValue
import software.amazon.awssdk.services.dynamodb.model.DeleteRequest

/**
  * Builds instances of type DeleteRequest:
  * Represents a request to perform a DeleteItem operation on an item.
  */
@DynamodbDSLMarker
inline class DeleteRequestDSL(
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder: DeleteRequest.Builder
){
  @PublishedApi
  internal fun build(): DeleteRequest = builder.build()

  /**
    * 
    */
  inline var key: Map<String, AttributeValue>?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.key(value)
    }

  /**
    * 
    */
  inline fun key(dslBlock: AttributeValueMapDSL.() -> Unit) {
    builder.key(DynamodbDSL.Companion.attributeValueMap(dslBlock))
  }

}

/**
  * Builds instances of type DeleteRequest:
  * Represents a request to perform a DeleteItem operation on an item.
  */
inline fun deleteRequest(dslBlock: DeleteRequestDSL.() -> Unit) =
  DeleteRequestDSL(DeleteRequest.builder()).apply(dslBlock).build()

/**
  * Builds instances of type DeleteRequest:
  * Represents a request to perform a DeleteItem operation on an item.
  */
inline fun DynamodbDSL.Companion.deleteRequest(dslBlock: DeleteRequestDSL.() -> Unit) =
  DeleteRequestDSL(DeleteRequest.builder()).apply(dslBlock).build()