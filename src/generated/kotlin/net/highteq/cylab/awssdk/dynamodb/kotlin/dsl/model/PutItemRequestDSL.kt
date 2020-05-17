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
import software.amazon.awssdk.services.dynamodb.model.ExpectedAttributeValue
import software.amazon.awssdk.services.dynamodb.model.PutItemRequest
import software.amazon.awssdk.services.dynamodb.model.ReturnConsumedCapacity
import software.amazon.awssdk.services.dynamodb.model.ReturnItemCollectionMetrics
import software.amazon.awssdk.services.dynamodb.model.ReturnValue
import software.amazon.awssdk.services.dynamodb.transform.PutItemRequestMarshaller

/**
  * Builds instances of type PutItemRequest:
  * Represents the input of a PutItem operation.
  */
@DynamodbDSLMarker
inline class PutItemRequestDSL(
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder: PutItemRequest.Builder
){
  @PublishedApi
  internal fun build(): PutItemRequest = builder.build()

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
  inline var item: Map<String, AttributeValue>?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.item(value)
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
  inline fun item(dslBlock: AttributeValueMapDSL.() -> Unit) {
    builder.item(DynamodbDSL.Companion.attributeValueMap(dslBlock))
  }

}

/**
  * Builds instances of type PutItemRequest:
  * Represents the input of a PutItem operation.
  */
inline fun putItemRequest(dslBlock: PutItemRequestDSL.() -> Unit) =
  PutItemRequestDSL(PutItemRequest.builder()).apply(dslBlock).build()

/**
  * Builds instances of type PutItemRequest:
  * Represents the input of a PutItem operation.
  */
inline fun DynamodbDSL.Companion.putItemRequest(dslBlock: PutItemRequestDSL.() -> Unit) =
  PutItemRequestDSL(PutItemRequest.builder()).apply(dslBlock).build()

/**
  * Creates a new item, or replaces an old item with a new item. If an item that has the same primary key as the new
  *  item already exists in the specified table, the new item completely replaces the existing item. You can perform a
  *  conditional put operation (add a new item if one with the specified primary key doesn't exist), or replace an
  *  existing item if it has certain attribute values. You can return the item's attribute values in the same
  *  operation, using the ReturnValues parameter.
  * 
  *  This topic provides general information about the PutItem API.
  * 
  *  For information on how to call the PutItem API using the AWS SDK in specific languages, see the
  *  following:
  * 
  *   PutItem in the AWS Command Line
  *  Interface 
  * 
  *   PutItem in the AWS SDK for
  *  .NET 
  * 
  *   PutItem in the AWS SDK for C++
  * 
  *   PutItem in the AWS SDK for Go
  * 
  *   PutItem in the AWS SDK for Java
  * 
  *   PutItem in the AWS SDK
  *  for JavaScript 
  * 
  *   PutItem in the AWS SDK for PHP
  *  V3 
  * 
  *   PutItem in the AWS SDK for Python
  * 
  *   PutItem in the AWS SDK for
  *  Ruby V2 
  * 
  *  When you add an item, the primary key attribute(s) are the only required attributes. Attribute values cannot be
  *  null. String and Binary type attributes must have lengths greater than zero. Set type attributes cannot be empty.
  *  Requests with empty values will be rejected with a ValidationException exception.
  * 
  *  To prevent a new item from replacing an existing item, use a conditional expression that contains the
  *  attribute_not_exists function with the name of the attribute being used as the partition key for the
  *  table. Since every record must contain that attribute, the attribute_not_exists function will only
  *  succeed if no matching item exists.
  * 
  *  For more information about PutItem, see Working with
  *  Items in the Amazon DynamoDB Developer Guide.
  */
inline fun DynamoDbAsyncClient.putItemBy(dslBlock: PutItemRequestDSL.() -> Unit) =
  this.putItem(DynamodbDSL.Companion.putItemRequest(dslBlock))

/**
  * Creates a new item, or replaces an old item with a new item. If an item that has the same primary key as the new
  *  item already exists in the specified table, the new item completely replaces the existing item. You can perform a
  *  conditional put operation (add a new item if one with the specified primary key doesn't exist), or replace an
  *  existing item if it has certain attribute values. You can return the item's attribute values in the same
  *  operation, using the ReturnValues parameter.
  * 
  *  This topic provides general information about the PutItem API.
  * 
  *  For information on how to call the PutItem API using the AWS SDK in specific languages, see the
  *  following:
  * 
  *   PutItem in the AWS Command Line
  *  Interface 
  * 
  *   PutItem in the AWS SDK for
  *  .NET 
  * 
  *   PutItem in the AWS SDK for C++
  * 
  *   PutItem in the AWS SDK for Go
  * 
  *   PutItem in the AWS SDK for Java
  * 
  *   PutItem in the AWS SDK
  *  for JavaScript 
  * 
  *   PutItem in the AWS SDK for PHP
  *  V3 
  * 
  *   PutItem in the AWS SDK for Python
  * 
  *   PutItem in the AWS SDK for
  *  Ruby V2 
  * 
  *  When you add an item, the primary key attribute(s) are the only required attributes. Attribute values cannot be
  *  null. String and Binary type attributes must have lengths greater than zero. Set type attributes cannot be empty.
  *  Requests with empty values will be rejected with a ValidationException exception.
  * 
  *  To prevent a new item from replacing an existing item, use a conditional expression that contains the
  *  attribute_not_exists function with the name of the attribute being used as the partition key for the
  *  table. Since every record must contain that attribute, the attribute_not_exists function will only
  *  succeed if no matching item exists.
  * 
  *  For more information about PutItem, see Working with
  *  Items in the Amazon DynamoDB Developer Guide.
  */
inline fun DynamoDbClient.putItemBy(dslBlock: PutItemRequestDSL.() -> Unit) =
  this.putItem(DynamodbDSL.Companion.putItemRequest(dslBlock))

/**
  * 
  */
inline fun PutItemRequestMarshaller.marshallBy(dslBlock: PutItemRequestDSL.() -> Unit) =
  this.marshall(DynamodbDSL.Companion.putItemRequest(dslBlock))