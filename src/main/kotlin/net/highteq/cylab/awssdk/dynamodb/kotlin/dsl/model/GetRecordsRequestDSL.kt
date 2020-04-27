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
import software.amazon.awssdk.awscore.AwsRequestOverrideConfiguration
import software.amazon.awssdk.services.dynamodb.model.GetRecordsRequest

/**
  * Builds instances of type GetRecordsRequest:
  * Represents the input of a GetRecords operation.
  */
@DynamodbDSL
class GetRecordsRequestDSL {
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder = GetRecordsRequest.builder()
  internal fun build(): GetRecordsRequest = builder.build()
    
  /**
    * The maximum number of records to return from the shard. The upper limit is 1000.
    */
  var limit: Int?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.limit(value)
    }


  /**
    * 
    */
  var overrideConfiguration: AwsRequestOverrideConfiguration?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.overrideConfiguration(value)
    }


  /**
    * A shard iterator that was retrieved from a previous GetShardIterator operation. This iterator can be used to
    *  access the stream records in this shard.
    */
  var shardIterator: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.shardIterator(value)
    }

  
  
}

/**
  * Builds instances of type GetRecordsRequest:
  * Represents the input of a GetRecords operation.
  */
fun buildGetRecordsRequest(dslBlock: GetRecordsRequestDSL.() -> Unit) =
  GetRecordsRequestDSL().apply(dslBlock).build()