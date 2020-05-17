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
import software.amazon.awssdk.services.dynamodb.model.KeySchemaElement
import software.amazon.awssdk.services.dynamodb.model.KeyType

/**
  * Builds instances of type KeySchemaElement:
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
inline class KeySchemaElementDSL(
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder: KeySchemaElement.Builder
){
  @PublishedApi
  internal fun build(): KeySchemaElement = builder.build()

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
  inline var keyType: KeyType?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.keyType(value)
    }

  /**
    * 
    */
  inline fun keyType(value: String?) {
    builder.keyType(value)
  }

}

/**
  * Builds instances of type KeySchemaElement:
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
inline fun keySchemaElement(dslBlock: KeySchemaElementDSL.() -> Unit) =
  KeySchemaElementDSL(KeySchemaElement.builder()).apply(dslBlock).build()

/**
  * Builds instances of type KeySchemaElement:
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
inline fun DynamodbDSL.Companion.keySchemaElement(dslBlock: KeySchemaElementDSL.() -> Unit) =
  KeySchemaElementDSL(KeySchemaElement.builder()).apply(dslBlock).build()