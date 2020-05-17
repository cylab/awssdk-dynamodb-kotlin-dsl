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
import software.amazon.awssdk.services.dynamodb.model.DescribeGlobalTableRequest
import software.amazon.awssdk.services.dynamodb.transform.DescribeGlobalTableRequestMarshaller

/**
  * Builds instances of type DescribeGlobalTableRequest:
  * 
  */
@DynamodbDSLMarker
inline class DescribeGlobalTableRequestDSL(
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder: DescribeGlobalTableRequest.Builder
){
  @PublishedApi
  internal fun build(): DescribeGlobalTableRequest = builder.build()

  /**
    * 
    */
  inline var globalTableName: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.globalTableName(value)
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

}

/**
  * Builds instances of type DescribeGlobalTableRequest:
  * 
  */
inline fun describeGlobalTableRequest(dslBlock: DescribeGlobalTableRequestDSL.() -> Unit) =
  DescribeGlobalTableRequestDSL(DescribeGlobalTableRequest.builder()).apply(dslBlock).build()

/**
  * Builds instances of type DescribeGlobalTableRequest:
  * 
  */
inline fun DynamodbDSL.Companion.describeGlobalTableRequest(dslBlock: DescribeGlobalTableRequestDSL.() -> Unit) =
  DescribeGlobalTableRequestDSL(DescribeGlobalTableRequest.builder()).apply(dslBlock).build()

/**
  * 
  */
inline fun DescribeGlobalTableRequestMarshaller.marshallBy(dslBlock: DescribeGlobalTableRequestDSL.() -> Unit) =
  this.marshall(DynamodbDSL.Companion.describeGlobalTableRequest(dslBlock))

/**
  * Returns information about the specified global table.
  */
inline fun DynamoDbAsyncClient.describeGlobalTableBy(dslBlock: DescribeGlobalTableRequestDSL.() -> Unit) =
  this.describeGlobalTable(DynamodbDSL.Companion.describeGlobalTableRequest(dslBlock))

/**
  * Returns information about the specified global table.
  */
inline fun DynamoDbClient.describeGlobalTableBy(dslBlock: DescribeGlobalTableRequestDSL.() -> Unit) =
  this.describeGlobalTable(DynamodbDSL.Companion.describeGlobalTableRequest(dslBlock))