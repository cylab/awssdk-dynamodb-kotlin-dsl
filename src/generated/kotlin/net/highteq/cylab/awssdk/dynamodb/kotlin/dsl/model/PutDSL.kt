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
import software.amazon.awssdk.services.dynamodb.model.Put
import software.amazon.awssdk.services.dynamodb.model.ReturnValuesOnConditionCheckFailure

/**
  * Builds instances of type Put:
  * Represents a request to perform a PutItem operation.
  */
@DynamodbDSL
class PutDSL {
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder = Put.builder()
  internal fun build(): Put = builder.build()
    
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
    * A map of attribute name to attribute values, representing the primary key of the item to be written by
    *  PutItem. All of the table's primary key attributes must be specified, and their data types must
    *  match those of the table's key schema. If any attributes are present in the item that are part of an index
    *  key schema for the table, their types must match the index key schema.
    */
  var item: Map<String, AttributeValue>?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.item(value)
    }


  /**
    * Use ReturnValuesOnConditionCheckFailure to get the item attributes if the Put
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
    * Name of the table in which to write the item.
    */
  var tableName: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.tableName(value)
    }

    
  /**
    * Use ReturnValuesOnConditionCheckFailure to get the item attributes if the Put
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
    * A map of attribute name to attribute values, representing the primary key of the item to be written by
    *  PutItem. All of the table's primary key attributes must be specified, and their data types must
    *  match those of the table's key schema. If any attributes are present in the item that are part of an index
    *  key schema for the table, their types must match the index key schema.
    */
  fun item(dslBlock: AttributeValueMapDSL.() -> Unit) {
    builder.item(buildAttributeValueMap(dslBlock))
  }

}

/**
  * Builds instances of type Put:
  * Represents a request to perform a PutItem operation.
  */
fun buildPut(dslBlock: PutDSL.() -> Unit) =
  PutDSL().apply(dslBlock).build()