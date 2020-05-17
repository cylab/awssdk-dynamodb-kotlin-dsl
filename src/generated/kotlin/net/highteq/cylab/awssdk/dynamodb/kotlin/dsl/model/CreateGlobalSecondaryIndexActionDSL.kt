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
import software.amazon.awssdk.services.dynamodb.model.CreateGlobalSecondaryIndexAction
import software.amazon.awssdk.services.dynamodb.model.KeySchemaElement
import software.amazon.awssdk.services.dynamodb.model.Projection
import software.amazon.awssdk.services.dynamodb.model.ProvisionedThroughput

/**
  * Builds instances of type CreateGlobalSecondaryIndexAction:
  * Represents a new global secondary index to be added to an existing table.
  */
@DynamodbDSLMarker
inline class CreateGlobalSecondaryIndexActionDSL(
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder: CreateGlobalSecondaryIndexAction.Builder
){
  @PublishedApi
  internal fun build(): CreateGlobalSecondaryIndexAction = builder.build()

  /**
    * 
    */
  inline var indexName: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.indexName(value)
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
  inline var projection: Projection?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.projection(value)
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
  inline fun keySchema(dslBlock: KeySchemaElementCollectionDSL.() -> Unit) {
    builder.keySchema(DynamodbDSL.Companion.keySchemaElementCollection(dslBlock))
  }

  /**
    * 
    */
  inline fun projection(dslBlock: ProjectionDSL.() -> Unit) {
    builder.projection(DynamodbDSL.Companion.projection(dslBlock))
  }

  /**
    * 
    */
  inline fun provisionedThroughput(dslBlock: ProvisionedThroughputDSL.() -> Unit) {
    builder.provisionedThroughput(DynamodbDSL.Companion.provisionedThroughput(dslBlock))
  }

}

/**
  * Builds instances of type CreateGlobalSecondaryIndexAction:
  * Represents a new global secondary index to be added to an existing table.
  */
inline fun createGlobalSecondaryIndexAction(dslBlock: CreateGlobalSecondaryIndexActionDSL.() -> Unit) =
  CreateGlobalSecondaryIndexActionDSL(CreateGlobalSecondaryIndexAction.builder()).apply(dslBlock).build()

/**
  * Builds instances of type CreateGlobalSecondaryIndexAction:
  * Represents a new global secondary index to be added to an existing table.
  */
inline fun DynamodbDSL.Companion.createGlobalSecondaryIndexAction(dslBlock: CreateGlobalSecondaryIndexActionDSL.() -> Unit) =
  CreateGlobalSecondaryIndexActionDSL(CreateGlobalSecondaryIndexAction.builder()).apply(dslBlock).build()