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
import software.amazon.awssdk.awscore.AwsRequestOverrideConfiguration
import software.amazon.awssdk.services.dynamodb.DynamoDbAsyncClient
import software.amazon.awssdk.services.dynamodb.DynamoDbClient
import software.amazon.awssdk.services.dynamodb.model.AttributeDefinition
import software.amazon.awssdk.services.dynamodb.model.BillingMode
import software.amazon.awssdk.services.dynamodb.model.GlobalSecondaryIndexUpdate
import software.amazon.awssdk.services.dynamodb.model.ProvisionedThroughput
import software.amazon.awssdk.services.dynamodb.model.SSESpecification
import software.amazon.awssdk.services.dynamodb.model.StreamSpecification
import software.amazon.awssdk.services.dynamodb.model.UpdateTableRequest
import software.amazon.awssdk.services.dynamodb.transform.UpdateTableRequestMarshaller

/**
  * Builds instances of type UpdateTableRequest:
  * Represents the input of an UpdateTable operation.
  */
@DynamodbDSLMarker
inline class UpdateTableRequestDSL(
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder: UpdateTableRequest.Builder
){
  @PublishedApi
  internal fun build(): UpdateTableRequest = builder.build()

  /**
    * 
    */
  inline var attributeDefinitions: Collection<AttributeDefinition>?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.attributeDefinitions(value)
    }

  /**
    * 
    */
  inline var billingMode: BillingMode?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.billingMode(value)
    }

  /**
    * 
    */
  inline var globalSecondaryIndexUpdates: Collection<GlobalSecondaryIndexUpdate>?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.globalSecondaryIndexUpdates(value)
    }

  /**
    * 
    */
  inline var overrideConfiguration: AwsRequestOverrideConfiguration?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.overrideConfiguration(value)
    }

  /**
    * 
    */
  inline var provisionedThroughput: ProvisionedThroughput?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.provisionedThroughput(value)
    }

  /**
    * 
    */
  inline var sseSpecification: SSESpecification?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.sseSpecification(value)
    }

  /**
    * 
    */
  inline var streamSpecification: StreamSpecification?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.streamSpecification(value)
    }

  /**
    * 
    */
  inline var tableName: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.tableName(value)
    }

  /**
    * 
    */
  inline fun billingMode(value: String?) {
    builder.billingMode(value)
  }

  /**
    * 
    */
  inline fun attributeDefinitions(dslBlock: AttributeDefinitionCollectionDSL.() -> Unit) {
    builder.attributeDefinitions(DynamodbDSL.Companion.attributeDefinitionCollection(dslBlock))
  }

  /**
    * 
    */
  inline fun globalSecondaryIndexUpdates(dslBlock: GlobalSecondaryIndexUpdateCollectionDSL.() -> Unit) {
    builder.globalSecondaryIndexUpdates(DynamodbDSL.Companion.globalSecondaryIndexUpdateCollection(dslBlock))
  }

  /**
    * 
    */
  inline fun provisionedThroughput(dslBlock: ProvisionedThroughputDSL.() -> Unit) {
    builder.provisionedThroughput(DynamodbDSL.Companion.provisionedThroughput(dslBlock))
  }

  /**
    * 
    */
  inline fun sseSpecification(dslBlock: SSESpecificationDSL.() -> Unit) {
    builder.sseSpecification(DynamodbDSL.Companion.sseSpecification(dslBlock))
  }

  /**
    * 
    */
  inline fun streamSpecification(dslBlock: StreamSpecificationDSL.() -> Unit) {
    builder.streamSpecification(DynamodbDSL.Companion.streamSpecification(dslBlock))
  }

}

/**
  * Builds instances of type UpdateTableRequest:
  * Represents the input of an UpdateTable operation.
  */
inline fun updateTableRequest(dslBlock: UpdateTableRequestDSL.() -> Unit) =
  UpdateTableRequestDSL(UpdateTableRequest.builder()).apply(dslBlock).build()

/**
  * Builds instances of type UpdateTableRequest:
  * Represents the input of an UpdateTable operation.
  */
inline fun DynamodbDSL.Companion.updateTableRequest(dslBlock: UpdateTableRequestDSL.() -> Unit) =
  UpdateTableRequestDSL(UpdateTableRequest.builder()).apply(dslBlock).build()

/**
  * Modifies the provisioned throughput settings, global secondary indexes, or DynamoDB Streams settings for a given
  *  table.
  * 
  *  You can only perform one of the following operations at once:
  * 
  *  Modify the provisioned throughput settings of the table.
  * 
  *  Enable or disable Streams on the table.
  * 
  *  Remove a global secondary index from the table.
  * 
  *  Create a new global secondary index on the table. Once the index begins backfilling, you can use
  *  UpdateTable to perform other operations.
  * 
  *  UpdateTable is an asynchronous operation; while it is executing, the table status changes from
  *  ACTIVE to UPDATING. While it is UPDATING, you cannot issue another
  *  UpdateTable request. When the table returns to the ACTIVE state, the
  *  UpdateTable operation is complete.
  */
inline fun DynamoDbAsyncClient.updateTableBy(dslBlock: UpdateTableRequestDSL.() -> Unit) =
  this.updateTable(DynamodbDSL.Companion.updateTableRequest(dslBlock))

/**
  * Modifies the provisioned throughput settings, global secondary indexes, or DynamoDB Streams settings for a given
  *  table.
  * 
  *  You can only perform one of the following operations at once:
  * 
  *  Modify the provisioned throughput settings of the table.
  * 
  *  Enable or disable Streams on the table.
  * 
  *  Remove a global secondary index from the table.
  * 
  *  Create a new global secondary index on the table. Once the index begins backfilling, you can use
  *  UpdateTable to perform other operations.
  * 
  *  UpdateTable is an asynchronous operation; while it is executing, the table status changes from
  *  ACTIVE to UPDATING. While it is UPDATING, you cannot issue another
  *  UpdateTable request. When the table returns to the ACTIVE state, the
  *  UpdateTable operation is complete.
  */
inline fun DynamoDbClient.updateTableBy(dslBlock: UpdateTableRequestDSL.() -> Unit) =
  this.updateTable(DynamodbDSL.Companion.updateTableRequest(dslBlock))

/**
  * 
  */
inline fun UpdateTableRequestMarshaller.marshallBy(dslBlock: UpdateTableRequestDSL.() -> Unit) =
  this.marshall(DynamodbDSL.Companion.updateTableRequest(dslBlock))