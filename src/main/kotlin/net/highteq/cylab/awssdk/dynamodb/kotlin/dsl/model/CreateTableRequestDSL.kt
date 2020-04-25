/*
  This file was generated from https://github.com/aws/aws-sdk-java-v2 by https://github.com/cylab/aws-kotlin-dsl-builder
  Like the original code, this file and project is licensed under
  Apache License Version 2.0
  See LICENSE.txt for more info
*/
package net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.model

import kotlin.DeprecationLevel.HIDDEN
import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSL
import software.amazon.awssdk.awscore.AwsRequestOverrideConfiguration
import software.amazon.awssdk.services.dynamodb.model.AttributeDefinition
import software.amazon.awssdk.services.dynamodb.model.BillingMode
import software.amazon.awssdk.services.dynamodb.model.CreateTableRequest
import software.amazon.awssdk.services.dynamodb.model.GlobalSecondaryIndex
import software.amazon.awssdk.services.dynamodb.model.KeySchemaElement
import software.amazon.awssdk.services.dynamodb.model.LocalSecondaryIndex
import software.amazon.awssdk.services.dynamodb.model.ProvisionedThroughput
import software.amazon.awssdk.services.dynamodb.model.SSESpecification
import software.amazon.awssdk.services.dynamodb.model.StreamSpecification
import software.amazon.awssdk.services.dynamodb.model.Tag

/**
  * Builds instances of type CreateTableRequest:
  * Represents the input of a CreateTable operation.
  */
@DynamodbDSL
class CreateTableRequestDSL {
  private val builder = CreateTableRequest.builder()
  internal fun build(): CreateTableRequest = builder.build()
    
