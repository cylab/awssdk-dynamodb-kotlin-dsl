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
import software.amazon.awssdk.services.dynamodb.model.CreateBackupRequest
import software.amazon.awssdk.services.dynamodb.transform.CreateBackupRequestMarshaller

/**
  * Builds instances of type CreateBackupRequest:
  * 
  */
@DynamodbDSL
inline class CreateBackupRequestDSL(
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder: CreateBackupRequest.Builder
){
  @PublishedApi
  internal fun build(): CreateBackupRequest = builder.build()

  /**
    * 
    */
  inline var backupName: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.backupName(value)
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

}

/**
  * Builds instances of type CreateBackupRequest:
  * 
  */
inline fun buildCreateBackupRequest(dslBlock: CreateBackupRequestDSL.() -> Unit) =
  CreateBackupRequestDSL(CreateBackupRequest.builder()).apply(dslBlock).build()

/**
  * 
  */
inline fun CreateBackupRequestMarshaller.marshallBy(dslBlock: CreateBackupRequestDSL.() -> Unit) =
  this.marshall(buildCreateBackupRequest(dslBlock))

/**
  * Creates a backup for an existing table.
  * 
  *  Each time you create an On-Demand Backup, the entire table data is backed up. There is no limit to the number of
  *  on-demand backups that can be taken.
  * 
  *  When you create an On-Demand Backup, a time marker of the request is cataloged, and the backup is created
  *  asynchronously, by applying all changes until the time of the request to the last full table snapshot. Backup
  *  requests are processed instantaneously and become available for restore within minutes.
  * 
  *  You can call CreateBackup at a maximum rate of 50 times per second.
  * 
  *  All backups in DynamoDB work without consuming any provisioned throughput on the table.
  * 
  *  If you submit a backup request on 2018-12-14 at 14:25:00, the backup is guaranteed to contain all data committed
  *  to the table up to 14:24:00, and data committed after 14:26:00 will not be. The backup may or may not contain
  *  data modifications made between 14:24:00 and 14:26:00. On-Demand Backup does not support causal consistency.
  * 
  *  Along with data, the following are also included on the backups:
  * 
  *  Global secondary indexes (GSIs)
  * 
  *  Local secondary indexes (LSIs)
  * 
  *  Streams
  * 
  *  Provisioned read and write capacity
  */
inline fun DynamoDbAsyncClient.createBackupBy(dslBlock: CreateBackupRequestDSL.() -> Unit) =
  this.createBackup(buildCreateBackupRequest(dslBlock))

/**
  * Creates a backup for an existing table.
  * 
  *  Each time you create an On-Demand Backup, the entire table data is backed up. There is no limit to the number of
  *  on-demand backups that can be taken.
  * 
  *  When you create an On-Demand Backup, a time marker of the request is cataloged, and the backup is created
  *  asynchronously, by applying all changes until the time of the request to the last full table snapshot. Backup
  *  requests are processed instantaneously and become available for restore within minutes.
  * 
  *  You can call CreateBackup at a maximum rate of 50 times per second.
  * 
  *  All backups in DynamoDB work without consuming any provisioned throughput on the table.
  * 
  *  If you submit a backup request on 2018-12-14 at 14:25:00, the backup is guaranteed to contain all data committed
  *  to the table up to 14:24:00, and data committed after 14:26:00 will not be. The backup may or may not contain
  *  data modifications made between 14:24:00 and 14:26:00. On-Demand Backup does not support causal consistency.
  * 
  *  Along with data, the following are also included on the backups:
  * 
  *  Global secondary indexes (GSIs)
  * 
  *  Local secondary indexes (LSIs)
  * 
  *  Streams
  * 
  *  Provisioned read and write capacity
  */
inline fun DynamoDbClient.createBackupBy(dslBlock: CreateBackupRequestDSL.() -> Unit) =
  this.createBackup(buildCreateBackupRequest(dslBlock))