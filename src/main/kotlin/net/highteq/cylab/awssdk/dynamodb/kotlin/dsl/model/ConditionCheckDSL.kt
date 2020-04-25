/*
  This file was generated from https://github.com/aws/aws-sdk-java-v2 by https://github.com/cylab/aws-kotlin-dsl-builder
  Like the original code, this file and project is licensed under
  Apache License Version 2.0
  See LICENSE.txt for more info
*/
package net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.model

import kotlin.DeprecationLevel.HIDDEN
import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSL
import software.amazon.awssdk.services.dynamodb.model.AttributeValue
import software.amazon.awssdk.services.dynamodb.model.ConditionCheck
import software.amazon.awssdk.services.dynamodb.model.ReturnValuesOnConditionCheckFailure

/**
  * Builds instances of type ConditionCheck:
  * Represents a request to perform a check that an item exists or to check the condition of specific attributes of the
  *  item.
  */
@DynamodbDSL
class ConditionCheckDSL {
  private val builder = ConditionCheck.builder()
  internal fun build(): ConditionCheck = builder.build()
    
  /**
    * A condition that must be satisfied in order for a conditional update to succeed.
    */
  @get:JvmSynthetic // Hide from Java callers
  var conditionExpression: String
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.conditionExpression(value)
    }


  /**
    * Name of the table for the check item request.
    */
  @get:JvmSynthetic // Hide from Java callers
  var tableName: String
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.tableName(value)
    }


  /**
    * One or more substitution tokens for attribute names in an expression.
    */
  @get:JvmSynthetic // Hide from Java callers
  var expressionAttributeNames: Map<String, String>
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.expressionAttributeNames(value)
    }


  /**
    * One or more values that can be substituted in an expression.
    */
  @get:JvmSynthetic // Hide from Java callers
  var expressionAttributeValues: Map<String, AttributeValue>
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.expressionAttributeValues(value)
    }


  /**
    * Use ReturnValuesOnConditionCheckFailure to get the item attributes if the
    *  ConditionCheck condition fails. For ReturnValuesOnConditionCheckFailure, the valid
    *  values are: NONE and ALL_OLD.
    */
  @get:JvmSynthetic // Hide from Java callers
  var returnValuesOnConditionCheckFailure: ReturnValuesOnConditionCheckFailure
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.returnValuesOnConditionCheckFailure(value)
    }


  /**
    * The primary key of the item to be checked. Each element consists of an attribute name and a value for that
    *  attribute.
    */
  @get:JvmSynthetic // Hide from Java callers
  var key: Map<String, AttributeValue>
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.key(value)
    }

    
  /**
    * Use ReturnValuesOnConditionCheckFailure to get the item attributes if the
    *  ConditionCheck condition fails. For ReturnValuesOnConditionCheckFailure, the valid
    *  values are: NONE and ALL_OLD.
    */
  fun returnValuesOnConditionCheckFailure(value: String) {
    builder.returnValuesOnConditionCheckFailure(value)
  }

  
}

/**
  * Builds instances of type ConditionCheck:
  * Represents a request to perform a check that an item exists or to check the condition of specific attributes of the
  *  item.
  */
fun buildConditionCheck(dslBlock: ConditionCheckDSL.() -> Unit) =
  ConditionCheckDSL().apply(dslBlock).build()