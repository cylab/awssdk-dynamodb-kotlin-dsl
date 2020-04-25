/*
  This file was generated from https://github.com/aws/aws-sdk-java-v2 by https://github.com/cylab/aws-kotlin-dsl-builder
  Like the original code, this file and project is licensed under
  Apache License Version 2.0
  See LICENSE.txt for more info
*/
package net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.model

import kotlin.DeprecationLevel.HIDDEN
import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSL
import software.amazon.awssdk.services.dynamodb.model.TagResourceResponse

/**
  * Builds instances of type TagResourceResponse:
  * 
  */
@DynamodbDSL
class TagResourceResponseDSL {
  private val builder = TagResourceResponse.builder()
  internal fun build(): TagResourceResponse = builder.build()
  
  
  
}

/**
  * Builds instances of type TagResourceResponse:
  * 
  */
fun buildTagResourceResponse(dslBlock: TagResourceResponseDSL.() -> Unit) =
  TagResourceResponseDSL().apply(dslBlock).build()