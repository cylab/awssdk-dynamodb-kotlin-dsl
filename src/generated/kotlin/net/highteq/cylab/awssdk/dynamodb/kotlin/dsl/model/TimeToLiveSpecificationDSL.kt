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
import software.amazon.awssdk.services.dynamodb.model.TimeToLiveSpecification

/**
  * Builds instances of type TimeToLiveSpecification:
  * Represents the settings used to enable or disable Time to Live for the specified table.
  */
@DynamodbDSL
inline class TimeToLiveSpecificationDSL(
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder: TimeToLiveSpecification.Builder
){
  @PublishedApi
  internal fun build(): TimeToLiveSpecification = builder.build()

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
  inline var enabled: Boolean?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.enabled(value)
    }

}

/**
  * Builds instances of type TimeToLiveSpecification:
  * Represents the settings used to enable or disable Time to Live for the specified table.
  */
inline fun buildTimeToLiveSpecification(dslBlock: TimeToLiveSpecificationDSL.() -> Unit) =
  TimeToLiveSpecificationDSL(TimeToLiveSpecification.builder()).apply(dslBlock).build()