/*
  This file was generated from https://github.com/aws/aws-sdk-java-v2 by https://github.com/cylab/aws-kotlin-dsl-builder
  Like the original code, this file and project is licensed under
  Apache License Version 2.0
  See LICENSE.txt for more info
*/
@file:Suppress("DEPRECATION", "NOTHING_TO_INLINE")
package net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.model

import kotlin.DeprecationLevel.WARNING
import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSL
import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSLMarker
import software.amazon.awssdk.services.dynamodb.model.AttributeValue

/**
  * Builds a collection of type AttributeValue:
  * Represents the data for an attribute.
  * 
  *  Each attribute value is described as a name-value pair. The name is the data type, and the value is the data itself.
  * 
  *  For more information, see Data Types in the Amazon DynamoDB Developer Guide.
  */
@DynamodbDSLMarker
inline class AttributeValueCollectionDSL(
  @PublishedApi
  @Deprecated("Don't use internal fields!", level = WARNING)
  internal val list : MutableList<AttributeValue>
){
  @PublishedApi
  internal fun build() = list

  /**
    * Builds an object of type AttributeValue from 
    * the given DSL in 'dslBlock' and adds it to the collection
    */
  inline fun o(dslBlock: AttributeValueDSL.() -> Unit) {
    list.add(DynamodbDSL.attributeValue(dslBlock))
  }

  /**
    * Adds a AttributeValue to the collection built by this DSL
    */
  inline operator fun AttributeValue.unaryPlus() {
    list.add(this)
  }

  /**
    * Adds all given AttributeValue instances to the collection built by this DSL
    */
  inline operator fun Collection<AttributeValue>.unaryPlus() {
    list.addAll(this)
  }

  /**
    * Adds all given AttributeValue instances to the collection built by this DSL
    */
  inline operator fun Array<AttributeValue>.unaryPlus() {
    list.addAll(this)
  }
}

/**
  * Builds a collection of type AttributeValue:
  * Represents the data for an attribute.
  * 
  *  Each attribute value is described as a name-value pair. The name is the data type, and the value is the data itself.
  * 
  *  For more information, see Data Types in the Amazon DynamoDB Developer Guide.
  */
inline fun attributeValueCollection(dslBlock: AttributeValueCollectionDSL.() -> Unit) =
  AttributeValueCollectionDSL(mutableListOf<AttributeValue>()).apply(dslBlock).build()

/**
  * Builds a collection of type AttributeValue:
  * Represents the data for an attribute.
  * 
  *  Each attribute value is described as a name-value pair. The name is the data type, and the value is the data itself.
  * 
  *  For more information, see Data Types in the Amazon DynamoDB Developer Guide.
  */
inline fun DynamodbDSL.Companion.attributeValueCollection(dslBlock: AttributeValueCollectionDSL.() -> Unit) =
  AttributeValueCollectionDSL(mutableListOf<AttributeValue>()).apply(dslBlock).build()