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
import software.amazon.awssdk.services.dynamodb.model.TimeToLiveDescription
import software.amazon.awssdk.services.dynamodb.model.TimeToLiveStatus

/**
  * Builds instances of type TimeToLiveDescription:
  * The description of the Time to Live (TTL) status on the specified table.
  */
@DynamodbDSL
inline class TimeToLiveDescriptionDSL(
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder: TimeToLiveDescription.Builder
){
  @PublishedApi
  internal fun build(): TimeToLiveDescription = builder.build()

  /**
    * 
    */
  inline var attributeName: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.attributeName(value)
    }

  /**
    * 
    */
  inline var timeToLiveStatus: TimeToLiveStatus?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.timeToLiveStatus(value)
    }

  /**
    * 
    */
  inline fun timeToLiveStatus(value: String?) {
    builder.timeToLiveStatus(value)
  }

}

/**
  * Builds instances of type TimeToLiveDescription:
  * The description of the Time to Live (TTL) status on the specified table.
  */
inline fun buildTimeToLiveDescription(dslBlock: TimeToLiveDescriptionDSL.() -> Unit) =
  TimeToLiveDescriptionDSL(TimeToLiveDescription.builder()).apply(dslBlock).build()