/*
  This file was generated from https://github.com/aws/aws-sdk-java-v2 by https://github.com/cylab/aws-kotlin-dsl-builder
  Like the original code, this file and project is licensed under
  Apache License Version 2.0
  See LICENSE.txt for more info
*/
package net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.model

import kotlin.DeprecationLevel.HIDDEN
import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSL
import software.amazon.awssdk.services.dynamodb.model.Endpoint

/**
  * Builds instances of type Endpoint:
  * An endpoint information details.
  */
@DynamodbDSL
class EndpointDSL {
  private val builder = Endpoint.builder()
  internal fun build(): Endpoint = builder.build()
    
  /**
    * Endpoint cache time to live (TTL) value.
    */
  @get:JvmSynthetic // Hide from Java callers
  var cachePeriodInMinutes: Long
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.cachePeriodInMinutes(value)
    }


  /**
    * IP address of the endpoint.
    */
  @get:JvmSynthetic // Hide from Java callers
  var address: String
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.address(value)
    }

  
  
}

/**
  * Builds instances of type Endpoint:
  * An endpoint information details.
  */
fun buildEndpoint(dslBlock: EndpointDSL.() -> Unit) =
  EndpointDSL().apply(dslBlock).build()