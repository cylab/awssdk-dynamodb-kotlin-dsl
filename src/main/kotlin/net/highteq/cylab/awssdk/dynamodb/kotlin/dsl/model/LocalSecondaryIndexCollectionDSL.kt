/*
  This file was generated from https://github.com/aws/aws-sdk-java-v2 by https://github.com/cylab/aws-kotlin-dsl-builder
  Like the original code, this file and project is licensed under
  Apache License Version 2.0
  See LICENSE.txt for more info
*/
package net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.model

import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSL
import software.amazon.awssdk.services.dynamodb.model.LocalSecondaryIndex

/**
  * Builds instances of type LocalSecondaryIndex:
  * Represents the properties of a local secondary index.
  */
@DynamodbDSL
class LocalSecondaryIndexCollectionDSL {
  private val list = ArrayList<LocalSecondaryIndex>()
  internal fun build() : List<LocalSecondaryIndex> = list

  fun item(init: LocalSecondaryIndexDSL.() -> Unit) {
    list.add(LocalSecondaryIndexDSL().apply(init).build())
  }

  operator fun LocalSecondaryIndex.unaryPlus() {
    list.add(this)
  }

  operator fun Collection<LocalSecondaryIndex>.unaryPlus() {
    list.addAll(this)
  }

  operator fun Array<LocalSecondaryIndex>.unaryPlus() {
    list.addAll(this)
  }
}

/**
  * Builds instances of type LocalSecondaryIndex:
  * Represents the properties of a local secondary index.
  */
fun buildLocalSecondaryIndexCollection(dslBlock: LocalSecondaryIndexCollectionDSL.() -> Unit) =
  LocalSecondaryIndexCollectionDSL().apply(dslBlock).build()