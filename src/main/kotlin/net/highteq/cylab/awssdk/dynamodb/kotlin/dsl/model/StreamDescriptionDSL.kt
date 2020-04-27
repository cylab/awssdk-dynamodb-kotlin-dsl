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
import java.time.Instant
import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSL
import software.amazon.awssdk.services.dynamodb.model.KeySchemaElement
import software.amazon.awssdk.services.dynamodb.model.Shard
import software.amazon.awssdk.services.dynamodb.model.StreamDescription
import software.amazon.awssdk.services.dynamodb.model.StreamStatus
import software.amazon.awssdk.services.dynamodb.model.StreamViewType

/**
  * Builds instances of type StreamDescription:
  * Represents all of the data describing a particular stream.
  */
@DynamodbDSL
class StreamDescriptionDSL {
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder = StreamDescription.builder()
  internal fun build(): StreamDescription = builder.build()
    
  /**
    * A timestamp, in ISO 8601 format, for this stream.
    * 
    *  Note that LatestStreamLabel is not a unique identifier for the stream, because it is possible
    *  that a stream from another table might have the same timestamp. However, the combination of the following
    *  three elements is guaranteed to be unique:
    * 
    *  the AWS customer ID.
    * 
    *  the table name
    * 
    *  the StreamLabel
    */
  var streamLabel: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.streamLabel(value)
    }


  /**
    * Indicates the current status of the stream:
    * 
    *  ENABLING - Streams is currently being enabled on the DynamoDB table.
    * 
    *  ENABLED - the stream is enabled.
    * 
    *  DISABLING - Streams is currently being disabled on the DynamoDB table.
    * 
    *  DISABLED - the stream is disabled.
    */
  var streamStatus: StreamStatus?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.streamStatus(value)
    }


  /**
    * The date and time when the request to create this stream was issued.
    */
  var creationRequestDateTime: Instant?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.creationRequestDateTime(value)
    }


  /**
    * The shards that comprise the stream.
    */
  var shards: Collection<Shard>?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.shards(value)
    }


  /**
    * The shard ID of the item where the operation stopped, inclusive of the previous result set. Use this value to
    *  start a new operation, excluding this value in the new request.
    * 
    *  If LastEvaluatedShardId is empty, then the "last page" of results has been processed and there
    *  is currently no more data to be retrieved.
    * 
    *  If LastEvaluatedShardId is not empty, it does not necessarily mean that there is more data in
    *  the result set. The only way to know when you have reached the end of the result set is when
    *  LastEvaluatedShardId is empty.
    */
  var lastEvaluatedShardId: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.lastEvaluatedShardId(value)
    }


  /**
    * The DynamoDB table with which the stream is associated.
    */
  var tableName: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.tableName(value)
    }


  /**
    * The key attribute(s) of the stream's DynamoDB table.
    */
  var keySchema: Collection<KeySchemaElement>?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.keySchema(value)
    }


  /**
    * Indicates the format of the records within this stream:
    * 
    *  KEYS_ONLY - only the key attributes of items that were modified in the DynamoDB table.
    * 
    *  NEW_IMAGE - entire items from the table, as they appeared after they were modified.
    * 
    *  OLD_IMAGE - entire items from the table, as they appeared before they were modified.
    * 
    *  NEW_AND_OLD_IMAGES - both the new and the old images of the items from the table.
    */
  var streamViewType: StreamViewType?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.streamViewType(value)
    }


  /**
    * The Amazon Resource Name (ARN) for the stream.
    */
  var streamArn: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.streamArn(value)
    }

    
  /**
    * Indicates the current status of the stream:
    * 
    *  ENABLING - Streams is currently being enabled on the DynamoDB table.
    * 
    *  ENABLED - the stream is enabled.
    * 
    *  DISABLING - Streams is currently being disabled on the DynamoDB table.
    * 
    *  DISABLED - the stream is disabled.
    */
  fun streamStatus(value: String?) {
    builder.streamStatus(value)
  }


  /**
    * Indicates the format of the records within this stream:
    * 
    *  KEYS_ONLY - only the key attributes of items that were modified in the DynamoDB table.
    * 
    *  NEW_IMAGE - entire items from the table, as they appeared after they were modified.
    * 
    *  OLD_IMAGE - entire items from the table, as they appeared before they were modified.
    * 
    *  NEW_AND_OLD_IMAGES - both the new and the old images of the items from the table.
    */
  fun streamViewType(value: String?) {
    builder.streamViewType(value)
  }

    
  /**
    * The shards that comprise the stream.
    */
  fun shards(dslBlock: ShardCollectionDSL.() -> Unit) {
    builder.shards(buildShardCollection(dslBlock))
  }


  /**
    * The key attribute(s) of the stream's DynamoDB table.
    */
  fun keySchema(dslBlock: KeySchemaElementCollectionDSL.() -> Unit) {
    builder.keySchema(buildKeySchemaElementCollection(dslBlock))
  }

}

/**
  * Builds instances of type StreamDescription:
  * Represents all of the data describing a particular stream.
  */
fun buildStreamDescription(dslBlock: StreamDescriptionDSL.() -> Unit) =
  StreamDescriptionDSL().apply(dslBlock).build()