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
import software.amazon.awssdk.services.dynamodb.model.LocalSecondaryIndexDescription
import software.amazon.awssdk.services.dynamodb.model.Projection

/**
  * Builds instances of type LocalSecondaryIndexDescription:
  * Represents the properties of a local secondary index.
  */
@DynamodbDSL
class LocalSecondaryIndexDescriptionDSL {
  private val builder = LocalSecondaryIndexDescription.builder()
  internal fun build(): LocalSecondaryIndexDescription = builder.build()
    
  /**
    * Represents attributes that are copied (projected) from the table into the global secondary index. These are
    *  in addition to the primary key attributes and index key attributes, which are automatically projected.
    */
  @get:JvmSynthetic // Hide from Java callers
  var projection: Projection
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.projection(value)
    }


  /**
    * Represents the name of the local secondary index.
    */
  @get:JvmSynthetic // Hide from Java callers
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
  @get:JvmSynthetic // Hide from Java callers
  var keySchema: Collection<KeySchemaElement>
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.keySchema(value)
    }


  /**
    * The number of items in the specified index. DynamoDB updates this value approximately every six hours. Recent
    *  changes might not be reflected in this value.
    */
  @get:JvmSynthetic // Hide from Java callers
  var itemCount: Long
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.itemCount(value)
    }


  /**
    * The total size of the specified index, in bytes. DynamoDB updates this value approximately every six hours.
    *  Recent changes might not be reflected in this value.
    */
  @get:JvmSynthetic // Hide from Java callers
  var indexSizeBytes: Long
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.indexSizeBytes(value)
    }


  /**
    * The Amazon Resource Name (ARN) that uniquely identifies the index.
    */
  @get:JvmSynthetic // Hide from Java callers
  var indexArn: String
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.indexArn(value)
    }

  
    
  /**
    * Represents attributes that are copied (projected) from the table into the global secondary index. These are
    *  in addition to the primary key attributes and index key attributes, which are automatically projected.
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
  * Builds instances of type LocalSecondaryIndexDescription:
  * Represents the properties of a local secondary index.
  */
fun buildLocalSecondaryIndexDescription(dslBlock: LocalSecondaryIndexDescriptionDSL.() -> Unit) =
  LocalSecondaryIndexDescriptionDSL().apply(dslBlock).build()