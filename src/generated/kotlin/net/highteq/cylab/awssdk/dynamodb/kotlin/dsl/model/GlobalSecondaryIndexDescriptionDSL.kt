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
inline class GlobalSecondaryIndexDescriptionDSL(
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder: GlobalSecondaryIndexDescription.Builder
){
  @PublishedApi
  internal fun build(): GlobalSecondaryIndexDescription = builder.build()

  /**
    * 
    */
  inline var backfilling: Boolean?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.backfilling(value)
    }

  /**
    * 
    */
  inline var indexArn: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.indexArn(value)
    }

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
  inline var indexSizeBytes: Long?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.indexSizeBytes(value)
    }

  /**
    * 
    */
  inline var indexStatus: IndexStatus?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.indexStatus(value)
    }

  /**
    * 
    */
  inline var itemCount: Long?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.itemCount(value)
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
  inline var provisionedThroughput: ProvisionedThroughputDescription?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.provisionedThroughput(value)
    }

  /**
    * 
    */
  inline fun indexStatus(value: String?) {
    builder.indexStatus(value)
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
  inline fun projection(dslBlock: ProjectionDSL.() -> Unit) {
    builder.projection(buildProjection(dslBlock))
  }

  /**
    * 
    */
  inline fun provisionedThroughput(dslBlock: ProvisionedThroughputDescriptionDSL.() -> Unit) {
    builder.provisionedThroughput(buildProvisionedThroughputDescription(dslBlock))
  }

}

/**
  * Builds instances of type GlobalSecondaryIndexDescription:
  * Represents the properties of a global secondary index.
  */
inline fun buildGlobalSecondaryIndexDescription(dslBlock: GlobalSecondaryIndexDescriptionDSL.() -> Unit) =
  GlobalSecondaryIndexDescriptionDSL(GlobalSecondaryIndexDescription.builder()).apply(dslBlock).build()