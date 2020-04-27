/*
  This file was generated from https://github.com/aws/aws-sdk-java-v2 by https://github.com/cylab/aws-kotlin-dsl-builder
  Like the original code, this file and project is licensed under
  Apache License Version 2.0
  See LICENSE.txt for more info
*/
package net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.model

import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSL
import software.amazon.awssdk.services.dynamodb.model.GlobalSecondaryIndexInfo

/**
  * Builds instances of type GlobalSecondaryIndexInfo:
  * Represents the properties of a global secondary index for the table when the backup was created.
  */
@DynamodbDSL
class GlobalSecondaryIndexInfoCollectionDSL {
  private val list = ArrayList<GlobalSecondaryIndexInfo>()
  internal fun build() : List<GlobalSecondaryIndexInfo> = list

  /**
    * Receives a sub DSL in 'dslBlock' to build a GlobalSecondaryIndexInfo instance
    * and adds it to the collection built by the enclosing DSL
    */
  fun add(dslBlock: GlobalSecondaryIndexInfoDSL.() -> Unit) {
    list.add(GlobalSecondaryIndexInfoDSL().apply(dslBlock).build())
  }

  /**
    * Adds a GlobalSecondaryIndexInfo to the collection built by this DSL
    */
  fun add(item: GlobalSecondaryIndexInfo) {
    list.add(item)
  }

  /**
    * Adds all given GlobalSecondaryIndexInfo instances to the collection built by this DSL
    */
  fun addAll(items: Collection<GlobalSecondaryIndexInfo>) {
    list.addAll(items)
  }

  /**
    * Adds all given GlobalSecondaryIndexInfo instances to the collection built by this DSL
    */
  infix fun addAll(items: Array<GlobalSecondaryIndexInfo>) {
    list.addAll(items)
  }

  /**
    * Adds a GlobalSecondaryIndexInfo to the collection built by this DSL
    */
  operator fun GlobalSecondaryIndexInfo.unaryPlus() {
    list.add(this)
  }

  /**
    * Adds all given GlobalSecondaryIndexInfo instances to the collection built by this DSL
    */
  operator fun Collection<GlobalSecondaryIndexInfo>.unaryPlus() {
    list.addAll(this)
  }

  /**
    * Adds all given GlobalSecondaryIndexInfo instances to the collection built by this DSL
    */
  operator fun Array<GlobalSecondaryIndexInfo>.unaryPlus() {
    list.addAll(this)
  }
}

/**
  * Builds instances of type GlobalSecondaryIndexInfo:
  * Represents the properties of a global secondary index for the table when the backup was created.
  */
fun buildGlobalSecondaryIndexInfoCollection(dslBlock: GlobalSecondaryIndexInfoCollectionDSL.() -> Unit) =
  GlobalSecondaryIndexInfoCollectionDSL().apply(dslBlock).build()