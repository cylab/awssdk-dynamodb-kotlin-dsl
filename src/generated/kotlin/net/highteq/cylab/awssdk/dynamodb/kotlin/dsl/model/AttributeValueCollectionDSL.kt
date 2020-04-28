/*
  This file was generated from https://github.com/aws/aws-sdk-java-v2 by https://github.com/cylab/aws-kotlin-dsl-builder
  Like the original code, this file and project is licensed under
  Apache License Version 2.0
  See LICENSE.txt for more info
*/
package net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.model

import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSL
import software.amazon.awssdk.services.dynamodb.model.AttributeValue

/**
  * Builds instances of type AttributeValue:
  * Represents the data for an attribute.
  * 
  *  Each attribute value is described as a name-value pair. The name is the data type, and the value is the data itself.
  * 
  *  For more information, see Data Types in the Amazon DynamoDB Developer Guide.
  */
@DynamodbDSL
class AttributeValueCollectionDSL {
  private val list = ArrayList<AttributeValue>()
  internal fun build() : List<AttributeValue> = list

  /**
    * Builds an object of type AttributeValue from 
    * the given DSL in 'dslBlock' and adds it to the collection
    */
  fun o(dslBlock: AttributeValueDSL.() -> Unit) {
    list.add(AttributeValueDSL().apply(dslBlock).build())
  }

  /**
    * Adds a AttributeValue to the collection built by this DSL
    */
  operator fun AttributeValue.unaryPlus() {
    list.add(this)
  }

  /**
    * Adds all given AttributeValue instances to the collection built by this DSL
    */
  operator fun Collection<AttributeValue>.unaryPlus() {
    list.addAll(this)
  }

  /**
    * Adds all given AttributeValue instances to the collection built by this DSL
    */
  operator fun Array<AttributeValue>.unaryPlus() {
    list.addAll(this)
  }
}

/**
  * Builds instances of type AttributeValue:
  * Represents the data for an attribute.
  * 
  *  Each attribute value is described as a name-value pair. The name is the data type, and the value is the data itself.
  * 
  *  For more information, see Data Types in the Amazon DynamoDB Developer Guide.
  */
fun buildAttributeValueCollection(dslBlock: AttributeValueCollectionDSL.() -> Unit) =
  AttributeValueCollectionDSL().apply(dslBlock).build()