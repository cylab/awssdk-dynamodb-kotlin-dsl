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
import software.amazon.awssdk.services.dynamodb.model.RestoreTableFromBackupRequest
import software.amazon.awssdk.services.dynamodb.transform.RestoreTableFromBackupRequestMarshaller

/**
  * Builds instances of type RestoreTableFromBackupRequest:
  * 
  */
@DynamodbDSL
inline class RestoreTableFromBackupRequestDSL(
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder: RestoreTableFromBackupRequest.Builder
){
  @PublishedApi
  internal fun build(): RestoreTableFromBackupRequest = builder.build()

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

  /**
    * 
    */
  inline var targetTableName: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.targetTableName(value)
    }

}

/**
  * Builds instances of type RestoreTableFromBackupRequest:
  * 
  */
inline fun buildRestoreTableFromBackupRequest(dslBlock: RestoreTableFromBackupRequestDSL.() -> Unit) =
  RestoreTableFromBackupRequestDSL(RestoreTableFromBackupRequest.builder()).apply(dslBlock).build()

/**
  * Creates a new table from an existing backup. Any number of users can execute up to 4 concurrent restores (any
  *  type of restore) in a given account.
  * 
  *  You can call RestoreTableFromBackup at a maximum rate of 10 times per second.
  * 
  *  You must manually set up the following on the restored table:
  * 
  *  Auto scaling policies
  * 
  *  IAM policies
  * 
  *  Cloudwatch metrics and alarms
  * 
  *  Tags
  * 
  *  Stream settings
  * 
  *  Time to Live (TTL) settings
  */
inline fun DynamoDbAsyncClient.restoreTableFromBackupBy(dslBlock: RestoreTableFromBackupRequestDSL.() -> Unit) =
  this.restoreTableFromBackup(buildRestoreTableFromBackupRequest(dslBlock))

/**
  * Creates a new table from an existing backup. Any number of users can execute up to 4 concurrent restores (any
  *  type of restore) in a given account.
  * 
  *  You can call RestoreTableFromBackup at a maximum rate of 10 times per second.
  * 
  *  You must manually set up the following on the restored table:
  * 
  *  Auto scaling policies
  * 
  *  IAM policies
  * 
  *  Cloudwatch metrics and alarms
  * 
  *  Tags
  * 
  *  Stream settings
  * 
  *  Time to Live (TTL) settings
  */
inline fun DynamoDbClient.restoreTableFromBackupBy(dslBlock: RestoreTableFromBackupRequestDSL.() -> Unit) =
  this.restoreTableFromBackup(buildRestoreTableFromBackupRequest(dslBlock))

/**
  * 
  */
inline fun RestoreTableFromBackupRequestMarshaller.marshallBy(dslBlock: RestoreTableFromBackupRequestDSL.() -> Unit) =
  this.marshall(buildRestoreTableFromBackupRequest(dslBlock))