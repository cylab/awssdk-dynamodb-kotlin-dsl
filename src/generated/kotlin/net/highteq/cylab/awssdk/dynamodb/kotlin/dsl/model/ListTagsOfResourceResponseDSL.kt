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
import software.amazon.awssdk.services.dynamodb.model.ListTagsOfResourceResponse
import software.amazon.awssdk.services.dynamodb.model.Tag

/**
  * Builds instances of type ListTagsOfResourceResponse:
  * 
  */
@DynamodbDSL
inline class ListTagsOfResourceResponseDSL(
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder: ListTagsOfResourceResponse.Builder
){
  @PublishedApi
  internal fun build(): ListTagsOfResourceResponse = builder.build()
    
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
  * Builds instances of type ListTagsOfResourceResponse:
  * 
  */
inline fun buildListTagsOfResourceResponse(dslBlock: ListTagsOfResourceResponseDSL.() -> Unit) =
  ListTagsOfResourceResponseDSL(ListTagsOfResourceResponse.builder()).apply(dslBlock).build()