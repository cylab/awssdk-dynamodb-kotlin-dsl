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
import software.amazon.awssdk.services.dynamodb.model.PointInTimeRecoverySpecification

/**
  * Builds instances of type PointInTimeRecoverySpecification:
  * Represents the settings used to enable point in time recovery.
  */
@DynamodbDSL
inline class PointInTimeRecoverySpecificationDSL(
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder: PointInTimeRecoverySpecification.Builder
){
  @PublishedApi
  internal fun build(): PointInTimeRecoverySpecification = builder.build()
    
  /**
    * 
    */
  inline var pointInTimeRecoveryEnabled: Boolean?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.pointInTimeRecoveryEnabled(value)
    }

  
  
  
}

/**
  * Builds instances of type PointInTimeRecoverySpecification:
  * Represents the settings used to enable point in time recovery.
  */
inline fun buildPointInTimeRecoverySpecification(dslBlock: PointInTimeRecoverySpecificationDSL.() -> Unit) =
  PointInTimeRecoverySpecificationDSL(PointInTimeRecoverySpecification.builder()).apply(dslBlock).build()