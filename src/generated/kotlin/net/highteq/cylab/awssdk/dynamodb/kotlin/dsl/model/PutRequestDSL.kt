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
import software.amazon.awssdk.services.dynamodb.model.PutRequest

/**
  * Builds instances of type PutRequest:
  * Represents a request to perform a PutItem operation on an item.
  */
@DynamodbDSL
inline class PutRequestDSL(
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder: PutRequest.Builder
){
  @PublishedApi
  internal fun build(): PutRequest = builder.build()

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
  inline fun item(dslBlock: AttributeValueMapDSL.() -> Unit) {
    builder.item(buildAttributeValueMap(dslBlock))
  }

}

/**
  * Builds instances of type PutRequest:
  * Represents a request to perform a PutItem operation on an item.
  */
inline fun buildPutRequest(dslBlock: PutRequestDSL.() -> Unit) =
  PutRequestDSL(PutRequest.builder()).apply(dslBlock).build()