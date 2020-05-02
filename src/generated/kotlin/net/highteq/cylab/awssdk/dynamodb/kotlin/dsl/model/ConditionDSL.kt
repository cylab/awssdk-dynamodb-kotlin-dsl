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
import software.amazon.awssdk.services.dynamodb.model.AttributeValue
import software.amazon.awssdk.services.dynamodb.model.ComparisonOperator
import software.amazon.awssdk.services.dynamodb.model.Condition

/**
  * Builds instances of type Condition:
  * Represents the selection criteria for a Query or Scan operation:
  * 
  *  For a Query operation, Condition is used for specifying the KeyConditions to
  *  use when querying a table or an index. For KeyConditions, only the following comparison operators are
  *  supported:
  * 
  *  EQ | LE | LT | GE | GT | BEGINS_WITH | BETWEEN
  * 
  *  Condition is also used in a QueryFilter, which evaluates the query results and returns only
  *  the desired values.
  * 
  *  For a Scan operation, Condition is used in a ScanFilter, which evaluates the
  *  scan results and returns only the desired values.
  */
@DynamodbDSL
inline class ConditionDSL(
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder: Condition.Builder
){
  @PublishedApi
  internal fun build(): Condition = builder.build()

  /**
    * 
    */
  inline var attributeValueList: Collection<AttributeValue>?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.attributeValueList(value)
    }

  /**
    * 
    */
  inline var comparisonOperator: ComparisonOperator?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.comparisonOperator(value)
    }

  /**
    * 
    */
  inline fun comparisonOperator(value: String?) {
    builder.comparisonOperator(value)
  }

  /**
    * 
    */
  inline fun attributeValueList(dslBlock: AttributeValueCollectionDSL.() -> Unit) {
    builder.attributeValueList(buildAttributeValueCollection(dslBlock))
  }

}

/**
  * Builds instances of type Condition:
  * Represents the selection criteria for a Query or Scan operation:
  * 
  *  For a Query operation, Condition is used for specifying the KeyConditions to
  *  use when querying a table or an index. For KeyConditions, only the following comparison operators are
  *  supported:
  * 
  *  EQ | LE | LT | GE | GT | BEGINS_WITH | BETWEEN
  * 
  *  Condition is also used in a QueryFilter, which evaluates the query results and returns only
  *  the desired values.
  * 
  *  For a Scan operation, Condition is used in a ScanFilter, which evaluates the
  *  scan results and returns only the desired values.
  */
inline fun buildCondition(dslBlock: ConditionDSL.() -> Unit) =
  ConditionDSL(Condition.builder()).apply(dslBlock).build()