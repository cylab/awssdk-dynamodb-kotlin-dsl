/*
  This file was generated from https://github.com/aws/aws-sdk-java-v2 by https://github.com/cylab/aws-kotlin-dsl-builder
  Like the original code, this file and project is licensed under
  Apache License Version 2.0
  See LICENSE.txt for more info
*/
package net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.model

import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSL
import software.amazon.awssdk.services.dynamodb.model.Record

/**
  * Builds instances of type Record:
  * A description of a unique event within a stream.
  */
@DynamodbDSL
class RecordCollectionDSL {
  private val list = ArrayList<Record>()
  internal fun build() : List<Record> = list

  /**
    * Receives a sub DSL in 'dslBlock' to build a Record instance
    * and adds it to the collection built by the enclosing DSL
    */
  fun add(dslBlock: RecordDSL.() -> Unit) {
    list.add(RecordDSL().apply(dslBlock).build())
  }

  /**
    * Adds a Record to the collection built by this DSL
    */
  fun add(item: Record) {
    list.add(item)
  }

  /**
    * Adds all given Record instances to the collection built by this DSL
    */
  fun addAll(items: Collection<Record>) {
    list.addAll(items)
  }

  /**
    * Adds all given Record instances to the collection built by this DSL
    */
  infix fun addAll(items: Array<Record>) {
    list.addAll(items)
  }

  /**
    * Adds a Record to the collection built by this DSL
    */
  operator fun Record.unaryPlus() {
    list.add(this)
  }

  /**
    * Adds all given Record instances to the collection built by this DSL
    */
  operator fun Collection<Record>.unaryPlus() {
    list.addAll(this)
  }

  /**
    * Adds all given Record instances to the collection built by this DSL
    */
  operator fun Array<Record>.unaryPlus() {
    list.addAll(this)
  }
}

/**
  * Builds instances of type Record:
  * A description of a unique event within a stream.
  */
fun buildRecordCollection(dslBlock: RecordCollectionDSL.() -> Unit) =
  RecordCollectionDSL().apply(dslBlock).build()