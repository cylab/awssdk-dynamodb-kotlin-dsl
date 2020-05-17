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
import java.time.Instant
import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSL
import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSLMarker
import software.amazon.awssdk.services.dynamodb.model.KeySchemaElement
import software.amazon.awssdk.services.dynamodb.model.Shard
import software.amazon.awssdk.services.dynamodb.model.StreamDescription
import software.amazon.awssdk.services.dynamodb.model.StreamStatus
import software.amazon.awssdk.services.dynamodb.model.StreamViewType

/**
  * Builds instances of type StreamDescription:
  * Represents all of the data describing a particular stream.
  */
@DynamodbDSLMarker
inline class StreamDescriptionDSL(
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder: StreamDescription.Builder
){
  @PublishedApi
  internal fun build(): StreamDescription = builder.build()

  /**
    * 
    */
  inline var creationRequestDateTime: Instant?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.creationRequestDateTime(value)
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
  inline var lastEvaluatedShardId: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.lastEvaluatedShardId(value)
    }

  /**
    * 
    */
  inline var shards: Collection<Shard>?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.shards(value)
    }

  /**
    * 
    */
  inline var streamArn: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.streamArn(value)
    }

  /**
    * 
    */
  inline var streamLabel: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.streamLabel(value)
    }

  /**
    * 
    */
  inline var streamStatus: StreamStatus?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.streamStatus(value)
    }

  /**
    * 
    */
  inline var streamViewType: StreamViewType?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.streamViewType(value)
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
  inline fun streamStatus(value: String?) {
    builder.streamStatus(value)
  }

  /**
    * 
    */
  inline fun streamViewType(value: String?) {
    builder.streamViewType(value)
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
  inline fun shards(dslBlock: ShardCollectionDSL.() -> Unit) {
    builder.shards(DynamodbDSL.Companion.shardCollection(dslBlock))
  }

}

/**
  * Builds instances of type StreamDescription:
  * Represents all of the data describing a particular stream.
  */
inline fun streamDescription(dslBlock: StreamDescriptionDSL.() -> Unit) =
  StreamDescriptionDSL(StreamDescription.builder()).apply(dslBlock).build()

/**
  * Builds instances of type StreamDescription:
  * Represents all of the data describing a particular stream.
  */
inline fun DynamodbDSL.Companion.streamDescription(dslBlock: StreamDescriptionDSL.() -> Unit) =
  StreamDescriptionDSL(StreamDescription.builder()).apply(dslBlock).build()