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
import software.amazon.awssdk.services.dynamodb.model.GlobalSecondaryIndexDescription
import software.amazon.awssdk.services.dynamodb.model.IndexStatus
import software.amazon.awssdk.services.dynamodb.model.KeySchemaElement
import software.amazon.awssdk.services.dynamodb.model.Projection
import software.amazon.awssdk.services.dynamodb.model.ProvisionedThroughputDescription

/**
  * Builds instances of type GlobalSecondaryIndexDescription:
  * Represents the properties of a global secondary index.
  */
@DynamodbDSL
class GlobalSecondaryIndexDescriptionDSL {
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder = GlobalSecondaryIndexDescription.builder()
  internal fun build(): GlobalSecondaryIndexDescription = builder.build()
    
  /**
    * Represents attributes that are copied (projected) from the table into the global secondary index. These are
    *  in addition to the primary key attributes and index key attributes, which are automatically projected.
    */
  var projection: Projection?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.projection(value)
    }


  /**
    * The name of the global secondary index.
    */
  var indexName: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.indexName(value)
    }


  /**
    * The complete key schema for a global secondary index, which consists of one or more pairs of attribute names
    *  and key types:
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
  var keySchema: Collection<KeySchemaElement>?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.keySchema(value)
    }


  /**
    * Represents the provisioned throughput settings for the specified global secondary index.
    * 
    *  For current minimum and maximum provisioned throughput values, see Limits in the
    *  Amazon DynamoDB Developer Guide.
    */
  var provisionedThroughput: ProvisionedThroughputDescription?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.provisionedThroughput(value)
    }


  /**
    * The total size of the specified index, in bytes. DynamoDB updates this value approximately every six hours.
    *  Recent changes might not be reflected in this value.
    */
  var indexSizeBytes: Long?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.indexSizeBytes(value)
    }


  /**
    * The Amazon Resource Name (ARN) that uniquely identifies the index.
    */
  var indexArn: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.indexArn(value)
    }


  /**
    * The current state of the global secondary index:
    * 
    *  CREATING - The index is being created.
    * 
    *  UPDATING - The index is being updated.
    * 
    *  DELETING - The index is being deleted.
    * 
    *  ACTIVE - The index is ready for use.
    */
  var indexStatus: IndexStatus?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.indexStatus(value)
    }


  /**
    * Indicates whether the index is currently backfilling. Backfilling is the process of reading items from
    *  the table and determining whether they can be added to the index. (Not all items will qualify: For example, a
    *  partition key cannot have any duplicate values.) If an item can be added to the index, DynamoDB will do so.
    *  After all items have been processed, the backfilling operation is complete and Backfilling is
    *  false.
    * 
    *  You can delete an index that is being created during the Backfilling phase when
    *  IndexStatus is set to CREATING and Backfilling is true. You can't delete the index
    *  that is being created when IndexStatus is set to CREATING and Backfilling is false.
    * 
    *  For indexes that were created during a CreateTable operation, the Backfilling
    *  attribute does not appear in the DescribeTable output.
    */
  var backfilling: Boolean?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.backfilling(value)
    }


  /**
    * The number of items in the specified index. DynamoDB updates this value approximately every six hours. Recent
    *  changes might not be reflected in this value.
    */
  var itemCount: Long?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.itemCount(value)
    }

    
  /**
    * The current state of the global secondary index:
    * 
    *  CREATING - The index is being created.
    * 
    *  UPDATING - The index is being updated.
    * 
    *  DELETING - The index is being deleted.
    * 
    *  ACTIVE - The index is ready for use.
    */
  fun indexStatus(value: String?) {
    builder.indexStatus(value)
  }

    
  /**
    * Represents attributes that are copied (projected) from the table into the global secondary index. These are
    *  in addition to the primary key attributes and index key attributes, which are automatically projected.
    */
  fun projection(dslBlock: ProjectionDSL.() -> Unit) {
    builder.projection(buildProjection(dslBlock))
  }


  /**
    * Represents the provisioned throughput settings for the specified global secondary index.
    * 
    *  For current minimum and maximum provisioned throughput values, see Limits in the
    *  Amazon DynamoDB Developer Guide.
    */
  fun provisionedThroughput(dslBlock: ProvisionedThroughputDescriptionDSL.() -> Unit) {
    builder.provisionedThroughput(buildProvisionedThroughputDescription(dslBlock))
  }


  /**
    * The complete key schema for a global secondary index, which consists of one or more pairs of attribute names
    *  and key types:
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
  * Builds instances of type GlobalSecondaryIndexDescription:
  * Represents the properties of a global secondary index.
  */
fun buildGlobalSecondaryIndexDescription(dslBlock: GlobalSecondaryIndexDescriptionDSL.() -> Unit) =
  GlobalSecondaryIndexDescriptionDSL().apply(dslBlock).build()