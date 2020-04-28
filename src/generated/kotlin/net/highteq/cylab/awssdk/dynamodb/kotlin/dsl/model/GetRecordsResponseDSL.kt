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
import software.amazon.awssdk.services.dynamodb.model.GetRecordsResponse
import software.amazon.awssdk.services.dynamodb.model.Record

/**
  * Builds instances of type GetRecordsResponse:
  * Represents the output of a GetRecords operation.
  */
@DynamodbDSL
class GetRecordsResponseDSL {
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder = GetRecordsResponse.builder()
  internal fun build(): GetRecordsResponse = builder.build()
    
  /**
    * The next position in the shard from which to start sequentially reading stream records. If set to
    *  null, the shard has been closed and the requested iterator will not return any more data.
    */
  var nextShardIterator: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.nextShardIterator(value)
    }


  /**
    * The stream records from the shard, which were retrieved using the shard iterator.
    */
  var records: Collection<Record>?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.records(value)
    }


  /**
    * 
    */
  var responseMetadata: AwsResponseMetadata?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.responseMetadata(value)
    }


  /**
    * 
    */
  var sdkHttpResponse: SdkHttpResponse?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.sdkHttpResponse(value)
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