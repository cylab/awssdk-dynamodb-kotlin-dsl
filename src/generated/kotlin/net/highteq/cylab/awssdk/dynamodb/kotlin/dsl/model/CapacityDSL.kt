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

/**
  * Builds instances of type Capacity:
  * Represents the amount of provisioned throughput capacity consumed on a table or an index.
  */
@DynamodbDSL
class CapacityDSL {
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder = Capacity.builder()
  internal fun build(): Capacity = builder.build()
    
  /**
    * The total number of capacity units consumed on a table or an index.
    */
  var capacityUnits: Double?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.capacityUnits(value)
    }


  /**
    * The total number of read capacity units consumed on a table or an index.
    */
  var readCapacityUnits: Double?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.readCapacityUnits(value)
    }


  /**
    * The total number of write capacity units consumed on a table or an index.
    */
  var writeCapacityUnits: Double?
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
fun buildCapacity(dslBlock: CapacityDSL.() -> Unit) =
  CapacityDSL().apply(dslBlock).build()