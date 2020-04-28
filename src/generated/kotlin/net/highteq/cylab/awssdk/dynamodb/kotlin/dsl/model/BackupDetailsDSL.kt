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
import software.amazon.awssdk.services.dynamodb.model.BackupDetails
import software.amazon.awssdk.services.dynamodb.model.BackupStatus
import software.amazon.awssdk.services.dynamodb.model.BackupType

/**
  * Builds instances of type BackupDetails:
  * Contains the details of the backup created for the table.
  */
@DynamodbDSL
class BackupDetailsDSL {
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder = BackupDetails.builder()
  internal fun build(): BackupDetails = builder.build()
    
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
    * Time at which the backup was created. This is the request time of the backup.
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
    * Name of the requested backup.
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
  * Builds instances of type BackupDetails:
  * Contains the details of the backup created for the table.
  */
fun buildBackupDetails(dslBlock: BackupDetailsDSL.() -> Unit) =
  BackupDetailsDSL().apply(dslBlock).build()