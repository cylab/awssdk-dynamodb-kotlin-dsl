/*
  This file was generated from https://github.com/aws/aws-sdk-java-v2 by https://github.com/cylab/aws-kotlin-dsl-builder
  Like the original code, this file and project is licensed under
  Apache License Version 2.0
  See LICENSE.txt for more info
*/
package net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.model

import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSL
import software.amazon.awssdk.services.dynamodb.model.ReplicaSettingsDescription

/**
  * Builds instances of type ReplicaSettingsDescription:
  * Represents the properties of a replica.
  */
@DynamodbDSL
class ReplicaSettingsDescriptionCollectionDSL {
  private val list = ArrayList<ReplicaSettingsDescription>()
  internal fun build() : List<ReplicaSettingsDescription> = list

  fun item(dslBlock: ReplicaSettingsDescriptionDSL.() -> Unit) {
    list.add(ReplicaSettingsDescriptionDSL().apply(dslBlock).build())
  }

  operator fun ReplicaSettingsDescription.unaryPlus() {
    list.add(this)
  }

  operator fun Collection<ReplicaSettingsDescription>.unaryPlus() {
    list.addAll(this)
  }

  operator fun Array<ReplicaSettingsDescription>.unaryPlus() {
    list.addAll(this)
  }
}

/**
  * Builds instances of type ReplicaSettingsDescription:
  * Represents the properties of a replica.
  */
fun buildReplicaSettingsDescriptionCollection(dslBlock: ReplicaSettingsDescriptionCollectionDSL.() -> Unit) =
  ReplicaSettingsDescriptionCollectionDSL().apply(dslBlock).build()