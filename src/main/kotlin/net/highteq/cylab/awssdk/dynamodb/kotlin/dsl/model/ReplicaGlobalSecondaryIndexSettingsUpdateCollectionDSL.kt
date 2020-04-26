/*
  This file was generated from https://github.com/aws/aws-sdk-java-v2 by https://github.com/cylab/aws-kotlin-dsl-builder
  Like the original code, this file and project is licensed under
  Apache License Version 2.0
  See LICENSE.txt for more info
*/
package net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.model

import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSL
import software.amazon.awssdk.services.dynamodb.model.ReplicaGlobalSecondaryIndexSettingsUpdate

/**
  * Builds instances of type ReplicaGlobalSecondaryIndexSettingsUpdate:
  * Represents the settings of a global secondary index for a global table that will be modified.
  */
@DynamodbDSL
class ReplicaGlobalSecondaryIndexSettingsUpdateCollectionDSL {
  private val list = ArrayList<ReplicaGlobalSecondaryIndexSettingsUpdate>()
  internal fun build() : List<ReplicaGlobalSecondaryIndexSettingsUpdate> = list

  fun item(dslBlock: ReplicaGlobalSecondaryIndexSettingsUpdateDSL.() -> Unit) {
    list.add(ReplicaGlobalSecondaryIndexSettingsUpdateDSL().apply(dslBlock).build())
  }

  operator fun ReplicaGlobalSecondaryIndexSettingsUpdate.unaryPlus() {
    list.add(this)
  }

  operator fun Collection<ReplicaGlobalSecondaryIndexSettingsUpdate>.unaryPlus() {
    list.addAll(this)
  }

  operator fun Array<ReplicaGlobalSecondaryIndexSettingsUpdate>.unaryPlus() {
    list.addAll(this)
  }
}

/**
  * Builds instances of type ReplicaGlobalSecondaryIndexSettingsUpdate:
  * Represents the settings of a global secondary index for a global table that will be modified.
  */
fun buildReplicaGlobalSecondaryIndexSettingsUpdateCollection(dslBlock: ReplicaGlobalSecondaryIndexSettingsUpdateCollectionDSL.() -> Unit) =
  ReplicaGlobalSecondaryIndexSettingsUpdateCollectionDSL().apply(dslBlock).build()