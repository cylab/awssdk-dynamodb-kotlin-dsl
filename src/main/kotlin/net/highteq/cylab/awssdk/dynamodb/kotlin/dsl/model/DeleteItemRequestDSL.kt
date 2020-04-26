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
import software.amazon.awssdk.awscore.AwsRequestOverrideConfiguration
import software.amazon.awssdk.services.dynamodb.model.AttributeValue
import software.amazon.awssdk.services.dynamodb.model.ConditionalOperator
import software.amazon.awssdk.services.dynamodb.model.DeleteItemRequest
import software.amazon.awssdk.services.dynamodb.model.ExpectedAttributeValue
import software.amazon.awssdk.services.dynamodb.model.ReturnConsumedCapacity
import software.amazon.awssdk.services.dynamodb.model.ReturnItemCollectionMetrics
import software.amazon.awssdk.services.dynamodb.model.ReturnValue

/**
  * Builds instances of type DeleteItemRequest:
  * Represents the input of a DeleteItem operation.
  */
@DynamodbDSL
class DeleteItemRequestDSL {
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder = DeleteItemRequest.builder()
  internal fun build(): DeleteItemRequest = builder.build()
    
  /**
    * A map of attribute names to AttributeValue objects, representing the primary key of the item to
    *  delete.
    * 
    *  For the primary key, you must provide all of the attributes. For example, with a simple primary key, you only
    *  need to provide a value for the partition key. For a composite primary key, you must provide values for both
    *  the partition key and the sort key.
    */
  var key: Map<String, AttributeValue>
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.key(value)
    }


  /**
    * This is a legacy parameter. Use ConditionExpression instead. For more information, see Expected in the Amazon DynamoDB Developer Guide.
    */
  var expected: Map<String, ExpectedAttributeValue>
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.expected(value)
    }


  /**
    * A condition that must be satisfied in order for a conditional DeleteItem to succeed.
    * 
    *  An expression can contain any of the following:
    * 
    *  Functions:
    *  attribute_exists | attribute_not_exists | attribute_type | contains | begins_with | size
    * 
    *  These function names are case-sensitive.
    * 
    *  Comparison operators: = | &lt;&gt; | &lt; | &gt; | &lt;= | &gt;= | BETWEEN | IN 
    * 
    *  Logical operators: AND | OR | NOT
    * 
    *  For more information about condition expressions, see Condition Expressions in the Amazon DynamoDB Developer Guide.
    */
  var conditionExpression: String
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.conditionExpression(value)
    }


  /**
    * 
    */
  var overrideConfiguration: AwsRequestOverrideConfiguration
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.overrideConfiguration(value)
    }


  /**
    * The name of the table from which to delete the item.
    */
  var tableName: String
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.tableName(value)
    }


  /**
    * One or more substitution tokens for attribute names in an expression. The following are some use cases for
    *  using ExpressionAttributeNames:
    * 
    *  To access an attribute whose name conflicts with a DynamoDB reserved word.
    * 
    *  To create a placeholder for repeating occurrences of an attribute name in an expression.
    * 
    *  To prevent special characters in an attribute name from being misinterpreted in an expression.
    * 
    *  Use the # character in an expression to dereference an attribute name. For example, consider the
    *  following attribute name:
    * 
    *  Percentile
    * 
    *  The name of this attribute conflicts with a reserved word, so it cannot be used directly in an expression.
    *  (For the complete list of reserved words, see Reserved Words
    *  in the Amazon DynamoDB Developer Guide). To work around this, you could specify the following for
    *  ExpressionAttributeNames:
    * 
    *  {"#P":"Percentile"}
    * 
    *  You could then use this substitution in an expression, as in this example:
    * 
    *  #P = :val
    * 
    *  Tokens that begin with the : character are expression attribute values, which are placeholders
    *  for the actual value at runtime.
    * 
    *  For more information on expression attribute names, see Specifying Item Attributes in the Amazon DynamoDB Developer Guide.
    */
  var expressionAttributeNames: Map<String, String>
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.expressionAttributeNames(value)
    }


  /**
    * One or more values that can be substituted in an expression.
    * 
    *  Use the : (colon) character in an expression to dereference an attribute value. For example, suppose
    *  that you wanted to check whether the value of the ProductStatus attribute was one of the following:
    * 
    *  Available | Backordered | Discontinued
    * 
    *  You would first need to specify ExpressionAttributeValues as follows:
    * 
    *  { ":avail":{"S":"Available"}, ":back":{"S":"Backordered"}, ":disc":{"S":"Discontinued"} }
    * 
    *  You could then use these values in an expression, such as this:
    * 
    *  ProductStatus IN (:avail, :back, :disc)
    * 
    *  For more information on expression attribute values, see Condition Expressions in the Amazon DynamoDB Developer Guide.
    */
  var expressionAttributeValues: Map<String, AttributeValue>
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.expressionAttributeValues(value)
    }


  /**
    * Sets the value of the ReturnConsumedCapacity property for this object.
    */
  var returnConsumedCapacity: ReturnConsumedCapacity
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.returnConsumedCapacity(value)
    }


  /**
    * Determines whether item collection metrics are returned. If set to SIZE, the response includes
    *  statistics about item collections, if any, that were modified during the operation are returned in the
    *  response. If set to NONE (the default), no statistics are returned.
    */
  var returnItemCollectionMetrics: ReturnItemCollectionMetrics
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.returnItemCollectionMetrics(value)
    }


  /**
    * This is a legacy parameter. Use ConditionExpression instead. For more information, see ConditionalOperator in the Amazon DynamoDB Developer Guide.
    */
  var conditionalOperator: ConditionalOperator
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.conditionalOperator(value)
    }


  /**
    * Use ReturnValues if you want to get the item attributes as they appeared before they were
    *  deleted. For DeleteItem, the valid values are:
    * 
    *  NONE - If ReturnValues is not specified, or if its value is NONE, then
    *  nothing is returned. (This setting is the default for ReturnValues.)
    * 
    *  ALL_OLD - The content of the old item is returned.
    * 
    *  The ReturnValues parameter is used by several DynamoDB operations; however,
    *  DeleteItem does not recognize any values other than NONE or ALL_OLD.
    */
  var returnValues: ReturnValue
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.returnValues(value)
    }

    
  /**
    * Sets the value of the ReturnConsumedCapacity property for this object.
    */
  fun returnConsumedCapacity(value: String) {
    builder.returnConsumedCapacity(value)
  }


  /**
    * Determines whether item collection metrics are returned. If set to SIZE, the response includes
    *  statistics about item collections, if any, that were modified during the operation are returned in the
    *  response. If set to NONE (the default), no statistics are returned.
    */
  fun returnItemCollectionMetrics(value: String) {
    builder.returnItemCollectionMetrics(value)
  }


  /**
    * This is a legacy parameter. Use ConditionExpression instead. For more information, see ConditionalOperator in the Amazon DynamoDB Developer Guide.
    */
  fun conditionalOperator(value: String) {
    builder.conditionalOperator(value)
  }


  /**
    * Use ReturnValues if you want to get the item attributes as they appeared before they were
    *  deleted. For DeleteItem, the valid values are:
    * 
    *  NONE - If ReturnValues is not specified, or if its value is NONE, then
    *  nothing is returned. (This setting is the default for ReturnValues.)
    * 
    *  ALL_OLD - The content of the old item is returned.
    * 
    *  The ReturnValues parameter is used by several DynamoDB operations; however,
    *  DeleteItem does not recognize any values other than NONE or ALL_OLD.
    */
  fun returnValues(value: String) {
    builder.returnValues(value)
  }

  
}

/**
  * Builds instances of type DeleteItemRequest:
  * Represents the input of a DeleteItem operation.
  */
fun buildDeleteItemRequest(dslBlock: DeleteItemRequestDSL.() -> Unit) =
  DeleteItemRequestDSL().apply(dslBlock).build()