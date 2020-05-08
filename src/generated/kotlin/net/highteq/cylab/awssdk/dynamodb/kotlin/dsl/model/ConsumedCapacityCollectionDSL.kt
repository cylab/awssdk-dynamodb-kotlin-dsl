/*
  This file was generated from https://github.com/aws/aws-sdk-java-v2 by https://github.com/cylab/aws-kotlin-dsl-builder
  Like the original code, this file and project is licensed under
  Apache License Version 2.0
  See LICENSE.txt for more info
*/
@file:Suppress("DEPRECATION", "NOTHING_TO_INLINE")
package net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.model

import kotlin.DeprecationLevel.WARNING
import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSL
import software.amazon.awssdk.services.dynamodb.model.ConsumedCapacity

/**
  * Builds a collection of type ConsumedCapacity:
  * The capacity units consumed by an operation. The data returned includes the total provisioned throughput consumed,
  *  along with statistics for the table and any indexes involved in the operation. ConsumedCapacity is only
  *  returned if the request asked for it. For more information, see Provisioned
  *  Throughput in the Amazon DynamoDB Developer Guide.
  */
@DynamodbDSL
inline class ConsumedCapacityCollectionDSL(
  @PublishedApi
  @Deprecated("Don't use internal fields!", level = WARNING)
  internal val list : MutableList<ConsumedCapacity>
){
  @PublishedApi
  internal fun build() = list

  /**
    * Builds an object of type ConsumedCapacity from 
    * the given DSL in 'dslBlock' and adds it to the collection
    */
  inline fun o(dslBlock: ConsumedCapacityDSL.() -> Unit) {
    list.add(buildConsumedCapacity(dslBlock))
  }

  /**
    * Adds a ConsumedCapacity to the collection built by this DSL
    */
  inline operator fun ConsumedCapacity.unaryPlus() {
    list.add(this)
  }

  /**
    * Adds all given ConsumedCapacity instances to the collection built by this DSL
    */
  inline operator fun Collection<ConsumedCapacity>.unaryPlus() {
    list.addAll(this)
  }

  /**
    * Adds all given ConsumedCapacity instances to the collection built by this DSL
    */
  inline operator fun Array<ConsumedCapacity>.unaryPlus() {
    list.addAll(this)
  }
}

/**
  * Builds a collection of type ConsumedCapacity:
  * The capacity units consumed by an operation. The data returned includes the total provisioned throughput consumed,
  *  along with statistics for the table and any indexes involved in the operation. ConsumedCapacity is only
  *  returned if the request asked for it. For more information, see Provisioned
  *  Throughput in the Amazon DynamoDB Developer Guide.
  */
inline fun buildConsumedCapacityCollection(dslBlock: ConsumedCapacityCollectionDSL.() -> Unit) =
  ConsumedCapacityCollectionDSL(mutableListOf<ConsumedCapacity>()).apply(dslBlock).build()