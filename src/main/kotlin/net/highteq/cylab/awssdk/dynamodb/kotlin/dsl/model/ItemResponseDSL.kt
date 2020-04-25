/*
  This file was generated from https://github.com/aws/aws-sdk-java-v2 by https://github.com/cylab/aws-kotlin-dsl-builder
  Like the original code, this file and project is licensed under
  Apache License Version 2.0
  See LICENSE.txt for more info
*/
package net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.model

import kotlin.DeprecationLevel.HIDDEN
import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSL
import software.amazon.awssdk.services.dynamodb.model.AttributeValue
import software.amazon.awssdk.services.dynamodb.model.ItemResponse

/**
  * Builds instances of type ItemResponse:
  * Details for the requested item.
  */
@DynamodbDSL
class ItemResponseDSL {
  private val builder = ItemResponse.builder()
  internal fun build(): ItemResponse = builder.build()
    
  /**
    * Map of attribute data consisting of the data type and attribute value.
    */
  @get:JvmSynthetic // Hide from Java callers
  var item: Map<String, AttributeValue>
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.item(value)
    }

  
  
}

/**
  * Builds instances of type ItemResponse:
  * Details for the requested item.
  */
fun buildItemResponse(dslBlock: ItemResponseDSL.() -> Unit) =
  ItemResponseDSL().apply(dslBlock).build()