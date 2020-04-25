/*
  This file was generated from https://github.com/aws/aws-sdk-java-v2 by https://github.com/cylab/aws-kotlin-dsl-builder
  Like the original code, this file and project is licensed under
  Apache License Version 2.0
  See LICENSE.txt for more info
*/
package net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.model

import kotlin.DeprecationLevel.HIDDEN
import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSL
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
@DynamodbDSL
class KeySchemaElementDSL {
  private val builder = KeySchemaElement.builder()
  internal fun build(): KeySchemaElement = builder.build()
    
  /**
    * The name of a key attribute.
    */
  @get:JvmSynthetic // Hide from Java callers
  var attributeName: String
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.attributeName(value)
    }


  /**
    * The role that this key attribute will assume:
    * 
    *  HASH - partition key
    * 
    *  RANGE - sort key
    * 
    *  The partition key of an item is also known as its hash attribute. The term "hash attribute" derives
    *  from DynamoDB's usage of an internal hash function to evenly distribute data items across partitions, based
    *  on their partition key values.
    * 
    *  The sort key of an item is also known as its range attribute. The term "range attribute" derives from
    *  the way DynamoDB stores items with the same partition key physically close together, in sorted order by the
    *  sort key value.
    */
  @get:JvmSynthetic // Hide from Java callers
  var keyType: KeyType
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.keyType(value)
    }

    
  /**
    * The role that this key attribute will assume:
    * 
    *  HASH - partition key
    * 
    *  RANGE - sort key
    * 
    *  The partition key of an item is also known as its hash attribute. The term "hash attribute" derives
    *  from DynamoDB's usage of an internal hash function to evenly distribute data items across partitions, based
    *  on their partition key values.
    * 
    *  The sort key of an item is also known as its range attribute. The term "range attribute" derives from
    *  the way DynamoDB stores items with the same partition key physically close together, in sorted order by the
    *  sort key value.
    */
  fun keyType(value: String) {
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
fun buildKeySchemaElement(dslBlock: KeySchemaElementDSL.() -> Unit) =
  KeySchemaElementDSL().apply(dslBlock).build()