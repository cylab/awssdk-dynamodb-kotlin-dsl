/*
  This file was generated from https://github.com/aws/aws-sdk-java-v2 by https://github.com/cylab/aws-kotlin-dsl-builder
  Like the original code, this file and project is licensed under
  Apache License Version 2.0
  See LICENSE.txt for more info
*/
package net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.model

import kotlin.DeprecationLevel.HIDDEN
import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSL
import software.amazon.awssdk.awscore.AwsRequestOverrideConfiguration
import software.amazon.awssdk.services.dynamodb.model.TimeToLiveSpecification
import software.amazon.awssdk.services.dynamodb.model.UpdateTimeToLiveRequest

/**
  * Builds instances of type UpdateTimeToLiveRequest:
  * Represents the input of an UpdateTimeToLive operation.
  */
@DynamodbDSL
class UpdateTimeToLiveRequestDSL {
  private val builder = UpdateTimeToLiveRequest.builder()
  internal fun build(): UpdateTimeToLiveRequest = builder.build()
    
  /**
    * 
    */
  @get:JvmSynthetic // Hide from Java callers
  var overrideConfiguration: AwsRequestOverrideConfiguration
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.overrideConfiguration(value)
    }


  /**
    * The name of the table to be configured.
    */
  @get:JvmSynthetic // Hide from Java callers
  var tableName: String
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.tableName(value)
    }


  /**
    * Represents the settings used to enable or disable Time to Live for the specified table.
    */
  @get:JvmSynthetic // Hide from Java callers
  var timeToLiveSpecification: TimeToLiveSpecification
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.timeToLiveSpecification(value)
    }

  
    
  /**
    * Represents the settings used to enable or disable Time to Live for the specified table.
    */
  fun timeToLiveSpecification(dslBlock: TimeToLiveSpecificationDSL.() -> Unit) {
    builder.timeToLiveSpecification(buildTimeToLiveSpecification(dslBlock))
  }

}

/**
  * Builds instances of type UpdateTimeToLiveRequest:
  * Represents the input of an UpdateTimeToLive operation.
  */
fun buildUpdateTimeToLiveRequest(dslBlock: UpdateTimeToLiveRequestDSL.() -> Unit) =
  UpdateTimeToLiveRequestDSL().apply(dslBlock).build()