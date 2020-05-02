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
import software.amazon.awssdk.awscore.AwsResponseMetadata
import software.amazon.awssdk.http.SdkHttpResponse
import software.amazon.awssdk.services.dynamodb.model.DescribeEndpointsResponse
import software.amazon.awssdk.services.dynamodb.model.Endpoint

/**
  * Builds instances of type DescribeEndpointsResponse:
  * 
  */
@DynamodbDSL
inline class DescribeEndpointsResponseDSL(
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder: DescribeEndpointsResponse.Builder
){
  @PublishedApi
  internal fun build(): DescribeEndpointsResponse = builder.build()

  /**
    * 
    */
  inline var endpoints: Collection<Endpoint>?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.endpoints(value)
    }

  /**
    * 
    */
  inline var responseMetadata: AwsResponseMetadata?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.responseMetadata(value)
    }

  /**
    * 
    */
  inline var sdkHttpResponse: SdkHttpResponse?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.sdkHttpResponse(value)
    }

  /**
    * 
    */
  inline fun endpoints(dslBlock: EndpointCollectionDSL.() -> Unit) {
    builder.endpoints(buildEndpointCollection(dslBlock))
  }

}

/**
  * Builds instances of type DescribeEndpointsResponse:
  * 
  */
inline fun buildDescribeEndpointsResponse(dslBlock: DescribeEndpointsResponseDSL.() -> Unit) =
  DescribeEndpointsResponseDSL(DescribeEndpointsResponse.builder()).apply(dslBlock).build()