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
import software.amazon.awssdk.services.dynamodb.model.DescribeTimeToLiveRequest
import software.amazon.awssdk.services.dynamodb.transform.DescribeTimeToLiveRequestMarshaller

/**
  * Builds instances of type DescribeTimeToLiveRequest:
  * 
  */
@DynamodbDSLMarker
inline class DescribeTimeToLiveRequestDSL(
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder: DescribeTimeToLiveRequest.Builder
){
  @PublishedApi
  internal fun build(): DescribeTimeToLiveRequest = builder.build()

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
  inline var tableName: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.tableName(value)
    }

}

/**
  * Builds instances of type DescribeTimeToLiveRequest:
  * 
  */
inline fun describeTimeToLiveRequest(dslBlock: DescribeTimeToLiveRequestDSL.() -> Unit) =
  DescribeTimeToLiveRequestDSL(DescribeTimeToLiveRequest.builder()).apply(dslBlock).build()

/**
  * Builds instances of type DescribeTimeToLiveRequest:
  * 
  */
inline fun DynamodbDSL.Companion.describeTimeToLiveRequest(dslBlock: DescribeTimeToLiveRequestDSL.() -> Unit) =
  DescribeTimeToLiveRequestDSL(DescribeTimeToLiveRequest.builder()).apply(dslBlock).build()

/**
  * 
  */
inline fun DescribeTimeToLiveRequestMarshaller.marshallBy(dslBlock: DescribeTimeToLiveRequestDSL.() -> Unit) =
  this.marshall(DynamodbDSL.Companion.describeTimeToLiveRequest(dslBlock))

/**
  * Gives a description of the Time to Live (TTL) status on the specified table.
  */
inline fun DynamoDbAsyncClient.describeTimeToLiveBy(dslBlock: DescribeTimeToLiveRequestDSL.() -> Unit) =
  this.describeTimeToLive(DynamodbDSL.Companion.describeTimeToLiveRequest(dslBlock))

/**
  * Gives a description of the Time to Live (TTL) status on the specified table.
  */
inline fun DynamoDbClient.describeTimeToLiveBy(dslBlock: DescribeTimeToLiveRequestDSL.() -> Unit) =
  this.describeTimeToLive(DynamodbDSL.Companion.describeTimeToLiveRequest(dslBlock))