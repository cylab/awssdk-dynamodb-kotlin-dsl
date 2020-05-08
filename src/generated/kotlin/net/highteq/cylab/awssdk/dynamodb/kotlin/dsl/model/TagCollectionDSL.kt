/*
  This file was generated from https://github.com/aws/aws-sdk-java-v2 by https://github.com/cylab/aws-kotlin-dsl-builder
  Like the original code, this file and project is licensed under
  Apache License Version 2.0
  See LICENSE.txt for more info
*/
@file:Suppress("DEPRECATION", "NOTHING_TO_INLINE")
package net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.model

import kotlin.DeprecationLevel.WARNING
import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSL
import software.amazon.awssdk.services.dynamodb.model.Tag

/**
  * Builds a collection of type Tag:
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
inline class TagCollectionDSL(
  @PublishedApi
  @Deprecated("Don't use internal fields!", level = WARNING)
  internal val list : MutableList<Tag>
){
  @PublishedApi
  internal fun build() = list

  /**
    * Builds an object of type Tag from 
    * the given DSL in 'dslBlock' and adds it to the collection
    */
  inline fun o(dslBlock: TagDSL.() -> Unit) {
    list.add(buildTag(dslBlock))
  }

  /**
    * Adds a Tag to the collection built by this DSL
    */
  inline operator fun Tag.unaryPlus() {
    list.add(this)
  }

  /**
    * Adds all given Tag instances to the collection built by this DSL
    */
  inline operator fun Collection<Tag>.unaryPlus() {
    list.addAll(this)
  }

  /**
    * Adds all given Tag instances to the collection built by this DSL
    */
  inline operator fun Array<Tag>.unaryPlus() {
    list.addAll(this)
  }
}

/**
  * Builds a collection of type Tag:
  * Describes a tag. A tag is a key-value pair. You can add up to 50 tags to a single DynamoDB table.
  * 
  *  AWS-assigned tag names and values are automatically assigned the aws: prefix, which the user cannot assign.
  *  AWS-assigned tag names do not count towards the tag limit of 50. User-assigned tag names have the prefix user: in the
  *  Cost Allocation Report. You cannot backdate the application of a tag.
  * 
  *  For an overview on tagging DynamoDB resources, see Tagging for DynamoDB in the
  *  Amazon DynamoDB Developer Guide.
  */
inline fun buildTagCollection(dslBlock: TagCollectionDSL.() -> Unit) =
  TagCollectionDSL(mutableListOf<Tag>()).apply(dslBlock).build()