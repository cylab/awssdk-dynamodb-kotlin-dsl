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
import software.amazon.awssdk.services.dynamodb.model.DescribeEndpointsRequest
import software.amazon.awssdk.services.dynamodb.transform.DescribeEndpointsRequestMarshaller

/**
  * Builds instances of type DescribeEndpointsRequest:
  * 
  */
@DynamodbDSLMarker
inline class DescribeEndpointsRequestDSL(
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder: DescribeEndpointsRequest.Builder
){
  @PublishedApi
  internal fun build(): DescribeEndpointsRequest = builder.build()

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
  * Builds instances of type DescribeEndpointsRequest:
  * 
  */
inline fun describeEndpointsRequest(dslBlock: DescribeEndpointsRequestDSL.() -> Unit) =
  DescribeEndpointsRequestDSL(DescribeEndpointsRequest.builder()).apply(dslBlock).build()

/**
  * Builds instances of type DescribeEndpointsRequest:
  * 
  */
inline fun DynamodbDSL.Companion.describeEndpointsRequest(dslBlock: DescribeEndpointsRequestDSL.() -> Unit) =
  DescribeEndpointsRequestDSL(DescribeEndpointsRequest.builder()).apply(dslBlock).build()

/**
  * 
  */
inline fun DescribeEndpointsRequestMarshaller.marshallBy(dslBlock: DescribeEndpointsRequestDSL.() -> Unit) =
  this.marshall(DynamodbDSL.Companion.describeEndpointsRequest(dslBlock))

/**
  * Returns the regional endpoint information.
  */
inline fun DynamoDbAsyncClient.describeEndpointsBy(dslBlock: DescribeEndpointsRequestDSL.() -> Unit) =
  this.describeEndpoints(DynamodbDSL.Companion.describeEndpointsRequest(dslBlock))

/**
  * Returns the regional endpoint information.
  */
inline fun DynamoDbClient.describeEndpointsBy(dslBlock: DescribeEndpointsRequestDSL.() -> Unit) =
  this.describeEndpoints(DynamodbDSL.Companion.describeEndpointsRequest(dslBlock))