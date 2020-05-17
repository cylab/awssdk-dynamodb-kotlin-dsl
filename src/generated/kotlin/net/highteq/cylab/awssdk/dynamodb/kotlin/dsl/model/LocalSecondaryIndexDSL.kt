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
import software.amazon.awssdk.services.dynamodb.model.KeySchemaElement
import software.amazon.awssdk.services.dynamodb.model.LocalSecondaryIndex
import software.amazon.awssdk.services.dynamodb.model.Projection

/**
  * Builds instances of type LocalSecondaryIndex:
  * Represents the properties of a local secondary index.
  */
@DynamodbDSLMarker
inline class LocalSecondaryIndexDSL(
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder: LocalSecondaryIndex.Builder
){
  @PublishedApi
  internal fun build(): LocalSecondaryIndex = builder.build()

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
    builder.keySchema(DynamodbDSL.Companion.keySchemaElementCollection(dslBlock))
  }

  /**
    * 
    */
  inline fun projection(dslBlock: ProjectionDSL.() -> Unit) {
    builder.projection(DynamodbDSL.Companion.projection(dslBlock))
  }

}

/**
  * Builds instances of type LocalSecondaryIndex:
  * Represents the properties of a local secondary index.
  */
inline fun localSecondaryIndex(dslBlock: LocalSecondaryIndexDSL.() -> Unit) =
  LocalSecondaryIndexDSL(LocalSecondaryIndex.builder()).apply(dslBlock).build()

/**
  * Builds instances of type LocalSecondaryIndex:
  * Represents the properties of a local secondary index.
  */
inline fun DynamodbDSL.Companion.localSecondaryIndex(dslBlock: LocalSecondaryIndexDSL.() -> Unit) =
  LocalSecondaryIndexDSL(LocalSecondaryIndex.builder()).apply(dslBlock).build()