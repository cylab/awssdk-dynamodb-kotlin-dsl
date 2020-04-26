/*
  This file was generated from https://github.com/aws/aws-sdk-java-v2 by https://github.com/cylab/aws-kotlin-dsl-builder
  Like the original code, this file and project is licensed under
  Apache License Version 2.0
  See LICENSE.txt for more info
*/
package net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.model

import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSL
import software.amazon.awssdk.services.dynamodb.model.ReplicaDescription

/**
  * Builds instances of type ReplicaDescription:
  * Contains the details of the replica.
  */
@DynamodbDSL
class ReplicaDescriptionCollectionDSL {
  private val list = ArrayList<ReplicaDescription>()
  internal fun build() : List<ReplicaDescription> = list

  fun item(dslBlock: ReplicaDescriptionDSL.() -> Unit) {
    list.add(ReplicaDescriptionDSL().apply(dslBlock).build())
  }

  operator fun ReplicaDescription.unaryPlus() {
    list.add(this)
  }

  operator fun Collection<ReplicaDescription>.unaryPlus() {
    list.addAll(this)
  }

  operator fun Array<ReplicaDescription>.unaryPlus() {
    list.addAll(this)
  }
}

/**
  * Builds instances of type ReplicaDescription:
  * Contains the details of the replica.
  */
fun buildReplicaDescriptionCollection(dslBlock: ReplicaDescriptionCollectionDSL.() -> Unit) =
  ReplicaDescriptionCollectionDSL().apply(dslBlock).build()