/*
  This file was generated from https://github.com/aws/aws-sdk-java-v2 by https://github.com/cylab/aws-kotlin-dsl-builder
  Like the original code, this file and project is licensed under
  Apache License Version 2.0
  See LICENSE.txt for more info
*/
package net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.model

import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSL
import software.amazon.awssdk.services.dynamodb.model.GlobalTableGlobalSecondaryIndexSettingsUpdate

/**
  * Builds instances of type GlobalTableGlobalSecondaryIndexSettingsUpdate:
  * Represents the settings of a global secondary index for a global table that will be modified.
  */
@DynamodbDSL
class GlobalTableGlobalSecondaryIndexSettingsUpdateCollectionDSL {
  private val list = ArrayList<GlobalTableGlobalSecondaryIndexSettingsUpdate>()
  internal fun build() : List<GlobalTableGlobalSecondaryIndexSettingsUpdate> = list

  fun item(init: GlobalTableGlobalSecondaryIndexSettingsUpdateDSL.() -> Unit) {
    list.add(GlobalTableGlobalSecondaryIndexSettingsUpdateDSL().apply(init).build())
  }

  operator fun GlobalTableGlobalSecondaryIndexSettingsUpdate.unaryPlus() {
    list.add(this)
  }

  operator fun Collection<GlobalTableGlobalSecondaryIndexSettingsUpdate>.unaryPlus() {
    list.addAll(this)
  }

  operator fun Array<GlobalTableGlobalSecondaryIndexSettingsUpdate>.unaryPlus() {
    list.addAll(this)
  }
}

/**
  * Builds instances of type GlobalTableGlobalSecondaryIndexSettingsUpdate:
  * Represents the settings of a global secondary index for a global table that will be modified.
  */
fun buildGlobalTableGlobalSecondaryIndexSettingsUpdateCollection(dslBlock: GlobalTableGlobalSecondaryIndexSettingsUpdateCollectionDSL.() -> Unit) =
  GlobalTableGlobalSecondaryIndexSettingsUpdateCollectionDSL().apply(dslBlock).build()