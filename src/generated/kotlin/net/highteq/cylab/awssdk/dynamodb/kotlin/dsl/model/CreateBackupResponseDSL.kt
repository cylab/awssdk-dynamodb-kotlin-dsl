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
import software.amazon.awssdk.services.dynamodb.model.BackupDetails
import software.amazon.awssdk.services.dynamodb.model.CreateBackupResponse

/**
  * Builds instances of type CreateBackupResponse:
  * 
  */
@DynamodbDSLMarker
inline class CreateBackupResponseDSL(
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder: CreateBackupResponse.Builder
){
  @PublishedApi
  internal fun build(): CreateBackupResponse = builder.build()

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
  inline fun backupDetails(dslBlock: BackupDetailsDSL.() -> Unit) {
    builder.backupDetails(DynamodbDSL.Companion.backupDetails(dslBlock))
  }

}

/**
  * Builds instances of type CreateBackupResponse:
  * 
  */
inline fun createBackupResponse(dslBlock: CreateBackupResponseDSL.() -> Unit) =
  CreateBackupResponseDSL(CreateBackupResponse.builder()).apply(dslBlock).build()

/**
  * Builds instances of type CreateBackupResponse:
  * 
  */
inline fun DynamodbDSL.Companion.createBackupResponse(dslBlock: CreateBackupResponseDSL.() -> Unit) =
  CreateBackupResponseDSL(CreateBackupResponse.builder()).apply(dslBlock).build()