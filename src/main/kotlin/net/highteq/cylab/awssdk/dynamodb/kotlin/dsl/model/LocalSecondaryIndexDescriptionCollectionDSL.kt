/*
  This file was generated from https://github.com/aws/aws-sdk-java-v2 by https://github.com/cylab/aws-kotlin-dsl-builder
  Like the original code, this file and project is licensed under
  Apache License Version 2.0
  See LICENSE.txt for more info
*/
package net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.model

import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSL
import software.amazon.awssdk.services.dynamodb.model.LocalSecondaryIndexDescription

/**
  * Builds instances of type LocalSecondaryIndexDescription:
  * Represents the properties of a local secondary index.
  */
@DynamodbDSL
class LocalSecondaryIndexDescriptionCollectionDSL {
  private val list = ArrayList<LocalSecondaryIndexDescription>()
  internal fun build() : List<LocalSecondaryIndexDescription> = list

  /**
    * Receives a sub DSL in 'dslBlock' to build a LocalSecondaryIndexDescription instance
    * and adds it to the collection built by the enclosing DSL
    */
  fun add(dslBlock: LocalSecondaryIndexDescriptionDSL.() -> Unit) {
    list.add(LocalSecondaryIndexDescriptionDSL().apply(dslBlock).build())
  }

  /**
    * Adds a LocalSecondaryIndexDescription to the collection built by this DSL
    */
  fun add(item: LocalSecondaryIndexDescription) {
    list.add(item)
  }

  /**
    * Adds all given LocalSecondaryIndexDescription instances to the collection built by this DSL
    */
  fun addAll(items: Collection<LocalSecondaryIndexDescription>) {
    list.addAll(items)
  }

  /**
    * Adds all given LocalSecondaryIndexDescription instances to the collection built by this DSL
    */
  infix fun addAll(items: Array<LocalSecondaryIndexDescription>) {
    list.addAll(items)
  }

  /**
    * Adds a LocalSecondaryIndexDescription to the collection built by this DSL
    */
  operator fun LocalSecondaryIndexDescription.unaryPlus() {
    list.add(this)
  }

  /**
    * Adds all given LocalSecondaryIndexDescription instances to the collection built by this DSL
    */
  operator fun Collection<LocalSecondaryIndexDescription>.unaryPlus() {
    list.addAll(this)
  }

  /**
    * Adds all given LocalSecondaryIndexDescription instances to the collection built by this DSL
    */
  operator fun Array<LocalSecondaryIndexDescription>.unaryPlus() {
    list.addAll(this)
  }
}

/**
  * Builds instances of type LocalSecondaryIndexDescription:
  * Represents the properties of a local secondary index.
  */
fun buildLocalSecondaryIndexDescriptionCollection(dslBlock: LocalSecondaryIndexDescriptionCollectionDSL.() -> Unit) =
  LocalSecondaryIndexDescriptionCollectionDSL().apply(dslBlock).build()