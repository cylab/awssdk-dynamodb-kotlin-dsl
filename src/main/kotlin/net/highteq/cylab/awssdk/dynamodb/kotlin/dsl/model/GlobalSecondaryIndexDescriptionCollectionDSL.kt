/*
  This file was generated from https://github.com/aws/aws-sdk-java-v2 by https://github.com/cylab/aws-kotlin-dsl-builder
  Like the original code, this file and project is licensed under
  Apache License Version 2.0
  See LICENSE.txt for more info
*/
package net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.model

import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSL
import software.amazon.awssdk.services.dynamodb.model.GlobalSecondaryIndexDescription

/**
  * Builds instances of type GlobalSecondaryIndexDescription:
  * Represents the properties of a global secondary index.
  */
@DynamodbDSL
class GlobalSecondaryIndexDescriptionCollectionDSL {
  private val list = ArrayList<GlobalSecondaryIndexDescription>()
  internal fun build() : List<GlobalSecondaryIndexDescription> = list

  /**
    * Receives a sub DSL in 'dslBlock' to build a GlobalSecondaryIndexDescription instance
    * and adds it to the collection built by the enclosing DSL
    */
  fun add(dslBlock: GlobalSecondaryIndexDescriptionDSL.() -> Unit) {
    list.add(GlobalSecondaryIndexDescriptionDSL().apply(dslBlock).build())
  }

  /**
    * Adds a GlobalSecondaryIndexDescription to the collection built by this DSL
    */
  fun add(item: GlobalSecondaryIndexDescription) {
    list.add(item)
  }

  /**
    * Adds all given GlobalSecondaryIndexDescription instances to the collection built by this DSL
    */
  fun addAll(items: Collection<GlobalSecondaryIndexDescription>) {
    list.addAll(items)
  }

  /**
    * Adds all given GlobalSecondaryIndexDescription instances to the collection built by this DSL
    */
  infix fun addAll(items: Array<GlobalSecondaryIndexDescription>) {
    list.addAll(items)
  }

  /**
    * Adds a GlobalSecondaryIndexDescription to the collection built by this DSL
    */
  operator fun GlobalSecondaryIndexDescription.unaryPlus() {
    list.add(this)
  }

  /**
    * Adds all given GlobalSecondaryIndexDescription instances to the collection built by this DSL
    */
  operator fun Collection<GlobalSecondaryIndexDescription>.unaryPlus() {
    list.addAll(this)
  }

  /**
    * Adds all given GlobalSecondaryIndexDescription instances to the collection built by this DSL
    */
  operator fun Array<GlobalSecondaryIndexDescription>.unaryPlus() {
    list.addAll(this)
  }
}

/**
  * Builds instances of type GlobalSecondaryIndexDescription:
  * Represents the properties of a global secondary index.
  */
fun buildGlobalSecondaryIndexDescriptionCollection(dslBlock: GlobalSecondaryIndexDescriptionCollectionDSL.() -> Unit) =
  GlobalSecondaryIndexDescriptionCollectionDSL().apply(dslBlock).build()