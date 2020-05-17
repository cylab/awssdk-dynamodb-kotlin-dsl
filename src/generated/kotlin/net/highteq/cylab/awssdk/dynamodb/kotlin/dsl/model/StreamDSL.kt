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
import software.amazon.awssdk.services.dynamodb.model.Stream

/**
  * Builds instances of type Stream:
  * Represents all of the data describing a particular stream.
  */
@DynamodbDSLMarker
inline class StreamDSL(
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder: Stream.Builder
){
  @PublishedApi
  internal fun build(): Stream = builder.build()

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
  inline var tableName: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.tableName(value)
    }

}

/**
  * Builds instances of type Stream:
  * Represents all of the data describing a particular stream.
  */
inline fun stream(dslBlock: StreamDSL.() -> Unit) =
  StreamDSL(Stream.builder()).apply(dslBlock).build()

/**
  * Builds instances of type Stream:
  * Represents all of the data describing a particular stream.
  */
inline fun DynamodbDSL.Companion.stream(dslBlock: StreamDSL.() -> Unit) =
  StreamDSL(Stream.builder()).apply(dslBlock).build()