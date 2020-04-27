/*
  This file was generated from https://github.com/aws/aws-sdk-java-v2 by https://github.com/cylab/aws-kotlin-dsl-builder
  Like the original code, this file and project is licensed under
  Apache License Version 2.0
  See LICENSE.txt for more info
*/
package net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.model

import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSL
import software.amazon.awssdk.services.dynamodb.model.ConsumedCapacity

/**
  * Builds instances of type ConsumedCapacity:
  * The capacity units consumed by an operation. The data returned includes the total provisioned throughput consumed,
  *  along with statistics for the table and any indexes involved in the operation. ConsumedCapacity is only
  *  returned if the request asked for it. For more information, see Provisioned
  *  Throughput in the Amazon DynamoDB Developer Guide.
  */
@DynamodbDSL
class ConsumedCapacityCollectionDSL {
  private val list = ArrayList<ConsumedCapacity>()
  internal fun build() : List<ConsumedCapacity> = list

  /**
    * Receives a sub DSL in 'dslBlock' to build a ConsumedCapacity instance
    * and adds it to the collection built by the enclosing DSL
    */
  fun add(dslBlock: ConsumedCapacityDSL.() -> Unit) {
    list.add(ConsumedCapacityDSL().apply(dslBlock).build())
  }

  /**
    * Adds a ConsumedCapacity to the collection built by this DSL
    */
  fun add(item: ConsumedCapacity) {
    list.add(item)
  }

  /**
    * Adds all given ConsumedCapacity instances to the collection built by this DSL
    */
  fun addAll(items: Collection<ConsumedCapacity>) {
    list.addAll(items)
  }

  /**
    * Adds all given ConsumedCapacity instances to the collection built by this DSL
    */
  infix fun addAll(items: Array<ConsumedCapacity>) {
    list.addAll(items)
  }

  /**
    * Adds a ConsumedCapacity to the collection built by this DSL
    */
  operator fun ConsumedCapacity.unaryPlus() {
    list.add(this)
  }

  /**
    * Adds all given ConsumedCapacity instances to the collection built by this DSL
    */
  operator fun Collection<ConsumedCapacity>.unaryPlus() {
    list.addAll(this)
  }

  /**
    * Adds all given ConsumedCapacity instances to the collection built by this DSL
    */
  operator fun Array<ConsumedCapacity>.unaryPlus() {
    list.addAll(this)
  }
}

/**
  * Builds instances of type ConsumedCapacity:
  * The capacity units consumed by an operation. The data returned includes the total provisioned throughput consumed,
  *  along with statistics for the table and any indexes involved in the operation. ConsumedCapacity is only
  *  returned if the request asked for it. For more information, see Provisioned
  *  Throughput in the Amazon DynamoDB Developer Guide.
  */
fun buildConsumedCapacityCollection(dslBlock: ConsumedCapacityCollectionDSL.() -> Unit) =
  ConsumedCapacityCollectionDSL().apply(dslBlock).build()