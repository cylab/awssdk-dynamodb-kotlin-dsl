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
import software.amazon.awssdk.services.dynamodb.model.DeleteTableResponse
import software.amazon.awssdk.services.dynamodb.model.TableDescription

/**
  * Builds instances of type DeleteTableResponse:
  * Represents the output of a DeleteTable operation.
  */
@DynamodbDSLMarker
inline class DeleteTableResponseDSL(
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder: DeleteTableResponse.Builder
){
  @PublishedApi
  internal fun build(): DeleteTableResponse = builder.build()

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
  inline var tableDescription: TableDescription?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.tableDescription(value)
    }

  /**
    * 
    */
  inline fun tableDescription(dslBlock: TableDescriptionDSL.() -> Unit) {
    builder.tableDescription(DynamodbDSL.Companion.tableDescription(dslBlock))
  }

}

/**
  * Builds instances of type DeleteTableResponse:
  * Represents the output of a DeleteTable operation.
  */
inline fun deleteTableResponse(dslBlock: DeleteTableResponseDSL.() -> Unit) =
  DeleteTableResponseDSL(DeleteTableResponse.builder()).apply(dslBlock).build()

/**
  * Builds instances of type DeleteTableResponse:
  * Represents the output of a DeleteTable operation.
  */
inline fun DynamodbDSL.Companion.deleteTableResponse(dslBlock: DeleteTableResponseDSL.() -> Unit) =
  DeleteTableResponseDSL(DeleteTableResponse.builder()).apply(dslBlock).build()