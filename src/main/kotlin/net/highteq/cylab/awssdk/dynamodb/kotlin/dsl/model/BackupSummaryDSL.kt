/*
  This file was generated from https://github.com/aws/aws-sdk-java-v2 by https://github.com/cylab/aws-kotlin-dsl-builder
  Like the original code, this file and project is licensed under
  Apache License Version 2.0
  See LICENSE.txt for more info
*/
package net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.model

import kotlin.DeprecationLevel.HIDDEN
import java.time.Instant
import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSL
import software.amazon.awssdk.services.dynamodb.model.BackupStatus
import software.amazon.awssdk.services.dynamodb.model.BackupSummary
import software.amazon.awssdk.services.dynamodb.model.BackupType

/**
  * Builds instances of type BackupSummary:
  * Contains details for the backup.
  */
@DynamodbDSL
class BackupSummaryDSL {
  private val builder = BackupSummary.builder()
  internal fun build(): BackupSummary = builder.build()
    
  /**
    * Name of the table.
    */
  @get:JvmSynthetic // Hide from Java callers
  var tableName: String
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.tableName(value)
    }


  /**
    * ARN associated with the table.
    */
  @get:JvmSynthetic // Hide from Java callers
  var tableArn: String
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.tableArn(value)
    }


  /**
    * Unique identifier for the table.
    */
  @get:JvmSynthetic // Hide from Java callers
  var tableId: String
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.tableId(value)
    }


  /**
    * ARN associated with the backup.
    */
  @get:JvmSynthetic // Hide from Java callers
  var backupArn: String
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.backupArn(value)
    }


  /**
    * Name of the specified backup.
    */
  @get:JvmSynthetic // Hide from Java callers
  var backupName: String
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.backupName(value)
    }


  /**
    * Time at which the backup was created.
    */
  @get:JvmSynthetic // Hide from Java callers
  var backupCreationDateTime: Instant
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.backupCreationDateTime(value)
    }


  /**
    * Time at which the automatic on-demand backup created by DynamoDB will expire. This SYSTEM
    *  on-demand backup expires automatically 35 days after its creation.
    */
  @get:JvmSynthetic // Hide from Java callers
  var backupExpiryDateTime: Instant
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.backupExpiryDateTime(value)
    }


  /**
    * Backup can be in one of the following states: CREATING, ACTIVE, DELETED.
    */
  @get:JvmSynthetic // Hide from Java callers
  var backupStatus: BackupStatus
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.backupStatus(value)
    }


  /**
    * BackupType:
    * 
    *  USER - You create and manage these using the on-demand backup feature.
    * 
    *  SYSTEM - If you delete a table with point-in-time recovery enabled, a SYSTEM backup
    *  is automatically created and is retained for 35 days (at no additional cost). System backups allow you to
    *  restore the deleted table to the state it was in just before the point of deletion.
    * 
    *  AWS_BACKUP - On-demand backup created by you from AWS Backup service.
    */
  @get:JvmSynthetic // Hide from Java callers
  var backupType: BackupType
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.backupType(value)
    }


  /**
    * Size of the backup in bytes.
    */
  @get:JvmSynthetic // Hide from Java callers
  var backupSizeBytes: Long
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.backupSizeBytes(value)
    }

    
  /**
    * Backup can be in one of the following states: CREATING, ACTIVE, DELETED.
    */
  fun backupStatus(value: String) {
    builder.backupStatus(value)
  }


  /**
    * BackupType:
    * 
    *  USER - You create and manage these using the on-demand backup feature.
    * 
    *  SYSTEM - If you delete a table with point-in-time recovery enabled, a SYSTEM backup
    *  is automatically created and is retained for 35 days (at no additional cost). System backups allow you to
    *  restore the deleted table to the state it was in just before the point of deletion.
    * 
    *  AWS_BACKUP - On-demand backup created by you from AWS Backup service.
    */
  fun backupType(value: String) {
    builder.backupType(value)
  }

  
}

/**
  * Builds instances of type BackupSummary:
  * Contains details for the backup.
  */
fun buildBackupSummary(dslBlock: BackupSummaryDSL.() -> Unit) =
  BackupSummaryDSL().apply(dslBlock).build()