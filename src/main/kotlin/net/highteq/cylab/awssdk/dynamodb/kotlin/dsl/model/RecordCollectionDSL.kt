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

  fun item(dslBlock: RecordDSL.() -> Unit) {
    list.add(RecordDSL().apply(dslBlock).build())
  }

  operator fun Record.unaryPlus() {
    list.add(this)
  }

  operator fun Collection<Record>.unaryPlus() {
    list.addAll(this)
  }

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