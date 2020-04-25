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
import software.amazon.awssdk.services.dynamodb.model.ConsumedCapacity
import software.amazon.awssdk.services.dynamodb.model.GetItemResponse

/**
  * Builds instances of type GetItemResponse:
  * Represents the output of a GetItem operation.
  */
@DynamodbDSL
class GetItemResponseDSL {
  private val builder = GetItemResponse.builder()
  internal fun build(): GetItemResponse = builder.build()
    
  /**
    * A map of attribute names to AttributeValue objects, as specified by
    *  ProjectionExpression.
    */
  @get:JvmSynthetic // Hide from Java callers
  var item: Map<String, AttributeValue>
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.item(value)
    }


  /**
    * The capacity units consumed by the GetItem operation. The data returned includes the total
    *  provisioned throughput consumed, along with statistics for the table and any indexes involved in the
    *  operation. ConsumedCapacity is only returned if the ReturnConsumedCapacity
    *  parameter was specified. For more information, see Read/Write Capacity Mode in the Amazon DynamoDB Developer Guide.
    */
  @get:JvmSynthetic // Hide from Java callers
  var consumedCapacity: ConsumedCapacity
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.consumedCapacity(value)
    }

  
    
  /**
    * The capacity units consumed by the GetItem operation. The data returned includes the total
    *  provisioned throughput consumed, along with statistics for the table and any indexes involved in the
    *  operation. ConsumedCapacity is only returned if the ReturnConsumedCapacity
    *  parameter was specified. For more information, see Read/Write Capacity Mode in the Amazon DynamoDB Developer Guide.
    */
  fun consumedCapacity(dslBlock: ConsumedCapacityDSL.() -> Unit) {
    builder.consumedCapacity(buildConsumedCapacity(dslBlock))
  }

}

/**
  * Builds instances of type GetItemResponse:
  * Represents the output of a GetItem operation.
  */
fun buildGetItemResponse(dslBlock: GetItemResponseDSL.() -> Unit) =
  GetItemResponseDSL().apply(dslBlock).build()