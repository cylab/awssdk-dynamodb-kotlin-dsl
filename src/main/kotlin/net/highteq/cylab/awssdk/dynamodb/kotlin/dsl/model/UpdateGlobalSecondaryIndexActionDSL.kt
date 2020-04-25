/*
  This file was generated from https://github.com/aws/aws-sdk-java-v2 by https://github.com/cylab/aws-kotlin-dsl-builder
  Like the original code, this file and project is licensed under
  Apache License Version 2.0
  See LICENSE.txt for more info
*/
package net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.model

import kotlin.DeprecationLevel.HIDDEN
import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSL
import software.amazon.awssdk.services.dynamodb.model.ProvisionedThroughput
import software.amazon.awssdk.services.dynamodb.model.UpdateGlobalSecondaryIndexAction

/**
  * Builds instances of type UpdateGlobalSecondaryIndexAction:
  * Represents the new provisioned throughput settings to be applied to a global secondary index.
  */
@DynamodbDSL
class UpdateGlobalSecondaryIndexActionDSL {
  private val builder = UpdateGlobalSecondaryIndexAction.builder()
  internal fun build(): UpdateGlobalSecondaryIndexAction = builder.build()
    
  /**
    * The name of the global secondary index to be updated.
    */
  @get:JvmSynthetic // Hide from Java callers
  var indexName: String
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.indexName(value)
    }


  /**
    * Represents the provisioned throughput settings for the specified global secondary index.
    * 
    *  For current minimum and maximum provisioned throughput values, see Limits in the
    *  Amazon DynamoDB Developer Guide.
    */
  @get:JvmSynthetic // Hide from Java callers
  var provisionedThroughput: ProvisionedThroughput
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.provisionedThroughput(value)
    }

  
    
  /**
    * Represents the provisioned throughput settings for the specified global secondary index.
    * 
    *  For current minimum and maximum provisioned throughput values, see Limits in the
    *  Amazon DynamoDB Developer Guide.
    */
  fun provisionedThroughput(dslBlock: ProvisionedThroughputDSL.() -> Unit) {
    builder.provisionedThroughput(buildProvisionedThroughput(dslBlock))
  }

}

/**
  * Builds instances of type UpdateGlobalSecondaryIndexAction:
  * Represents the new provisioned throughput settings to be applied to a global secondary index.
  */
fun buildUpdateGlobalSecondaryIndexAction(dslBlock: UpdateGlobalSecondaryIndexActionDSL.() -> Unit) =
  UpdateGlobalSecondaryIndexActionDSL().apply(dslBlock).build()