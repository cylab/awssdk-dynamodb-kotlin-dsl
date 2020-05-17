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
import software.amazon.awssdk.services.dynamodb.model.Identity
import software.amazon.awssdk.services.dynamodb.model.OperationType
import software.amazon.awssdk.services.dynamodb.model.Record
import software.amazon.awssdk.services.dynamodb.model.StreamRecord

/**
  * Builds instances of type Record:
  * A description of a unique event within a stream.
  */
@DynamodbDSLMarker
inline class RecordDSL(
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder: Record.Builder
){
  @PublishedApi
  internal fun build(): Record = builder.build()

  /**
    * 
    */
  inline var awsRegion: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.awsRegion(value)
    }

  /**
    * 
    */
  inline var dynamodb: StreamRecord?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.dynamodb(value)
    }

  /**
    * 
    */
  inline var eventID: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.eventID(value)
    }

  /**
    * 
    */
  inline var eventName: OperationType?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.eventName(value)
    }

  /**
    * 
    */
  inline var eventSource: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.eventSource(value)
    }

  /**
    * 
    */
  inline var eventVersion: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.eventVersion(value)
    }

  /**
    * 
    */
  inline var userIdentity: Identity?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.userIdentity(value)
    }

  /**
    * 
    */
  inline fun eventName(value: String?) {
    builder.eventName(value)
  }

  /**
    * 
    */
  inline fun dynamodb(dslBlock: StreamRecordDSL.() -> Unit) {
    builder.dynamodb(DynamodbDSL.Companion.streamRecord(dslBlock))
  }

  /**
    * 
    */
  inline fun userIdentity(dslBlock: IdentityDSL.() -> Unit) {
    builder.userIdentity(DynamodbDSL.Companion.identity(dslBlock))
  }

}

/**
  * Builds instances of type Record:
  * A description of a unique event within a stream.
  */
inline fun record(dslBlock: RecordDSL.() -> Unit) =
  RecordDSL(Record.builder()).apply(dslBlock).build()

/**
  * Builds instances of type Record:
  * A description of a unique event within a stream.
  */
inline fun DynamodbDSL.Companion.record(dslBlock: RecordDSL.() -> Unit) =
  RecordDSL(Record.builder()).apply(dslBlock).build()