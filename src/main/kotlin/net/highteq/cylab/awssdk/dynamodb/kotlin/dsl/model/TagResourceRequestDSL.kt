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
import software.amazon.awssdk.services.dynamodb.model.Tag
import software.amazon.awssdk.services.dynamodb.model.TagResourceRequest

/**
  * Builds instances of type TagResourceRequest:
  * 
  */
@DynamodbDSL
class TagResourceRequestDSL {
  private val builder = TagResourceRequest.builder()
  internal fun build(): TagResourceRequest = builder.build()
    
  /**
    * The tags to be assigned to the Amazon DynamoDB resource.
    */
  @get:JvmSynthetic // Hide from Java callers
  var tags: Collection<Tag>
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.tags(value)
    }


  /**
    * Identifies the Amazon DynamoDB resource to which tags should be added. This value is an Amazon Resource Name
    *  (ARN).
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
    * The tags to be assigned to the Amazon DynamoDB resource.
    */
  fun tags(dslBlock: TagCollectionDSL.() -> Unit) {
    builder.tags(buildTagCollection(dslBlock))
  }

}

/**
  * Builds instances of type TagResourceRequest:
  * 
  */
fun buildTagResourceRequest(dslBlock: TagResourceRequestDSL.() -> Unit) =
  TagResourceRequestDSL().apply(dslBlock).build()