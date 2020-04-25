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
import software.amazon.awssdk.services.dynamodb.model.BackupDetails
import software.amazon.awssdk.services.dynamodb.model.SourceTableDetails
import software.amazon.awssdk.services.dynamodb.model.SourceTableFeatureDetails

/**
  * Builds instances of type BackupDescription:
  * Contains the description of the backup created for the table.
  */
@DynamodbDSL
class BackupDescriptionDSL {
  private val builder = BackupDescription.builder()
  internal fun build(): BackupDescription = builder.build()
    
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
    * Contains the details of the table when the backup was created.
    */
  @get:JvmSynthetic // Hide from Java callers
  var sourceTableDetails: SourceTableDetails
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.sourceTableDetails(value)
    }


  /**
    * Contains the details of the features enabled on the table when the backup was created. For example, LSIs,
    *  GSIs, streams, TTL.
    */
  @get:JvmSynthetic // Hide from Java callers
  var sourceTableFeatureDetails: SourceTableFeatureDetails
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.sourceTableFeatureDetails(value)
    }

  
    
  /**
    * Contains the details of the backup created for the table.
    */
  fun backupDetails(dslBlock: BackupDetailsDSL.() -> Unit) {
    builder.backupDetails(buildBackupDetails(dslBlock))
  }


  /**
    * Contains the details of the table when the backup was created.
    */
  fun sourceTableDetails(dslBlock: SourceTableDetailsDSL.() -> Unit) {
    builder.sourceTableDetails(buildSourceTableDetails(dslBlock))
  }


  /**
    * Contains the details of the features enabled on the table when the backup was created. For example, LSIs,
    *  GSIs, streams, TTL.
    */
  fun sourceTableFeatureDetails(dslBlock: SourceTableFeatureDetailsDSL.() -> Unit) {
    builder.sourceTableFeatureDetails(buildSourceTableFeatureDetails(dslBlock))
  }

}

/**
  * Builds instances of type BackupDescription:
  * Contains the description of the backup created for the table.
  */
fun buildBackupDescription(dslBlock: BackupDescriptionDSL.() -> Unit) =
  BackupDescriptionDSL().apply(dslBlock).build()