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
import software.amazon.awssdk.services.dynamodb.model.Tag
import software.amazon.awssdk.services.dynamodb.model.TagResourceRequest

/**
  * Builds instances of type TagResourceRequest:
  * 
  */
@DynamodbDSL
inline class TagResourceRequestDSL(
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder: TagResourceRequest.Builder
){
  @PublishedApi
  internal fun build(): TagResourceRequest = builder.build()

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
  inline var tags: Collection<Tag>?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.tags(value)
    }

  /**
    * 
    */
  inline fun tags(dslBlock: TagCollectionDSL.() -> Unit) {
    builder.tags(buildTagCollection(dslBlock))
  }

}

/**
  * Builds instances of type TagResourceRequest:
  * 
  */
inline fun buildTagResourceRequest(dslBlock: TagResourceRequestDSL.() -> Unit) =
  TagResourceRequestDSL(TagResourceRequest.builder()).apply(dslBlock).build()