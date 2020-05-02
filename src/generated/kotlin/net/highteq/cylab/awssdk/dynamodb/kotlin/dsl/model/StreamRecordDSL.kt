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
import software.amazon.awssdk.services.dynamodb.model.AttributeValue
import software.amazon.awssdk.services.dynamodb.model.StreamRecord
import software.amazon.awssdk.services.dynamodb.model.StreamViewType

/**
  * Builds instances of type StreamRecord:
  * A description of a single data modification that was performed on an item in a DynamoDB table.
  */
@DynamodbDSL
inline class StreamRecordDSL(
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder: StreamRecord.Builder
){
  @PublishedApi
  internal fun build(): StreamRecord = builder.build()
    
  /**
    * 
    */
  inline var approximateCreationDateTime: Instant?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.approximateCreationDateTime(value)
    }


  /**
    * 
    */
  inline var keys: Map<String, AttributeValue>?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.keys(value)
    }


  /**
    * 
    */
  inline var newImage: Map<String, AttributeValue>?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.newImage(value)
    }


  /**
    * 
    */
  inline var oldImage: Map<String, AttributeValue>?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.oldImage(value)
    }


  /**
    * 
    */
  inline var sequenceNumber: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.sequenceNumber(value)
    }


  /**
    * 
    */
  inline var sizeBytes: Long?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.sizeBytes(value)
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
  inline fun streamViewType(value: String?) {
    builder.streamViewType(value)
  }

  
    
  /**
    * 
    */
  inline fun keys(dslBlock: AttributeValueMapDSL.() -> Unit) {
    builder.keys(buildAttributeValueMap(dslBlock))
  }


  /**
    * 
    */
  inline fun newImage(dslBlock: AttributeValueMapDSL.() -> Unit) {
    builder.newImage(buildAttributeValueMap(dslBlock))
  }


  /**
    * 
    */
  inline fun oldImage(dslBlock: AttributeValueMapDSL.() -> Unit) {
    builder.oldImage(buildAttributeValueMap(dslBlock))
  }

}

/**
  * Builds instances of type StreamRecord:
  * A description of a single data modification that was performed on an item in a DynamoDB table.
  */
inline fun buildStreamRecord(dslBlock: StreamRecordDSL.() -> Unit) =
  StreamRecordDSL(StreamRecord.builder()).apply(dslBlock).build()