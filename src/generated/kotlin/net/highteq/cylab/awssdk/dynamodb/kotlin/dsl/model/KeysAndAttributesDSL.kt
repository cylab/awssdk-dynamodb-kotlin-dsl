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
import software.amazon.awssdk.services.dynamodb.model.KeysAndAttributes

/**
  * Builds instances of type KeysAndAttributes:
  * Represents a set of primary keys and, for each key, the attributes to retrieve from the table.
  * 
  *  For each primary key, you must provide all of the key attributes. For example, with a simple primary key, you
  *  only need to provide the partition key. For a composite primary key, you must provide both the partition key
  *  and the sort key.
  */
@DynamodbDSL
class KeysAndAttributesDSL {
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder = KeysAndAttributes.builder()
  internal fun build(): KeysAndAttributes = builder.build()
    
  /**
    * This is a legacy parameter. Use ProjectionExpression instead. For more information, see Legacy Conditional Parameters in the Amazon DynamoDB Developer Guide.
    */
  var attributesToGet: Collection<String>?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.attributesToGet(value)
    }


  /**
    * The consistency of a read operation. If set to true, then a strongly consistent read is used;
    *  otherwise, an eventually consistent read is used.
    */
  var consistentRead: Boolean?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.consistentRead(value)
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
    *  For more information on expression attribute names, see Accessing Item Attributes in the Amazon DynamoDB Developer Guide.
    */
  var expressionAttributeNames: Map<String, String>?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.expressionAttributeNames(value)
    }


  /**
    * The primary key attribute values that define the items and the attributes associated with the items.
    */
  var keys: Collection<Map<String, AttributeValue>>?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.keys(value)
    }


  /**
    * A string that identifies one or more attributes to retrieve from the table. These attributes can include
    *  scalars, sets, or elements of a JSON document. The attributes in the ProjectionExpression must
    *  be separated by commas.
    * 
    *  If no attribute names are specified, then all attributes will be returned. If any of the requested attributes
    *  are not found, they will not appear in the result.
    * 
    *  For more information, see Accessing Item Attributes in the Amazon DynamoDB Developer Guide.
    */
  var projectionExpression: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.projectionExpression(value)
    }

  
  
}

/**
  * Builds instances of type KeysAndAttributes:
  * Represents a set of primary keys and, for each key, the attributes to retrieve from the table.
  * 
  *  For each primary key, you must provide all of the key attributes. For example, with a simple primary key, you
  *  only need to provide the partition key. For a composite primary key, you must provide both the partition key
  *  and the sort key.
  */
fun buildKeysAndAttributes(dslBlock: KeysAndAttributesDSL.() -> Unit) =
  KeysAndAttributesDSL().apply(dslBlock).build()