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
import software.amazon.awssdk.awscore.AwsRequestOverrideConfiguration
import software.amazon.awssdk.services.dynamodb.model.AttributeDefinition
import software.amazon.awssdk.services.dynamodb.model.BillingMode
import software.amazon.awssdk.services.dynamodb.model.GlobalSecondaryIndexUpdate
import software.amazon.awssdk.services.dynamodb.model.ProvisionedThroughput
import software.amazon.awssdk.services.dynamodb.model.SSESpecification
import software.amazon.awssdk.services.dynamodb.model.StreamSpecification
import software.amazon.awssdk.services.dynamodb.model.UpdateTableRequest

/**
  * Builds instances of type UpdateTableRequest:
  * Represents the input of an UpdateTable operation.
  */
@DynamodbDSL
class UpdateTableRequestDSL {
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  internal val builder = UpdateTableRequest.builder()
  internal fun build(): UpdateTableRequest = builder.build()
    
  /**
    * An array of one or more global secondary indexes for the table. For each index in the array, you can request
    *  one action:
    * 
    *  Create - add a new global secondary index to the table.
    * 
    *  Update - modify the provisioned throughput settings of an existing global secondary index.
    * 
    *  Delete - remove a global secondary index from the table.
    * 
    *  You can create or delete only one global secondary index per UpdateTable operation.
    * 
    *  For more information, see Managing Global
    *  Secondary Indexes in the Amazon DynamoDB Developer Guide.
    */
  var globalSecondaryIndexUpdates: Collection<GlobalSecondaryIndexUpdate>
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.globalSecondaryIndexUpdates(value)
    }


  /**
    * 
    */
  var overrideConfiguration: AwsRequestOverrideConfiguration
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.overrideConfiguration(value)
    }


  /**
    * The name of the table to be updated.
    */
  var tableName: String
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.tableName(value)
    }


  /**
    * The new provisioned throughput settings for the specified table or index.
    */
  var provisionedThroughput: ProvisionedThroughput
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.provisionedThroughput(value)
    }


  /**
    * The new server-side encryption settings for the specified table.
    */
  var sseSpecification: SSESpecification
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.sseSpecification(value)
    }


  /**
    * An array of attributes that describe the key schema for the table and indexes. If you are adding a new global
    *  secondary index to the table, AttributeDefinitions must include the key element(s) of the new
    *  index.
    */
  var attributeDefinitions: Collection<AttributeDefinition>
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.attributeDefinitions(value)
    }


  /**
    * Represents the DynamoDB Streams configuration for the table.
    * 
    *  You receive a ResourceInUseException if you try to enable a stream on a table that already has a
    *  stream, or if you try to disable a stream on a table that doesn't have a stream.
    */
  var streamSpecification: StreamSpecification
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.streamSpecification(value)
    }


  /**
    * Controls how you are charged for read and write throughput and how you manage capacity. When switching from
    *  pay-per-request to provisioned capacity, initial provisioned capacity values must be set. The initial
    *  provisioned capacity values are estimated based on the consumed read and write capacity of your table and
    *  global secondary indexes over the past 30 minutes.
    * 
    *  PROVISIONED - We recommend using PROVISIONED for predictable workloads.
    *  PROVISIONED sets the billing mode to Provisioned Mode.
    * 
    *  PAY_PER_REQUEST - We recommend using PAY_PER_REQUEST for unpredictable workloads.
    *  PAY_PER_REQUEST sets the billing mode to On-Demand Mode.
    */
  var billingMode: BillingMode
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.billingMode(value)
    }

    
  /**
    * Controls how you are charged for read and write throughput and how you manage capacity. When switching from
    *  pay-per-request to provisioned capacity, initial provisioned capacity values must be set. The initial
    *  provisioned capacity values are estimated based on the consumed read and write capacity of your table and
    *  global secondary indexes over the past 30 minutes.
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
    * The new provisioned throughput settings for the specified table or index.
    */
  fun provisionedThroughput(dslBlock: ProvisionedThroughputDSL.() -> Unit) {
    builder.provisionedThroughput(buildProvisionedThroughput(dslBlock))
  }


  /**
    * The new server-side encryption settings for the specified table.
    */
  fun sseSpecification(dslBlock: SSESpecificationDSL.() -> Unit) {
    builder.sseSpecification(buildSSESpecification(dslBlock))
  }


  /**
    * Represents the DynamoDB Streams configuration for the table.
    * 
    *  You receive a ResourceInUseException if you try to enable a stream on a table that already has a
    *  stream, or if you try to disable a stream on a table that doesn't have a stream.
    */
  fun streamSpecification(dslBlock: StreamSpecificationDSL.() -> Unit) {
    builder.streamSpecification(buildStreamSpecification(dslBlock))
  }


  /**
    * An array of one or more global secondary indexes for the table. For each index in the array, you can request
    *  one action:
    * 
    *  Create - add a new global secondary index to the table.
    * 
    *  Update - modify the provisioned throughput settings of an existing global secondary index.
    * 
    *  Delete - remove a global secondary index from the table.
    * 
    *  You can create or delete only one global secondary index per UpdateTable operation.
    * 
    *  For more information, see Managing Global
    *  Secondary Indexes in the Amazon DynamoDB Developer Guide.
    */
  fun globalSecondaryIndexUpdates(dslBlock: GlobalSecondaryIndexUpdateCollectionDSL.() -> Unit) {
    builder.globalSecondaryIndexUpdates(buildGlobalSecondaryIndexUpdateCollection(dslBlock))
  }


  /**
    * An array of attributes that describe the key schema for the table and indexes. If you are adding a new global
    *  secondary index to the table, AttributeDefinitions must include the key element(s) of the new
    *  index.
    */
  fun attributeDefinitions(dslBlock: AttributeDefinitionCollectionDSL.() -> Unit) {
    builder.attributeDefinitions(buildAttributeDefinitionCollection(dslBlock))
  }

}

/**
  * Builds instances of type UpdateTableRequest:
  * Represents the input of an UpdateTable operation.
  */
fun buildUpdateTableRequest(dslBlock: UpdateTableRequestDSL.() -> Unit) =
  UpdateTableRequestDSL().apply(dslBlock).build()