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
import software.amazon.awssdk.services.dynamodb.model.DescribeContinuousBackupsRequest

/**
  * Builds instances of type DescribeContinuousBackupsRequest:
  * 
  */
@DynamodbDSL
class DescribeContinuousBackupsRequestDSL {
  private val builder = DescribeContinuousBackupsRequest.builder()
  internal fun build(): DescribeContinuousBackupsRequest = builder.build()
    
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
    * Name of the table for which the customer wants to check the continuous backups and point in time recovery
    *  settings.
    */
  @get:JvmSynthetic // Hide from Java callers
  var tableName: String
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.tableName(value)
    }

  
  
}

/**
  * Builds instances of type DescribeContinuousBackupsRequest:
  * 
  */
fun buildDescribeContinuousBackupsRequest(dslBlock: DescribeContinuousBackupsRequestDSL.() -> Unit) =
  DescribeContinuousBackupsRequestDSL().apply(dslBlock).build()