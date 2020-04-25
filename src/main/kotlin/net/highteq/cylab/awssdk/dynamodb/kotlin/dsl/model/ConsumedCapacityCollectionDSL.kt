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

  fun item(init: ConsumedCapacityDSL.() -> Unit) {
    list.add(ConsumedCapacityDSL().apply(init).build())
  }

  operator fun ConsumedCapacity.unaryPlus() {
    list.add(this)
  }

  operator fun Collection<ConsumedCapacity>.unaryPlus() {
    list.addAll(this)
  }

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