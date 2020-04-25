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
import software.amazon.awssdk.services.dynamodb.model.Get

/**
  * Builds instances of type Get:
  * Specifies an item and related attribute values to retrieve in a TransactGetItem object.
  */
@DynamodbDSL
class GetDSL {
  private val builder = Get.builder()
  internal fun build(): Get = builder.build()
    
  /**
    * The name of the table from which to retrieve the specified item.
    */
  @get:JvmSynthetic // Hide from Java callers
  var tableName: String
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.tableName(value)
    }


  /**
    * One or more substitution tokens for attribute names in the ProjectionExpression parameter.
    */
  @get:JvmSynthetic // Hide from Java callers
  var expressionAttributeNames: Map<String, String>
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.expressionAttributeNames(value)
    }


  /**
    * A string that identifies one or more attributes of the specified item to retrieve from the table. The
    *  attributes in the expression must be separated by commas. If no attribute names are specified, then all
    *  attributes of the specified item are returned. If any of the requested attributes are not found, they do not
    *  appear in the result.
    */
  @get:JvmSynthetic // Hide from Java callers
  var projectionExpression: String
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.projectionExpression(value)
    }


  /**
    * A map of attribute names to AttributeValue objects that specifies the primary key of the item to
    *  retrieve.
    */
  @get:JvmSynthetic // Hide from Java callers
  var key: Map<String, AttributeValue>
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.key(value)
    }

  
  
}

/**
  * Builds instances of type Get:
  * Specifies an item and related attribute values to retrieve in a TransactGetItem object.
  */
fun buildGet(dslBlock: GetDSL.() -> Unit) =
  GetDSL().apply(dslBlock).build()