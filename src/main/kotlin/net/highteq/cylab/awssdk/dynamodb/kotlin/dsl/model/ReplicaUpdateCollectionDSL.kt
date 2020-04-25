/*
  This file was generated from https://github.com/aws/aws-sdk-java-v2 by https://github.com/cylab/aws-kotlin-dsl-builder
  Like the original code, this file and project is licensed under
  Apache License Version 2.0
  See LICENSE.txt for more info
*/
package net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.model

import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSL
import software.amazon.awssdk.services.dynamodb.model.ReplicaUpdate

/**
  * Builds instances of type ReplicaUpdate:
  * Represents one of the following:
  * 
  *  A new replica to be added to an existing global table.
  * 
  *  New parameters for an existing replica.
  * 
  *  An existing replica to be removed from an existing global table.
  */
@DynamodbDSL
class ReplicaUpdateCollectionDSL {
  private val list = ArrayList<ReplicaUpdate>()
  internal fun build() : List<ReplicaUpdate> = list

  fun item(init: ReplicaUpdateDSL.() -> Unit) {
    list.add(ReplicaUpdateDSL().apply(init).build())
  }

  operator fun ReplicaUpdate.unaryPlus() {
    list.add(this)
  }

  operator fun Collection<ReplicaUpdate>.unaryPlus() {
    list.addAll(this)
  }

  operator fun Array<ReplicaUpdate>.unaryPlus() {
    list.addAll(this)
  }
}

/**
  * Builds instances of type ReplicaUpdate:
  * Represents one of the following:
  * 
  *  A new replica to be added to an existing global table.
  * 
  *  New parameters for an existing replica.
  * 
  *  An existing replica to be removed from an existing global table.
  */
fun buildReplicaUpdateCollection(dslBlock: ReplicaUpdateCollectionDSL.() -> Unit) =
  ReplicaUpdateCollectionDSL().apply(dslBlock).build()