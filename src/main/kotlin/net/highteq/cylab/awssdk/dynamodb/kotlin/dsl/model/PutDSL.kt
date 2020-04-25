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
import software.amazon.awssdk.services.dynamodb.model.Put
import software.amazon.awssdk.services.dynamodb.model.ReturnValuesOnConditionCheckFailure

/**
  * Builds instances of type Put:
  * Represents a request to perform a PutItem operation.
  */
@DynamodbDSL
class PutDSL {
  private val builder = Put.builder()
  internal fun build(): Put = builder.build()
    
  /**
    * A map of attribute name to attribute values, representing the primary key of the item to be written by
    *  PutItem. All of the table's primary key attributes must be specified, and their data types must
    *  match those of the table's key schema. If any attributes are present in the item that are part of an index
    *  key schema for the table, their types must match the index key schema.
    */
  @get:JvmSynthetic // Hide from Java callers
  var item: Map<String, AttributeValue>
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.item(value)
    }


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
    * Name of the table in which to write the item.
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
    * Use ReturnValuesOnConditionCheckFailure to get the item attributes if the Put
    *  condition fails. For ReturnValuesOnConditionCheckFailure, the valid values are: NONE and
    *  ALL_OLD.
    */
  @get:JvmSynthetic // Hide from Java callers
  var returnValuesOnConditionCheckFailure: ReturnValuesOnConditionCheckFailure
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.returnValuesOnConditionCheckFailure(value)
    }

    
  /**
    * Use ReturnValuesOnConditionCheckFailure to get the item attributes if the Put
    *  condition fails. For ReturnValuesOnConditionCheckFailure, the valid values are: NONE and
    *  ALL_OLD.
    */
  fun returnValuesOnConditionCheckFailure(value: String) {
    builder.returnValuesOnConditionCheckFailure(value)
  }

  
}

/**
  * Builds instances of type Put:
  * Represents a request to perform a PutItem operation.
  */
fun buildPut(dslBlock: PutDSL.() -> Unit) =
  PutDSL().apply(dslBlock).build()