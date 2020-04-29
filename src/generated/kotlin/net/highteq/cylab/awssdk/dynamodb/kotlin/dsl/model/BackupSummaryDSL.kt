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
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder = BackupSummary.builder()
  internal fun build(): BackupSummary = builder.build()
    
  /**
    * ARN associated with the backup.
    */
  var backupArn: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.backupArn(value)
    }


  /**
    * Time at which the backup was created.
    */
  var backupCreationDateTime: Instant?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.backupCreationDateTime(value)
    }


  /**
    * Time at which the automatic on-demand backup created by DynamoDB will expire. This SYSTEM
    *  on-demand backup expires automatically 35 days after its creation.
    */
  var backupExpiryDateTime: Instant?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.backupExpiryDateTime(value)
    }


  /**
    * Name of the specified backup.
    */
  var backupName: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.backupName(value)
    }


  /**
    * Size of the backup in bytes.
    */
  var backupSizeBytes: Long?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.backupSizeBytes(value)
    }


  /**
    * Backup can be in one of the following states: CREATING, ACTIVE, DELETED.
    */
  var backupStatus: BackupStatus?
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
  var backupType: BackupType?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.backupType(value)
    }


  /**
    * ARN associated with the table.
    */
  var tableArn: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.tableArn(value)
    }


  /**
    * Unique identifier for the table.
    */
  var tableId: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.tableId(value)
    }


  /**
    * Name of the table.
    */
  var tableName: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.tableName(value)
    }

    
  /**
    * Backup can be in one of the following states: CREATING, ACTIVE, DELETED.
    */
  fun backupStatus(value: String?) {
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
  fun backupType(value: String?) {
    builder.backupType(value)
  }

  
  
}

/**
  * Builds instances of type BackupSummary:
  * Contains details for the backup.
  */
fun buildBackupSummary(dslBlock: BackupSummaryDSL.() -> Unit) =
  BackupSummaryDSL().apply(dslBlock).build()