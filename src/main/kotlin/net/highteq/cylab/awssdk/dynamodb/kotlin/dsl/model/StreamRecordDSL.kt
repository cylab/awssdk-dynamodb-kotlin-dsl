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
import software.amazon.awssdk.services.dynamodb.model.AttributeValue
import software.amazon.awssdk.services.dynamodb.model.StreamRecord
import software.amazon.awssdk.services.dynamodb.model.StreamViewType

/**
  * Builds instances of type StreamRecord:
  * A description of a single data modification that was performed on an item in a DynamoDB table.
  */
@DynamodbDSL
class StreamRecordDSL {
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder = StreamRecord.builder()
  internal fun build(): StreamRecord = builder.build()
    
  /**
    * The sequence number of the stream record.
    */
  var sequenceNumber: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.sequenceNumber(value)
    }


  /**
    * The primary key attribute(s) for the DynamoDB item that was modified.
    */
  var keys: Map<String, AttributeValue>?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.keys(value)
    }


  /**
    * The item in the DynamoDB table as it appeared after it was modified.
    */
  var newImage: Map<String, AttributeValue>?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.newImage(value)
    }


  /**
    * The approximate date and time when the stream record was created, in UNIX epoch time format.
    */
  var approximateCreationDateTime: Instant?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.approximateCreationDateTime(value)
    }


  /**
    * The item in the DynamoDB table as it appeared before it was modified.
    */
  var oldImage: Map<String, AttributeValue>?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.oldImage(value)
    }


  /**
    * The size of the stream record, in bytes.
    */
  var sizeBytes: Long?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.sizeBytes(value)
    }


  /**
    * The type of data from the modified DynamoDB item that was captured in this stream record:
    * 
    *  KEYS_ONLY - only the key attributes of the modified item.
    * 
    *  NEW_IMAGE - the entire item, as it appeared after it was modified.
    * 
    *  OLD_IMAGE - the entire item, as it appeared before it was modified.
    * 
    *  NEW_AND_OLD_IMAGES - both the new and the old item images of the item.
    */
  var streamViewType: StreamViewType?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.streamViewType(value)
    }

    
  /**
    * The type of data from the modified DynamoDB item that was captured in this stream record:
    * 
    *  KEYS_ONLY - only the key attributes of the modified item.
    * 
    *  NEW_IMAGE - the entire item, as it appeared after it was modified.
    * 
    *  OLD_IMAGE - the entire item, as it appeared before it was modified.
    * 
    *  NEW_AND_OLD_IMAGES - both the new and the old item images of the item.
    */
  fun streamViewType(value: String?) {
    builder.streamViewType(value)
  }

  
}

/**
  * Builds instances of type StreamRecord:
  * A description of a single data modification that was performed on an item in a DynamoDB table.
  */
fun buildStreamRecord(dslBlock: StreamRecordDSL.() -> Unit) =
  StreamRecordDSL().apply(dslBlock).build()