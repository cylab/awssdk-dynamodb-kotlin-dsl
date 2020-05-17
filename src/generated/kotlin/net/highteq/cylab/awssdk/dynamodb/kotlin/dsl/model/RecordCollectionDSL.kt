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
import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSLMarker
import software.amazon.awssdk.services.dynamodb.model.Record

/**
  * Builds a collection of type Record:
  * A description of a unique event within a stream.
  */
@DynamodbDSLMarker
inline class RecordCollectionDSL(
  @PublishedApi
  @Deprecated("Don't use internal fields!", level = WARNING)
  internal val list : MutableList<Record>
){
  @PublishedApi
  internal fun build() = list

  /**
    * Builds an object of type Record from 
    * the given DSL in 'dslBlock' and adds it to the collection
    */
  inline fun o(dslBlock: RecordDSL.() -> Unit) {
    list.add(DynamodbDSL.record(dslBlock))
  }

  /**
    * Adds a Record to the collection built by this DSL
    */
  inline operator fun Record.unaryPlus() {
    list.add(this)
  }

  /**
    * Adds all given Record instances to the collection built by this DSL
    */
  inline operator fun Collection<Record>.unaryPlus() {
    list.addAll(this)
  }

  /**
    * Adds all given Record instances to the collection built by this DSL
    */
  inline operator fun Array<Record>.unaryPlus() {
    list.addAll(this)
  }
}

/**
  * Builds a collection of type Record:
  * A description of a unique event within a stream.
  */
inline fun recordCollection(dslBlock: RecordCollectionDSL.() -> Unit) =
  RecordCollectionDSL(mutableListOf<Record>()).apply(dslBlock).build()

/**
  * Builds a collection of type Record:
  * A description of a unique event within a stream.
  */
inline fun DynamodbDSL.Companion.recordCollection(dslBlock: RecordCollectionDSL.() -> Unit) =
  RecordCollectionDSL(mutableListOf<Record>()).apply(dslBlock).build()