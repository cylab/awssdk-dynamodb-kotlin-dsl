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
import software.amazon.awssdk.services.dynamodb.model.Stream

/**
  * Builds instances of type Stream:
  * Represents all of the data describing a particular stream.
  */
@DynamodbDSL
inline class StreamCollectionDSL(
  @PublishedApi
  @Deprecated("Don't use internal fields!", level = WARNING)
  internal val list : MutableList<Stream>
){
  @PublishedApi
  internal fun build() = list

  /**
    * Builds an object of type Stream from 
    * the given DSL in 'dslBlock' and adds it to the collection
    */
  inline fun o(dslBlock: StreamDSL.() -> Unit) {
    list.add(buildStream(dslBlock))
  }

  /**
    * Adds a Stream to the collection built by this DSL
    */
  inline operator fun Stream.unaryPlus() {
    list.add(this)
  }

  /**
    * Adds all given Stream instances to the collection built by this DSL
    */
  inline operator fun Collection<Stream>.unaryPlus() {
    list.addAll(this)
  }

  /**
    * Adds all given Stream instances to the collection built by this DSL
    */
  inline operator fun Array<Stream>.unaryPlus() {
    list.addAll(this)
  }
}

/**
  * Builds instances of type Stream:
  * Represents all of the data describing a particular stream.
  */
inline fun buildStreamCollection(dslBlock: StreamCollectionDSL.() -> Unit) =
  StreamCollectionDSL(mutableListOf<Stream>()).apply(dslBlock).build()