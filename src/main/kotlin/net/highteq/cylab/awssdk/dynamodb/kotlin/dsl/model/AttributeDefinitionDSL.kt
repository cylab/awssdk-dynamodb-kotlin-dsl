/*
  This file was generated from https://github.com/aws/aws-sdk-java-v2 by https://github.com/cylab/aws-kotlin-dsl-builder
  Like the original code, this file and project is licensed under
  Apache License Version 2.0
  See LICENSE.txt for more info
*/
package net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.model

import kotlin.DeprecationLevel.HIDDEN
import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSL
import software.amazon.awssdk.services.dynamodb.model.AttributeDefinition
import software.amazon.awssdk.services.dynamodb.model.ScalarAttributeType

/**
  * Builds instances of type AttributeDefinition:
  * Represents an attribute for describing the key schema for the table and indexes.
  */
@DynamodbDSL
class AttributeDefinitionDSL {
  private val builder = AttributeDefinition.builder()
  internal fun build(): AttributeDefinition = builder.build()
    
  /**
    * The data type for the attribute, where:
    * 
    *  S - the attribute is of type String
    * 
    *  N - the attribute is of type Number
    * 
    *  B - the attribute is of type Binary
    */
  @get:JvmSynthetic // Hide from Java callers
  var attributeType: ScalarAttributeType
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.attributeType(value)
    }


  /**
    * A name for the attribute.
    */
  @get:JvmSynthetic // Hide from Java callers
  var attributeName: String
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.attributeName(value)
    }

    
  /**
    * The data type for the attribute, where:
    * 
    *  S - the attribute is of type String
    * 
    *  N - the attribute is of type Number
    * 
    *  B - the attribute is of type Binary
    */
  fun attributeType(value: String) {
    builder.attributeType(value)
  }

  
}

/**
  * Builds instances of type AttributeDefinition:
  * Represents an attribute for describing the key schema for the table and indexes.
  */
fun buildAttributeDefinition(dslBlock: AttributeDefinitionDSL.() -> Unit) =
  AttributeDefinitionDSL().apply(dslBlock).build()