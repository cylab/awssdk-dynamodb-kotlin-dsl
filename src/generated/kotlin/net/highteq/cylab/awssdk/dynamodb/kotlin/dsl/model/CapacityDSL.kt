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
import software.amazon.awssdk.services.dynamodb.model.Capacity

/**
  * Builds instances of type Capacity:
  * Represents the amount of provisioned throughput capacity consumed on a table or an index.
  */
@DynamodbDSLMarker
inline class CapacityDSL(
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder: Capacity.Builder
){
  @PublishedApi
  internal fun build(): Capacity = builder.build()

  /**
    * 
    */
  inline var capacityUnits: Double?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.capacityUnits(value)
    }

  /**
    * 
    */
  inline var readCapacityUnits: Double?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.readCapacityUnits(value)
    }

  /**
    * 
    */
  inline var writeCapacityUnits: Double?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.writeCapacityUnits(value)
    }

}

/**
  * Builds instances of type Capacity:
  * Represents the amount of provisioned throughput capacity consumed on a table or an index.
  */
inline fun capacity(dslBlock: CapacityDSL.() -> Unit) =
  CapacityDSL(Capacity.builder()).apply(dslBlock).build()

/**
  * Builds instances of type Capacity:
  * Represents the amount of provisioned throughput capacity consumed on a table or an index.
  */
inline fun DynamodbDSL.Companion.capacity(dslBlock: CapacityDSL.() -> Unit) =
  CapacityDSL(Capacity.builder()).apply(dslBlock).build()