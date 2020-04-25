/*
  This file was generated from https://github.com/aws/aws-sdk-java-v2 by https://github.com/cylab/aws-kotlin-dsl-builder
  Like the original code, this file and project is licensed under
  Apache License Version 2.0
  See LICENSE.txt for more info
*/
package net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.model

import kotlin.DeprecationLevel.HIDDEN
import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSL
import software.amazon.awssdk.services.dynamodb.model.BackupDescription
import software.amazon.awssdk.services.dynamodb.model.DeleteBackupResponse

/**
  * Builds instances of type DeleteBackupResponse:
  * 
  */
@DynamodbDSL
class DeleteBackupResponseDSL {
  private val builder = DeleteBackupResponse.builder()
  internal fun build(): DeleteBackupResponse = builder.build()
    
  /**
    * Contains the description of the backup created for the table.
    */
  @get:JvmSynthetic // Hide from Java callers
  var backupDescription: BackupDescription
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.backupDescription(value)
    }

  
    
  /**
    * Contains the description of the backup created for the table.
    */
  fun backupDescription(dslBlock: BackupDescriptionDSL.() -> Unit) {
    builder.backupDescription(buildBackupDescription(dslBlock))
  }

}

/**
  * Builds instances of type DeleteBackupResponse:
  * 
  */
fun buildDeleteBackupResponse(dslBlock: DeleteBackupResponseDSL.() -> Unit) =
  DeleteBackupResponseDSL().apply(dslBlock).build()