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
import software.amazon.awssdk.services.dynamodb.model.StreamSpecification
import software.amazon.awssdk.services.dynamodb.model.StreamViewType

/**
  * Builds instances of type StreamSpecification:
  * Represents the DynamoDB Streams configuration for a table in DynamoDB.
  */
@DynamodbDSL
inline class StreamSpecificationDSL(
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder: StreamSpecification.Builder
){
  @PublishedApi
  internal fun build(): StreamSpecification = builder.build()
    
  /**
    * 
    */
  inline var streamEnabled: Boolean?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.streamEnabled(value)
    }


  /**
    * 
    */
  inline var streamViewType: StreamViewType?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.streamViewType(value)
    }

    
  /**
    * 
    */
  inline fun streamViewType(value: String?) {
    builder.streamViewType(value)
  }

  
  
}

/**
  * Builds instances of type StreamSpecification:
  * Represents the DynamoDB Streams configuration for a table in DynamoDB.
  */
inline fun buildStreamSpecification(dslBlock: StreamSpecificationDSL.() -> Unit) =
  StreamSpecificationDSL(StreamSpecification.builder()).apply(dslBlock).build()