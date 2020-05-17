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
import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSLMarker
import software.amazon.awssdk.awscore.AwsResponseMetadata
import software.amazon.awssdk.http.SdkHttpResponse
import software.amazon.awssdk.services.dynamodb.model.BackupDescription
import software.amazon.awssdk.services.dynamodb.model.DeleteBackupResponse

/**
  * Builds instances of type DeleteBackupResponse:
  * 
  */
@DynamodbDSLMarker
inline class DeleteBackupResponseDSL(
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder: DeleteBackupResponse.Builder
){
  @PublishedApi
  internal fun build(): DeleteBackupResponse = builder.build()

  /**
    * 
    */
  inline var backupDescription: BackupDescription?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.backupDescription(value)
    }

  /**
    * 
    */
  inline var responseMetadata: AwsResponseMetadata?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.responseMetadata(value)
    }

  /**
    * 
    */
  inline var sdkHttpResponse: SdkHttpResponse?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.sdkHttpResponse(value)
    }

  /**
    * 
    */
  inline fun backupDescription(dslBlock: BackupDescriptionDSL.() -> Unit) {
    builder.backupDescription(DynamodbDSL.Companion.backupDescription(dslBlock))
  }

}

/**
  * Builds instances of type DeleteBackupResponse:
  * 
  */
inline fun deleteBackupResponse(dslBlock: DeleteBackupResponseDSL.() -> Unit) =
  DeleteBackupResponseDSL(DeleteBackupResponse.builder()).apply(dslBlock).build()

/**
  * Builds instances of type DeleteBackupResponse:
  * 
  */
inline fun DynamodbDSL.Companion.deleteBackupResponse(dslBlock: DeleteBackupResponseDSL.() -> Unit) =
  DeleteBackupResponseDSL(DeleteBackupResponse.builder()).apply(dslBlock).build()