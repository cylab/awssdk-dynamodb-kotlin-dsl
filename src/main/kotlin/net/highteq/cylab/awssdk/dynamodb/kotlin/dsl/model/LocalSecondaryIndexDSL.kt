/*
  This file was generated from https://github.com/aws/aws-sdk-java-v2 by https://github.com/cylab/aws-kotlin-dsl-builder
  Like the original code, this file and project is licensed under
  Apache License Version 2.0
  See LICENSE.txt for more info
*/
@file:Suppress("DEPRECATION")
package net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.model

import kotlin.DeprecationLevel.HIDDEN
import kotlin.DeprecationLevel.WARNING
import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSL
import software.amazon.awssdk.services.dynamodb.model.KeySchemaElement
import software.amazon.awssdk.services.dynamodb.model.LocalSecondaryIndex
import software.amazon.awssdk.services.dynamodb.model.Projection

/**
  * Builds instances of type LocalSecondaryIndex:
  * Represents the properties of a local secondary index.
  */
@DynamodbDSL
class LocalSecondaryIndexDSL {
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  internal val builder = LocalSecondaryIndex.builder()
  internal fun build(): LocalSecondaryIndex = builder.build()
    
  /**
    * Represents attributes that are copied (projected) from the table into the local secondary index. These are in
    *  addition to the primary key attributes and index key attributes, which are automatically projected.
    */
  var projection: Projection
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.projection(value)
    }


  /**
    * The name of the local secondary index. The name must be unique among all other indexes on this table.
    */
  var indexName: String
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.indexName(value)
    }


  /**
    * The complete key schema for the local secondary index, consisting of one or more pairs of attribute names and
    *  key types:
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
  var keySchema: Collection<KeySchemaElement>
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.keySchema(value)
    }

  
    
  /**
    * Represents attributes that are copied (projected) from the table into the local secondary index. These are in
    *  addition to the primary key attributes and index key attributes, which are automatically projected.
    */
  fun projection(dslBlock: ProjectionDSL.() -> Unit) {
    builder.projection(buildProjection(dslBlock))
  }


  /**
    * The complete key schema for the local secondary index, consisting of one or more pairs of attribute names and
    *  key types:
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
  fun keySchema(dslBlock: KeySchemaElementCollectionDSL.() -> Unit) {
    builder.keySchema(buildKeySchemaElementCollection(dslBlock))
  }

}

/**
  * Builds instances of type LocalSecondaryIndex:
  * Represents the properties of a local secondary index.
  */
fun buildLocalSecondaryIndex(dslBlock: LocalSecondaryIndexDSL.() -> Unit) =
  LocalSecondaryIndexDSL().apply(dslBlock).build()