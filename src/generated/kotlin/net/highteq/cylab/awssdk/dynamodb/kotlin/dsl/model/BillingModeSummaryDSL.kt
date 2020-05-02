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
import software.amazon.awssdk.services.dynamodb.model.BillingMode
import software.amazon.awssdk.services.dynamodb.model.BillingModeSummary

/**
  * Builds instances of type BillingModeSummary:
  * Contains the details for the read/write capacity mode.
  */
@DynamodbDSL
inline class BillingModeSummaryDSL(
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder: BillingModeSummary.Builder
){
  @PublishedApi
  internal fun build(): BillingModeSummary = builder.build()
    
  /**
    * 
    */
  inline var billingMode: BillingMode?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.billingMode(value)
    }


  /**
    * 
    */
  inline var lastUpdateToPayPerRequestDateTime: Instant?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.lastUpdateToPayPerRequestDateTime(value)
    }

    
  /**
    * 
    */
  inline fun billingMode(value: String?) {
    builder.billingMode(value)
  }

  
  
}

/**
  * Builds instances of type BillingModeSummary:
  * Contains the details for the read/write capacity mode.
  */
inline fun buildBillingModeSummary(dslBlock: BillingModeSummaryDSL.() -> Unit) =
  BillingModeSummaryDSL(BillingModeSummary.builder()).apply(dslBlock).build()