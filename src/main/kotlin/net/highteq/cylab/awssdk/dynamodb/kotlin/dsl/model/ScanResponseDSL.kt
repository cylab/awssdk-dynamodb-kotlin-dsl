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
import software.amazon.awssdk.services.dynamodb.model.ScanResponse

/**
  * Builds instances of type ScanResponse:
  * Represents the output of a Scan operation.
  */
@DynamodbDSL
class ScanResponseDSL {
  private val builder = ScanResponse.builder()
  internal fun build(): ScanResponse = builder.build()
    
  /**
    * An array of item attributes that match the scan criteria. Each element in this array consists of an attribute
    *  name and the value for that attribute.
    */
  @get:JvmSynthetic // Hide from Java callers
  var items: Collection<Map<String, AttributeValue>>
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.items(value)
    }


  /**
    * The number of items evaluated, before any ScanFilter is applied. A high
    *  ScannedCount value with few, or no, Count results indicates an inefficient
    *  Scan operation. For more information, see Count and
    *  ScannedCount in the Amazon DynamoDB Developer Guide.
    * 
    *  If you did not use a filter in the request, then ScannedCount is the same as Count.
    */
  @get:JvmSynthetic // Hide from Java callers
  var scannedCount: Int
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.scannedCount(value)
    }


  /**
    * The primary key of the item where the operation stopped, inclusive of the previous result set. Use this value
    *  to start a new operation, excluding this value in the new request.
    * 
    *  If LastEvaluatedKey is empty, then the "last page" of results has been processed and there is no
    *  more data to be retrieved.
    * 
    *  If LastEvaluatedKey is not empty, it does not necessarily mean that there is more data in the
    *  result set. The only way to know when you have reached the end of the result set is when
    *  LastEvaluatedKey is empty.
    */
  @get:JvmSynthetic // Hide from Java callers
  var lastEvaluatedKey: Map<String, AttributeValue>
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.lastEvaluatedKey(value)
    }


  /**
    * The capacity units consumed by the Scan operation. The data returned includes the total
    *  provisioned throughput consumed, along with statistics for the table and any indexes involved in the
    *  operation. ConsumedCapacity is only returned if the ReturnConsumedCapacity
    *  parameter was specified. For more information, see Provisioned Throughput in the Amazon DynamoDB Developer Guide.
    */
  @get:JvmSynthetic // Hide from Java callers
  var consumedCapacity: ConsumedCapacity
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.consumedCapacity(value)
    }


  /**
    * The number of items in the response.
    * 
    *  If you set ScanFilter in the request, then Count is the number of items returned
    *  after the filter was applied, and ScannedCount is the number of matching items before the filter
    *  was applied.
    * 
    *  If you did not use a filter in the request, then Count is the same as ScannedCount.
    */
  @get:JvmSynthetic // Hide from Java callers
  var count: Int
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.count(value)
    }

  
    
  /**
    * The capacity units consumed by the Scan operation. The data returned includes the total
    *  provisioned throughput consumed, along with statistics for the table and any indexes involved in the
    *  operation. ConsumedCapacity is only returned if the ReturnConsumedCapacity
    *  parameter was specified. For more information, see Provisioned Throughput in the Amazon DynamoDB Developer Guide.
    */
  fun consumedCapacity(dslBlock: ConsumedCapacityDSL.() -> Unit) {
    builder.consumedCapacity(buildConsumedCapacity(dslBlock))
  }

}

/**
  * Builds instances of type ScanResponse:
  * Represents the output of a Scan operation.
  */
fun buildScanResponse(dslBlock: ScanResponseDSL.() -> Unit) =
  ScanResponseDSL().apply(dslBlock).build()