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

/**
  * Builds instances of type ProvisionedThroughput:
  * Represents the provisioned throughput settings for a specified table or index. The settings can be modified using the
  *  UpdateTable operation.
  * 
  *  For current minimum and maximum provisioned throughput values, see Limits in the Amazon
  *  DynamoDB Developer Guide.
  */
@DynamodbDSLMarker
inline class ProvisionedThroughputDSL(
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder: ProvisionedThroughput.Builder
){
  @PublishedApi
  internal fun build(): ProvisionedThroughput = builder.build()

  /**
    * 
    */
  inline var readCapacityUnits: Long?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.readCapacityUnits(value)
    }

  /**
    * 
    */
  inline var writeCapacityUnits: Long?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.writeCapacityUnits(value)
    }

}

/**
  * Builds instances of type ProvisionedThroughput:
  * Represents the provisioned throughput settings for a specified table or index. The settings can be modified using the
  *  UpdateTable operation.
  * 
  *  For current minimum and maximum provisioned throughput values, see Limits in the Amazon
  *  DynamoDB Developer Guide.
  */
inline fun provisionedThroughput(dslBlock: ProvisionedThroughputDSL.() -> Unit) =
  ProvisionedThroughputDSL(ProvisionedThroughput.builder()).apply(dslBlock).build()

/**
  * Builds instances of type ProvisionedThroughput:
  * Represents the provisioned throughput settings for a specified table or index. The settings can be modified using the
  *  UpdateTable operation.
  * 
  *  For current minimum and maximum provisioned throughput values, see Limits in the Amazon
  *  DynamoDB Developer Guide.
  */
inline fun DynamodbDSL.Companion.provisionedThroughput(dslBlock: ProvisionedThroughputDSL.() -> Unit) =
  ProvisionedThroughputDSL(ProvisionedThroughput.builder()).apply(dslBlock).build()