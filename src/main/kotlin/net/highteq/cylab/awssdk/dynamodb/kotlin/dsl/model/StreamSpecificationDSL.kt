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
import software.amazon.awssdk.services.dynamodb.model.StreamSpecification
import software.amazon.awssdk.services.dynamodb.model.StreamViewType

/**
  * Builds instances of type StreamSpecification:
  * Represents the DynamoDB Streams configuration for a table in DynamoDB.
  */
@DynamodbDSL
class StreamSpecificationDSL {
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  internal val builder = StreamSpecification.builder()
  internal fun build(): StreamSpecification = builder.build()
    
  /**
    * Indicates whether DynamoDB Streams is enabled (true) or disabled (false) on the table.
    */
  var streamEnabled: Boolean
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.streamEnabled(value)
    }


  /**
    * When an item in the table is modified, StreamViewType determines what information is written to
    *  the stream for this table. Valid values for StreamViewType are:
    * 
    *  KEYS_ONLY - Only the key attributes of the modified item are written to the stream.
    * 
    *  NEW_IMAGE - The entire item, as it appears after it was modified, is written to the stream.
    * 
    *  OLD_IMAGE - The entire item, as it appeared before it was modified, is written to the stream.
    * 
    *  NEW_AND_OLD_IMAGES - Both the new and the old item images of the item are written to the stream.
    */
  var streamViewType: StreamViewType
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.streamViewType(value)
    }

    
  /**
    * When an item in the table is modified, StreamViewType determines what information is written to
    *  the stream for this table. Valid values for StreamViewType are:
    * 
    *  KEYS_ONLY - Only the key attributes of the modified item are written to the stream.
    * 
    *  NEW_IMAGE - The entire item, as it appears after it was modified, is written to the stream.
    * 
    *  OLD_IMAGE - The entire item, as it appeared before it was modified, is written to the stream.
    * 
    *  NEW_AND_OLD_IMAGES - Both the new and the old item images of the item are written to the stream.
    */
  fun streamViewType(value: String) {
    builder.streamViewType(value)
  }

  
}

/**
  * Builds instances of type StreamSpecification:
  * Represents the DynamoDB Streams configuration for a table in DynamoDB.
  */
fun buildStreamSpecification(dslBlock: StreamSpecificationDSL.() -> Unit) =
  StreamSpecificationDSL().apply(dslBlock).build()