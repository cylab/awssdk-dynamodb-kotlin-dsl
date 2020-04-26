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
import java.time.Instant
import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSL
import software.amazon.awssdk.services.dynamodb.model.AttributeDefinition
import software.amazon.awssdk.services.dynamodb.model.BillingModeSummary
import software.amazon.awssdk.services.dynamodb.model.GlobalSecondaryIndexDescription
import software.amazon.awssdk.services.dynamodb.model.KeySchemaElement
import software.amazon.awssdk.services.dynamodb.model.LocalSecondaryIndexDescription
import software.amazon.awssdk.services.dynamodb.model.ProvisionedThroughputDescription
import software.amazon.awssdk.services.dynamodb.model.RestoreSummary
import software.amazon.awssdk.services.dynamodb.model.SSEDescription
import software.amazon.awssdk.services.dynamodb.model.StreamSpecification
import software.amazon.awssdk.services.dynamodb.model.TableDescription
import software.amazon.awssdk.services.dynamodb.model.TableStatus

/**
  * Builds instances of type TableDescription:
  * Represents the properties of a table.
  */
@DynamodbDSL
class TableDescriptionDSL {
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder = TableDescription.builder()
  internal fun build(): TableDescription = builder.build()
    
  /**
    * The name of the table.
    */
  var tableName: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.tableName(value)
    }


  /**
    * The primary key structure for the table. Each KeySchemaElement consists of:
    * 
    *  AttributeName - The name of the attribute.
    * 
    *  KeyType - The role of the attribute:
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
    * 
    *  For more information about primary keys, see Primary Key in the Amazon DynamoDB Developer Guide.
    */
  var keySchema: Collection<KeySchemaElement>?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.keySchema(value)
    }


  /**
    * The provisioned throughput settings for the table, consisting of read and write capacity units, along with
    *  data about increases and decreases.
    */
  var provisionedThroughput: ProvisionedThroughputDescription?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.provisionedThroughput(value)
    }


  /**
    * The current state of the table:
    * 
    *  CREATING - The table is being created.
    * 
    *  UPDATING - The table is being updated.
    * 
    *  DELETING - The table is being deleted.
    * 
    *  ACTIVE - The table is ready for use.
    * 
    *  INACCESSIBLE_ENCRYPTION_CREDENTIALS - The AWS KMS key used to encrypt the table in inaccessible.
    *  Table operations may fail due to failure to use the AWS KMS key. DynamoDB will initiate the table archival
    *  process when a table's AWS KMS key remains inaccessible for more than seven days.
    * 
    *  ARCHIVING - The table is being archived. Operations are not allowed until archival is complete.
    * 
    *  ARCHIVED - The table has been archived. See the ArchivalReason for more information.
    */
  var tableStatus: TableStatus?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.tableStatus(value)
    }


  /**
    * An array of AttributeDefinition objects. Each of these objects describes one attribute in the
    *  table and index key schema.
    * 
    *  Each AttributeDefinition object in this array is composed of:
    * 
    *  AttributeName - The name of the attribute.
    * 
    *  AttributeType - The data type for the attribute.
    */
  var attributeDefinitions: Collection<AttributeDefinition>?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.attributeDefinitions(value)
    }


  /**
    * The date and time when the table was created, in UNIX epoch time
    *  format.
    */
  var creationDateTime: Instant?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.creationDateTime(value)
    }


  /**
    * The total size of the specified table, in bytes. DynamoDB updates this value approximately every six hours.
    *  Recent changes might not be reflected in this value.
    */
  var tableSizeBytes: Long?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.tableSizeBytes(value)
    }


  /**
    * The number of items in the specified table. DynamoDB updates this value approximately every six hours. Recent
    *  changes might not be reflected in this value.
    */
  var itemCount: Long?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.itemCount(value)
    }


  /**
    * The Amazon Resource Name (ARN) that uniquely identifies the table.
    */
  var tableArn: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.tableArn(value)
    }


  /**
    * Unique identifier for the table for which the backup was created.
    */
  var tableId: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.tableId(value)
    }


  /**
    * Contains the details for the read/write capacity mode.
    */
  var billingModeSummary: BillingModeSummary?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.billingModeSummary(value)
    }


  /**
    * Represents one or more local secondary indexes on the table. Each index is scoped to a given partition key
    *  value. Tables with one or more local secondary indexes are subject to an item collection size limit, where
    *  the amount of data within a given item collection cannot exceed 10 GB. Each element is composed of:
    * 
    *  IndexName - The name of the local secondary index.
    * 
    *  KeySchema - Specifies the complete index key schema. The attribute names in the key schema must
    *  be between 1 and 255 characters (inclusive). The key schema must begin with the same partition key as the
    *  table.
    * 
    *  Projection - Specifies attributes that are copied (projected) from the table into the index.
    *  These are in addition to the primary key attributes and index key attributes, which are automatically
    *  projected. Each attribute specification is composed of:
    * 
    *  ProjectionType - One of the following:
    * 
    *  KEYS_ONLY - Only the index and primary keys are projected into the index.
    * 
    *  INCLUDE - Only the specified table attributes are projected into the index. The list of
    *  projected attributes is in NonKeyAttributes.
    * 
    *  ALL - All of the table attributes are projected into the index.
    * 
    *  NonKeyAttributes - A list of one or more non-key attribute names that are projected into the
    *  secondary index. The total count of attributes provided in NonKeyAttributes, summed across all
    *  of the secondary indexes, must not exceed 20. If you project the same attribute into two different indexes,
    *  this counts as two distinct attributes when determining the total.
    * 
    *  IndexSizeBytes - Represents the total size of the index, in bytes. DynamoDB updates this value
    *  approximately every six hours. Recent changes might not be reflected in this value.
    * 
    *  ItemCount - Represents the number of items in the index. DynamoDB updates this value
    *  approximately every six hours. Recent changes might not be reflected in this value.
    * 
    *  If the table is in the DELETING state, no information about indexes will be returned.
    */
  var localSecondaryIndexes: Collection<LocalSecondaryIndexDescription>?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.localSecondaryIndexes(value)
    }


  /**
    * The global secondary indexes, if any, on the table. Each index is scoped to a given partition key value. Each
    *  element is composed of:
    * 
    *  Backfilling - If true, then the index is currently in the backfilling phase. Backfilling occurs
    *  only when a new global secondary index is added to the table. It is the process by which DynamoDB populates
    *  the new index with data from the table. (This attribute does not appear for indexes that were created during
    *  a CreateTable operation.)
    * 
    *  You can delete an index that is being created during the Backfilling phase when
    *  IndexStatus is set to CREATING and Backfilling is true. You can't delete the index
    *  that is being created when IndexStatus is set to CREATING and Backfilling is false.
    *  (This attribute does not appear for indexes that were created during a CreateTable operation.)
    * 
    *  IndexName - The name of the global secondary index.
    * 
    *  IndexSizeBytes - The total size of the global secondary index, in bytes. DynamoDB updates this
    *  value approximately every six hours. Recent changes might not be reflected in this value.
    * 
    *  IndexStatus - The current status of the global secondary index:
    * 
    *  CREATING - The index is being created.
    * 
    *  UPDATING - The index is being updated.
    * 
    *  DELETING - The index is being deleted.
    * 
    *  ACTIVE - The index is ready for use.
    * 
    *  ItemCount - The number of items in the global secondary index. DynamoDB updates this value
    *  approximately every six hours. Recent changes might not be reflected in this value.
    * 
    *  KeySchema - Specifies the complete index key schema. The attribute names in the key schema must
    *  be between 1 and 255 characters (inclusive). The key schema must begin with the same partition key as the
    *  table.
    * 
    *  Projection - Specifies attributes that are copied (projected) from the table into the index.
    *  These are in addition to the primary key attributes and index key attributes, which are automatically
    *  projected. Each attribute specification is composed of:
    * 
    *  ProjectionType - One of the following:
    * 
    *  KEYS_ONLY - Only the index and primary keys are projected into the index.
    * 
    *  INCLUDE - Only the specified table attributes are projected into the index. The list of
    *  projected attributes is in NonKeyAttributes.
    * 
    *  ALL - All of the table attributes are projected into the index.
    * 
    *  NonKeyAttributes - A list of one or more non-key attribute names that are projected into the
    *  secondary index. The total count of attributes provided in NonKeyAttributes, summed across all
    *  of the secondary indexes, must not exceed 20. If you project the same attribute into two different indexes,
    *  this counts as two distinct attributes when determining the total.
    * 
    *  ProvisionedThroughput - The provisioned throughput settings for the global secondary index,
    *  consisting of read and write capacity units, along with data about increases and decreases.
    * 
    *  If the table is in the DELETING state, no information about indexes will be returned.
    */
  var globalSecondaryIndexes: Collection<GlobalSecondaryIndexDescription>?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.globalSecondaryIndexes(value)
    }


  /**
    * The current DynamoDB Streams configuration for the table.
    */
  var streamSpecification: StreamSpecification?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.streamSpecification(value)
    }


  /**
    * A timestamp, in ISO 8601 format, for this stream.
    * 
    *  Note that LatestStreamLabel is not a unique identifier for the stream, because it is possible
    *  that a stream from another table might have the same timestamp. However, the combination of the following
    *  three elements is guaranteed to be unique:
    * 
    *  AWS customer ID
    * 
    *  Table name
    * 
    *  StreamLabel
    */
  var latestStreamLabel: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.latestStreamLabel(value)
    }


  /**
    * The Amazon Resource Name (ARN) that uniquely identifies the latest stream for this table.
    */
  var latestStreamArn: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.latestStreamArn(value)
    }


  /**
    * Contains details for the restore.
    */
  var restoreSummary: RestoreSummary?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.restoreSummary(value)
    }


  /**
    * The description of the server-side encryption status on the specified table.
    */
  var sseDescription: SSEDescription?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.sseDescription(value)
    }

    
  /**
    * The current state of the table:
    * 
    *  CREATING - The table is being created.
    * 
    *  UPDATING - The table is being updated.
    * 
    *  DELETING - The table is being deleted.
    * 
    *  ACTIVE - The table is ready for use.
    * 
    *  INACCESSIBLE_ENCRYPTION_CREDENTIALS - The AWS KMS key used to encrypt the table in inaccessible.
    *  Table operations may fail due to failure to use the AWS KMS key. DynamoDB will initiate the table archival
    *  process when a table's AWS KMS key remains inaccessible for more than seven days.
    * 
    *  ARCHIVING - The table is being archived. Operations are not allowed until archival is complete.
    * 
    *  ARCHIVED - The table has been archived. See the ArchivalReason for more information.
    */
  fun tableStatus(value: String?) {
    builder.tableStatus(value)
  }

    
  /**
    * The provisioned throughput settings for the table, consisting of read and write capacity units, along with
    *  data about increases and decreases.
    */
  fun provisionedThroughput(dslBlock: ProvisionedThroughputDescriptionDSL.() -> Unit) {
    builder.provisionedThroughput(buildProvisionedThroughputDescription(dslBlock))
  }


  /**
    * Contains the details for the read/write capacity mode.
    */
  fun billingModeSummary(dslBlock: BillingModeSummaryDSL.() -> Unit) {
    builder.billingModeSummary(buildBillingModeSummary(dslBlock))
  }


  /**
    * The current DynamoDB Streams configuration for the table.
    */
  fun streamSpecification(dslBlock: StreamSpecificationDSL.() -> Unit) {
    builder.streamSpecification(buildStreamSpecification(dslBlock))
  }


  /**
    * Contains details for the restore.
    */
  fun restoreSummary(dslBlock: RestoreSummaryDSL.() -> Unit) {
    builder.restoreSummary(buildRestoreSummary(dslBlock))
  }


  /**
    * The description of the server-side encryption status on the specified table.
    */
  fun sseDescription(dslBlock: SSEDescriptionDSL.() -> Unit) {
    builder.sseDescription(buildSSEDescription(dslBlock))
  }


  /**
    * The primary key structure for the table. Each KeySchemaElement consists of:
    * 
    *  AttributeName - The name of the attribute.
    * 
    *  KeyType - The role of the attribute:
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
    * 
    *  For more information about primary keys, see Primary Key in the Amazon DynamoDB Developer Guide.
    */
  fun keySchema(dslBlock: KeySchemaElementCollectionDSL.() -> Unit) {
    builder.keySchema(buildKeySchemaElementCollection(dslBlock))
  }


  /**
    * An array of AttributeDefinition objects. Each of these objects describes one attribute in the
    *  table and index key schema.
    * 
    *  Each AttributeDefinition object in this array is composed of:
    * 
    *  AttributeName - The name of the attribute.
    * 
    *  AttributeType - The data type for the attribute.
    */
  fun attributeDefinitions(dslBlock: AttributeDefinitionCollectionDSL.() -> Unit) {
    builder.attributeDefinitions(buildAttributeDefinitionCollection(dslBlock))
  }


  /**
    * Represents one or more local secondary indexes on the table. Each index is scoped to a given partition key
    *  value. Tables with one or more local secondary indexes are subject to an item collection size limit, where
    *  the amount of data within a given item collection cannot exceed 10 GB. Each element is composed of:
    * 
    *  IndexName - The name of the local secondary index.
    * 
    *  KeySchema - Specifies the complete index key schema. The attribute names in the key schema must
    *  be between 1 and 255 characters (inclusive). The key schema must begin with the same partition key as the
    *  table.
    * 
    *  Projection - Specifies attributes that are copied (projected) from the table into the index.
    *  These are in addition to the primary key attributes and index key attributes, which are automatically
    *  projected. Each attribute specification is composed of:
    * 
    *  ProjectionType - One of the following:
    * 
    *  KEYS_ONLY - Only the index and primary keys are projected into the index.
    * 
    *  INCLUDE - Only the specified table attributes are projected into the index. The list of
    *  projected attributes is in NonKeyAttributes.
    * 
    *  ALL - All of the table attributes are projected into the index.
    * 
    *  NonKeyAttributes - A list of one or more non-key attribute names that are projected into the
    *  secondary index. The total count of attributes provided in NonKeyAttributes, summed across all
    *  of the secondary indexes, must not exceed 20. If you project the same attribute into two different indexes,
    *  this counts as two distinct attributes when determining the total.
    * 
    *  IndexSizeBytes - Represents the total size of the index, in bytes. DynamoDB updates this value
    *  approximately every six hours. Recent changes might not be reflected in this value.
    * 
    *  ItemCount - Represents the number of items in the index. DynamoDB updates this value
    *  approximately every six hours. Recent changes might not be reflected in this value.
    * 
    *  If the table is in the DELETING state, no information about indexes will be returned.
    */
  fun localSecondaryIndexes(dslBlock: LocalSecondaryIndexDescriptionCollectionDSL.() -> Unit) {
    builder.localSecondaryIndexes(buildLocalSecondaryIndexDescriptionCollection(dslBlock))
  }


  /**
    * The global secondary indexes, if any, on the table. Each index is scoped to a given partition key value. Each
    *  element is composed of:
    * 
    *  Backfilling - If true, then the index is currently in the backfilling phase. Backfilling occurs
    *  only when a new global secondary index is added to the table. It is the process by which DynamoDB populates
    *  the new index with data from the table. (This attribute does not appear for indexes that were created during
    *  a CreateTable operation.)
    * 
    *  You can delete an index that is being created during the Backfilling phase when
    *  IndexStatus is set to CREATING and Backfilling is true. You can't delete the index
    *  that is being created when IndexStatus is set to CREATING and Backfilling is false.
    *  (This attribute does not appear for indexes that were created during a CreateTable operation.)
    * 
    *  IndexName - The name of the global secondary index.
    * 
    *  IndexSizeBytes - The total size of the global secondary index, in bytes. DynamoDB updates this
    *  value approximately every six hours. Recent changes might not be reflected in this value.
    * 
    *  IndexStatus - The current status of the global secondary index:
    * 
    *  CREATING - The index is being created.
    * 
    *  UPDATING - The index is being updated.
    * 
    *  DELETING - The index is being deleted.
    * 
    *  ACTIVE - The index is ready for use.
    * 
    *  ItemCount - The number of items in the global secondary index. DynamoDB updates this value
    *  approximately every six hours. Recent changes might not be reflected in this value.
    * 
    *  KeySchema - Specifies the complete index key schema. The attribute names in the key schema must
    *  be between 1 and 255 characters (inclusive). The key schema must begin with the same partition key as the
    *  table.
    * 
    *  Projection - Specifies attributes that are copied (projected) from the table into the index.
    *  These are in addition to the primary key attributes and index key attributes, which are automatically
    *  projected. Each attribute specification is composed of:
    * 
    *  ProjectionType - One of the following:
    * 
    *  KEYS_ONLY - Only the index and primary keys are projected into the index.
    * 
    *  INCLUDE - Only the specified table attributes are projected into the index. The list of
    *  projected attributes is in NonKeyAttributes.
    * 
    *  ALL - All of the table attributes are projected into the index.
    * 
    *  NonKeyAttributes - A list of one or more non-key attribute names that are projected into the
    *  secondary index. The total count of attributes provided in NonKeyAttributes, summed across all
    *  of the secondary indexes, must not exceed 20. If you project the same attribute into two different indexes,
    *  this counts as two distinct attributes when determining the total.
    * 
    *  ProvisionedThroughput - The provisioned throughput settings for the global secondary index,
    *  consisting of read and write capacity units, along with data about increases and decreases.
    * 
    *  If the table is in the DELETING state, no information about indexes will be returned.
    */
  fun globalSecondaryIndexes(dslBlock: GlobalSecondaryIndexDescriptionCollectionDSL.() -> Unit) {
    builder.globalSecondaryIndexes(buildGlobalSecondaryIndexDescriptionCollection(dslBlock))
  }

}

/**
  * Builds instances of type TableDescription:
  * Represents the properties of a table.
  */
fun buildTableDescription(dslBlock: TableDescriptionDSL.() -> Unit) =
  TableDescriptionDSL().apply(dslBlock).build()