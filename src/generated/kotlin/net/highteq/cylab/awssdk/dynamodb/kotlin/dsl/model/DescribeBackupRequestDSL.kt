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
import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSLMarker
import software.amazon.awssdk.awscore.AwsRequestOverrideConfiguration
import software.amazon.awssdk.services.dynamodb.DynamoDbAsyncClient
import software.amazon.awssdk.services.dynamodb.DynamoDbClient
import software.amazon.awssdk.services.dynamodb.model.DescribeBackupRequest
import software.amazon.awssdk.services.dynamodb.transform.DescribeBackupRequestMarshaller

/**
  * Builds instances of type DescribeBackupRequest:
  * 
  */
@DynamodbDSLMarker
inline class DescribeBackupRequestDSL(
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder: DescribeBackupRequest.Builder
){
  @PublishedApi
  internal fun build(): DescribeBackupRequest = builder.build()

  /**
    * 
    */
  inline var backupArn: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.backupArn(value)
    }

  /**
    * 
    */
  inline var overrideConfiguration: AwsRequestOverrideConfiguration?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.overrideConfiguration(value)
    }

}

/**
  * Builds instances of type DescribeBackupRequest:
  * 
  */
inline fun describeBackupRequest(dslBlock: DescribeBackupRequestDSL.() -> Unit) =
  DescribeBackupRequestDSL(DescribeBackupRequest.builder()).apply(dslBlock).build()

/**
  * Builds instances of type DescribeBackupRequest:
  * 
  */
inline fun DynamodbDSL.Companion.describeBackupRequest(dslBlock: DescribeBackupRequestDSL.() -> Unit) =
  DescribeBackupRequestDSL(DescribeBackupRequest.builder()).apply(dslBlock).build()

/**
  * 
  */
inline fun DescribeBackupRequestMarshaller.marshallBy(dslBlock: DescribeBackupRequestDSL.() -> Unit) =
  this.marshall(DynamodbDSL.Companion.describeBackupRequest(dslBlock))

/**
  * Describes an existing backup of a table.
  * 
  *  You can call DescribeBackup at a maximum rate of 10 times per second.
  */
inline fun DynamoDbAsyncClient.describeBackupBy(dslBlock: DescribeBackupRequestDSL.() -> Unit) =
  this.describeBackup(DynamodbDSL.Companion.describeBackupRequest(dslBlock))

/**
  * Describes an existing backup of a table.
  * 
  *  You can call DescribeBackup at a maximum rate of 10 times per second.
  */
inline fun DynamoDbClient.describeBackupBy(dslBlock: DescribeBackupRequestDSL.() -> Unit) =
  this.describeBackup(DynamodbDSL.Companion.describeBackupRequest(dslBlock))