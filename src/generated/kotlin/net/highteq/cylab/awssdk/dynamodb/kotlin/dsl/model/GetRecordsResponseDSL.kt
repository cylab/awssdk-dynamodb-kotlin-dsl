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
import software.amazon.awssdk.services.dynamodb.model.GetRecordsResponse
import software.amazon.awssdk.services.dynamodb.model.Record

/**
  * Builds instances of type GetRecordsResponse:
  * Represents the output of a GetRecords operation.
  */
@DynamodbDSLMarker
inline class GetRecordsResponseDSL(
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder: GetRecordsResponse.Builder
){
  @PublishedApi
  internal fun build(): GetRecordsResponse = builder.build()

  /**
    * 
    */
  inline var nextShardIterator: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.nextShardIterator(value)
    }

  /**
    * 
    */
  inline var records: Collection<Record>?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.records(value)
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
  inline fun records(dslBlock: RecordCollectionDSL.() -> Unit) {
    builder.records(DynamodbDSL.Companion.recordCollection(dslBlock))
  }

}

/**
  * Builds instances of type GetRecordsResponse:
  * Represents the output of a GetRecords operation.
  */
inline fun getRecordsResponse(dslBlock: GetRecordsResponseDSL.() -> Unit) =
  GetRecordsResponseDSL(GetRecordsResponse.builder()).apply(dslBlock).build()

/**
  * Builds instances of type GetRecordsResponse:
  * Represents the output of a GetRecords operation.
  */
inline fun DynamodbDSL.Companion.getRecordsResponse(dslBlock: GetRecordsResponseDSL.() -> Unit) =
  GetRecordsResponseDSL(GetRecordsResponse.builder()).apply(dslBlock).build()