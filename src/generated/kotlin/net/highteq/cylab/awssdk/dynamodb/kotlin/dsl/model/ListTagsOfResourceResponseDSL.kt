/*
  This file was generated from https://github.com/aws/aws-sdk-java-v2 by https://github.com/cylab/aws-kotlin-dsl-builder
  Like the original code, this file and project is licensed under
  Apache License Version 2.0
  See LICENSE.txt for more info
*/
@file:Suppress("DEPRECATION")
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
class ListTagsOfResourceResponseDSL {
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder = ListTagsOfResourceResponse.builder()
  internal fun build(): ListTagsOfResourceResponse = builder.build()
    
  /**
    * If this value is returned, there are additional results to be displayed. To retrieve them, call
    *  ListTagsOfResource again, with NextToken set to this value.
    */
  var nextToken: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.nextToken(value)
    }


  /**
    * 
    */
  var responseMetadata: AwsResponseMetadata?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.responseMetadata(value)
    }


  /**
    * 
    */
  var sdkHttpResponse: SdkHttpResponse?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.sdkHttpResponse(value)
    }


  /**
    * The tags currently associated with the Amazon DynamoDB resource.
    */
  var tags: Collection<Tag>?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.tags(value)
    }

  
  
    
  /**
    * The tags currently associated with the Amazon DynamoDB resource.
    */
  fun tags(dslBlock: TagCollectionDSL.() -> Unit) {
    builder.tags(buildTagCollection(dslBlock))
  }

}

/**
  * Builds instances of type ListTagsOfResourceResponse:
  * 
  */
fun buildListTagsOfResourceResponse(dslBlock: ListTagsOfResourceResponseDSL.() -> Unit) =
  ListTagsOfResourceResponseDSL().apply(dslBlock).build()