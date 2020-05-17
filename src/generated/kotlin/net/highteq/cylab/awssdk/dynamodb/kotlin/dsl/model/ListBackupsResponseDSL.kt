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
import software.amazon.awssdk.services.dynamodb.model.BackupSummary
import software.amazon.awssdk.services.dynamodb.model.ListBackupsResponse

/**
  * Builds instances of type ListBackupsResponse:
  * 
  */
@DynamodbDSLMarker
inline class ListBackupsResponseDSL(
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder: ListBackupsResponse.Builder
){
  @PublishedApi
  internal fun build(): ListBackupsResponse = builder.build()

  /**
    * 
    */
  inline var backupSummaries: Collection<BackupSummary>?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.backupSummaries(value)
    }

  /**
    * 
    */
  inline var lastEvaluatedBackupArn: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.lastEvaluatedBackupArn(value)
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
  inline fun backupSummaries(dslBlock: BackupSummaryCollectionDSL.() -> Unit) {
    builder.backupSummaries(DynamodbDSL.Companion.backupSummaryCollection(dslBlock))
  }

}

/**
  * Builds instances of type ListBackupsResponse:
  * 
  */
inline fun listBackupsResponse(dslBlock: ListBackupsResponseDSL.() -> Unit) =
  ListBackupsResponseDSL(ListBackupsResponse.builder()).apply(dslBlock).build()

/**
  * Builds instances of type ListBackupsResponse:
  * 
  */
inline fun DynamodbDSL.Companion.listBackupsResponse(dslBlock: ListBackupsResponseDSL.() -> Unit) =
  ListBackupsResponseDSL(ListBackupsResponse.builder()).apply(dslBlock).build()