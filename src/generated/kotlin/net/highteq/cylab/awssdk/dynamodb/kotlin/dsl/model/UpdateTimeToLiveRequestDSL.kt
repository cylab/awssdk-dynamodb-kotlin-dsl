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
import software.amazon.awssdk.services.dynamodb.model.TimeToLiveSpecification
import software.amazon.awssdk.services.dynamodb.model.UpdateTimeToLiveRequest

/**
  * Builds instances of type UpdateTimeToLiveRequest:
  * Represents the input of an UpdateTimeToLive operation.
  */
@DynamodbDSL
inline class UpdateTimeToLiveRequestDSL(
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder: UpdateTimeToLiveRequest.Builder
){
  @PublishedApi
  internal fun build(): UpdateTimeToLiveRequest = builder.build()
    
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
  inline var tableName: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.tableName(value)
    }


  /**
    * 
    */
  inline var timeToLiveSpecification: TimeToLiveSpecification?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.timeToLiveSpecification(value)
    }

  
  
    
  /**
    * 
    */
  inline fun timeToLiveSpecification(dslBlock: TimeToLiveSpecificationDSL.() -> Unit) {
    builder.timeToLiveSpecification(buildTimeToLiveSpecification(dslBlock))
  }

}

/**
  * Builds instances of type UpdateTimeToLiveRequest:
  * Represents the input of an UpdateTimeToLive operation.
  */
inline fun buildUpdateTimeToLiveRequest(dslBlock: UpdateTimeToLiveRequestDSL.() -> Unit) =
  UpdateTimeToLiveRequestDSL(UpdateTimeToLiveRequest.builder()).apply(dslBlock).build()