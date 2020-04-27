/*
  This file was generated from https://github.com/aws/aws-sdk-java-v2 by https://github.com/cylab/aws-kotlin-dsl-builder
  Like the original code, this file and project is licensed under
  Apache License Version 2.0
  See LICENSE.txt for more info
*/
package net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.model

import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSL
import software.amazon.awssdk.services.dynamodb.model.Endpoint

/**
  * Builds instances of type Endpoint:
  * An endpoint information details.
  */
@DynamodbDSL
class EndpointCollectionDSL {
  private val list = ArrayList<Endpoint>()
  internal fun build() : List<Endpoint> = list

  /**
    * Receives a sub DSL in 'dslBlock' to build a Endpoint instance
    * and adds it to the collection built by the enclosing DSL
    */
  fun add(dslBlock: EndpointDSL.() -> Unit) {
    list.add(EndpointDSL().apply(dslBlock).build())
  }

  /**
    * Adds a Endpoint to the collection built by this DSL
    */
  fun add(item: Endpoint) {
    list.add(item)
  }

  /**
    * Adds all given Endpoint instances to the collection built by this DSL
    */
  fun addAll(items: Collection<Endpoint>) {
    list.addAll(items)
  }

  /**
    * Adds all given Endpoint instances to the collection built by this DSL
    */
  infix fun addAll(items: Array<Endpoint>) {
    list.addAll(items)
  }

  /**
    * Adds a Endpoint to the collection built by this DSL
    */
  operator fun Endpoint.unaryPlus() {
    list.add(this)
  }

  /**
    * Adds all given Endpoint instances to the collection built by this DSL
    */
  operator fun Collection<Endpoint>.unaryPlus() {
    list.addAll(this)
  }

  /**
    * Adds all given Endpoint instances to the collection built by this DSL
    */
  operator fun Array<Endpoint>.unaryPlus() {
    list.addAll(this)
  }
}

/**
  * Builds instances of type Endpoint:
  * An endpoint information details.
  */
fun buildEndpointCollection(dslBlock: EndpointCollectionDSL.() -> Unit) =
  EndpointCollectionDSL().apply(dslBlock).build()