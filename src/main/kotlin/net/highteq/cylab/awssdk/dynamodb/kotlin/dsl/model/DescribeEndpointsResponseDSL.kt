/*
  This file was generated from https://github.com/aws/aws-sdk-java-v2 by https://github.com/cylab/aws-kotlin-dsl-builder
  Like the original code, this file and project is licensed under
  Apache License Version 2.0
  See LICENSE.txt for more info
*/
package net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.model

import kotlin.DeprecationLevel.HIDDEN
import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSL
import software.amazon.awssdk.services.dynamodb.model.DescribeEndpointsResponse
import software.amazon.awssdk.services.dynamodb.model.Endpoint

/**
  * Builds instances of type DescribeEndpointsResponse:
  * 
  */
@DynamodbDSL
class DescribeEndpointsResponseDSL {
  private val builder = DescribeEndpointsResponse.builder()
  internal fun build(): DescribeEndpointsResponse = builder.build()
    
  /**
    * List of endpoints.
    */
  @get:JvmSynthetic // Hide from Java callers
  var endpoints: Collection<Endpoint>
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.endpoints(value)
    }

  
    
  /**
    * List of endpoints.
    */
  fun endpoints(dslBlock: EndpointCollectionDSL.() -> Unit) {
    builder.endpoints(buildEndpointCollection(dslBlock))
  }

}

/**
  * Builds instances of type DescribeEndpointsResponse:
  * 
  */
fun buildDescribeEndpointsResponse(dslBlock: DescribeEndpointsResponseDSL.() -> Unit) =
  DescribeEndpointsResponseDSL().apply(dslBlock).build()