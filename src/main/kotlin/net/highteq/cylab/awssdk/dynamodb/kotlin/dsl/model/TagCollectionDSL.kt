/*
  This file was generated from https://github.com/aws/aws-sdk-java-v2 by https://github.com/cylab/aws-kotlin-dsl-builder
  Like the original code, this file and project is licensed under
  Apache License Version 2.0
  See LICENSE.txt for more info
*/
package net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.model

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
class TagCollectionDSL {
  private val list = ArrayList<Tag>()
  internal fun build() : List<Tag> = list

  /**
    * Receives a sub DSL in 'dslBlock' to build a Tag instance
    * and adds it to the collection built by the enclosing DSL
    */
  fun add(dslBlock: TagDSL.() -> Unit) {
    list.add(TagDSL().apply(dslBlock).build())
  }

  /**
    * Adds a Tag to the collection built by this DSL
    */
  fun add(item: Tag) {
    list.add(item)
  }

  /**
    * Adds all given Tag instances to the collection built by this DSL
    */
  fun addAll(items: Collection<Tag>) {
    list.addAll(items)
  }

  /**
    * Adds all given Tag instances to the collection built by this DSL
    */
  infix fun addAll(items: Array<Tag>) {
    list.addAll(items)
  }

  /**
    * Adds a Tag to the collection built by this DSL
    */
  operator fun Tag.unaryPlus() {
    list.add(this)
  }

  /**
    * Adds all given Tag instances to the collection built by this DSL
    */
  operator fun Collection<Tag>.unaryPlus() {
    list.addAll(this)
  }

  /**
    * Adds all given Tag instances to the collection built by this DSL
    */
  operator fun Array<Tag>.unaryPlus() {
    list.addAll(this)
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
fun buildTagCollection(dslBlock: TagCollectionDSL.() -> Unit) =
  TagCollectionDSL().apply(dslBlock).build()