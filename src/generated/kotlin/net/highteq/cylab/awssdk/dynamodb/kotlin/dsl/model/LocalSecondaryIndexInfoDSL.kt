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
import software.amazon.awssdk.services.dynamodb.model.KeySchemaElement
import software.amazon.awssdk.services.dynamodb.model.LocalSecondaryIndexInfo
import software.amazon.awssdk.services.dynamodb.model.Projection

/**
  * Builds instances of type LocalSecondaryIndexInfo:
  * Represents the properties of a local secondary index for the table when the backup was created.
  */
@DynamodbDSL
inline class LocalSecondaryIndexInfoDSL(
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder: LocalSecondaryIndexInfo.Builder
){
  @PublishedApi
  internal fun build(): LocalSecondaryIndexInfo = builder.build()

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
  inline fun keySchema(dslBlock: KeySchemaElementCollectionDSL.() -> Unit) {
    builder.keySchema(buildKeySchemaElementCollection(dslBlock))
  }

  /**
    * 
    */
  inline fun projection(dslBlock: ProjectionDSL.() -> Unit) {
    builder.projection(buildProjection(dslBlock))
  }

}

/**
  * Builds instances of type LocalSecondaryIndexInfo:
  * Represents the properties of a local secondary index for the table when the backup was created.
  */
inline fun buildLocalSecondaryIndexInfo(dslBlock: LocalSecondaryIndexInfoDSL.() -> Unit) =
  LocalSecondaryIndexInfoDSL(LocalSecondaryIndexInfo.builder()).apply(dslBlock).build()