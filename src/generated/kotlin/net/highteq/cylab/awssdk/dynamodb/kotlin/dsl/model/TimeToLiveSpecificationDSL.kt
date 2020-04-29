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
import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSL
import software.amazon.awssdk.services.dynamodb.model.TimeToLiveSpecification

/**
  * Builds instances of type TimeToLiveSpecification:
  * Represents the settings used to enable or disable Time to Live (TTL) for the specified table.
  */
@DynamodbDSL
class TimeToLiveSpecificationDSL {
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder = TimeToLiveSpecification.builder()
  internal fun build(): TimeToLiveSpecification = builder.build()
    
  /**
    * The name of the TTL attribute used to store the expiration time for items in the table.
    */
  var attributeName: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.attributeName(value)
    }


  /**
    * Indicates whether TTL is to be enabled (true) or disabled (false) on the table.
    */
  var enabled: Boolean?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.enabled(value)
    }

  
  
  
}

/**
  * Builds instances of type TimeToLiveSpecification:
  * Represents the settings used to enable or disable Time to Live (TTL) for the specified table.
  */
fun buildTimeToLiveSpecification(dslBlock: TimeToLiveSpecificationDSL.() -> Unit) =
  TimeToLiveSpecificationDSL().apply(dslBlock).build()