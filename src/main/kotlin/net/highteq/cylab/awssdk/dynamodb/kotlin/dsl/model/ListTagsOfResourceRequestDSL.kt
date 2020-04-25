/*
  This file was generated from https://github.com/aws/aws-sdk-java-v2 by https://github.com/cylab/aws-kotlin-dsl-builder
  Like the original code, this file and project is licensed under
  Apache License Version 2.0
  See LICENSE.txt for more info
*/
package net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.model

import kotlin.DeprecationLevel.HIDDEN
import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSL
import software.amazon.awssdk.awscore.AwsRequestOverrideConfiguration
import software.amazon.awssdk.services.dynamodb.model.ListTagsOfResourceRequest

/**
  * Builds instances of type ListTagsOfResourceRequest:
  * 
  */
@DynamodbDSL
class ListTagsOfResourceRequestDSL {
  private val builder = ListTagsOfResourceRequest.builder()
  internal fun build(): ListTagsOfResourceRequest = builder.build()
    
  /**
    * The Amazon DynamoDB resource with tags to be listed. This value is an Amazon Resource Name (ARN).
    */
  @get:JvmSynthetic // Hide from Java callers
  var resourceArn: String
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.resourceArn(value)
    }


  /**
    * 
    */
  @get:JvmSynthetic // Hide from Java callers
  var overrideConfiguration: AwsRequestOverrideConfiguration
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.overrideConfiguration(value)
    }


  /**
    * An optional string that, if supplied, must be copied from the output of a previous call to ListTagOfResource.
    *  When provided in this manner, this API fetches the next page of results.
    */
  @get:JvmSynthetic // Hide from Java callers
  var nextToken: String
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.nextToken(value)
    }

  
  
}

/**
  * Builds instances of type ListTagsOfResourceRequest:
  * 
  */
fun buildListTagsOfResourceRequest(dslBlock: ListTagsOfResourceRequestDSL.() -> Unit) =
  ListTagsOfResourceRequestDSL().apply(dslBlock).build()