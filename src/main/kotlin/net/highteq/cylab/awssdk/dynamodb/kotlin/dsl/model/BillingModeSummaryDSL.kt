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
import software.amazon.awssdk.services.dynamodb.model.BillingMode
import software.amazon.awssdk.services.dynamodb.model.BillingModeSummary

/**
  * Builds instances of type BillingModeSummary:
  * Contains the details for the read/write capacity mode.
  */
@DynamodbDSL
class BillingModeSummaryDSL {
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  internal val builder = BillingModeSummary.builder()
  internal fun build(): BillingModeSummary = builder.build()
    
  /**
    * Controls how you are charged for read and write throughput and how you manage capacity. This setting can be
    *  changed later.
    * 
    *  PROVISIONED - Sets the read/write capacity mode to PROVISIONED. We recommend using
    *  PROVISIONED for predictable workloads.
    * 
    *  PAY_PER_REQUEST - Sets the read/write capacity mode to PAY_PER_REQUEST. We
    *  recommend using PAY_PER_REQUEST for unpredictable workloads.
    */
  var billingMode: BillingMode
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.billingMode(value)
    }


  /**
    * Represents the time when PAY_PER_REQUEST was last set as the read/write capacity mode.
    */
  var lastUpdateToPayPerRequestDateTime: Instant
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.lastUpdateToPayPerRequestDateTime(value)
    }

    
  /**
    * Controls how you are charged for read and write throughput and how you manage capacity. This setting can be
    *  changed later.
    * 
    *  PROVISIONED - Sets the read/write capacity mode to PROVISIONED. We recommend using
    *  PROVISIONED for predictable workloads.
    * 
    *  PAY_PER_REQUEST - Sets the read/write capacity mode to PAY_PER_REQUEST. We
    *  recommend using PAY_PER_REQUEST for unpredictable workloads.
    */
  fun billingMode(value: String) {
    builder.billingMode(value)
  }

  
}

/**
  * Builds instances of type BillingModeSummary:
  * Contains the details for the read/write capacity mode.
  */
fun buildBillingModeSummary(dslBlock: BillingModeSummaryDSL.() -> Unit) =
  BillingModeSummaryDSL().apply(dslBlock).build()