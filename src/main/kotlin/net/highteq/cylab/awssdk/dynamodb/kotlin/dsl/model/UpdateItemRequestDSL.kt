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
import software.amazon.awssdk.services.dynamodb.model.AttributeValueUpdate
import software.amazon.awssdk.services.dynamodb.model.ConditionalOperator
import software.amazon.awssdk.services.dynamodb.model.ExpectedAttributeValue
import software.amazon.awssdk.services.dynamodb.model.ReturnConsumedCapacity
import software.amazon.awssdk.services.dynamodb.model.ReturnItemCollectionMetrics
import software.amazon.awssdk.services.dynamodb.model.ReturnValue
import software.amazon.awssdk.services.dynamodb.model.UpdateItemRequest

/**
  * Builds instances of type UpdateItemRequest:
  * Represents the input of an UpdateItem operation.
  */
@DynamodbDSL
class UpdateItemRequestDSL {
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder = UpdateItemRequest.builder()
  internal fun build(): UpdateItemRequest = builder.build()
    
  /**
    * The primary key of the item to be updated. Each element consists of an attribute name and a value for that
    *  attribute.
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
    * A condition that must be satisfied in order for a conditional update to succeed.
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
    *  For more information about condition expressions, see Specifying Conditions in the Amazon DynamoDB Developer Guide.
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
    * The name of the table containing the item to update.
    */
  var tableName: String
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.tableName(value)
    }


  /**
    * An expression that defines one or more attributes to be updated, the action to be performed on them, and new
    *  values for them.
    * 
    *  The following action values are available for UpdateExpression.
    * 
    *  SET - Adds one or more attributes and values to an item. If any of these attributes already
    *  exist, they are replaced by the new values. You can also use SET to add or subtract from an
    *  attribute that is of type Number. For example: SET myNum = myNum + :val
    * 
    *  SET supports the following functions:
    * 
    *  if_not_exists (path, operand) - if the item does not contain an attribute at the specified path,
    *  then if_not_exists evaluates to operand; otherwise, it evaluates to path. You can use this
    *  function to avoid overwriting an attribute that may already be present in the item.
    * 
    *  list_append (operand, operand) - evaluates to a list with a new element added to it. You can
    *  append the new element to the start or the end of the list by reversing the order of the operands.
    * 
    *  These function names are case-sensitive.
    * 
    *  REMOVE - Removes one or more attributes from an item.
    * 
    *  ADD - Adds the specified value to the item, if the attribute does not already exist. If the
    *  attribute does exist, then the behavior of ADD depends on the data type of the attribute:
    * 
    *  If the existing attribute is a number, and if Value is also a number, then Value is
    *  mathematically added to the existing attribute. If Value is a negative number, then it is
    *  subtracted from the existing attribute.
    * 
    *  If you use ADD to increment or decrement a number value for an item that doesn't exist before
    *  the update, DynamoDB uses 0 as the initial value.
    * 
    *  Similarly, if you use ADD for an existing item to increment or decrement an attribute value that
    *  doesn't exist before the update, DynamoDB uses 0 as the initial value. For example, suppose that
    *  the item you want to update doesn't have an attribute named itemcount, but you decide to
    *  ADD the number 3 to this attribute anyway. DynamoDB will create the
    *  itemcount attribute, set its initial value to 0, and finally add 3 to
    *  it. The result will be a new itemcount attribute in the item, with a value of 3.
    * 
    *  If the existing data type is a set and if Value is also a set, then Value is added
    *  to the existing set. For example, if the attribute value is the set [1,2], and the
    *  ADD action specified [3], then the final attribute value is [1,2,3].
    *  An error occurs if an ADD action is specified for a set attribute and the attribute type
    *  specified does not match the existing set type.
    * 
    *  Both sets must have the same primitive data type. For example, if the existing data type is a set of strings,
    *  the Value must also be a set of strings.
    * 
    *  The ADD action only supports Number and set data types. In addition, ADD can only
    *  be used on top-level attributes, not nested attributes.
    * 
    *  DELETE - Deletes an element from a set.
    * 
    *  If a set of values is specified, then those values are subtracted from the old set. For example, if the
    *  attribute value was the set [a,b,c] and the DELETE action specifies
    *  [a,c], then the final attribute value is [b]. Specifying an empty set is an error.
    * 
    *  The DELETE action only supports set data types. In addition, DELETE can only be
    *  used on top-level attributes, not nested attributes.
    * 
    *  You can have many actions in a single expression, such as the following:
    *  SET a=:value1, b=:value2 DELETE :value3, :value4, :value5
    * 
    *  For more information on update expressions, see Modifying
    *  Items and Attributes in the Amazon DynamoDB Developer Guide.
    */
  var updateExpression: String
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.updateExpression(value)
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
    *  in the Amazon DynamoDB Developer Guide.) To work around this, you could specify the following for
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
    *  For more information about expression attribute names, see Specifying Item Attributes in the Amazon DynamoDB Developer Guide.
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
    *  that you wanted to check whether the value of the ProductStatus attribute was one of the
    *  following:
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
    * This is a legacy parameter. Use UpdateExpression instead. For more information, see AttributeUpdates in the Amazon DynamoDB Developer Guide.
    */
  var attributeUpdates: Map<String, AttributeValueUpdate>
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.attributeUpdates(value)
    }


  /**
    * Use ReturnValues if you want to get the item attributes as they appear before or after they are
    *  updated. For UpdateItem, the valid values are:
    * 
    *  NONE - If ReturnValues is not specified, or if its value is NONE, then
    *  nothing is returned. (This setting is the default for ReturnValues.)
    * 
    *  ALL_OLD - Returns all of the attributes of the item, as they appeared before the UpdateItem
    *  operation.
    * 
    *  UPDATED_OLD - Returns only the updated attributes, as they appeared before the UpdateItem
    *  operation.
    * 
    *  ALL_NEW - Returns all of the attributes of the item, as they appear after the UpdateItem
    *  operation.
    * 
    *  UPDATED_NEW - Returns only the updated attributes, as they appear after the UpdateItem
    *  operation.
    * 
    *  There is no additional cost associated with requesting a return value aside from the small network and
    *  processing overhead of receiving a larger response. No read capacity units are consumed.
    * 
    *  The values returned are strongly consistent.
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
    * Use ReturnValues if you want to get the item attributes as they appear before or after they are
    *  updated. For UpdateItem, the valid values are:
    * 
    *  NONE - If ReturnValues is not specified, or if its value is NONE, then
    *  nothing is returned. (This setting is the default for ReturnValues.)
    * 
    *  ALL_OLD - Returns all of the attributes of the item, as they appeared before the UpdateItem
    *  operation.
    * 
    *  UPDATED_OLD - Returns only the updated attributes, as they appeared before the UpdateItem
    *  operation.
    * 
    *  ALL_NEW - Returns all of the attributes of the item, as they appear after the UpdateItem
    *  operation.
    * 
    *  UPDATED_NEW - Returns only the updated attributes, as they appear after the UpdateItem
    *  operation.
    * 
    *  There is no additional cost associated with requesting a return value aside from the small network and
    *  processing overhead of receiving a larger response. No read capacity units are consumed.
    * 
    *  The values returned are strongly consistent.
    */
  fun returnValues(value: String) {
    builder.returnValues(value)
  }

  
}

/**
  * Builds instances of type UpdateItemRequest:
  * Represents the input of an UpdateItem operation.
  */
fun buildUpdateItemRequest(dslBlock: UpdateItemRequestDSL.() -> Unit) =
  UpdateItemRequestDSL().apply(dslBlock).build()