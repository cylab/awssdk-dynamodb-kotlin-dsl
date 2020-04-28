/*
  This file was generated from https://github.com/aws/aws-sdk-java-v2 by https://github.com/cylab/aws-kotlin-dsl-builder
  Like the original code, this file and project is licensed under
  Apache License Version 2.0
  See LICENSE.txt for more info
*/
package net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.model

import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSL
import software.amazon.awssdk.services.dynamodb.model.AttributeDefinition

/**
  * Builds instances of type AttributeDefinition:
  * Represents an attribute for describing the key schema for the table and indexes.
  */
@DynamodbDSL
class AttributeDefinitionCollectionDSL {
  private val list = ArrayList<AttributeDefinition>()
  internal fun build() : List<AttributeDefinition> = list

  /**
    * Builds an object of type AttributeDefinition from 
    * the given DSL in 'dslBlock' and adds it to the collection
    */
  fun o(dslBlock: AttributeDefinitionDSL.() -> Unit) {
    list.add(AttributeDefinitionDSL().apply(dslBlock).build())
  }

  /**
    * Adds a AttributeDefinition to the collection built by this DSL
    */
  operator fun AttributeDefinition.unaryPlus() {
    list.add(this)
  }

  /**
    * Adds all given AttributeDefinition instances to the collection built by this DSL
    */
  operator fun Collection<AttributeDefinition>.unaryPlus() {
    list.addAll(this)
  }

  /**
    * Adds all given AttributeDefinition instances to the collection built by this DSL
    */
  operator fun Array<AttributeDefinition>.unaryPlus() {
    list.addAll(this)
  }
}

/**
  * Builds instances of type AttributeDefinition:
  * Represents an attribute for describing the key schema for the table and indexes.
  */
fun buildAttributeDefinitionCollection(dslBlock: AttributeDefinitionCollectionDSL.() -> Unit) =
  AttributeDefinitionCollectionDSL().apply(dslBlock).build()