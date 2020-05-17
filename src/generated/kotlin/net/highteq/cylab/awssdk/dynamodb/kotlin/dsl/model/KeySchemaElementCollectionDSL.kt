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
import software.amazon.awssdk.services.dynamodb.model.KeySchemaElement

/**
  * Builds a collection of type KeySchemaElement:
  * Represents a single element of a key schema. A key schema specifies the attributes that make up the primary
  *  key of a table, or the key attributes of an index.
  * 
  *  A KeySchemaElement represents exactly one attribute of the primary key. For example, a simple primary
  *  key would be represented by one KeySchemaElement (for the partition key). A composite primary key would
  *  require one KeySchemaElement for the partition key, and another KeySchemaElement for the
  *  sort key.
  * 
  *  A KeySchemaElement must be a scalar, top-level attribute (not a nested attribute). The data type must be
  *  one of String, Number, or Binary. The attribute cannot be nested within a List or a Map.
  */
@DynamodbDSLMarker
inline class KeySchemaElementCollectionDSL(
  @PublishedApi
  @Deprecated("Don't use internal fields!", level = WARNING)
  internal val list : MutableList<KeySchemaElement>
){
  @PublishedApi
  internal fun build() = list

  /**
    * Builds an object of type KeySchemaElement from 
    * the given DSL in 'dslBlock' and adds it to the collection
    */
  inline fun o(dslBlock: KeySchemaElementDSL.() -> Unit) {
    list.add(DynamodbDSL.keySchemaElement(dslBlock))
  }

  /**
    * Adds a KeySchemaElement to the collection built by this DSL
    */
  inline operator fun KeySchemaElement.unaryPlus() {
    list.add(this)
  }

  /**
    * Adds all given KeySchemaElement instances to the collection built by this DSL
    */
  inline operator fun Collection<KeySchemaElement>.unaryPlus() {
    list.addAll(this)
  }

  /**
    * Adds all given KeySchemaElement instances to the collection built by this DSL
    */
  inline operator fun Array<KeySchemaElement>.unaryPlus() {
    list.addAll(this)
  }
}

/**
  * Builds a collection of type KeySchemaElement:
  * Represents a single element of a key schema. A key schema specifies the attributes that make up the primary
  *  key of a table, or the key attributes of an index.
  * 
  *  A KeySchemaElement represents exactly one attribute of the primary key. For example, a simple primary
  *  key would be represented by one KeySchemaElement (for the partition key). A composite primary key would
  *  require one KeySchemaElement for the partition key, and another KeySchemaElement for the
  *  sort key.
  * 
  *  A KeySchemaElement must be a scalar, top-level attribute (not a nested attribute). The data type must be
  *  one of String, Number, or Binary. The attribute cannot be nested within a List or a Map.
  */
inline fun keySchemaElementCollection(dslBlock: KeySchemaElementCollectionDSL.() -> Unit) =
  KeySchemaElementCollectionDSL(mutableListOf<KeySchemaElement>()).apply(dslBlock).build()

/**
  * Builds a collection of type KeySchemaElement:
  * Represents a single element of a key schema. A key schema specifies the attributes that make up the primary
  *  key of a table, or the key attributes of an index.
  * 
  *  A KeySchemaElement represents exactly one attribute of the primary key. For example, a simple primary
  *  key would be represented by one KeySchemaElement (for the partition key). A composite primary key would
  *  require one KeySchemaElement for the partition key, and another KeySchemaElement for the
  *  sort key.
  * 
  *  A KeySchemaElement must be a scalar, top-level attribute (not a nested attribute). The data type must be
  *  one of String, Number, or Binary. The attribute cannot be nested within a List or a Map.
  */
inline fun DynamodbDSL.Companion.keySchemaElementCollection(dslBlock: KeySchemaElementCollectionDSL.() -> Unit) =
  KeySchemaElementCollectionDSL(mutableListOf<KeySchemaElement>()).apply(dslBlock).build()