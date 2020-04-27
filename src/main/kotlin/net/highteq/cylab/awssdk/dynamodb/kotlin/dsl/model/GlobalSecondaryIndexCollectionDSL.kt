/*
  This file was generated from https://github.com/aws/aws-sdk-java-v2 by https://github.com/cylab/aws-kotlin-dsl-builder
  Like the original code, this file and project is licensed under
  Apache License Version 2.0
  See LICENSE.txt for more info
*/
package net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.model

import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSL
import software.amazon.awssdk.services.dynamodb.model.GlobalSecondaryIndex

/**
  * Builds instances of type GlobalSecondaryIndex:
  * Represents the properties of a global secondary index.
  */
@DynamodbDSL
class GlobalSecondaryIndexCollectionDSL {
  private val list = ArrayList<GlobalSecondaryIndex>()
  internal fun build() : List<GlobalSecondaryIndex> = list

  /**
    * Receives a sub DSL in 'dslBlock' to build a GlobalSecondaryIndex instance
    * and adds it to the collection built by the enclosing DSL
    */
  fun add(dslBlock: GlobalSecondaryIndexDSL.() -> Unit) {
    list.add(GlobalSecondaryIndexDSL().apply(dslBlock).build())
  }

  /**
    * Adds a GlobalSecondaryIndex to the collection built by this DSL
    */
  fun add(item: GlobalSecondaryIndex) {
    list.add(item)
  }

  /**
    * Adds all given GlobalSecondaryIndex instances to the collection built by this DSL
    */
  fun addAll(items: Collection<GlobalSecondaryIndex>) {
    list.addAll(items)
  }

  /**
    * Adds all given GlobalSecondaryIndex instances to the collection built by this DSL
    */
  infix fun addAll(items: Array<GlobalSecondaryIndex>) {
    list.addAll(items)
  }

  /**
    * Adds a GlobalSecondaryIndex to the collection built by this DSL
    */
  operator fun GlobalSecondaryIndex.unaryPlus() {
    list.add(this)
  }

  /**
    * Adds all given GlobalSecondaryIndex instances to the collection built by this DSL
    */
  operator fun Collection<GlobalSecondaryIndex>.unaryPlus() {
    list.addAll(this)
  }

  /**
    * Adds all given GlobalSecondaryIndex instances to the collection built by this DSL
    */
  operator fun Array<GlobalSecondaryIndex>.unaryPlus() {
    list.addAll(this)
  }
}

/**
  * Builds instances of type GlobalSecondaryIndex:
  * Represents the properties of a global secondary index.
  */
fun buildGlobalSecondaryIndexCollection(dslBlock: GlobalSecondaryIndexCollectionDSL.() -> Unit) =
  GlobalSecondaryIndexCollectionDSL().apply(dslBlock).build()