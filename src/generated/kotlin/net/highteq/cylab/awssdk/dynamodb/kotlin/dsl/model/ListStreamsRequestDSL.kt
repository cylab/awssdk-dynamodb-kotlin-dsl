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
import software.amazon.awssdk.services.dynamodb.model.ListStreamsRequest

/**
  * Builds instances of type ListStreamsRequest:
  * Represents the input of a ListStreams operation.
  */
@DynamodbDSL
class ListStreamsRequestDSL {
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder = ListStreamsRequest.builder()
  internal fun build(): ListStreamsRequest = builder.build()
    
  /**
    * The ARN (Amazon Resource Name) of the first item that this operation will evaluate. Use the value that was
    *  returned for LastEvaluatedStreamArn in the previous operation.
    */
  var exclusiveStartStreamArn: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.exclusiveStartStreamArn(value)
    }


  /**
    * The maximum number of streams to return. The upper limit is 100.
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
    * If this parameter is provided, then only the streams associated with this table name are returned.
    */
  var tableName: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.tableName(value)
    }

  
  
  
}

/**
  * Builds instances of type ListStreamsRequest:
  * Represents the input of a ListStreams operation.
  */
fun buildListStreamsRequest(dslBlock: ListStreamsRequestDSL.() -> Unit) =
  ListStreamsRequestDSL().apply(dslBlock).build()