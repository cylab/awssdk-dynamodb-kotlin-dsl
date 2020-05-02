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
import software.amazon.awssdk.awscore.AwsRequestOverrideConfiguration
import software.amazon.awssdk.services.dynamodb.model.BatchWriteItemRequest
import software.amazon.awssdk.services.dynamodb.model.ReturnConsumedCapacity
import software.amazon.awssdk.services.dynamodb.model.ReturnItemCollectionMetrics
import software.amazon.awssdk.services.dynamodb.model.WriteRequest

/**
  * Builds instances of type BatchWriteItemRequest:
  * Represents the input of a BatchWriteItem operation.
  */
@DynamodbDSL
inline class BatchWriteItemRequestDSL(
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder: BatchWriteItemRequest.Builder
){
  @PublishedApi
  internal fun build(): BatchWriteItemRequest = builder.build()
    
  /**
    * 
    */
  inline var overrideConfiguration: AwsRequestOverrideConfiguration?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.overrideConfiguration(value)
    }


  /**
    * 
    */
  inline var requestItems: Map<String, Collection<WriteRequest>>?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.requestItems(value)
    }


  /**
    * 
    */
  inline var returnConsumedCapacity: ReturnConsumedCapacity?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.returnConsumedCapacity(value)
    }


  /**
    * 
    */
  inline var returnItemCollectionMetrics: ReturnItemCollectionMetrics?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.returnItemCollectionMetrics(value)
    }

    
  /**
    * 
    */
  inline fun returnConsumedCapacity(value: String?) {
    builder.returnConsumedCapacity(value)
  }


  /**
    * 
    */
  inline fun returnItemCollectionMetrics(value: String?) {
    builder.returnItemCollectionMetrics(value)
  }

  
  
}

/**
  * Builds instances of type BatchWriteItemRequest:
  * Represents the input of a BatchWriteItem operation.
  */
inline fun buildBatchWriteItemRequest(dslBlock: BatchWriteItemRequestDSL.() -> Unit) =
  BatchWriteItemRequestDSL(BatchWriteItemRequest.builder()).apply(dslBlock).build()