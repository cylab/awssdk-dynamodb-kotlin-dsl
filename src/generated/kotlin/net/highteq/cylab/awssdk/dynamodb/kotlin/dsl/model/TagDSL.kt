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
import software.amazon.awssdk.services.dynamodb.model.Tag

/**
  * Builds instances of type Tag:
  * Describes a tag. A tag is a key-value pair. You can add up to 50 tags to a single DynamoDB table.
  * 
  *  AWS-assigned tag names and values are automatically assigned the aws: prefix, which the user cannot assign.
  *  AWS-assigned tag names do not count towards the tag limit of 50. User-assigned tag names have the prefix user: in the
  *  Cost Allocation Report. You cannot backdate the application of a tag.
  * 
  *  For an overview on tagging DynamoDB resources, see Tagging for DynamoDB in the
  *  Amazon DynamoDB Developer Guide.
  */
@DynamodbDSL
inline class TagDSL(
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder: Tag.Builder
){
  @PublishedApi
  internal fun build(): Tag = builder.build()

  /**
    * 
    */
  inline var key: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.key(value)
    }

  /**
    * 
    */
  inline var value: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.value(value)
    }

}

/**
  * Builds instances of type Tag:
  * Describes a tag. A tag is a key-value pair. You can add up to 50 tags to a single DynamoDB table.
  * 
  *  AWS-assigned tag names and values are automatically assigned the aws: prefix, which the user cannot assign.
  *  AWS-assigned tag names do not count towards the tag limit of 50. User-assigned tag names have the prefix user: in the
  *  Cost Allocation Report. You cannot backdate the application of a tag.
  * 
  *  For an overview on tagging DynamoDB resources, see Tagging for DynamoDB in the
  *  Amazon DynamoDB Developer Guide.
  */
inline fun buildTag(dslBlock: TagDSL.() -> Unit) =
  TagDSL(Tag.builder()).apply(dslBlock).build()