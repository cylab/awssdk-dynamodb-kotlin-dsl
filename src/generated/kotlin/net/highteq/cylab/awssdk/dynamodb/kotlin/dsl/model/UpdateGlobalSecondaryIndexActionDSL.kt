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
import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSLMarker
import software.amazon.awssdk.services.dynamodb.model.ProvisionedThroughput
import software.amazon.awssdk.services.dynamodb.model.UpdateGlobalSecondaryIndexAction

/**
  * Builds instances of type UpdateGlobalSecondaryIndexAction:
  * Represents the new provisioned throughput settings to be applied to a global secondary index.
  */
@DynamodbDSLMarker
inline class UpdateGlobalSecondaryIndexActionDSL(
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder: UpdateGlobalSecondaryIndexAction.Builder
){
  @PublishedApi
  internal fun build(): UpdateGlobalSecondaryIndexAction = builder.build()

  /**
    * 
    */
  inline var indexName: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.indexName(value)
    }

  /**
    * 
    */
  inline var provisionedThroughput: ProvisionedThroughput?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.provisionedThroughput(value)
    }

  /**
    * 
    */
  inline fun provisionedThroughput(dslBlock: ProvisionedThroughputDSL.() -> Unit) {
    builder.provisionedThroughput(DynamodbDSL.Companion.provisionedThroughput(dslBlock))
  }

}

/**
  * Builds instances of type UpdateGlobalSecondaryIndexAction:
  * Represents the new provisioned throughput settings to be applied to a global secondary index.
  */
inline fun updateGlobalSecondaryIndexAction(dslBlock: UpdateGlobalSecondaryIndexActionDSL.() -> Unit) =
  UpdateGlobalSecondaryIndexActionDSL(UpdateGlobalSecondaryIndexAction.builder()).apply(dslBlock).build()

/**
  * Builds instances of type UpdateGlobalSecondaryIndexAction:
  * Represents the new provisioned throughput settings to be applied to a global secondary index.
  */
inline fun DynamodbDSL.Companion.updateGlobalSecondaryIndexAction(dslBlock: UpdateGlobalSecondaryIndexActionDSL.() -> Unit) =
  UpdateGlobalSecondaryIndexActionDSL(UpdateGlobalSecondaryIndexAction.builder()).apply(dslBlock).build()