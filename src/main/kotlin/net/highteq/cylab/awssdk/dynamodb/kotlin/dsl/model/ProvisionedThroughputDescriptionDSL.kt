/*
  This file was generated from https://github.com/aws/aws-sdk-java-v2 by https://github.com/cylab/aws-kotlin-dsl-builder
  Like the original code, this file and project is licensed under
  Apache License Version 2.0
  See LICENSE.txt for more info
*/
@file:Suppress("DEPRECATION")
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
class ProvisionedThroughputDescriptionDSL {
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder = ProvisionedThroughputDescription.builder()
  internal fun build(): ProvisionedThroughputDescription = builder.build()
    
  /**
    * The date and time of the last provisioned throughput increase for this table.
    */
  var lastIncreaseDateTime: Instant?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.lastIncreaseDateTime(value)
    }


  /**
    * The date and time of the last provisioned throughput decrease for this table.
    */
  var lastDecreaseDateTime: Instant?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.lastDecreaseDateTime(value)
    }


  /**
    * The number of provisioned throughput decreases for this table during this UTC calendar day. For current
    *  maximums on provisioned throughput decreases, see Limits in the
    *  Amazon DynamoDB Developer Guide.
    */
  var numberOfDecreasesToday: Long?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.numberOfDecreasesToday(value)
    }


  /**
    * The maximum number of writes consumed per second before DynamoDB returns a ThrottlingException.
    */
  var writeCapacityUnits: Long?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.writeCapacityUnits(value)
    }


  /**
    * The maximum number of strongly consistent reads consumed per second before DynamoDB returns a
    *  ThrottlingException. Eventually consistent reads require less effort than strongly consistent
    *  reads, so a setting of 50 ReadCapacityUnits per second provides 100 eventually consistent
    *  ReadCapacityUnits per second.
    */
  var readCapacityUnits: Long?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.readCapacityUnits(value)
    }

  
  
}

/**
  * Builds instances of type ProvisionedThroughputDescription:
  * Represents the provisioned throughput settings for the table, consisting of read and write capacity units, along with
  *  data about increases and decreases.
  */
fun buildProvisionedThroughputDescription(dslBlock: ProvisionedThroughputDescriptionDSL.() -> Unit) =
  ProvisionedThroughputDescriptionDSL().apply(dslBlock).build()