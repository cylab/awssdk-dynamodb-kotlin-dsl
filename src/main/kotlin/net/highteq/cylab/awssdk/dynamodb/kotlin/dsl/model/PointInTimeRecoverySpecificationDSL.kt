/*
  This file was generated from https://github.com/aws/aws-sdk-java-v2 by https://github.com/cylab/aws-kotlin-dsl-builder
  Like the original code, this file and project is licensed under
  Apache License Version 2.0
  See LICENSE.txt for more info
*/
package net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.model

import kotlin.DeprecationLevel.HIDDEN
import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSL
import software.amazon.awssdk.services.dynamodb.model.PointInTimeRecoverySpecification

/**
  * Builds instances of type PointInTimeRecoverySpecification:
  * Represents the settings used to enable point in time recovery.
  */
@DynamodbDSL
class PointInTimeRecoverySpecificationDSL {
  private val builder = PointInTimeRecoverySpecification.builder()
  internal fun build(): PointInTimeRecoverySpecification = builder.build()
    
  /**
    * Indicates whether point in time recovery is enabled (true) or disabled (false) on the table.
    */
  @get:JvmSynthetic // Hide from Java callers
  var pointInTimeRecoveryEnabled: Boolean
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
fun buildPointInTimeRecoverySpecification(dslBlock: PointInTimeRecoverySpecificationDSL.() -> Unit) =
  PointInTimeRecoverySpecificationDSL().apply(dslBlock).build()