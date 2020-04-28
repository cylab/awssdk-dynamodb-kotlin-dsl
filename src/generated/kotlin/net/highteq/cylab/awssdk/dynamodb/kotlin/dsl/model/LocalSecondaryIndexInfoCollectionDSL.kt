/*
  This file was generated from https://github.com/aws/aws-sdk-java-v2 by https://github.com/cylab/aws-kotlin-dsl-builder
  Like the original code, this file and project is licensed under
  Apache License Version 2.0
  See LICENSE.txt for more info
*/
package net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.model

import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSL
import software.amazon.awssdk.services.dynamodb.model.LocalSecondaryIndexInfo

/**
  * Builds instances of type LocalSecondaryIndexInfo:
  * Represents the properties of a local secondary index for the table when the backup was created.
  */
@DynamodbDSL
class LocalSecondaryIndexInfoCollectionDSL {
  private val list = ArrayList<LocalSecondaryIndexInfo>()
  internal fun build() : List<LocalSecondaryIndexInfo> = list

  /**
    * Builds an object of type LocalSecondaryIndexInfo from 
    * the given DSL in 'dslBlock' and adds it to the collection
    */
  fun o(dslBlock: LocalSecondaryIndexInfoDSL.() -> Unit) {
    list.add(LocalSecondaryIndexInfoDSL().apply(dslBlock).build())
  }

  /**
    * Adds a LocalSecondaryIndexInfo to the collection built by this DSL
    */
  operator fun LocalSecondaryIndexInfo.unaryPlus() {
    list.add(this)
  }

  /**
    * Adds all given LocalSecondaryIndexInfo instances to the collection built by this DSL
    */
  operator fun Collection<LocalSecondaryIndexInfo>.unaryPlus() {
    list.addAll(this)
  }

  /**
    * Adds all given LocalSecondaryIndexInfo instances to the collection built by this DSL
    */
  operator fun Array<LocalSecondaryIndexInfo>.unaryPlus() {
    list.addAll(this)
  }
}

/**
  * Builds instances of type LocalSecondaryIndexInfo:
  * Represents the properties of a local secondary index for the table when the backup was created.
  */
fun buildLocalSecondaryIndexInfoCollection(dslBlock: LocalSecondaryIndexInfoCollectionDSL.() -> Unit) =
  LocalSecondaryIndexInfoCollectionDSL().apply(dslBlock).build()