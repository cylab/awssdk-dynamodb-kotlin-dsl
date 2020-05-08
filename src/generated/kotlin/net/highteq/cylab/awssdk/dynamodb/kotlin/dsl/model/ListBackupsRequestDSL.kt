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
import java.time.Instant
import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSL
import software.amazon.awssdk.awscore.AwsRequestOverrideConfiguration
import software.amazon.awssdk.services.dynamodb.DynamoDbAsyncClient
import software.amazon.awssdk.services.dynamodb.DynamoDbClient
import software.amazon.awssdk.services.dynamodb.model.BackupTypeFilter
import software.amazon.awssdk.services.dynamodb.model.ListBackupsRequest
import software.amazon.awssdk.services.dynamodb.transform.ListBackupsRequestMarshaller

/**
  * Builds instances of type ListBackupsRequest:
  * 
  */
@DynamodbDSL
inline class ListBackupsRequestDSL(
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder: ListBackupsRequest.Builder
){
  @PublishedApi
  internal fun build(): ListBackupsRequest = builder.build()

  /**
    * 
    */
  inline var backupType: BackupTypeFilter?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.backupType(value)
    }

  /**
    * 
    */
  inline var exclusiveStartBackupArn: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.exclusiveStartBackupArn(value)
    }

  /**
    * 
    */
  inline var limit: Int?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.limit(value)
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

  /**
    * 
    */
  inline var tableName: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.tableName(value)
    }

  /**
    * 
    */
  inline var timeRangeLowerBound: Instant?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.timeRangeLowerBound(value)
    }

  /**
    * 
    */
  inline var timeRangeUpperBound: Instant?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.timeRangeUpperBound(value)
    }

  /**
    * 
    */
  inline fun backupType(value: String?) {
    builder.backupType(value)
  }

}

/**
  * Builds instances of type ListBackupsRequest:
  * 
  */
inline fun buildListBackupsRequest(dslBlock: ListBackupsRequestDSL.() -> Unit) =
  ListBackupsRequestDSL(ListBackupsRequest.builder()).apply(dslBlock).build()

/**
  * List backups associated with an AWS account. To list backups for a given table, specify TableName.
  *  ListBackups returns a paginated list of results with at most 1MB worth of items in a page. You can
  *  also specify a limit for the maximum number of entries to be returned in a page.
  * 
  *  In the request, start time is inclusive but end time is exclusive. Note that these limits are for the time at
  *  which the original backup was requested.
  * 
  *  You can call ListBackups a maximum of 5 times per second.
  */
inline fun DynamoDbAsyncClient.listBackupsBy(dslBlock: ListBackupsRequestDSL.() -> Unit) =
  this.listBackups(buildListBackupsRequest(dslBlock))

/**
  * List backups associated with an AWS account. To list backups for a given table, specify TableName.
  *  ListBackups returns a paginated list of results with at most 1MB worth of items in a page. You can
  *  also specify a limit for the maximum number of entries to be returned in a page.
  * 
  *  In the request, start time is inclusive but end time is exclusive. Note that these limits are for the time at
  *  which the original backup was requested.
  * 
  *  You can call ListBackups a maximum of 5 times per second.
  */
inline fun DynamoDbClient.listBackupsBy(dslBlock: ListBackupsRequestDSL.() -> Unit) =
  this.listBackups(buildListBackupsRequest(dslBlock))

/**
  * 
  */
inline fun ListBackupsRequestMarshaller.marshallBy(dslBlock: ListBackupsRequestDSL.() -> Unit) =
  this.marshall(buildListBackupsRequest(dslBlock))