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
import software.amazon.awssdk.services.dynamodb.model.Delete
import software.amazon.awssdk.services.dynamodb.model.ReturnValuesOnConditionCheckFailure

/**
  * Builds instances of type Delete:
  * Represents a request to perform a DeleteItem operation.
  */
@DynamodbDSLMarker
inline class DeleteDSL(
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder: Delete.Builder
){
  @PublishedApi
  internal fun build(): Delete = builder.build()

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
  inline var returnValuesOnConditionCheckFailure: ReturnValuesOnConditionCheckFailure?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.returnValuesOnConditionCheckFailure(value)
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
  inline fun returnValuesOnConditionCheckFailure(value: String?) {
    builder.returnValuesOnConditionCheckFailure(value)
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
  * Builds instances of type Delete:
  * Represents a request to perform a DeleteItem operation.
  */
inline fun delete(dslBlock: DeleteDSL.() -> Unit) =
  DeleteDSL(Delete.builder()).apply(dslBlock).build()

/**
  * Builds instances of type Delete:
  * Represents a request to perform a DeleteItem operation.
  */
inline fun DynamodbDSL.Companion.delete(dslBlock: DeleteDSL.() -> Unit) =
  DeleteDSL(Delete.builder()).apply(dslBlock).build()