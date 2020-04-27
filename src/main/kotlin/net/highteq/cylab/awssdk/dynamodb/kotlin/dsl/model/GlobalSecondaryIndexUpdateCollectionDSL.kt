/*
  This file was generated from https://github.com/aws/aws-sdk-java-v2 by https://github.com/cylab/aws-kotlin-dsl-builder
  Like the original code, this file and project is licensed under
  Apache License Version 2.0
  See LICENSE.txt for more info
*/
package net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.model

import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSL
import software.amazon.awssdk.services.dynamodb.model.GlobalSecondaryIndexUpdate

/**
  * Builds instances of type GlobalSecondaryIndexUpdate:
  * Represents one of the following:
  * 
  *  A new global secondary index to be added to an existing table.
  * 
  *  New provisioned throughput parameters for an existing global secondary index.
  * 
  *  An existing global secondary index to be removed from an existing table.
  */
@DynamodbDSL
class GlobalSecondaryIndexUpdateCollectionDSL {
  private val list = ArrayList<GlobalSecondaryIndexUpdate>()
  internal fun build() : List<GlobalSecondaryIndexUpdate> = list

  /**
    * Receives a sub DSL in 'dslBlock' to build a GlobalSecondaryIndexUpdate instance
    * and adds it to the collection built by the enclosing DSL
    */
  fun add(dslBlock: GlobalSecondaryIndexUpdateDSL.() -> Unit) {
    list.add(GlobalSecondaryIndexUpdateDSL().apply(dslBlock).build())
  }

  /**
    * Adds a GlobalSecondaryIndexUpdate to the collection built by this DSL
    */
  fun add(item: GlobalSecondaryIndexUpdate) {
    list.add(item)
  }

  /**
    * Adds all given GlobalSecondaryIndexUpdate instances to the collection built by this DSL
    */
  fun addAll(items: Collection<GlobalSecondaryIndexUpdate>) {
    list.addAll(items)
  }

  /**
    * Adds all given GlobalSecondaryIndexUpdate instances to the collection built by this DSL
    */
  infix fun addAll(items: Array<GlobalSecondaryIndexUpdate>) {
    list.addAll(items)
  }

  /**
    * Adds a GlobalSecondaryIndexUpdate to the collection built by this DSL
    */
  operator fun GlobalSecondaryIndexUpdate.unaryPlus() {
    list.add(this)
  }

  /**
    * Adds all given GlobalSecondaryIndexUpdate instances to the collection built by this DSL
    */
  operator fun Collection<GlobalSecondaryIndexUpdate>.unaryPlus() {
    list.addAll(this)
  }

  /**
    * Adds all given GlobalSecondaryIndexUpdate instances to the collection built by this DSL
    */
  operator fun Array<GlobalSecondaryIndexUpdate>.unaryPlus() {
    list.addAll(this)
  }
}

/**
  * Builds instances of type GlobalSecondaryIndexUpdate:
  * Represents one of the following:
  * 
  *  A new global secondary index to be added to an existing table.
  * 
  *  New provisioned throughput parameters for an existing global secondary index.
  * 
  *  An existing global secondary index to be removed from an existing table.
  */
fun buildGlobalSecondaryIndexUpdateCollection(dslBlock: GlobalSecondaryIndexUpdateCollectionDSL.() -> Unit) =
  GlobalSecondaryIndexUpdateCollectionDSL().apply(dslBlock).build()