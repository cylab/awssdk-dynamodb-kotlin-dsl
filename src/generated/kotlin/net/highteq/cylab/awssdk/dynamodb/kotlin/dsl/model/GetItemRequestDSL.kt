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
import software.amazon.awssdk.awscore.AwsRequestOverrideConfiguration
import software.amazon.awssdk.services.dynamodb.DynamoDbAsyncClient
import software.amazon.awssdk.services.dynamodb.DynamoDbClient
import software.amazon.awssdk.services.dynamodb.model.AttributeValue
import software.amazon.awssdk.services.dynamodb.model.GetItemRequest
import software.amazon.awssdk.services.dynamodb.model.ReturnConsumedCapacity
import software.amazon.awssdk.services.dynamodb.transform.GetItemRequestMarshaller

/**
  * Builds instances of type GetItemRequest:
  * Represents the input of a GetItem operation.
  */
@DynamodbDSLMarker
inline class GetItemRequestDSL(
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder: GetItemRequest.Builder
){
  @PublishedApi
  internal fun build(): GetItemRequest = builder.build()

  /**
    * 
    */
  inline var attributesToGet: Collection<String>?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.attributesToGet(value)
    }

  /**
    * 
    */
  inline var consistentRead: Boolean?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.consistentRead(value)
    }

  /**
    * 
    */
  inline var expressionAttributeNames: Map<String, String>?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.expressionAttributeNames(value)
    }

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
  inline var overrideConfiguration: AwsRequestOverrideConfiguration?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.overrideConfiguration(value)
    }

  /**
    * 
    */
  inline var projectionExpression: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.projectionExpression(value)
    }

  /**
    * 
    */
  inline var returnConsumedCapacity: ReturnConsumedCapacity?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.returnConsumedCapacity(value)
    }

  /**
    * 
    */
  inline var tableName: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.tableName(value)
    }

  /**
    * 
    */
  inline fun returnConsumedCapacity(value: String?) {
    builder.returnConsumedCapacity(value)
  }

  /**
    * 
    */
  inline fun key(dslBlock: AttributeValueMapDSL.() -> Unit) {
    builder.key(DynamodbDSL.Companion.attributeValueMap(dslBlock))
  }

}

/**
  * Builds instances of type GetItemRequest:
  * Represents the input of a GetItem operation.
  */
inline fun getItemRequest(dslBlock: GetItemRequestDSL.() -> Unit) =
  GetItemRequestDSL(GetItemRequest.builder()).apply(dslBlock).build()

/**
  * Builds instances of type GetItemRequest:
  * Represents the input of a GetItem operation.
  */
inline fun DynamodbDSL.Companion.getItemRequest(dslBlock: GetItemRequestDSL.() -> Unit) =
  GetItemRequestDSL(GetItemRequest.builder()).apply(dslBlock).build()

/**
  * The GetItem operation returns a set of attributes for the item with the given primary key. If there
  *  is no matching item, GetItem does not return any data and there will be no Item element
  *  in the response.
  * 
  *  GetItem provides an eventually consistent read by default. If your application requires a strongly
  *  consistent read, set ConsistentRead to true. Although a strongly consistent read might
  *  take more time than an eventually consistent read, it always returns the last updated value.
  */
inline fun DynamoDbAsyncClient.getItemBy(dslBlock: GetItemRequestDSL.() -> Unit) =
  this.getItem(DynamodbDSL.Companion.getItemRequest(dslBlock))

/**
  * The GetItem operation returns a set of attributes for the item with the given primary key. If there
  *  is no matching item, GetItem does not return any data and there will be no Item element
  *  in the response.
  * 
  *  GetItem provides an eventually consistent read by default. If your application requires a strongly
  *  consistent read, set ConsistentRead to true. Although a strongly consistent read might
  *  take more time than an eventually consistent read, it always returns the last updated value.
  */
inline fun DynamoDbClient.getItemBy(dslBlock: GetItemRequestDSL.() -> Unit) =
  this.getItem(DynamodbDSL.Companion.getItemRequest(dslBlock))

/**
  * 
  */
inline fun GetItemRequestMarshaller.marshallBy(dslBlock: GetItemRequestDSL.() -> Unit) =
  this.marshall(DynamodbDSL.Companion.getItemRequest(dslBlock))