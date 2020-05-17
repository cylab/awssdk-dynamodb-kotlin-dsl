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
import software.amazon.awssdk.services.dynamodb.model.ConditionalOperator
import software.amazon.awssdk.services.dynamodb.model.DeleteItemRequest
import software.amazon.awssdk.services.dynamodb.model.ExpectedAttributeValue
import software.amazon.awssdk.services.dynamodb.model.ReturnConsumedCapacity
import software.amazon.awssdk.services.dynamodb.model.ReturnItemCollectionMetrics
import software.amazon.awssdk.services.dynamodb.model.ReturnValue
import software.amazon.awssdk.services.dynamodb.transform.DeleteItemRequestMarshaller

/**
  * Builds instances of type DeleteItemRequest:
  * Represents the input of a DeleteItem operation.
  */
@DynamodbDSLMarker
inline class DeleteItemRequestDSL(
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder: DeleteItemRequest.Builder
){
  @PublishedApi
  internal fun build(): DeleteItemRequest = builder.build()

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
  * Builds instances of type DeleteItemRequest:
  * Represents the input of a DeleteItem operation.
  */
inline fun deleteItemRequest(dslBlock: DeleteItemRequestDSL.() -> Unit) =
  DeleteItemRequestDSL(DeleteItemRequest.builder()).apply(dslBlock).build()

/**
  * Builds instances of type DeleteItemRequest:
  * Represents the input of a DeleteItem operation.
  */
inline fun DynamodbDSL.Companion.deleteItemRequest(dslBlock: DeleteItemRequestDSL.() -> Unit) =
  DeleteItemRequestDSL(DeleteItemRequest.builder()).apply(dslBlock).build()

/**
  * 
  */
inline fun DeleteItemRequestMarshaller.marshallBy(dslBlock: DeleteItemRequestDSL.() -> Unit) =
  this.marshall(DynamodbDSL.Companion.deleteItemRequest(dslBlock))

/**
  * Deletes a single item in a table by primary key. You can perform a conditional delete operation that deletes the
  *  item if it exists, or if it has an expected attribute value.
  * 
  *  In addition to deleting an item, you can also return the item's attribute values in the same operation, using the
  *  ReturnValues parameter.
  * 
  *  Unless you specify conditions, the DeleteItem is an idempotent operation; running it multiple times
  *  on the same item or attribute does not result in an error response.
  * 
  *  Conditional deletes are useful for deleting items only if specific conditions are met. If those conditions are
  *  met, DynamoDB performs the delete. Otherwise, the item is not deleted.
  */
inline fun DynamoDbAsyncClient.deleteItemBy(dslBlock: DeleteItemRequestDSL.() -> Unit) =
  this.deleteItem(DynamodbDSL.Companion.deleteItemRequest(dslBlock))

/**
  * Deletes a single item in a table by primary key. You can perform a conditional delete operation that deletes the
  *  item if it exists, or if it has an expected attribute value.
  * 
  *  In addition to deleting an item, you can also return the item's attribute values in the same operation, using the
  *  ReturnValues parameter.
  * 
  *  Unless you specify conditions, the DeleteItem is an idempotent operation; running it multiple times
  *  on the same item or attribute does not result in an error response.
  * 
  *  Conditional deletes are useful for deleting items only if specific conditions are met. If those conditions are
  *  met, DynamoDB performs the delete. Otherwise, the item is not deleted.
  */
inline fun DynamoDbClient.deleteItemBy(dslBlock: DeleteItemRequestDSL.() -> Unit) =
  this.deleteItem(DynamodbDSL.Companion.deleteItemRequest(dslBlock))