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
import software.amazon.awssdk.awscore.AwsResponseMetadata
import software.amazon.awssdk.http.SdkHttpResponse
import software.amazon.awssdk.services.dynamodb.model.CreateGlobalTableResponse
import software.amazon.awssdk.services.dynamodb.model.GlobalTableDescription

/**
  * Builds instances of type CreateGlobalTableResponse:
  * 
  */
@DynamodbDSLMarker
inline class CreateGlobalTableResponseDSL(
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder: CreateGlobalTableResponse.Builder
){
  @PublishedApi
  internal fun build(): CreateGlobalTableResponse = builder.build()

  /**
    * 
    */
  inline var globalTableDescription: GlobalTableDescription?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.globalTableDescription(value)
    }

  /**
    * 
    */
  inline var responseMetadata: AwsResponseMetadata?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.responseMetadata(value)
    }

  /**
    * 
    */
  inline var sdkHttpResponse: SdkHttpResponse?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.sdkHttpResponse(value)
    }

  /**
    * 
    */
  inline fun globalTableDescription(dslBlock: GlobalTableDescriptionDSL.() -> Unit) {
    builder.globalTableDescription(DynamodbDSL.Companion.globalTableDescription(dslBlock))
  }

}

/**
  * Builds instances of type CreateGlobalTableResponse:
  * 
  */
inline fun createGlobalTableResponse(dslBlock: CreateGlobalTableResponseDSL.() -> Unit) =
  CreateGlobalTableResponseDSL(CreateGlobalTableResponse.builder()).apply(dslBlock).build()

/**
  * Builds instances of type CreateGlobalTableResponse:
  * 
  */
inline fun DynamodbDSL.Companion.createGlobalTableResponse(dslBlock: CreateGlobalTableResponseDSL.() -> Unit) =
  CreateGlobalTableResponseDSL(CreateGlobalTableResponse.builder()).apply(dslBlock).build()