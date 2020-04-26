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

  fun item(dslBlock: GlobalSecondaryIndexInfoDSL.() -> Unit) {
    list.add(GlobalSecondaryIndexInfoDSL().apply(dslBlock).build())
  }

  operator fun GlobalSecondaryIndexInfo.unaryPlus() {
    list.add(this)
  }

  operator fun Collection<GlobalSecondaryIndexInfo>.unaryPlus() {
    list.addAll(this)
  }

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