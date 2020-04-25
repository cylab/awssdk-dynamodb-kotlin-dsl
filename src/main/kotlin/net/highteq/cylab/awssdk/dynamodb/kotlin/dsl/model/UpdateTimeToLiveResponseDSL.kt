/*
  This file was generated from https://github.com/aws/aws-sdk-java-v2 by https://github.com/cylab/aws-kotlin-dsl-builder
  Like the original code, this file and project is licensed under
  Apache License Version 2.0
  See LICENSE.txt for more info
*/
package net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.model

import kotlin.DeprecationLevel.HIDDEN
import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSL
import software.amazon.awssdk.services.dynamodb.model.TimeToLiveSpecification
import software.amazon.awssdk.services.dynamodb.model.UpdateTimeToLiveResponse

/**
  * Builds instances of type UpdateTimeToLiveResponse:
  * 
  */
@DynamodbDSL
class UpdateTimeToLiveResponseDSL {
  private val builder = UpdateTimeToLiveResponse.builder()
  internal fun build(): UpdateTimeToLiveResponse = builder.build()
    
  /**
    * Represents the output of an UpdateTimeToLive operation.
    */
  @get:JvmSynthetic // Hide from Java callers
  var timeToLiveSpecification: TimeToLiveSpecification
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.timeToLiveSpecification(value)
    }

  
    
  /**
    * Represents the output of an UpdateTimeToLive operation.
    */
  fun timeToLiveSpecification(dslBlock: TimeToLiveSpecificationDSL.() -> Unit) {
    builder.timeToLiveSpecification(buildTimeToLiveSpecification(dslBlock))
  }

}

/**
  * Builds instances of type UpdateTimeToLiveResponse:
  * 
  */
fun buildUpdateTimeToLiveResponse(dslBlock: UpdateTimeToLiveResponseDSL.() -> Unit) =
  UpdateTimeToLiveResponseDSL().apply(dslBlock).build()