/*
  This file was generated from https://github.com/aws/aws-sdk-java-v2 by https://github.com/cylab/aws-kotlin-dsl-builder
  Like the original code, this file and project is licensed under
  Apache License Version 2.0
  See LICENSE.txt for more info
*/
package net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.model

import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSL
import software.amazon.awssdk.services.dynamodb.model.ItemResponse

/**
  * Builds instances of type ItemResponse:
  * Details for the requested item.
  */
@DynamodbDSL
class ItemResponseCollectionDSL {
  private val list = ArrayList<ItemResponse>()
  internal fun build() : List<ItemResponse> = list

  fun item(init: ItemResponseDSL.() -> Unit) {
    list.add(ItemResponseDSL().apply(init).build())
  }

  operator fun ItemResponse.unaryPlus() {
    list.add(this)
  }

  operator fun Collection<ItemResponse>.unaryPlus() {
    list.addAll(this)
  }

  operator fun Array<ItemResponse>.unaryPlus() {
    list.addAll(this)
  }
}

/**
  * Builds instances of type ItemResponse:
  * Details for the requested item.
  */
fun buildItemResponseCollection(dslBlock: ItemResponseCollectionDSL.() -> Unit) =
  ItemResponseCollectionDSL().apply(dslBlock).build()