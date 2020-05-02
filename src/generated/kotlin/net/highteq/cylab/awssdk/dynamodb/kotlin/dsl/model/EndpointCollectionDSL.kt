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
import software.amazon.awssdk.services.dynamodb.model.Endpoint

/**
  * Builds instances of type Endpoint:
  * An endpoint information details.
  */
@DynamodbDSL
inline class EndpointCollectionDSL(
  @PublishedApi
  @Deprecated("Don't use internal fields!", level = WARNING)
  internal val list : MutableList<Endpoint>
){
  @PublishedApi
  internal fun build() = list

  /**
    * Builds an object of type Endpoint from 
    * the given DSL in 'dslBlock' and adds it to the collection
    */
  inline fun o(dslBlock: EndpointDSL.() -> Unit) {
    list.add(buildEndpoint(dslBlock))
  }

  /**
    * Adds a Endpoint to the collection built by this DSL
    */
  inline operator fun Endpoint.unaryPlus() {
    list.add(this)
  }

  /**
    * Adds all given Endpoint instances to the collection built by this DSL
    */
  inline operator fun Collection<Endpoint>.unaryPlus() {
    list.addAll(this)
  }

  /**
    * Adds all given Endpoint instances to the collection built by this DSL
    */
  inline operator fun Array<Endpoint>.unaryPlus() {
    list.addAll(this)
  }
}

/**
  * Builds instances of type Endpoint:
  * An endpoint information details.
  */
inline fun buildEndpointCollection(dslBlock: EndpointCollectionDSL.() -> Unit) =
  EndpointCollectionDSL(mutableListOf<Endpoint>()).apply(dslBlock).build()