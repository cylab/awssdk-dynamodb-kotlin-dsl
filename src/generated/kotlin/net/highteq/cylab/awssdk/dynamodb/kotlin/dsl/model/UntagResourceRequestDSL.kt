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
import software.amazon.awssdk.services.dynamodb.model.UntagResourceRequest
import software.amazon.awssdk.services.dynamodb.transform.UntagResourceRequestMarshaller

/**
  * Builds instances of type UntagResourceRequest:
  * 
  */
@DynamodbDSL
inline class UntagResourceRequestDSL(
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder: UntagResourceRequest.Builder
){
  @PublishedApi
  internal fun build(): UntagResourceRequest = builder.build()

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

  /**
    * 
    */
  inline var tagKeys: Collection<String>?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.tagKeys(value)
    }

}

/**
  * Builds instances of type UntagResourceRequest:
  * 
  */
inline fun buildUntagResourceRequest(dslBlock: UntagResourceRequestDSL.() -> Unit) =
  UntagResourceRequestDSL(UntagResourceRequest.builder()).apply(dslBlock).build()

/**
  * Removes the association of tags from an Amazon DynamoDB resource. You can call UntagResource up to 5 times per
  *  second, per account.
  * 
  *  For an overview on tagging DynamoDB resources, see Tagging for DynamoDB in
  *  the Amazon DynamoDB Developer Guide.
  */
inline fun DynamoDbAsyncClient.untagResourceBy(dslBlock: UntagResourceRequestDSL.() -> Unit) =
  this.untagResource(buildUntagResourceRequest(dslBlock))

/**
  * Removes the association of tags from an Amazon DynamoDB resource. You can call UntagResource up to 5 times per
  *  second, per account.
  * 
  *  For an overview on tagging DynamoDB resources, see Tagging for DynamoDB in
  *  the Amazon DynamoDB Developer Guide.
  */
inline fun DynamoDbClient.untagResourceBy(dslBlock: UntagResourceRequestDSL.() -> Unit) =
  this.untagResource(buildUntagResourceRequest(dslBlock))

/**
  * 
  */
inline fun UntagResourceRequestMarshaller.marshallBy(dslBlock: UntagResourceRequestDSL.() -> Unit) =
  this.marshall(buildUntagResourceRequest(dslBlock))