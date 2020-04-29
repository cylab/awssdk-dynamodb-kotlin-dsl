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
import software.amazon.awssdk.services.dynamodb.model.ExpectedAttributeValue
import software.amazon.awssdk.services.dynamodb.model.PutItemRequest
import software.amazon.awssdk.services.dynamodb.model.ReturnConsumedCapacity
import software.amazon.awssdk.services.dynamodb.model.ReturnItemCollectionMetrics
import software.amazon.awssdk.services.dynamodb.model.ReturnValue

/**
  * Builds instances of type PutItemRequest:
  * Represents the input of a PutItem operation.
  */
@DynamodbDSL
class PutItemRequestDSL {
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder = PutItemRequest.builder()
  internal fun build(): PutItemRequest = builder.build()
    
  /**
    * A condition that must be satisfied in order for a conditional PutItem operation to succeed.
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
    *  For more information on condition expressions, see Condition Expressions in the Amazon DynamoDB Developer Guide.
    */
  var conditionExpression: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.conditionExpression(value)
    }


  /**
    * This is a legacy parameter. Use ConditionExpression instead. For more information, see ConditionalOperator in the Amazon DynamoDB Developer Guide.
    */
  var conditionalOperator: ConditionalOperator?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.conditionalOperator(value)
    }


  /**
    * This is a legacy parameter. Use ConditionExpression instead. For more information, see Expected in the Amazon DynamoDB Developer Guide.
    */
  var expected: Map<String, ExpectedAttributeValue>?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.expected(value)
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
  var expressionAttributeNames: Map<String, String>?
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
  var expressionAttributeValues: Map<String, AttributeValue>?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.expressionAttributeValues(value)
    }


  /**
    * A map of attribute name/value pairs, one for each attribute. Only the primary key attributes are required;
    *  you can optionally provide other attribute name-value pairs for the item.
    * 
    *  You must provide all of the attributes for the primary key. For example, with a simple primary key, you only
    *  need to provide a value for the partition key. For a composite primary key, you must provide both values for
    *  both the partition key and the sort key.
    * 
    *  If you specify any attributes that are part of an index key, then the data types for those attributes must
    *  match those of the schema in the table's attribute definition.
    * 
    *  For more information about primary keys, see Primary Key in the Amazon DynamoDB Developer Guide.
    * 
    *  Each element in the Item map is an AttributeValue object.
    */
  var item: Map<String, AttributeValue>?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.item(value)
    }


  /**
    * 
    */
  var overrideConfiguration: AwsRequestOverrideConfiguration?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.overrideConfiguration(value)
    }


  /**
    * Sets the value of the ReturnConsumedCapacity property for this object.
    */
  var returnConsumedCapacity: ReturnConsumedCapacity?
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
  var returnItemCollectionMetrics: ReturnItemCollectionMetrics?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.returnItemCollectionMetrics(value)
    }


  /**
    * Use ReturnValues if you want to get the item attributes as they appeared before they were
    *  updated with the PutItem request. For PutItem, the valid values are:
    * 
    *  NONE - If ReturnValues is not specified, or if its value is NONE, then
    *  nothing is returned. (This setting is the default for ReturnValues.)
    * 
    *  ALL_OLD - If PutItem overwrote an attribute name-value pair, then the content of
    *  the old item is returned.
    * 
    *  The ReturnValues parameter is used by several DynamoDB operations; however, PutItem
    *  does not recognize any values other than NONE or ALL_OLD.
    */
  var returnValues: ReturnValue?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.returnValues(value)
    }


  /**
    * The name of the table to contain the item.
    */
  var tableName: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.tableName(value)
    }

    
  /**
    * This is a legacy parameter. Use ConditionExpression instead. For more information, see ConditionalOperator in the Amazon DynamoDB Developer Guide.
    */
  fun conditionalOperator(value: String?) {
    builder.conditionalOperator(value)
  }


  /**
    * Sets the value of the ReturnConsumedCapacity property for this object.
    */
  fun returnConsumedCapacity(value: String?) {
    builder.returnConsumedCapacity(value)
  }


  /**
    * Determines whether item collection metrics are returned. If set to SIZE, the response includes
    *  statistics about item collections, if any, that were modified during the operation are returned in the
    *  response. If set to NONE (the default), no statistics are returned.
    */
  fun returnItemCollectionMetrics(value: String?) {
    builder.returnItemCollectionMetrics(value)
  }


  /**
    * Use ReturnValues if you want to get the item attributes as they appeared before they were
    *  updated with the PutItem request. For PutItem, the valid values are:
    * 
    *  NONE - If ReturnValues is not specified, or if its value is NONE, then
    *  nothing is returned. (This setting is the default for ReturnValues.)
    * 
    *  ALL_OLD - If PutItem overwrote an attribute name-value pair, then the content of
    *  the old item is returned.
    * 
    *  The ReturnValues parameter is used by several DynamoDB operations; however, PutItem
    *  does not recognize any values other than NONE or ALL_OLD.
    */
  fun returnValues(value: String?) {
    builder.returnValues(value)
  }

  
    
  /**
    * This is a legacy parameter. Use ConditionExpression instead. For more information, see Expected in the Amazon DynamoDB Developer Guide.
    */
  fun expected(dslBlock: ExpectedAttributeValueMapDSL.() -> Unit) {
    builder.expected(buildExpectedAttributeValueMap(dslBlock))
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
  fun expressionAttributeValues(dslBlock: AttributeValueMapDSL.() -> Unit) {
    builder.expressionAttributeValues(buildAttributeValueMap(dslBlock))
  }


  /**
    * A map of attribute name/value pairs, one for each attribute. Only the primary key attributes are required;
    *  you can optionally provide other attribute name-value pairs for the item.
    * 
    *  You must provide all of the attributes for the primary key. For example, with a simple primary key, you only
    *  need to provide a value for the partition key. For a composite primary key, you must provide both values for
    *  both the partition key and the sort key.
    * 
    *  If you specify any attributes that are part of an index key, then the data types for those attributes must
    *  match those of the schema in the table's attribute definition.
    * 
    *  For more information about primary keys, see Primary Key in the Amazon DynamoDB Developer Guide.
    * 
    *  Each element in the Item map is an AttributeValue object.
    */
  fun item(dslBlock: AttributeValueMapDSL.() -> Unit) {
    builder.item(buildAttributeValueMap(dslBlock))
  }

}

/**
  * Builds instances of type PutItemRequest:
  * Represents the input of a PutItem operation.
  */
fun buildPutItemRequest(dslBlock: PutItemRequestDSL.() -> Unit) =
  PutItemRequestDSL().apply(dslBlock).build()