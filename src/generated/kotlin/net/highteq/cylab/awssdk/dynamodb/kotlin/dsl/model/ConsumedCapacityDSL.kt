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
import software.amazon.awssdk.services.dynamodb.model.ConsumedCapacity

/**
  * Builds instances of type ConsumedCapacity:
  * The capacity units consumed by an operation. The data returned includes the total provisioned throughput consumed,
  *  along with statistics for the table and any indexes involved in the operation. ConsumedCapacity is only
  *  returned if the request asked for it. For more information, see Provisioned
  *  Throughput in the Amazon DynamoDB Developer Guide.
  */
@DynamodbDSLMarker
inline class ConsumedCapacityDSL(
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder: ConsumedCapacity.Builder
){
  @PublishedApi
  internal fun build(): ConsumedCapacity = builder.build()

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
  inline var globalSecondaryIndexes: Map<String, Capacity>?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.globalSecondaryIndexes(value)
    }

  /**
    * 
    */
  inline var localSecondaryIndexes: Map<String, Capacity>?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.localSecondaryIndexes(value)
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
  inline var table: Capacity?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.table(value)
    }

  /**
    * 
    */
  inline var tableName: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.tableName(value)
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

  /**
    * 
    */
  inline fun globalSecondaryIndexes(dslBlock: CapacityMapDSL.() -> Unit) {
    builder.globalSecondaryIndexes(DynamodbDSL.Companion.capacityMap(dslBlock))
  }

  /**
    * 
    */
  inline fun localSecondaryIndexes(dslBlock: CapacityMapDSL.() -> Unit) {
    builder.localSecondaryIndexes(DynamodbDSL.Companion.capacityMap(dslBlock))
  }

  /**
    * 
    */
  inline fun table(dslBlock: CapacityDSL.() -> Unit) {
    builder.table(DynamodbDSL.Companion.capacity(dslBlock))
  }

}

/**
  * Builds instances of type ConsumedCapacity:
  * The capacity units consumed by an operation. The data returned includes the total provisioned throughput consumed,
  *  along with statistics for the table and any indexes involved in the operation. ConsumedCapacity is only
  *  returned if the request asked for it. For more information, see Provisioned
  *  Throughput in the Amazon DynamoDB Developer Guide.
  */
inline fun consumedCapacity(dslBlock: ConsumedCapacityDSL.() -> Unit) =
  ConsumedCapacityDSL(ConsumedCapacity.builder()).apply(dslBlock).build()

/**
  * Builds instances of type ConsumedCapacity:
  * The capacity units consumed by an operation. The data returned includes the total provisioned throughput consumed,
  *  along with statistics for the table and any indexes involved in the operation. ConsumedCapacity is only
  *  returned if the request asked for it. For more information, see Provisioned
  *  Throughput in the Amazon DynamoDB Developer Guide.
  */
inline fun DynamodbDSL.Companion.consumedCapacity(dslBlock: ConsumedCapacityDSL.() -> Unit) =
  ConsumedCapacityDSL(ConsumedCapacity.builder()).apply(dslBlock).build()