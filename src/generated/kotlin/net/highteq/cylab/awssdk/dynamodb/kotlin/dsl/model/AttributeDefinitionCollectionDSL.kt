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
import software.amazon.awssdk.services.dynamodb.model.AttributeDefinition

/**
  * Builds instances of type AttributeDefinition:
  * Represents an attribute for describing the key schema for the table and indexes.
  */
@DynamodbDSL
inline class AttributeDefinitionCollectionDSL(
  @PublishedApi
  @Deprecated("Don't use internal fields!", level = WARNING)
  internal val list : MutableList<AttributeDefinition>
){
  @PublishedApi
  internal fun build() = list

  /**
    * Builds an object of type AttributeDefinition from 
    * the given DSL in 'dslBlock' and adds it to the collection
    */
  inline fun o(dslBlock: AttributeDefinitionDSL.() -> Unit) {
    list.add(buildAttributeDefinition(dslBlock))
  }

  /**
    * Adds a AttributeDefinition to the collection built by this DSL
    */
  inline operator fun AttributeDefinition.unaryPlus() {
    list.add(this)
  }

  /**
    * Adds all given AttributeDefinition instances to the collection built by this DSL
    */
  inline operator fun Collection<AttributeDefinition>.unaryPlus() {
    list.addAll(this)
  }

  /**
    * Adds all given AttributeDefinition instances to the collection built by this DSL
    */
  inline operator fun Array<AttributeDefinition>.unaryPlus() {
    list.addAll(this)
  }
}

/**
  * Builds instances of type AttributeDefinition:
  * Represents an attribute for describing the key schema for the table and indexes.
  */
inline fun buildAttributeDefinitionCollection(dslBlock: AttributeDefinitionCollectionDSL.() -> Unit) =
  AttributeDefinitionCollectionDSL(mutableListOf<AttributeDefinition>()).apply(dslBlock).build()