  /**
    * A list of key-value pairs to label the table. For more information, see Tagging for
    *  DynamoDB.
    */
  @get:JvmSynthetic // Hide from Java callers
  var tags: Collection<Tag>
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.tags(value)
    }


  /**
    * Represents the settings used to enable server-side encryption.
    */
  @get:JvmSynthetic // Hide from Java callers
  var sseSpecification: SSESpecification
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.sseSpecification(value)
    }


  /**
    * 
    */
  @get:JvmSynthetic // Hide from Java callers
  var overrideConfiguration: AwsRequestOverrideConfiguration
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.overrideConfiguration(value)
    }


  /**
    * The name of the table to create.
    */
  @get:JvmSynthetic // Hide from Java callers
  var tableName: String
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.tableName(value)
    }


  /**
    * Specifies the attributes that make up the primary key for a table or an index. The attributes in
    *  KeySchema must also be defined in the AttributeDefinitions array. For more
    *  information, see Data Model in the
    *  Amazon DynamoDB Developer Guide.
    * 
    *  Each KeySchemaElement in the array is composed of:
    * 
    *  AttributeName - The name of this key attribute.
    * 
    *  KeyType - The role that the key attribute will assume:
    * 
    *  HASH - partition key
    * 
    *  RANGE - sort key
    * 
    *  The partition key of an item is also known as its hash attribute. The term "hash attribute" derives
    *  from the DynamoDB usage of an internal hash function to evenly distribute data items across partitions, based
    *  on their partition key values.
    * 
    *  The sort key of an item is also known as its range attribute. The term "range attribute" derives from
    *  the way DynamoDB stores items with the same partition key physically close together, in sorted order by the
    *  sort key value.
    * 
    *  For a simple primary key (partition key), you must provide exactly one element with a KeyType of
    *  HASH.
    * 
    *  For a composite primary key (partition key and sort key), you must provide exactly two elements, in this
    *  order: The first element must have a KeyType of HASH, and the second element must
    *  have a KeyType of RANGE.
    * 
    *  For more information, see Working with Tables in the Amazon DynamoDB Developer Guide.
    */
  @get:JvmSynthetic // Hide from Java callers
  var keySchema: Collection<KeySchemaElement>
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.keySchema(value)
    }


  /**
    * Represents the provisioned throughput settings for a specified table or index. The settings can be modified
    *  using the UpdateTable operation.
    * 
    *  If you set BillingMode as PROVISIONED, you must specify this property. If you set BillingMode as
    *  PAY_PER_REQUEST, you cannot specify this property.
    * 
    *  For current minimum and maximum provisioned throughput values, see Limits in the
    *  Amazon DynamoDB Developer Guide.
    */
  @get:JvmSynthetic // Hide from Java callers
  var provisionedThroughput: ProvisionedThroughput
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.provisionedThroughput(value)
    }


  /**
    * An array of attributes that describe the key schema for the table and indexes.
    */
  @get:JvmSynthetic // Hide from Java callers
  var attributeDefinitions: Collection<AttributeDefinition>
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.attributeDefinitions(value)
    }


  /**
    * One or more local secondary indexes (the maximum is 5) to be created on the table. Each index is scoped to a
    *  given partition key value. There is a 10 GB size limit per partition key value; otherwise, the size of a
    *  local secondary index is unconstrained.
    * 
    *  Each local secondary index in the array includes the following:
    * 
    *  IndexName - The name of the local secondary index. Must be unique only for this table.
    * 
    *  KeySchema - Specifies the key schema for the local secondary index. The key schema must begin
    *  with the same partition key as the table.
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
    *  of the secondary indexes, must not exceed 100. If you project the same attribute into two different indexes,
    *  this counts as two distinct attributes when determining the total.
    */
  @get:JvmSynthetic // Hide from Java callers
  var localSecondaryIndexes: Collection<LocalSecondaryIndex>
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.localSecondaryIndexes(value)
    }


  /**
    * One or more global secondary indexes (the maximum is 20) to be created on the table. Each global secondary
    *  index in the array includes the following:
    * 
    *  IndexName - The name of the global secondary index. Must be unique only for this table.
    * 
    *  KeySchema - Specifies the key schema for the global secondary index.
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
    *  of the secondary indexes, must not exceed 100. If you project the same attribute into two different indexes,
    *  this counts as two distinct attributes when determining the total.
    * 
    *  ProvisionedThroughput - The provisioned throughput settings for the global secondary index,
    *  consisting of read and write capacity units.
    */
  @get:JvmSynthetic // Hide from Java callers
  var globalSecondaryIndexes: Collection<GlobalSecondaryIndex>
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.globalSecondaryIndexes(value)
    }


  /**
    * The settings for DynamoDB Streams on the table. These settings consist of:
    * 
    *  StreamEnabled - Indicates whether DynamoDB Streams is to be enabled (true) or disabled (false).
    * 
    *  StreamViewType - When an item in the table is modified, StreamViewType determines
    *  what information is written to the table's stream. Valid values for StreamViewType are:
    * 
    *  KEYS_ONLY - Only the key attributes of the modified item are written to the stream.
    * 
    *  NEW_IMAGE - The entire item, as it appears after it was modified, is written to the stream.
    * 
    *  OLD_IMAGE - The entire item, as it appeared before it was modified, is written to the stream.
    * 
    *  NEW_AND_OLD_IMAGES - Both the new and the old item images of the item are written to the stream.
    */
  @get:JvmSynthetic // Hide from Java callers
  var streamSpecification: StreamSpecification
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.streamSpecification(value)
    }


  /**
    * Controls how you are charged for read and write throughput and how you manage capacity. This setting can be
    *  changed later.
    * 
    *  PROVISIONED - We recommend using PROVISIONED for predictable workloads.
    *  PROVISIONED sets the billing mode to Provisioned Mode.
    * 
    *  PAY_PER_REQUEST - We recommend using PAY_PER_REQUEST for unpredictable workloads.
    *  PAY_PER_REQUEST sets the billing mode to On-Demand Mode.
    */
  @get:JvmSynthetic // Hide from Java callers
  var billingMode: BillingMode
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.billingMode(value)
    }

    
  /**
    * Controls how you are charged for read and write throughput and how you manage capacity. This setting can be
    *  changed later.
    * 
    *  PROVISIONED - We recommend using PROVISIONED for predictable workloads.
    *  PROVISIONED sets the billing mode to Provisioned Mode.
    * 
    *  PAY_PER_REQUEST - We recommend using PAY_PER_REQUEST for unpredictable workloads.
    *  PAY_PER_REQUEST sets the billing mode to On-Demand Mode.
    */
  fun billingMode(value: String) {
    builder.billingMode(value)
  }

    
  /**
    * Represents the settings used to enable server-side encryption.
    */
  fun sseSpecification(dslBlock: SSESpecificationDSL.() -> Unit) {
    builder.sseSpecification(buildSSESpecification(dslBlock))
  }


  /**
    * Represents the provisioned throughput settings for a specified table or index. The settings can be modified
    *  using the UpdateTable operation.
    * 
    *  If you set BillingMode as PROVISIONED, you must specify this property. If you set BillingMode as
    *  PAY_PER_REQUEST, you cannot specify this property.
    * 
    *  For current minimum and maximum provisioned throughput values, see Limits in the
    *  Amazon DynamoDB Developer Guide.
    */
  fun provisionedThroughput(dslBlock: ProvisionedThroughputDSL.() -> Unit) {
    builder.provisionedThroughput(buildProvisionedThroughput(dslBlock))
  }


  /**
    * The settings for DynamoDB Streams on the table. These settings consist of:
    * 
    *  StreamEnabled - Indicates whether DynamoDB Streams is to be enabled (true) or disabled (false).
    * 
    *  StreamViewType - When an item in the table is modified, StreamViewType determines
    *  what information is written to the table's stream. Valid values for StreamViewType are:
    * 
    *  KEYS_ONLY - Only the key attributes of the modified item are written to the stream.
    * 
    *  NEW_IMAGE - The entire item, as it appears after it was modified, is written to the stream.
    * 
    *  OLD_IMAGE - The entire item, as it appeared before it was modified, is written to the stream.
    * 
    *  NEW_AND_OLD_IMAGES - Both the new and the old item images of the item are written to the stream.
    */
  fun streamSpecification(dslBlock: StreamSpecificationDSL.() -> Unit) {
    builder.streamSpecification(buildStreamSpecification(dslBlock))
  }


  /**
    * A list of key-value pairs to label the table. For more information, see Tagging for
    *  DynamoDB.
    */
  fun tags(dslBlock: TagCollectionDSL.() -> Unit) {
    builder.tags(buildTagCollection(dslBlock))
  }


  /**
    * Specifies the attributes that make up the primary key for a table or an index. The attributes in
    *  KeySchema must also be defined in the AttributeDefinitions array. For more
    *  information, see Data Model in the
    *  Amazon DynamoDB Developer Guide.
    * 
    *  Each KeySchemaElement in the array is composed of:
    * 
    *  AttributeName - The name of this key attribute.
    * 
    *  KeyType - The role that the key attribute will assume:
    * 
    *  HASH - partition key
    * 
    *  RANGE - sort key
    * 
    *  The partition key of an item is also known as its hash attribute. The term "hash attribute" derives
    *  from the DynamoDB usage of an internal hash function to evenly distribute data items across partitions, based
    *  on their partition key values.
    * 
    *  The sort key of an item is also known as its range attribute. The term "range attribute" derives from
    *  the way DynamoDB stores items with the same partition key physically close together, in sorted order by the
    *  sort key value.
    * 
    *  For a simple primary key (partition key), you must provide exactly one element with a KeyType of
    *  HASH.
    * 
    *  For a composite primary key (partition key and sort key), you must provide exactly two elements, in this
    *  order: The first element must have a KeyType of HASH, and the second element must
    *  have a KeyType of RANGE.
    * 
    *  For more information, see Working with Tables in the Amazon DynamoDB Developer Guide.
    */
  fun keySchema(dslBlock: KeySchemaElementCollectionDSL.() -> Unit) {
    builder.keySchema(buildKeySchemaElementCollection(dslBlock))
  }


  /**
    * An array of attributes that describe the key schema for the table and indexes.
    */
  fun attributeDefinitions(dslBlock: AttributeDefinitionCollectionDSL.() -> Unit) {
    builder.attributeDefinitions(buildAttributeDefinitionCollection(dslBlock))
  }


  /**
    * One or more local secondary indexes (the maximum is 5) to be created on the table. Each index is scoped to a
    *  given partition key value. There is a 10 GB size limit per partition key value; otherwise, the size of a
    *  local secondary index is unconstrained.
    * 
    *  Each local secondary index in the array includes the following:
    * 
    *  IndexName - The name of the local secondary index. Must be unique only for this table.
    * 
    *  KeySchema - Specifies the key schema for the local secondary index. The key schema must begin
    *  with the same partition key as the table.
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
    *  of the secondary indexes, must not exceed 100. If you project the same attribute into two different indexes,
    *  this counts as two distinct attributes when determining the total.
    */
  fun localSecondaryIndexes(dslBlock: LocalSecondaryIndexCollectionDSL.() -> Unit) {
    builder.localSecondaryIndexes(buildLocalSecondaryIndexCollection(dslBlock))
  }


  /**
    * One or more global secondary indexes (the maximum is 20) to be created on the table. Each global secondary
    *  index in the array includes the following:
    * 
    *  IndexName - The name of the global secondary index. Must be unique only for this table.
    * 
    *  KeySchema - Specifies the key schema for the global secondary index.
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
    *  of the secondary indexes, must not exceed 100. If you project the same attribute into two different indexes,
    *  this counts as two distinct attributes when determining the total.
    * 
    *  ProvisionedThroughput - The provisioned throughput settings for the global secondary index,
    *  consisting of read and write capacity units.
    */
  fun globalSecondaryIndexes(dslBlock: GlobalSecondaryIndexCollectionDSL.() -> Unit) {
    builder.globalSecondaryIndexes(buildGlobalSecondaryIndexCollection(dslBlock))
  }

}

/**
  * Builds instances of type CreateTableRequest:
  * Represents the input of a CreateTable operation.
  */
fun buildCreateTableRequest(dslBlock: CreateTableRequestDSL.() -> Unit) =
  CreateTableRequestDSL().apply(dslBlock).build()