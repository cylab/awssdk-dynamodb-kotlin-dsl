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
    * Builds an object of type Endpoint from 
    * the given DSL in 'dslBlock' and adds it to the collection
    */
  fun o(dslBlock: EndpointDSL.() -> Unit) {
    list.add(EndpointDSL().apply(dslBlock).build())
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