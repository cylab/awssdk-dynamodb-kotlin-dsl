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

  fun item(dslBlock: GlobalSecondaryIndexDescriptionDSL.() -> Unit) {
    list.add(GlobalSecondaryIndexDescriptionDSL().apply(dslBlock).build())
  }

  operator fun GlobalSecondaryIndexDescription.unaryPlus() {
    list.add(this)
  }

  operator fun Collection<GlobalSecondaryIndexDescription>.unaryPlus() {
    list.addAll(this)
  }

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