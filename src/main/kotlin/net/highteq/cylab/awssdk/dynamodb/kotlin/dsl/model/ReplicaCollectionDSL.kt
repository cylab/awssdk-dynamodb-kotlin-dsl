/*
  This file was generated from https://github.com/aws/aws-sdk-java-v2 by https://github.com/cylab/aws-kotlin-dsl-builder
  Like the original code, this file and project is licensed under
  Apache License Version 2.0
  See LICENSE.txt for more info
*/
package net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.model

import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSL
import software.amazon.awssdk.services.dynamodb.model.Replica

/**
  * Builds instances of type Replica:
  * Represents the properties of a replica.
  */
@DynamodbDSL
class ReplicaCollectionDSL {
  private val list = ArrayList<Replica>()
  internal fun build() : List<Replica> = list

  /**
    * Receives a sub DSL in 'dslBlock' to build a Replica instance
    * and adds it to the collection built by the enclosing DSL
    */
  fun add(dslBlock: ReplicaDSL.() -> Unit) {
    list.add(ReplicaDSL().apply(dslBlock).build())
  }

  /**
    * Adds a Replica to the collection built by this DSL
    */
  fun add(item: Replica) {
    list.add(item)
  }

  /**
    * Adds all given Replica instances to the collection built by this DSL
    */
  fun addAll(items: Collection<Replica>) {
    list.addAll(items)
  }

  /**
    * Adds all given Replica instances to the collection built by this DSL
    */
  infix fun addAll(items: Array<Replica>) {
    list.addAll(items)
  }

  /**
    * Adds a Replica to the collection built by this DSL
    */
  operator fun Replica.unaryPlus() {
    list.add(this)
  }

  /**
    * Adds all given Replica instances to the collection built by this DSL
    */
  operator fun Collection<Replica>.unaryPlus() {
    list.addAll(this)
  }

  /**
    * Adds all given Replica instances to the collection built by this DSL
    */
  operator fun Array<Replica>.unaryPlus() {
    list.addAll(this)
  }
}

/**
  * Builds instances of type Replica:
  * Represents the properties of a replica.
  */
fun buildReplicaCollection(dslBlock: ReplicaCollectionDSL.() -> Unit) =
  ReplicaCollectionDSL().apply(dslBlock).build()