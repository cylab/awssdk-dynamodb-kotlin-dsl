/*
  This file was generated from https://github.com/aws/aws-sdk-java-v2 by https://github.com/cylab/aws-kotlin-dsl-builder
  Like the original code, this file and project is licensed under
  Apache License Version 2.0
  See LICENSE.txt for more info
*/
@file:Suppress("DEPRECATION", "NOTHING_TO_INLINE")
package net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.model

import kotlin.DeprecationLevel.HIDDEN
import kotlin.DeprecationLevel.WARNING
import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSL
import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSLMarker
import software.amazon.awssdk.awscore.AwsRequestOverrideConfiguration
import software.amazon.awssdk.services.dynamodb.DynamoDbAsyncClient
import software.amazon.awssdk.services.dynamodb.DynamoDbClient
import software.amazon.awssdk.services.dynamodb.model.ListGlobalTablesRequest
import software.amazon.awssdk.services.dynamodb.transform.ListGlobalTablesRequestMarshaller

/**
  * Builds instances of type ListGlobalTablesRequest:
  * 
  */
@DynamodbDSLMarker
inline class ListGlobalTablesRequestDSL(
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder: ListGlobalTablesRequest.Builder
){
  @PublishedApi
  internal fun build(): ListGlobalTablesRequest = builder.build()

  /**
    * 
    */
  inline var exclusiveStartGlobalTableName: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.exclusiveStartGlobalTableName(value)
    }

  /**
    * 
    */
  inline var limit: Int?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.limit(value)
    }

  /**
    * 
    */
  inline var overrideConfiguration: AwsRequestOverrideConfiguration?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.overrideConfiguration(value)
    }

  /**
    * 
    */
  inline var regionName: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.regionName(value)
    }

}

/**
  * Builds instances of type ListGlobalTablesRequest:
  * 
  */
inline fun listGlobalTablesRequest(dslBlock: ListGlobalTablesRequestDSL.() -> Unit) =
  ListGlobalTablesRequestDSL(ListGlobalTablesRequest.builder()).apply(dslBlock).build()

/**
  * Builds instances of type ListGlobalTablesRequest:
  * 
  */
inline fun DynamodbDSL.Companion.listGlobalTablesRequest(dslBlock: ListGlobalTablesRequestDSL.() -> Unit) =
  ListGlobalTablesRequestDSL(ListGlobalTablesRequest.builder()).apply(dslBlock).build()

/**
  * Lists all global tables that have a replica in the specified region.
  */
inline fun DynamoDbAsyncClient.listGlobalTablesBy(dslBlock: ListGlobalTablesRequestDSL.() -> Unit) =
  this.listGlobalTables(DynamodbDSL.Companion.listGlobalTablesRequest(dslBlock))

/**
  * Lists all global tables that have a replica in the specified region.
  */
inline fun DynamoDbClient.listGlobalTablesBy(dslBlock: ListGlobalTablesRequestDSL.() -> Unit) =
  this.listGlobalTables(DynamodbDSL.Companion.listGlobalTablesRequest(dslBlock))

/**
  * 
  */
inline fun ListGlobalTablesRequestMarshaller.marshallBy(dslBlock: ListGlobalTablesRequestDSL.() -> Unit) =
  this.marshall(DynamodbDSL.Companion.listGlobalTablesRequest(dslBlock))