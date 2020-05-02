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
import java.time.Instant
import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSL
import software.amazon.awssdk.services.dynamodb.model.ProvisionedThroughputDescription

/**
  * Builds instances of type ProvisionedThroughputDescription:
  * Represents the provisioned throughput settings for the table, consisting of read and write capacity units, along with
  *  data about increases and decreases.
  */
@DynamodbDSL
inline class ProvisionedThroughputDescriptionDSL(
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder: ProvisionedThroughputDescription.Builder
){
  @PublishedApi
  internal fun build(): ProvisionedThroughputDescription = builder.build()

  /**
    * 
    */
  inline var lastDecreaseDateTime: Instant?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.lastDecreaseDateTime(value)
    }

  /**
    * 
    */
  inline var lastIncreaseDateTime: Instant?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.lastIncreaseDateTime(value)
    }

  /**
    * 
    */
  inline var numberOfDecreasesToday: Long?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.numberOfDecreasesToday(value)
    }

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
  * Builds instances of type ProvisionedThroughputDescription:
  * Represents the provisioned throughput settings for the table, consisting of read and write capacity units, along with
  *  data about increases and decreases.
  */
inline fun buildProvisionedThroughputDescription(dslBlock: ProvisionedThroughputDescriptionDSL.() -> Unit) =
  ProvisionedThroughputDescriptionDSL(ProvisionedThroughputDescription.builder()).apply(dslBlock).build()