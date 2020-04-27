/*
  This file was generated from https://github.com/aws/aws-sdk-java-v2 by https://github.com/cylab/aws-kotlin-dsl-builder
  Like the original code, this file and project is licensed under
  Apache License Version 2.0
  See LICENSE.txt for more info
*/
package net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.model

import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSL
import software.amazon.awssdk.services.dynamodb.model.CancellationReason

/**
  * Builds instances of type CancellationReason:
  * An ordered list of errors for each item in the request which caused the transaction to get cancelled. The values of
  *  the list are ordered according to the ordering of the TransactWriteItems request parameter. If no error
  *  occurred for the associated item an error with a Null code and Null message will be present.
  */
@DynamodbDSL
class CancellationReasonCollectionDSL {
  private val list = ArrayList<CancellationReason>()
  internal fun build() : List<CancellationReason> = list

  /**
    * Receives a sub DSL in 'dslBlock' to build a CancellationReason instance
    * and adds it to the collection built by the enclosing DSL
    */
  fun add(dslBlock: CancellationReasonDSL.() -> Unit) {
    list.add(CancellationReasonDSL().apply(dslBlock).build())
  }

  /**
    * Adds a CancellationReason to the collection built by this DSL
    */
  fun add(item: CancellationReason) {
    list.add(item)
  }

  /**
    * Adds all given CancellationReason instances to the collection built by this DSL
    */
  fun addAll(items: Collection<CancellationReason>) {
    list.addAll(items)
  }

  /**
    * Adds all given CancellationReason instances to the collection built by this DSL
    */
  infix fun addAll(items: Array<CancellationReason>) {
    list.addAll(items)
  }

  /**
    * Adds a CancellationReason to the collection built by this DSL
    */
  operator fun CancellationReason.unaryPlus() {
    list.add(this)
  }

  /**
    * Adds all given CancellationReason instances to the collection built by this DSL
    */
  operator fun Collection<CancellationReason>.unaryPlus() {
    list.addAll(this)
  }

  /**
    * Adds all given CancellationReason instances to the collection built by this DSL
    */
  operator fun Array<CancellationReason>.unaryPlus() {
    list.addAll(this)
  }
}

/**
  * Builds instances of type CancellationReason:
  * An ordered list of errors for each item in the request which caused the transaction to get cancelled. The values of
  *  the list are ordered according to the ordering of the TransactWriteItems request parameter. If no error
  *  occurred for the associated item an error with a Null code and Null message will be present.
  */
fun buildCancellationReasonCollection(dslBlock: CancellationReasonCollectionDSL.() -> Unit) =
  CancellationReasonCollectionDSL().apply(dslBlock).build()