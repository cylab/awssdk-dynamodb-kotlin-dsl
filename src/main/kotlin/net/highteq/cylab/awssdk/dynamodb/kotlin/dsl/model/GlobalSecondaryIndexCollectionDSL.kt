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

  fun item(init: GlobalSecondaryIndexDSL.() -> Unit) {
    list.add(GlobalSecondaryIndexDSL().apply(init).build())
  }

  operator fun GlobalSecondaryIndex.unaryPlus() {
    list.add(this)
  }

  operator fun Collection<GlobalSecondaryIndex>.unaryPlus() {
    list.addAll(this)
  }

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