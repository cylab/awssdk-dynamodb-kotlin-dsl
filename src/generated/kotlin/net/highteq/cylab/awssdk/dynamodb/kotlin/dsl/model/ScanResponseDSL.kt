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
import software.amazon.awssdk.services.dynamodb.model.AttributeValue
import software.amazon.awssdk.services.dynamodb.model.ConsumedCapacity
import software.amazon.awssdk.services.dynamodb.model.ScanResponse

/**
  * Builds instances of type ScanResponse:
  * Represents the output of a Scan operation.
  */
@DynamodbDSLMarker
inline class ScanResponseDSL(
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder: ScanResponse.Builder
){
  @PublishedApi
  internal fun build(): ScanResponse = builder.build()

  /**
    * 
    */
  inline var consumedCapacity: ConsumedCapacity?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.consumedCapacity(value)
    }

  /**
    * 
    */
  inline var count: Int?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.count(value)
    }

  /**
    * 
    */
  inline var items: Collection<Map<String, AttributeValue>>?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.items(value)
    }

  /**
    * 
    */
  inline var lastEvaluatedKey: Map<String, AttributeValue>?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.lastEvaluatedKey(value)
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
  inline var scannedCount: Int?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.scannedCount(value)
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
  inline fun consumedCapacity(dslBlock: ConsumedCapacityDSL.() -> Unit) {
    builder.consumedCapacity(DynamodbDSL.Companion.consumedCapacity(dslBlock))
  }

  /**
    * 
    */
  inline fun lastEvaluatedKey(dslBlock: AttributeValueMapDSL.() -> Unit) {
    builder.lastEvaluatedKey(DynamodbDSL.Companion.attributeValueMap(dslBlock))
  }

}

/**
  * Builds instances of type ScanResponse:
  * Represents the output of a Scan operation.
  */
inline fun scanResponse(dslBlock: ScanResponseDSL.() -> Unit) =
  ScanResponseDSL(ScanResponse.builder()).apply(dslBlock).build()

/**
  * Builds instances of type ScanResponse:
  * Represents the output of a Scan operation.
  */
inline fun DynamodbDSL.Companion.scanResponse(dslBlock: ScanResponseDSL.() -> Unit) =
  ScanResponseDSL(ScanResponse.builder()).apply(dslBlock).build()