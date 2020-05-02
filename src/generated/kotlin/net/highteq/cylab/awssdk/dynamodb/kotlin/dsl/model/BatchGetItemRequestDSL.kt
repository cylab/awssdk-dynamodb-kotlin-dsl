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
import software.amazon.awssdk.services.dynamodb.model.BatchGetItemRequest
import software.amazon.awssdk.services.dynamodb.model.KeysAndAttributes
import software.amazon.awssdk.services.dynamodb.model.ReturnConsumedCapacity

/**
  * Builds instances of type BatchGetItemRequest:
  * Represents the input of a BatchGetItem operation.
  */
@DynamodbDSL
inline class BatchGetItemRequestDSL(
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder: BatchGetItemRequest.Builder
){
  @PublishedApi
  internal fun build(): BatchGetItemRequest = builder.build()
    
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
  inline var requestItems: Map<String, KeysAndAttributes>?
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
  inline fun returnConsumedCapacity(value: String?) {
    builder.returnConsumedCapacity(value)
  }

  
    
  /**
    * 
    */
  inline fun requestItems(dslBlock: KeysAndAttributesMapDSL.() -> Unit) {
    builder.requestItems(buildKeysAndAttributesMap(dslBlock))
  }

}

/**
  * Builds instances of type BatchGetItemRequest:
  * Represents the input of a BatchGetItem operation.
  */
inline fun buildBatchGetItemRequest(dslBlock: BatchGetItemRequestDSL.() -> Unit) =
  BatchGetItemRequestDSL(BatchGetItemRequest.builder()).apply(dslBlock).build()