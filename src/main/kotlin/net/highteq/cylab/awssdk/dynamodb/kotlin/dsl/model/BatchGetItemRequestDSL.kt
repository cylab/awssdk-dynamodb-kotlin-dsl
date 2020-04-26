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
import software.amazon.awssdk.services.dynamodb.model.BatchGetItemRequest
import software.amazon.awssdk.services.dynamodb.model.KeysAndAttributes
import software.amazon.awssdk.services.dynamodb.model.ReturnConsumedCapacity

/**
  * Builds instances of type BatchGetItemRequest:
  * Represents the input of a BatchGetItem operation.
  */
@DynamodbDSL
class BatchGetItemRequestDSL {
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder = BatchGetItemRequest.builder()
  internal fun build(): BatchGetItemRequest = builder.build()
    
  /**
    * A map of one or more table names and, for each table, a map that describes one or more items to retrieve from
    *  that table. Each table name can be used only once per BatchGetItem request.
    * 
    *  Each element in the map of items to retrieve consists of the following:
    * 
    *  ConsistentRead - If true, a strongly consistent read is used; if false
    *  (the default), an eventually consistent read is used.
    * 
    *  ExpressionAttributeNames - One or more substitution tokens for attribute names in the
    *  ProjectionExpression parameter. The following are some use cases for using
    *  ExpressionAttributeNames:
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
    *  For more information about expression attribute names, see Accessing Item Attributes in the Amazon DynamoDB Developer Guide.
    * 
    *  Keys - An array of primary key attribute values that define specific items in the table. For
    *  each primary key, you must provide all of the key attributes. For example, with a simple primary key,
    *  you only need to provide the partition key value. For a composite key, you must provide both the
    *  partition key value and the sort key value.
    * 
    *  ProjectionExpression - A string that identifies one or more attributes to retrieve from the
    *  table. These attributes can include scalars, sets, or elements of a JSON document. The attributes in the
    *  expression must be separated by commas.
    * 
    *  If no attribute names are specified, then all attributes are returned. If any of the requested attributes are
    *  not found, they do not appear in the result.
    * 
    *  For more information, see Accessing Item Attributes in the Amazon DynamoDB Developer Guide.
    * 
    *  AttributesToGet - This is a legacy parameter. Use ProjectionExpression instead. For
    *  more information, see AttributesToGet in the Amazon DynamoDB Developer Guide.
    */
  var requestItems: Map<String, KeysAndAttributes>?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.requestItems(value)
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
  fun returnConsumedCapacity(value: String?) {
    builder.returnConsumedCapacity(value)
  }

  
}

/**
  * Builds instances of type BatchGetItemRequest:
  * Represents the input of a BatchGetItem operation.
  */
fun buildBatchGetItemRequest(dslBlock: BatchGetItemRequestDSL.() -> Unit) =
  BatchGetItemRequestDSL().apply(dslBlock).build()