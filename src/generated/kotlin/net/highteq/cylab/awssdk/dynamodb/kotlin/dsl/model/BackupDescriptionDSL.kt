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
import software.amazon.awssdk.services.dynamodb.model.BackupDescription
import software.amazon.awssdk.services.dynamodb.model.BackupDetails
import software.amazon.awssdk.services.dynamodb.model.SourceTableDetails
import software.amazon.awssdk.services.dynamodb.model.SourceTableFeatureDetails

/**
  * Builds instances of type BackupDescription:
  * Contains the description of the backup created for the table.
  */
@DynamodbDSL
inline class BackupDescriptionDSL(
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder: BackupDescription.Builder
){
  @PublishedApi
  internal fun build(): BackupDescription = builder.build()

  /**
    * 
    */
  inline var backupDetails: BackupDetails?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.backupDetails(value)
    }

  /**
    * 
    */
  inline var sourceTableDetails: SourceTableDetails?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.sourceTableDetails(value)
    }

  /**
    * 
    */
  inline var sourceTableFeatureDetails: SourceTableFeatureDetails?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.sourceTableFeatureDetails(value)
    }

  /**
    * 
    */
  inline fun backupDetails(dslBlock: BackupDetailsDSL.() -> Unit) {
    builder.backupDetails(buildBackupDetails(dslBlock))
  }

  /**
    * 
    */
  inline fun sourceTableDetails(dslBlock: SourceTableDetailsDSL.() -> Unit) {
    builder.sourceTableDetails(buildSourceTableDetails(dslBlock))
  }

  /**
    * 
    */
  inline fun sourceTableFeatureDetails(dslBlock: SourceTableFeatureDetailsDSL.() -> Unit) {
    builder.sourceTableFeatureDetails(buildSourceTableFeatureDetails(dslBlock))
  }

}

/**
  * Builds instances of type BackupDescription:
  * Contains the description of the backup created for the table.
  */
inline fun buildBackupDescription(dslBlock: BackupDescriptionDSL.() -> Unit) =
  BackupDescriptionDSL(BackupDescription.builder()).apply(dslBlock).build()