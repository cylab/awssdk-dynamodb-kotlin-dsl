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
import software.amazon.awssdk.services.dynamodb.model.GlobalSecondaryIndexInfo
import software.amazon.awssdk.services.dynamodb.model.LocalSecondaryIndexInfo
import software.amazon.awssdk.services.dynamodb.model.SSEDescription
import software.amazon.awssdk.services.dynamodb.model.SourceTableFeatureDetails
import software.amazon.awssdk.services.dynamodb.model.StreamSpecification
import software.amazon.awssdk.services.dynamodb.model.TimeToLiveDescription

/**
  * Builds instances of type SourceTableFeatureDetails:
  * Contains the details of the features enabled on the table when the backup was created. For example, LSIs, GSIs,
  *  streams, TTL.
  */
@DynamodbDSLMarker
inline class SourceTableFeatureDetailsDSL(
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder: SourceTableFeatureDetails.Builder
){
  @PublishedApi
  internal fun build(): SourceTableFeatureDetails = builder.build()

  /**
    * 
    */
  inline var globalSecondaryIndexes: Collection<GlobalSecondaryIndexInfo>?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.globalSecondaryIndexes(value)
    }

  /**
    * 
    */
  inline var localSecondaryIndexes: Collection<LocalSecondaryIndexInfo>?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.localSecondaryIndexes(value)
    }

  /**
    * 
    */
  inline var sseDescription: SSEDescription?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.sseDescription(value)
    }

  /**
    * 
    */
  inline var streamDescription: StreamSpecification?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.streamDescription(value)
    }

  /**
    * 
    */
  inline var timeToLiveDescription: TimeToLiveDescription?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.timeToLiveDescription(value)
    }

  /**
    * 
    */
  inline fun globalSecondaryIndexes(dslBlock: GlobalSecondaryIndexInfoCollectionDSL.() -> Unit) {
    builder.globalSecondaryIndexes(DynamodbDSL.Companion.globalSecondaryIndexInfoCollection(dslBlock))
  }

  /**
    * 
    */
  inline fun localSecondaryIndexes(dslBlock: LocalSecondaryIndexInfoCollectionDSL.() -> Unit) {
    builder.localSecondaryIndexes(DynamodbDSL.Companion.localSecondaryIndexInfoCollection(dslBlock))
  }

  /**
    * 
    */
  inline fun sseDescription(dslBlock: SSEDescriptionDSL.() -> Unit) {
    builder.sseDescription(DynamodbDSL.Companion.sseDescription(dslBlock))
  }

  /**
    * 
    */
  inline fun streamDescription(dslBlock: StreamSpecificationDSL.() -> Unit) {
    builder.streamDescription(DynamodbDSL.Companion.streamSpecification(dslBlock))
  }

  /**
    * 
    */
  inline fun timeToLiveDescription(dslBlock: TimeToLiveDescriptionDSL.() -> Unit) {
    builder.timeToLiveDescription(DynamodbDSL.Companion.timeToLiveDescription(dslBlock))
  }

}

/**
  * Builds instances of type SourceTableFeatureDetails:
  * Contains the details of the features enabled on the table when the backup was created. For example, LSIs, GSIs,
  *  streams, TTL.
  */
inline fun sourceTableFeatureDetails(dslBlock: SourceTableFeatureDetailsDSL.() -> Unit) =
  SourceTableFeatureDetailsDSL(SourceTableFeatureDetails.builder()).apply(dslBlock).build()

/**
  * Builds instances of type SourceTableFeatureDetails:
  * Contains the details of the features enabled on the table when the backup was created. For example, LSIs, GSIs,
  *  streams, TTL.
  */
inline fun DynamodbDSL.Companion.sourceTableFeatureDetails(dslBlock: SourceTableFeatureDetailsDSL.() -> Unit) =
  SourceTableFeatureDetailsDSL(SourceTableFeatureDetails.builder()).apply(dslBlock).build()