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
import software.amazon.awssdk.services.dynamodb.model.GlobalTableDescription
import software.amazon.awssdk.services.dynamodb.model.UpdateGlobalTableResponse

/**
  * Builds instances of type UpdateGlobalTableResponse:
  * 
  */
@DynamodbDSLMarker
inline class UpdateGlobalTableResponseDSL(
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder: UpdateGlobalTableResponse.Builder
){
  @PublishedApi
  internal fun build(): UpdateGlobalTableResponse = builder.build()

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
  * Builds instances of type UpdateGlobalTableResponse:
  * 
  */
inline fun updateGlobalTableResponse(dslBlock: UpdateGlobalTableResponseDSL.() -> Unit) =
  UpdateGlobalTableResponseDSL(UpdateGlobalTableResponse.builder()).apply(dslBlock).build()

/**
  * Builds instances of type UpdateGlobalTableResponse:
  * 
  */
inline fun DynamodbDSL.Companion.updateGlobalTableResponse(dslBlock: UpdateGlobalTableResponseDSL.() -> Unit) =
  UpdateGlobalTableResponseDSL(UpdateGlobalTableResponse.builder()).apply(dslBlock).build()