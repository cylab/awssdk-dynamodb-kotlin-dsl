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
import software.amazon.awssdk.services.dynamodb.model.Endpoint

/**
  * Builds instances of type Endpoint:
  * An endpoint information details.
  */
@DynamodbDSLMarker
inline class EndpointDSL(
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder: Endpoint.Builder
){
  @PublishedApi
  internal fun build(): Endpoint = builder.build()

  /**
    * 
    */
  inline var address: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.address(value)
    }

  /**
    * 
    */
  inline var cachePeriodInMinutes: Long?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.cachePeriodInMinutes(value)
    }

}

/**
  * Builds instances of type Endpoint:
  * An endpoint information details.
  */
inline fun endpoint(dslBlock: EndpointDSL.() -> Unit) =
  EndpointDSL(Endpoint.builder()).apply(dslBlock).build()

/**
  * Builds instances of type Endpoint:
  * An endpoint information details.
  */
inline fun DynamodbDSL.Companion.endpoint(dslBlock: EndpointDSL.() -> Unit) =
  EndpointDSL(Endpoint.builder()).apply(dslBlock).build()