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
import software.amazon.awssdk.services.dynamodb.model.AttributeAction
import software.amazon.awssdk.services.dynamodb.model.AttributeValue
import software.amazon.awssdk.services.dynamodb.model.AttributeValueUpdate

/**
  * Builds instances of type AttributeValueUpdate:
  * For the UpdateItem operation, represents the attributes to be modified, the action to perform on each,
  *  and the new value for each.
  * 
  *  You cannot use UpdateItem to update any primary key attributes. Instead, you will need to delete the
  *  item, and then use PutItem to create a new item with new attributes.
  * 
  *  Attribute values cannot be null; string and binary type attributes must have lengths greater than zero; and set type
  *  attributes must not be empty. Requests with empty values will be rejected with a ValidationException
  *  exception.
  */
@DynamodbDSL
inline class AttributeValueUpdateDSL(
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder: AttributeValueUpdate.Builder
){
  @PublishedApi
  internal fun build(): AttributeValueUpdate = builder.build()
    
  /**
    * 
    */
  inline var action: AttributeAction?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.action(value)
    }


  /**
    * 
    */
  inline var value: AttributeValue?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.value(value)
    }

    
  /**
    * 
    */
  inline fun action(value: String?) {
    builder.action(value)
  }

  
    
  /**
    * 
    */
  inline fun value(dslBlock: AttributeValueDSL.() -> Unit) {
    builder.value(buildAttributeValue(dslBlock))
  }

}

/**
  * Builds instances of type AttributeValueUpdate:
  * For the UpdateItem operation, represents the attributes to be modified, the action to perform on each,
  *  and the new value for each.
  * 
  *  You cannot use UpdateItem to update any primary key attributes. Instead, you will need to delete the
  *  item, and then use PutItem to create a new item with new attributes.
  * 
  *  Attribute values cannot be null; string and binary type attributes must have lengths greater than zero; and set type
  *  attributes must not be empty. Requests with empty values will be rejected with a ValidationException
  *  exception.
  */
inline fun buildAttributeValueUpdate(dslBlock: AttributeValueUpdateDSL.() -> Unit) =
  AttributeValueUpdateDSL(AttributeValueUpdate.builder()).apply(dslBlock).build()