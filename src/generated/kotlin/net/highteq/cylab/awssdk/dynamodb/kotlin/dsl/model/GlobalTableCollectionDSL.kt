/*
  This file was generated from https://github.com/aws/aws-sdk-java-v2 by https://github.com/cylab/aws-kotlin-dsl-builder
  Like the original code, this file and project is licensed under
  Apache License Version 2.0
  See LICENSE.txt for more info
*/
package net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.model

import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSL
import software.amazon.awssdk.services.dynamodb.model.GlobalTable

/**
  * Builds instances of type GlobalTable:
  * Represents the properties of a global table.
  */
@DynamodbDSL
class GlobalTableCollectionDSL {
  private val list = ArrayList<GlobalTable>()
  internal fun build() : List<GlobalTable> = list

  /**
    * Builds an object of type GlobalTable from 
    * the given DSL in 'dslBlock' and adds it to the collection
    */
  fun o(dslBlock: GlobalTableDSL.() -> Unit) {
    list.add(GlobalTableDSL().apply(dslBlock).build())
  }

  /**
    * Adds a GlobalTable to the collection built by this DSL
    */
  operator fun GlobalTable.unaryPlus() {
    list.add(this)
  }

  /**
    * Adds all given GlobalTable instances to the collection built by this DSL
    */
  operator fun Collection<GlobalTable>.unaryPlus() {
    list.addAll(this)
  }

  /**
    * Adds all given GlobalTable instances to the collection built by this DSL
    */
  operator fun Array<GlobalTable>.unaryPlus() {
    list.addAll(this)
  }
}

/**
  * Builds instances of type GlobalTable:
  * Represents the properties of a global table.
  */
fun buildGlobalTableCollection(dslBlock: GlobalTableCollectionDSL.() -> Unit) =
  GlobalTableCollectionDSL().apply(dslBlock).build()