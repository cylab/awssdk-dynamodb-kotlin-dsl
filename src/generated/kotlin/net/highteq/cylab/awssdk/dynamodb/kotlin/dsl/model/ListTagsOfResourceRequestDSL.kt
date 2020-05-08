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
import software.amazon.awssdk.awscore.AwsRequestOverrideConfiguration
import software.amazon.awssdk.services.dynamodb.DynamoDbAsyncClient
import software.amazon.awssdk.services.dynamodb.DynamoDbClient
import software.amazon.awssdk.services.dynamodb.model.ListTagsOfResourceRequest
import software.amazon.awssdk.services.dynamodb.transform.ListTagsOfResourceRequestMarshaller

/**
  * Builds instances of type ListTagsOfResourceRequest:
  * 
  */
@DynamodbDSL
inline class ListTagsOfResourceRequestDSL(
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder: ListTagsOfResourceRequest.Builder
){
  @PublishedApi
  internal fun build(): ListTagsOfResourceRequest = builder.build()

  /**
    * 
    */
  inline var nextToken: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.nextToken(value)
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
  inline var resourceArn: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.resourceArn(value)
    }

}

/**
  * Builds instances of type ListTagsOfResourceRequest:
  * 
  */
inline fun buildListTagsOfResourceRequest(dslBlock: ListTagsOfResourceRequestDSL.() -> Unit) =
  ListTagsOfResourceRequestDSL(ListTagsOfResourceRequest.builder()).apply(dslBlock).build()

/**
  * List all tags on an Amazon DynamoDB resource. You can call ListTagsOfResource up to 10 times per second, per
  *  account.
  * 
  *  For an overview on tagging DynamoDB resources, see Tagging for DynamoDB in
  *  the Amazon DynamoDB Developer Guide.
  */
inline fun DynamoDbAsyncClient.listTagsOfResourceBy(dslBlock: ListTagsOfResourceRequestDSL.() -> Unit) =
  this.listTagsOfResource(buildListTagsOfResourceRequest(dslBlock))

/**
  * List all tags on an Amazon DynamoDB resource. You can call ListTagsOfResource up to 10 times per second, per
  *  account.
  * 
  *  For an overview on tagging DynamoDB resources, see Tagging for DynamoDB in
  *  the Amazon DynamoDB Developer Guide.
  */
inline fun DynamoDbClient.listTagsOfResourceBy(dslBlock: ListTagsOfResourceRequestDSL.() -> Unit) =
  this.listTagsOfResource(buildListTagsOfResourceRequest(dslBlock))

/**
  * 
  */
inline fun ListTagsOfResourceRequestMarshaller.marshallBy(dslBlock: ListTagsOfResourceRequestDSL.() -> Unit) =
  this.marshall(buildListTagsOfResourceRequest(dslBlock))