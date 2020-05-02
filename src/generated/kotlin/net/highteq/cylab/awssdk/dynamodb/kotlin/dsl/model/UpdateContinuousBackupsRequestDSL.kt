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
import software.amazon.awssdk.services.dynamodb.model.PointInTimeRecoverySpecification
import software.amazon.awssdk.services.dynamodb.model.UpdateContinuousBackupsRequest

/**
  * Builds instances of type UpdateContinuousBackupsRequest:
  * 
  */
@DynamodbDSL
inline class UpdateContinuousBackupsRequestDSL(
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder: UpdateContinuousBackupsRequest.Builder
){
  @PublishedApi
  internal fun build(): UpdateContinuousBackupsRequest = builder.build()

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
  inline var pointInTimeRecoverySpecification: PointInTimeRecoverySpecification?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.pointInTimeRecoverySpecification(value)
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
  inline fun pointInTimeRecoverySpecification(dslBlock: PointInTimeRecoverySpecificationDSL.() -> Unit) {
    builder.pointInTimeRecoverySpecification(buildPointInTimeRecoverySpecification(dslBlock))
  }

}

/**
  * Builds instances of type UpdateContinuousBackupsRequest:
  * 
  */
inline fun buildUpdateContinuousBackupsRequest(dslBlock: UpdateContinuousBackupsRequestDSL.() -> Unit) =
  UpdateContinuousBackupsRequestDSL(UpdateContinuousBackupsRequest.builder()).apply(dslBlock).build()