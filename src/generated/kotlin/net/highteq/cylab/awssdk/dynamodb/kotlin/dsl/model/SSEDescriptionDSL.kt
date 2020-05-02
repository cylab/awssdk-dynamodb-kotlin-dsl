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
import software.amazon.awssdk.services.dynamodb.model.SSEDescription
import software.amazon.awssdk.services.dynamodb.model.SSEStatus
import software.amazon.awssdk.services.dynamodb.model.SSEType

/**
  * Builds instances of type SSEDescription:
  * The description of the server-side encryption status on the specified table.
  */
@DynamodbDSL
inline class SSEDescriptionDSL(
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder: SSEDescription.Builder
){
  @PublishedApi
  internal fun build(): SSEDescription = builder.build()
    
  /**
    * 
    */
  inline var kmsMasterKeyArn: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.kmsMasterKeyArn(value)
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
  inline var status: SSEStatus?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.status(value)
    }

    
  /**
    * 
    */
  inline fun sseType(value: String?) {
    builder.sseType(value)
  }


  /**
    * 
    */
  inline fun status(value: String?) {
    builder.status(value)
  }

  
  
}

/**
  * Builds instances of type SSEDescription:
  * The description of the server-side encryption status on the specified table.
  */
inline fun buildSSEDescription(dslBlock: SSEDescriptionDSL.() -> Unit) =
  SSEDescriptionDSL(SSEDescription.builder()).apply(dslBlock).build()