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
import software.amazon.awssdk.services.dynamodb.model.CancellationReason

/**
  * Builds a collection of type CancellationReason:
  * An ordered list of errors for each item in the request which caused the transaction to get cancelled. The values of
  *  the list are ordered according to the ordering of the TransactWriteItems request parameter. If no error
  *  occurred for the associated item an error with a Null code and Null message will be present.
  */
@DynamodbDSL
inline class CancellationReasonCollectionDSL(
  @PublishedApi
  @Deprecated("Don't use internal fields!", level = WARNING)
  internal val list : MutableList<CancellationReason>
){
  @PublishedApi
  internal fun build() = list

  /**
    * Builds an object of type CancellationReason from 
    * the given DSL in 'dslBlock' and adds it to the collection
    */
  inline fun o(dslBlock: CancellationReasonDSL.() -> Unit) {
    list.add(buildCancellationReason(dslBlock))
  }

  /**
    * Adds a CancellationReason to the collection built by this DSL
    */
  inline operator fun CancellationReason.unaryPlus() {
    list.add(this)
  }

  /**
    * Adds all given CancellationReason instances to the collection built by this DSL
    */
  inline operator fun Collection<CancellationReason>.unaryPlus() {
    list.addAll(this)
  }

  /**
    * Adds all given CancellationReason instances to the collection built by this DSL
    */
  inline operator fun Array<CancellationReason>.unaryPlus() {
    list.addAll(this)
  }
}

/**
  * Builds a collection of type CancellationReason:
  * An ordered list of errors for each item in the request which caused the transaction to get cancelled. The values of
  *  the list are ordered according to the ordering of the TransactWriteItems request parameter. If no error
  *  occurred for the associated item an error with a Null code and Null message will be present.
  */
inline fun buildCancellationReasonCollection(dslBlock: CancellationReasonCollectionDSL.() -> Unit) =
  CancellationReasonCollectionDSL(mutableListOf<CancellationReason>()).apply(dslBlock).build()