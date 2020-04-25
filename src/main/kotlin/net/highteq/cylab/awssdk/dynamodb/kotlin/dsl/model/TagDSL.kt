/*
  This file was generated from https://github.com/aws/aws-sdk-java-v2 by https://github.com/cylab/aws-kotlin-dsl-builder
  Like the original code, this file and project is licensed under
  Apache License Version 2.0
  See LICENSE.txt for more info
*/
package net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.model

import kotlin.DeprecationLevel.HIDDEN
import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSL
import software.amazon.awssdk.services.dynamodb.model.Tag

/**
  * Builds instances of type Tag:
  * Describes a tag. A tag is a key-value pair. You can add up to 50 tags to a single DynamoDB table.
  * 
  *  AWS-assigned tag names and values are automatically assigned the aws: prefix, which the user cannot
  *  assign. AWS-assigned tag names do not count towards the tag limit of 50. User-assigned tag names have the prefix
  *  user: in the Cost Allocation Report. You cannot backdate the application of a tag.
  * 
  *  For an overview on tagging DynamoDB resources, see Tagging for DynamoDB in the
  *  Amazon DynamoDB Developer Guide.
  */
@DynamodbDSL
class TagDSL {
  private val builder = Tag.builder()
  internal fun build(): Tag = builder.build()
    
  /**
    * The value of the tag. Tag values are case-sensitive and can be null.
    */
  @get:JvmSynthetic // Hide from Java callers
  var value: String
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.value(value)
    }


  /**
    * The key of the tag. Tag keys are case sensitive. Each DynamoDB table can only have up to one tag with the
    *  same key. If you try to add an existing tag (same key), the existing tag value will be updated to the new
    *  value.
    */
  @get:JvmSynthetic // Hide from Java callers
  var key: String
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.key(value)
    }

  
  
}

/**
  * Builds instances of type Tag:
  * Describes a tag. A tag is a key-value pair. You can add up to 50 tags to a single DynamoDB table.
  * 
  *  AWS-assigned tag names and values are automatically assigned the aws: prefix, which the user cannot
  *  assign. AWS-assigned tag names do not count towards the tag limit of 50. User-assigned tag names have the prefix
  *  user: in the Cost Allocation Report. You cannot backdate the application of a tag.
  * 
  *  For an overview on tagging DynamoDB resources, see Tagging for DynamoDB in the
  *  Amazon DynamoDB Developer Guide.
  */
fun buildTag(dslBlock: TagDSL.() -> Unit) =
  TagDSL().apply(dslBlock).build()