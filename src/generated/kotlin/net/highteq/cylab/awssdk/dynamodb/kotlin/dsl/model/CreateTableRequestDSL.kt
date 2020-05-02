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
inline class CreateTableRequestDSL(
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder: CreateTableRequest.Builder
){
  @PublishedApi
  internal fun build(): CreateTableRequest = builder.build()
    
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
  inline var globalSecondaryIndexes: Collection<GlobalSecondaryIndex>?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.globalSecondaryIndexes(value)
    }


  /**
    * 
    */
  inline var keySchema: Collection<KeySchemaElement>?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.keySchema(value)
    }


  /**
    * 
    */
  inline var localSecondaryIndexes: Collection<LocalSecondaryIndex>?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.localSecondaryIndexes(value)
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
  inline var tags: Collection<Tag>?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.tags(value)
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
  inline fun globalSecondaryIndexes(dslBlock: GlobalSecondaryIndexCollectionDSL.() -> Unit) {
    builder.globalSecondaryIndexes(buildGlobalSecondaryIndexCollection(dslBlock))
  }


  /**
    * 
    */
  inline fun keySchema(dslBlock: KeySchemaElementCollectionDSL.() -> Unit) {
    builder.keySchema(buildKeySchemaElementCollection(dslBlock))
  }


  /**
    * 
    */
  inline fun localSecondaryIndexes(dslBlock: LocalSecondaryIndexCollectionDSL.() -> Unit) {
    builder.localSecondaryIndexes(buildLocalSecondaryIndexCollection(dslBlock))
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


  /**
    * 
    */
  inline fun tags(dslBlock: TagCollectionDSL.() -> Unit) {
    builder.tags(buildTagCollection(dslBlock))
  }

}

/**
  * Builds instances of type CreateTableRequest:
  * Represents the input of a CreateTable operation.
  */
inline fun buildCreateTableRequest(dslBlock: CreateTableRequestDSL.() -> Unit) =
  CreateTableRequestDSL(CreateTableRequest.builder()).apply(dslBlock).build()