/*
  This file was generated from https://github.com/aws/aws-sdk-java-v2 by https://github.com/cylab/aws-kotlin-dsl-builder
  Like the original code, this file and project is licensed under
  Apache License Version 2.0
  See LICENSE.txt for more info
*/
package net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.model

import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSL
import software.amazon.awssdk.services.dynamodb.model.Stream

/**
  * Builds instances of type Stream:
  * Represents all of the data describing a particular stream.
  */
@DynamodbDSL
class StreamCollectionDSL {
  private val list = ArrayList<Stream>()
  internal fun build() : List<Stream> = list

  fun item(dslBlock: StreamDSL.() -> Unit) {
    list.add(StreamDSL().apply(dslBlock).build())
  }

  operator fun Stream.unaryPlus() {
    list.add(this)
  }

  operator fun Collection<Stream>.unaryPlus() {
    list.addAll(this)
  }

  operator fun Array<Stream>.unaryPlus() {
    list.addAll(this)
  }
}

/**
  * Builds instances of type Stream:
  * Represents all of the data describing a particular stream.
  */
fun buildStreamCollection(dslBlock: StreamCollectionDSL.() -> Unit) =
  StreamCollectionDSL().apply(dslBlock).build()