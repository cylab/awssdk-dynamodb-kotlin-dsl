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
import software.amazon.awssdk.services.dynamodb.model.ReturnValuesOnConditionCheckFailure
import software.amazon.awssdk.services.dynamodb.model.Update

/**
  * Builds instances of type Update:
  * Represents a request to perform an UpdateItem operation.
  */
@DynamodbDSL
class UpdateDSL {
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder = Update.builder()
  internal fun build(): Update = builder.build()
    
  /**
    * The primary key of the item to be updated. Each element consists of an attribute name and a value for that
    *  attribute.
    */
  var key: Map<String, AttributeValue>?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.key(value)
    }


  /**
    * A condition that must be satisfied in order for a conditional update to succeed.
    */
  var conditionExpression: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.conditionExpression(value)
    }


  /**
    * An expression that defines one or more attributes to be updated, the action to be performed on them, and new
    *  value(s) for them.
    */
  var updateExpression: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.updateExpression(value)
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
    * Use ReturnValuesOnConditionCheckFailure to get the item attributes if the Update
    *  condition fails. For ReturnValuesOnConditionCheckFailure, the valid values are: NONE, ALL_OLD,
    *  UPDATED_OLD, ALL_NEW, UPDATED_NEW.
    */
  var returnValuesOnConditionCheckFailure: ReturnValuesOnConditionCheckFailure?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.returnValuesOnConditionCheckFailure(value)
    }


  /**
    * Name of the table for the UpdateItem request.
    */
  var tableName: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.tableName(value)
    }

    
  /**
    * Use ReturnValuesOnConditionCheckFailure to get the item attributes if the Update
    *  condition fails. For ReturnValuesOnConditionCheckFailure, the valid values are: NONE, ALL_OLD,
    *  UPDATED_OLD, ALL_NEW, UPDATED_NEW.
    */
  fun returnValuesOnConditionCheckFailure(value: String?) {
    builder.returnValuesOnConditionCheckFailure(value)
  }

  
}

/**
  * Builds instances of type Update:
  * Represents a request to perform an UpdateItem operation.
  */
fun buildUpdate(dslBlock: UpdateDSL.() -> Unit) =
  UpdateDSL().apply(dslBlock).build()