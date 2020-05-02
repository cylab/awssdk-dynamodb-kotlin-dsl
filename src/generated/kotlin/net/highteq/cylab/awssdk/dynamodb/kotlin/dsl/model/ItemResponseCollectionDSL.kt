/*
  This file was generated from https://github.com/aws/aws-sdk-java-v2 by https://github.com/cylab/aws-kotlin-dsl-builder
  Like the original code, this file and project is licensed under
  Apache License Version 2.0
  See LICENSE.txt for more info
*/
@file:Suppress("DEPRECATION", "NOTHING_TO_INLINE")
package net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.model

import kotlin.DeprecationLevel.WARNING
import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSL
import software.amazon.awssdk.services.dynamodb.model.ItemResponse

/**
  * Builds instances of type ItemResponse:
  * Details for the requested item.
  */
@DynamodbDSL
inline class ItemResponseCollectionDSL(
  @PublishedApi
  @Deprecated("Don't use internal fields!", level = WARNING)
  internal val list : MutableList<ItemResponse>
){
  @PublishedApi
  internal fun build() = list

  /**
    * Builds an object of type ItemResponse from 
    * the given DSL in 'dslBlock' and adds it to the collection
    */
  inline fun o(dslBlock: ItemResponseDSL.() -> Unit) {
    list.add(buildItemResponse(dslBlock))
  }

  /**
    * Adds a ItemResponse to the collection built by this DSL
    */
  inline operator fun ItemResponse.unaryPlus() {
    list.add(this)
  }

  /**
    * Adds all given ItemResponse instances to the collection built by this DSL
    */
  inline operator fun Collection<ItemResponse>.unaryPlus() {
    list.addAll(this)
  }

  /**
    * Adds all given ItemResponse instances to the collection built by this DSL
    */
  inline operator fun Array<ItemResponse>.unaryPlus() {
    list.addAll(this)
  }
}

/**
  * Builds instances of type ItemResponse:
  * Details for the requested item.
  */
inline fun buildItemResponseCollection(dslBlock: ItemResponseCollectionDSL.() -> Unit) =
  ItemResponseCollectionDSL(mutableListOf<ItemResponse>()).apply(dslBlock).build()