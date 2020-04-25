/*
  This file was generated from https://github.com/aws/aws-sdk-java-v2 by https://github.com/cylab/aws-kotlin-dsl-builder
  Like the original code, this file and project is licensed under
  Apache License Version 2.0
  See LICENSE.txt for more info
*/
package net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.model

import kotlin.DeprecationLevel.HIDDEN
import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSL
import software.amazon.awssdk.services.dynamodb.model.BackupDetails
import software.amazon.awssdk.services.dynamodb.model.CreateBackupResponse

/**
  * Builds instances of type CreateBackupResponse:
  * 
  */
@DynamodbDSL
class CreateBackupResponseDSL {
  private val builder = CreateBackupResponse.builder()
  internal fun build(): CreateBackupResponse = builder.build()
    
  /**
    * Contains the details of the backup created for the table.
    */
  @get:JvmSynthetic // Hide from Java callers
  var backupDetails: BackupDetails
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.backupDetails(value)
    }

  
    
  /**
    * Contains the details of the backup created for the table.
    */
  fun backupDetails(dslBlock: BackupDetailsDSL.() -> Unit) {
    builder.backupDetails(buildBackupDetails(dslBlock))
  }

}

/**
  * Builds instances of type CreateBackupResponse:
  * 
  */
fun buildCreateBackupResponse(dslBlock: CreateBackupResponseDSL.() -> Unit) =
  CreateBackupResponseDSL().apply(dslBlock).build()