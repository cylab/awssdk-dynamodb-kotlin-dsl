/*
  This file was generated from https://github.com/aws/aws-sdk-java-v2 by https://github.com/cylab/aws-kotlin-dsl-builder
  Like the original code, this file and project is licensed under
  Apache License Version 2.0
  See LICENSE.txt for more info
*/
package net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.model

import kotlin.DeprecationLevel.HIDDEN
import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSL
import software.amazon.awssdk.services.dynamodb.model.GetRecordsResponse
import software.amazon.awssdk.services.dynamodb.model.Record

/**
  * Builds instances of type GetRecordsResponse:
  * Represents the output of a GetRecords operation.
  */
@DynamodbDSL
class GetRecordsResponseDSL {
  private val builder = GetRecordsResponse.builder()
  internal fun build(): GetRecordsResponse = builder.build()
    
  /**
    * The stream records from the shard, which were retrieved using the shard iterator.
    */
  @get:JvmSynthetic // Hide from Java callers
  var records: Collection<Record>
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.records(value)
    }


  /**
    * The next position in the shard from which to start sequentially reading stream records. If set to
    *  null, the shard has been closed and the requested iterator will not return any more data.
    */
  @get:JvmSynthetic // Hide from Java callers
  var nextShardIterator: String
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.nextShardIterator(value)
    }

  
    
  /**
    * The stream records from the shard, which were retrieved using the shard iterator.
    */
  fun records(dslBlock: RecordCollectionDSL.() -> Unit) {
    builder.records(buildRecordCollection(dslBlock))
  }

}

/**
  * Builds instances of type GetRecordsResponse:
  * Represents the output of a GetRecords operation.
  */
fun buildGetRecordsResponse(dslBlock: GetRecordsResponseDSL.() -> Unit) =
  GetRecordsResponseDSL().apply(dslBlock).build()