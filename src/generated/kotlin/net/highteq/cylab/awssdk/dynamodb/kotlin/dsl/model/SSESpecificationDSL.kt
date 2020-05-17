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
import software.amazon.awssdk.services.dynamodb.model.SSESpecification
import software.amazon.awssdk.services.dynamodb.model.SSEType

/**
  * Builds instances of type SSESpecification:
  * Represents the settings used to enable server-side encryption.
  */
@DynamodbDSLMarker
inline class SSESpecificationDSL(
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder: SSESpecification.Builder
){
  @PublishedApi
  internal fun build(): SSESpecification = builder.build()

  /**
    * 
    */
  inline var enabled: Boolean?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.enabled(value)
    }

  /**
    * 
    */
  inline var kmsMasterKeyId: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.kmsMasterKeyId(value)
    }

  /**
    * 
    */
  inline var sseType: SSEType?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.sseType(value)
    }

  /**
    * 
    */
  inline fun sseType(value: String?) {
    builder.sseType(value)
  }

}

/**
  * Builds instances of type SSESpecification:
  * Represents the settings used to enable server-side encryption.
  */
inline fun sseSpecification(dslBlock: SSESpecificationDSL.() -> Unit) =
  SSESpecificationDSL(SSESpecification.builder()).apply(dslBlock).build()

/**
  * Builds instances of type SSESpecification:
  * Represents the settings used to enable server-side encryption.
  */
inline fun DynamodbDSL.Companion.sseSpecification(dslBlock: SSESpecificationDSL.() -> Unit) =
  SSESpecificationDSL(SSESpecification.builder()).apply(dslBlock).build()