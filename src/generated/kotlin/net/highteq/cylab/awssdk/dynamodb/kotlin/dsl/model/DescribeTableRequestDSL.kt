/*
  This file was generated from https://github.com/aws/aws-sdk-java-v2 by https://github.com/cylab/aws-kotlin-dsl-builder
  Like the original code, this file and project is licensed under
  Apache License Version 2.0
  See LICENSE.txt for more info
*/
@file:Suppress("DEPRECATION", "NOTHING_TO_INLINE")
package net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.model

import kotlin.DeprecationLevel.HIDDEN
import kotlin.DeprecationLevel.WARNING
import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSL
import software.amazon.awssdk.awscore.AwsRequestOverrideConfiguration
import software.amazon.awssdk.services.dynamodb.DynamoDbAsyncClient
import software.amazon.awssdk.services.dynamodb.DynamoDbClient
import software.amazon.awssdk.services.dynamodb.model.DescribeTableRequest
import software.amazon.awssdk.services.dynamodb.transform.DescribeTableRequestMarshaller

/**
  * Builds instances of type DescribeTableRequest:
  * Represents the input of a DescribeTable operation.
  */
@DynamodbDSL
inline class DescribeTableRequestDSL(
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder: DescribeTableRequest.Builder
){
  @PublishedApi
  internal fun build(): DescribeTableRequest = builder.build()

  /**
    * 
    */
  inline var overrideConfiguration: AwsRequestOverrideConfiguration?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.overrideConfiguration(value)
    }

  /**
    * 
    */
  inline var tableName: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.tableName(value)
    }

}

/**
  * Builds instances of type DescribeTableRequest:
  * Represents the input of a DescribeTable operation.
  */
inline fun buildDescribeTableRequest(dslBlock: DescribeTableRequestDSL.() -> Unit) =
  DescribeTableRequestDSL(DescribeTableRequest.builder()).apply(dslBlock).build()

/**
  * 
  */
inline fun DescribeTableRequestMarshaller.marshallBy(dslBlock: DescribeTableRequestDSL.() -> Unit) =
  this.marshall(buildDescribeTableRequest(dslBlock))

/**
  * Returns information about the table, including the current status of the table, when it was created, the primary
  *  key schema, and any indexes on the table.
  * 
  *  If you issue a DescribeTable request immediately after a CreateTable request, DynamoDB
  *  might return a ResourceNotFoundException. This is because DescribeTable uses an
  *  eventually consistent query, and the metadata for your table might not be available at that moment. Wait for a
  *  few seconds, and then try the DescribeTable request again.
  */
inline fun DynamoDbAsyncClient.describeTableBy(dslBlock: DescribeTableRequestDSL.() -> Unit) =
  this.describeTable(buildDescribeTableRequest(dslBlock))

/**
  * Returns information about the table, including the current status of the table, when it was created, the primary
  *  key schema, and any indexes on the table.
  * 
  *  If you issue a DescribeTable request immediately after a CreateTable request, DynamoDB
  *  might return a ResourceNotFoundException. This is because DescribeTable uses an
  *  eventually consistent query, and the metadata for your table might not be available at that moment. Wait for a
  *  few seconds, and then try the DescribeTable request again.
  */
inline fun DynamoDbClient.describeTableBy(dslBlock: DescribeTableRequestDSL.() -> Unit) =
  this.describeTable(buildDescribeTableRequest(dslBlock))