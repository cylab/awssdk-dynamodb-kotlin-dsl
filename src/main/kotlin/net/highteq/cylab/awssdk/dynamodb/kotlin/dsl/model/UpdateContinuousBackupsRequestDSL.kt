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
import software.amazon.awssdk.services.dynamodb.model.PointInTimeRecoverySpecification
import software.amazon.awssdk.services.dynamodb.model.UpdateContinuousBackupsRequest

/**
  * Builds instances of type UpdateContinuousBackupsRequest:
  * 
  */
@DynamodbDSL
class UpdateContinuousBackupsRequestDSL {
  private val builder = UpdateContinuousBackupsRequest.builder()
  internal fun build(): UpdateContinuousBackupsRequest = builder.build()
    
  /**
    * Represents the settings used to enable point in time recovery.
    */
  @get:JvmSynthetic // Hide from Java callers
  var pointInTimeRecoverySpecification: PointInTimeRecoverySpecification
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.pointInTimeRecoverySpecification(value)
    }


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
    * The name of the table.
    */
  @get:JvmSynthetic // Hide from Java callers
  var tableName: String
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.tableName(value)
    }

  
    
  /**
    * Represents the settings used to enable point in time recovery.
    */
  fun pointInTimeRecoverySpecification(dslBlock: PointInTimeRecoverySpecificationDSL.() -> Unit) {
    builder.pointInTimeRecoverySpecification(buildPointInTimeRecoverySpecification(dslBlock))
  }

}

/**
  * Builds instances of type UpdateContinuousBackupsRequest:
  * 
  */
fun buildUpdateContinuousBackupsRequest(dslBlock: UpdateContinuousBackupsRequestDSL.() -> Unit) =
  UpdateContinuousBackupsRequestDSL().apply(dslBlock).build()