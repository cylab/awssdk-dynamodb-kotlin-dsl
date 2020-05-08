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
import software.amazon.awssdk.services.dynamodb.model.Condition

/**
  * Builds a maps of type Condition:
  * Represents the selection criteria for a Query or Scan operation:
  * 
  *  For a Query operation, Condition is used for specifying the KeyConditions to
  *  use when querying a table or an index. For KeyConditions, only the following comparison operators are
  *  supported:
  * 
  *  EQ | LE | LT | GE | GT | BEGINS_WITH | BETWEEN
  * 
  *  Condition is also used in a QueryFilter, which evaluates the query results and returns only
  *  the desired values.
  * 
  *  For a Scan operation, Condition is used in a ScanFilter, which evaluates the
  *  scan results and returns only the desired values.
  */
@DynamodbDSL
inline class ConditionMapDSL(
  @PublishedApi
  @Deprecated("Don't use internal fields!", level = WARNING)
  internal val map : MutableMap<String, Condition>
) {
  @PublishedApi
  internal fun build() : Map<String, Condition> = map

  /**
    * Builds an object of type Condition from 
    * the given DSL in 'dslBlock' and adds it to the map at ['key']
    */
  inline fun o(key: String, dslBlock: ConditionDSL.() -> Unit) {
    map[key] = buildCondition(dslBlock)
  }

  /**
    * Adds a pair of String -> Condition to the map
    */
  inline operator fun Pair<String, Condition>.unaryPlus() {
    map[this.first] = this.second
  }

  /**
    * Adds all given Pair<String, Condition> instances to the map
    */
  inline operator fun Collection<Pair<String, Condition>>.unaryPlus() {
    this.forEach { map[it.first] = it.second }
  }

  /**
    * Adds all given Pair<String, Condition> instances to the map
    */
  inline operator fun Array<Pair<String, Condition>>.unaryPlus() {
    this.forEach { map[it.first] = it.second }
  }

  /**
    * Adds all entries in the given map
    */
  inline operator fun Map<String, Condition>.unaryPlus() {
    map.putAll(this)
  }
}

/**
  * Builds a maps of type Condition:
  * Represents the selection criteria for a Query or Scan operation:
  * 
  *  For a Query operation, Condition is used for specifying the KeyConditions to
  *  use when querying a table or an index. For KeyConditions, only the following comparison operators are
  *  supported:
  * 
  *  EQ | LE | LT | GE | GT | BEGINS_WITH | BETWEEN
  * 
  *  Condition is also used in a QueryFilter, which evaluates the query results and returns only
  *  the desired values.
  * 
  *  For a Scan operation, Condition is used in a ScanFilter, which evaluates the
  *  scan results and returns only the desired values.
  */
inline fun buildConditionMap(dslBlock: ConditionMapDSL.() -> Unit) =
  ConditionMapDSL(mutableMapOf<String, Condition>()).apply(dslBlock).build()