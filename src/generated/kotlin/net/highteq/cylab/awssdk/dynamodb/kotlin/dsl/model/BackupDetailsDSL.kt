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
import software.amazon.awssdk.services.dynamodb.model.BackupDetails
import software.amazon.awssdk.services.dynamodb.model.BackupStatus
import software.amazon.awssdk.services.dynamodb.model.BackupType

/**
  * Builds instances of type BackupDetails:
  * Contains the details of the backup created for the table.
  */
@DynamodbDSL
inline class BackupDetailsDSL(
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder: BackupDetails.Builder
){
  @PublishedApi
  internal fun build(): BackupDetails = builder.build()
    
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
  inline var backupCreationDateTime: Instant?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.backupCreationDateTime(value)
    }


  /**
    * 
    */
  inline var backupExpiryDateTime: Instant?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.backupExpiryDateTime(value)
    }


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
  inline var backupSizeBytes: Long?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.backupSizeBytes(value)
    }


  /**
    * 
    */
  inline var backupStatus: BackupStatus?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.backupStatus(value)
    }


  /**
    * 
    */
  inline var backupType: BackupType?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.backupType(value)
    }

    
  /**
    * 
    */
  inline fun backupStatus(value: String?) {
    builder.backupStatus(value)
  }


  /**
    * 
    */
  inline fun backupType(value: String?) {
    builder.backupType(value)
  }

  
  
}

/**
  * Builds instances of type BackupDetails:
  * Contains the details of the backup created for the table.
  */
inline fun buildBackupDetails(dslBlock: BackupDetailsDSL.() -> Unit) =
  BackupDetailsDSL(BackupDetails.builder()).apply(dslBlock).build()