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
import software.amazon.awssdk.services.dynamodb.model.AttributeValue
import software.amazon.awssdk.services.dynamodb.model.BatchGetItemResponse
import software.amazon.awssdk.services.dynamodb.model.ConsumedCapacity
import software.amazon.awssdk.services.dynamodb.model.KeysAndAttributes

/**
  * Builds instances of type BatchGetItemResponse:
  * Represents the output of a BatchGetItem operation.
  */
@DynamodbDSL
class BatchGetItemResponseDSL {
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder = BatchGetItemResponse.builder()
  internal fun build(): BatchGetItemResponse = builder.build()
    
  /**
    * A map of table name to a list of items. Each object in Responses consists of a table name, along
    *  with a map of attribute data consisting of the data type and attribute value.
    */
  var responses: Map<String, Collection<Map<String, AttributeValue>>>
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.responses(value)
    }


  /**
    * A map of tables and their respective keys that were not processed with the current response. The
    *  UnprocessedKeys value is in the same form as RequestItems, so the value can be
    *  provided directly to a subsequent BatchGetItem operation. For more information, see
    *  RequestItems in the Request Parameters section.
    * 
    *  Each element consists of:
    * 
    *  Keys - An array of primary key attribute values that define specific items in the table.
    * 
    *  ProjectionExpression - One or more attributes to be retrieved from the table or index. By
    *  default, all attributes are returned. If a requested attribute is not found, it does not appear in the
    *  result.
    * 
    *  ConsistentRead - The consistency of a read operation. If set to true, then a
    *  strongly consistent read is used; otherwise, an eventually consistent read is used.
    * 
    *  If there are no unprocessed keys remaining, the response contains an empty UnprocessedKeys map.
    */
  var unprocessedKeys: Map<String, KeysAndAttributes>
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.unprocessedKeys(value)
    }


  /**
    * The read capacity units consumed by the entire BatchGetItem operation.
    * 
    *  Each element consists of:
    * 
    *  TableName - The table that consumed the provisioned throughput.
    * 
    *  CapacityUnits - The total number of capacity units consumed.
    */
  var consumedCapacity: Collection<ConsumedCapacity>
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.consumedCapacity(value)
    }


  /**
    * 
    */
  var responseMetadata: AwsResponseMetadata
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.responseMetadata(value)
    }


  /**
    * 
    */
  var sdkHttpResponse: SdkHttpResponse
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.sdkHttpResponse(value)
    }

  
    
  /**
    * The read capacity units consumed by the entire BatchGetItem operation.
    * 
    *  Each element consists of:
    * 
    *  TableName - The table that consumed the provisioned throughput.
    * 
    *  CapacityUnits - The total number of capacity units consumed.
    */
  fun consumedCapacity(dslBlock: ConsumedCapacityCollectionDSL.() -> Unit) {
    builder.consumedCapacity(buildConsumedCapacityCollection(dslBlock))
  }

}

/**
  * Builds instances of type BatchGetItemResponse:
  * Represents the output of a BatchGetItem operation.
  */
fun buildBatchGetItemResponse(dslBlock: BatchGetItemResponseDSL.() -> Unit) =
  BatchGetItemResponseDSL().apply(dslBlock).build()