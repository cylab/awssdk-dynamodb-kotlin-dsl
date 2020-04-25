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
import software.amazon.awssdk.services.dynamodb.model.Identity
import software.amazon.awssdk.services.dynamodb.model.OperationType
import software.amazon.awssdk.services.dynamodb.model.Record
import software.amazon.awssdk.services.dynamodb.model.StreamRecord

/**
  * Builds instances of type Record:
  * A description of a unique event within a stream.
  */
@DynamodbDSL
class RecordDSL {
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  internal val builder = Record.builder()
  internal fun build(): Record = builder.build()
    
  /**
    * The type of data modification that was performed on the DynamoDB table:
    * 
    *  INSERT - a new item was added to the table.
    * 
    *  MODIFY - one or more of an existing item's attributes were modified.
    * 
    *  REMOVE - the item was deleted from the table
    */
  var eventName: OperationType
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.eventName(value)
    }


  /**
    * The version number of the stream record format. This number is updated whenever the structure of
    *  Record is modified.
    * 
    *  Client applications must not assume that eventVersion will remain at a particular value, as this
    *  number is subject to change at any time. In general, eventVersion will only increase as the
    *  low-level DynamoDB Streams API evolves.
    */
  var eventVersion: String
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.eventVersion(value)
    }


  /**
    * Items that are deleted by the Time to Live process after expiration have the following fields:
    * 
    *  Records[].userIdentity.type
    * 
    *  "Service"
    * 
    *  Records[].userIdentity.principalId
    * 
    *  "dynamodb.amazonaws.com"
    */
  var userIdentity: Identity
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.userIdentity(value)
    }


  /**
    * The region in which the GetRecords request was received.
    */
  var awsRegion: String
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.awsRegion(value)
    }


  /**
    * The AWS service from which the stream record originated. For DynamoDB Streams, this is
    *  aws:dynamodb.
    */
  var eventSource: String
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.eventSource(value)
    }


  /**
    * A globally unique identifier for the event that was recorded in this stream record.
    */
  var eventID: String
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.eventID(value)
    }


  /**
    * The main body of the stream record, containing all of the DynamoDB-specific fields.
    */
  var dynamodb: StreamRecord
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.dynamodb(value)
    }

    
  /**
    * The type of data modification that was performed on the DynamoDB table:
    * 
    *  INSERT - a new item was added to the table.
    * 
    *  MODIFY - one or more of an existing item's attributes were modified.
    * 
    *  REMOVE - the item was deleted from the table
    */
  fun eventName(value: String) {
    builder.eventName(value)
  }

    
  /**
    * Items that are deleted by the Time to Live process after expiration have the following fields:
    * 
    *  Records[].userIdentity.type
    * 
    *  "Service"
    * 
    *  Records[].userIdentity.principalId
    * 
    *  "dynamodb.amazonaws.com"
    */
  fun userIdentity(dslBlock: IdentityDSL.() -> Unit) {
    builder.userIdentity(buildIdentity(dslBlock))
  }


  /**
    * The main body of the stream record, containing all of the DynamoDB-specific fields.
    */
  fun dynamodb(dslBlock: StreamRecordDSL.() -> Unit) {
    builder.dynamodb(buildStreamRecord(dslBlock))
  }

}

/**
  * Builds instances of type Record:
  * A description of a unique event within a stream.
  */
fun buildRecord(dslBlock: RecordDSL.() -> Unit) =
  RecordDSL().apply(dslBlock).build()