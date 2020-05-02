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
    builder.attributeDefinitions(buildAttributeDefinitionCollection(dslBlock))
  }

  /**
    * 
    */
  inline fun globalSecondaryIndexUpdates(dslBlock: GlobalSecondaryIndexUpdateCollectionDSL.() -> Unit) {
    builder.globalSecondaryIndexUpdates(buildGlobalSecondaryIndexUpdateCollection(dslBlock))
  }

  /**
    * 
    */
  inline fun provisionedThroughput(dslBlock: ProvisionedThroughputDSL.() -> Unit) {
    builder.provisionedThroughput(buildProvisionedThroughput(dslBlock))
  }

  /**
    * 
    */
  inline fun sseSpecification(dslBlock: SSESpecificationDSL.() -> Unit) {
    builder.sseSpecification(buildSSESpecification(dslBlock))
  }

  /**
    * 
    */
  inline fun streamSpecification(dslBlock: StreamSpecificationDSL.() -> Unit) {
    builder.streamSpecification(buildStreamSpecification(dslBlock))
  }

}

/**
  * Builds instances of type UpdateTableRequest:
  * Represents the input of an UpdateTable operation.
  */
inline fun buildUpdateTableRequest(dslBlock: UpdateTableRequestDSL.() -> Unit) =
  UpdateTableRequestDSL(UpdateTableRequest.builder()).apply(dslBlock).build()