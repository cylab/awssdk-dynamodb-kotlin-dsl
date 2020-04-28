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
import software.amazon.awssdk.services.dynamodb.model.Capacity
import software.amazon.awssdk.services.dynamodb.model.ConsumedCapacity

/**
  * Builds instances of type ConsumedCapacity:
  * The capacity units consumed by an operation. The data returned includes the total provisioned throughput consumed,
  *  along with statistics for the table and any indexes involved in the operation. ConsumedCapacity is only
  *  returned if the request asked for it. For more information, see Provisioned
  *  Throughput in the Amazon DynamoDB Developer Guide.
  */
@DynamodbDSL
class ConsumedCapacityDSL {
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder = ConsumedCapacity.builder()
  internal fun build(): ConsumedCapacity = builder.build()
    
  /**
    * The total number of capacity units consumed by the operation.
    */
  var capacityUnits: Double?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.capacityUnits(value)
    }


  /**
    * The amount of throughput consumed on each global index affected by the operation.
    */
  var globalSecondaryIndexes: Map<String, Capacity>?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.globalSecondaryIndexes(value)
    }


  /**
    * The amount of throughput consumed on each local index affected by the operation.
    */
  var localSecondaryIndexes: Map<String, Capacity>?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.localSecondaryIndexes(value)
    }


  /**
    * The total number of read capacity units consumed by the operation.
    */
  var readCapacityUnits: Double?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.readCapacityUnits(value)
    }


  /**
    * The amount of throughput consumed on the table affected by the operation.
    */
  var table: Capacity?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.table(value)
    }


  /**
    * The name of the table that was affected by the operation.
    */
  var tableName: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.tableName(value)
    }


  /**
    * The total number of write capacity units consumed by the operation.
    */
  var writeCapacityUnits: Double?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.writeCapacityUnits(value)
    }

  
    
  /**
    * The amount of throughput consumed on each global index affected by the operation.
    */
  fun globalSecondaryIndexes(dslBlock: CapacityMapDSL.() -> Unit) {
    builder.globalSecondaryIndexes(buildCapacityMap(dslBlock))
  }


  /**
    * The amount of throughput consumed on each local index affected by the operation.
    */
  fun localSecondaryIndexes(dslBlock: CapacityMapDSL.() -> Unit) {
    builder.localSecondaryIndexes(buildCapacityMap(dslBlock))
  }


  /**
    * The amount of throughput consumed on the table affected by the operation.
    */
  fun table(dslBlock: CapacityDSL.() -> Unit) {
    builder.table(buildCapacity(dslBlock))
  }

}

/**
  * Builds instances of type ConsumedCapacity:
  * The capacity units consumed by an operation. The data returned includes the total provisioned throughput consumed,
  *  along with statistics for the table and any indexes involved in the operation. ConsumedCapacity is only
  *  returned if the request asked for it. For more information, see Provisioned
  *  Throughput in the Amazon DynamoDB Developer Guide.
  */
fun buildConsumedCapacity(dslBlock: ConsumedCapacityDSL.() -> Unit) =
  ConsumedCapacityDSL().apply(dslBlock).build()