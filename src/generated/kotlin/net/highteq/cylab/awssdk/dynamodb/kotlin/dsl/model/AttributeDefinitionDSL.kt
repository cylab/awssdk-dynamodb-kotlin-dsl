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
import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSLMarker
import software.amazon.awssdk.services.dynamodb.model.AttributeDefinition
import software.amazon.awssdk.services.dynamodb.model.ScalarAttributeType

/**
  * Builds instances of type AttributeDefinition:
  * Represents an attribute for describing the key schema for the table and indexes.
  */
@DynamodbDSLMarker
inline class AttributeDefinitionDSL(
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder: AttributeDefinition.Builder
){
  @PublishedApi
  internal fun build(): AttributeDefinition = builder.build()

  /**
    * 
    */
  inline var attributeName: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.attributeName(value)
    }

  /**
    * 
    */
  inline var attributeType: ScalarAttributeType?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.attributeType(value)
    }

  /**
    * 
    */
  inline fun attributeType(value: String?) {
    builder.attributeType(value)
  }

}

/**
  * Builds instances of type AttributeDefinition:
  * Represents an attribute for describing the key schema for the table and indexes.
  */
inline fun attributeDefinition(dslBlock: AttributeDefinitionDSL.() -> Unit) =
  AttributeDefinitionDSL(AttributeDefinition.builder()).apply(dslBlock).build()

/**
  * Builds instances of type AttributeDefinition:
  * Represents an attribute for describing the key schema for the table and indexes.
  */
inline fun DynamodbDSL.Companion.attributeDefinition(dslBlock: AttributeDefinitionDSL.() -> Unit) =
  AttributeDefinitionDSL(AttributeDefinition.builder()).apply(dslBlock).build()