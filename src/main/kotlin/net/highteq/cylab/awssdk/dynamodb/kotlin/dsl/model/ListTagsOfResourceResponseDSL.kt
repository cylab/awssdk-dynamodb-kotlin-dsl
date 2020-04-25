/*
  This file was generated from https://github.com/aws/aws-sdk-java-v2 by https://github.com/cylab/aws-kotlin-dsl-builder
  Like the original code, this file and project is licensed under
  Apache License Version 2.0
  See LICENSE.txt for more info
*/
package net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.model

import kotlin.DeprecationLevel.HIDDEN
import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSL
import software.amazon.awssdk.services.dynamodb.model.ListTagsOfResourceResponse
import software.amazon.awssdk.services.dynamodb.model.Tag

/**
  * Builds instances of type ListTagsOfResourceResponse:
  * 
  */
@DynamodbDSL
class ListTagsOfResourceResponseDSL {
  private val builder = ListTagsOfResourceResponse.builder()
  internal fun build(): ListTagsOfResourceResponse = builder.build()
    
  /**
    * The tags currently associated with the Amazon DynamoDB resource.
    */
  @get:JvmSynthetic // Hide from Java callers
  var tags: Collection<Tag>
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.tags(value)
    }


  /**
    * If this value is returned, there are additional results to be displayed. To retrieve them, call
    *  ListTagsOfResource again, with NextToken set to this value.
    */
  @get:JvmSynthetic // Hide from Java callers
  var nextToken: String
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.nextToken(value)
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