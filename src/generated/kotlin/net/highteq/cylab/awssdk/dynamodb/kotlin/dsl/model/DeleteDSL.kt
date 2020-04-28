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
import software.amazon.awssdk.services.dynamodb.model.AttributeValue
import software.amazon.awssdk.services.dynamodb.model.Delete
import software.amazon.awssdk.services.dynamodb.model.ReturnValuesOnConditionCheckFailure

/**
  * Builds instances of type Delete:
  * Represents a request to perform a DeleteItem operation.
  */
@DynamodbDSL
class DeleteDSL {
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder = Delete.builder()
  internal fun build(): Delete = builder.build()
    
  /**
    * A condition that must be satisfied in order for a conditional delete to succeed.
    */
  var conditionExpression: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.conditionExpression(value)
    }


  /**
    * One or more substitution tokens for attribute names in an expression.
    */
  var expressionAttributeNames: Map<String, String>?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.expressionAttributeNames(value)
    }


  /**
    * One or more values that can be substituted in an expression.
    */
  var expressionAttributeValues: Map<String, AttributeValue>?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.expressionAttributeValues(value)
    }


  /**
    * The primary key of the item to be deleted. Each element consists of an attribute name and a value for that
    *  attribute.
    */
  var key: Map<String, AttributeValue>?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.key(value)
    }


  /**
    * Use ReturnValuesOnConditionCheckFailure to get the item attributes if the Delete
    *  condition fails. For ReturnValuesOnConditionCheckFailure, the valid values are: NONE and
    *  ALL_OLD.
    */
  var returnValuesOnConditionCheckFailure: ReturnValuesOnConditionCheckFailure?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.returnValuesOnConditionCheckFailure(value)
    }


  /**
    * Name of the table in which the item to be deleted resides.
    */
  var tableName: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.tableName(value)
    }

    
  /**
    * Use ReturnValuesOnConditionCheckFailure to get the item attributes if the Delete
    *  condition fails. For ReturnValuesOnConditionCheckFailure, the valid values are: NONE and
    *  ALL_OLD.
    */
  fun returnValuesOnConditionCheckFailure(value: String?) {
    builder.returnValuesOnConditionCheckFailure(value)
  }

    
  /**
    * One or more values that can be substituted in an expression.
    */
  fun expressionAttributeValues(dslBlock: AttributeValueMapDSL.() -> Unit) {
    builder.expressionAttributeValues(buildAttributeValueMap(dslBlock))
  }


  /**
    * The primary key of the item to be deleted. Each element consists of an attribute name and a value for that
    *  attribute.
    */
  fun key(dslBlock: AttributeValueMapDSL.() -> Unit) {
    builder.key(buildAttributeValueMap(dslBlock))
  }

}

/**
  * Builds instances of type Delete:
  * Represents a request to perform a DeleteItem operation.
  */
fun buildDelete(dslBlock: DeleteDSL.() -> Unit) =
  DeleteDSL().apply(dslBlock).build()