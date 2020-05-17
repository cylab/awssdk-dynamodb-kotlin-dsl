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
import software.amazon.awssdk.services.dynamodb.model.AttributeValueUpdate
import software.amazon.awssdk.services.dynamodb.model.ConditionalOperator
import software.amazon.awssdk.services.dynamodb.model.ExpectedAttributeValue
import software.amazon.awssdk.services.dynamodb.model.ReturnConsumedCapacity
import software.amazon.awssdk.services.dynamodb.model.ReturnItemCollectionMetrics
import software.amazon.awssdk.services.dynamodb.model.ReturnValue
import software.amazon.awssdk.services.dynamodb.model.UpdateItemRequest
import software.amazon.awssdk.services.dynamodb.transform.UpdateItemRequestMarshaller

/**
  * Builds instances of type UpdateItemRequest:
  * Represents the input of an UpdateItem operation.
  */
@DynamodbDSLMarker
inline class UpdateItemRequestDSL(
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder: UpdateItemRequest.Builder
){
  @PublishedApi
  internal fun build(): UpdateItemRequest = builder.build()

  /**
    * 
    */
  inline var attributeUpdates: Map<String, AttributeValueUpdate>?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.attributeUpdates(value)
    }

  /**
    * 
    */
  inline var conditionExpression: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.conditionExpression(value)
    }

  /**
    * 
    */
  inline var conditionalOperator: ConditionalOperator?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.conditionalOperator(value)
    }

  /**
    * 
    */
  inline var expected: Map<String, ExpectedAttributeValue>?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.expected(value)
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
  inline var expressionAttributeValues: Map<String, AttributeValue>?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.expressionAttributeValues(value)
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
  inline var returnConsumedCapacity: ReturnConsumedCapacity?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.returnConsumedCapacity(value)
    }

  /**
    * 
    */
  inline var returnItemCollectionMetrics: ReturnItemCollectionMetrics?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.returnItemCollectionMetrics(value)
    }

  /**
    * 
    */
  inline var returnValues: ReturnValue?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.returnValues(value)
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
  inline var updateExpression: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.updateExpression(value)
    }

  /**
    * 
    */
  inline fun conditionalOperator(value: String?) {
    builder.conditionalOperator(value)
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
  inline fun returnItemCollectionMetrics(value: String?) {
    builder.returnItemCollectionMetrics(value)
  }

  /**
    * 
    */
  inline fun returnValues(value: String?) {
    builder.returnValues(value)
  }

  /**
    * 
    */
  inline fun attributeUpdates(dslBlock: AttributeValueUpdateMapDSL.() -> Unit) {
    builder.attributeUpdates(DynamodbDSL.Companion.attributeValueUpdateMap(dslBlock))
  }

  /**
    * 
    */
  inline fun expected(dslBlock: ExpectedAttributeValueMapDSL.() -> Unit) {
    builder.expected(DynamodbDSL.Companion.expectedAttributeValueMap(dslBlock))
  }

  /**
    * 
    */
  inline fun expressionAttributeValues(dslBlock: AttributeValueMapDSL.() -> Unit) {
    builder.expressionAttributeValues(DynamodbDSL.Companion.attributeValueMap(dslBlock))
  }

  /**
    * 
    */
  inline fun key(dslBlock: AttributeValueMapDSL.() -> Unit) {
    builder.key(DynamodbDSL.Companion.attributeValueMap(dslBlock))
  }

}

/**
  * Builds instances of type UpdateItemRequest:
  * Represents the input of an UpdateItem operation.
  */
inline fun updateItemRequest(dslBlock: UpdateItemRequestDSL.() -> Unit) =
  UpdateItemRequestDSL(UpdateItemRequest.builder()).apply(dslBlock).build()

/**
  * Builds instances of type UpdateItemRequest:
  * Represents the input of an UpdateItem operation.
  */
inline fun DynamodbDSL.Companion.updateItemRequest(dslBlock: UpdateItemRequestDSL.() -> Unit) =
  UpdateItemRequestDSL(UpdateItemRequest.builder()).apply(dslBlock).build()

/**
  * Edits an existing item's attributes, or adds a new item to the table if it does not already exist. You can put,
  *  delete, or add attribute values. You can also perform a conditional update on an existing item (insert a new
  *  attribute name-value pair if it doesn't exist, or replace an existing name-value pair if it has certain expected
  *  attribute values).
  * 
  *  You can also return the item's attribute values in the same UpdateItem operation using the
  *  ReturnValues parameter.
  */
inline fun DynamoDbAsyncClient.updateItemBy(dslBlock: UpdateItemRequestDSL.() -> Unit) =
  this.updateItem(DynamodbDSL.Companion.updateItemRequest(dslBlock))

/**
  * Edits an existing item's attributes, or adds a new item to the table if it does not already exist. You can put,
  *  delete, or add attribute values. You can also perform a conditional update on an existing item (insert a new
  *  attribute name-value pair if it doesn't exist, or replace an existing name-value pair if it has certain expected
  *  attribute values).
  * 
  *  You can also return the item's attribute values in the same UpdateItem operation using the
  *  ReturnValues parameter.
  */
inline fun DynamoDbClient.updateItemBy(dslBlock: UpdateItemRequestDSL.() -> Unit) =
  this.updateItem(DynamodbDSL.Companion.updateItemRequest(dslBlock))

/**
  * 
  */
inline fun UpdateItemRequestMarshaller.marshallBy(dslBlock: UpdateItemRequestDSL.() -> Unit) =
  this.marshall(DynamodbDSL.Companion.updateItemRequest(dslBlock))