/*
  This file was generated from https://github.com/aws/aws-sdk-java-v2 by https://github.com/cylab/aws-kotlin-dsl-builder
  Like the original code, this file and project is licensed under
  Apache License Version 2.0
  See LICENSE.txt for more info
*/
package net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.model

import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSL
import software.amazon.awssdk.services.dynamodb.model.KeySchemaElement

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
class KeySchemaElementCollectionDSL {
  private val list = ArrayList<KeySchemaElement>()
  internal fun build() : List<KeySchemaElement> = list

  fun item(init: KeySchemaElementDSL.() -> Unit) {
    list.add(KeySchemaElementDSL().apply(init).build())
  }

  operator fun KeySchemaElement.unaryPlus() {
    list.add(this)
  }

  operator fun Collection<KeySchemaElement>.unaryPlus() {
    list.addAll(this)
  }

  operator fun Array<KeySchemaElement>.unaryPlus() {
    list.addAll(this)
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
fun buildKeySchemaElementCollection(dslBlock: KeySchemaElementCollectionDSL.() -> Unit) =
  KeySchemaElementCollectionDSL().apply(dslBlock).build()