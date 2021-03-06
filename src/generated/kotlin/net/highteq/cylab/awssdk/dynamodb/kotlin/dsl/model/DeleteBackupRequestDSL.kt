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
import software.amazon.awssdk.awscore.AwsRequestOverrideConfiguration
import software.amazon.awssdk.services.dynamodb.DynamoDbAsyncClient
import software.amazon.awssdk.services.dynamodb.DynamoDbClient
import software.amazon.awssdk.services.dynamodb.model.DeleteBackupRequest
import software.amazon.awssdk.services.dynamodb.transform.DeleteBackupRequestMarshaller

/**
  * Builds instances of type DeleteBackupRequest:
  * 
  */
@DynamodbDSLMarker
inline class DeleteBackupRequestDSL(
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder: DeleteBackupRequest.Builder
){
  @PublishedApi
  internal fun build(): DeleteBackupRequest = builder.build()

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
  inline var overrideConfiguration: AwsRequestOverrideConfiguration?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.overrideConfiguration(value)
    }

}

/**
  * Builds instances of type DeleteBackupRequest:
  * 
  */
inline fun deleteBackupRequest(dslBlock: DeleteBackupRequestDSL.() -> Unit) =
  DeleteBackupRequestDSL(DeleteBackupRequest.builder()).apply(dslBlock).build()

/**
  * Builds instances of type DeleteBackupRequest:
  * 
  */
inline fun DynamodbDSL.Companion.deleteBackupRequest(dslBlock: DeleteBackupRequestDSL.() -> Unit) =
  DeleteBackupRequestDSL(DeleteBackupRequest.builder()).apply(dslBlock).build()

/**
  * 
  */
inline fun DeleteBackupRequestMarshaller.marshallBy(dslBlock: DeleteBackupRequestDSL.() -> Unit) =
  this.marshall(DynamodbDSL.Companion.deleteBackupRequest(dslBlock))

/**
  * Deletes an existing backup of a table.
  * 
  *  You can call DeleteBackup at a maximum rate of 10 times per second.
  */
inline fun DynamoDbAsyncClient.deleteBackupBy(dslBlock: DeleteBackupRequestDSL.() -> Unit) =
  this.deleteBackup(DynamodbDSL.Companion.deleteBackupRequest(dslBlock))

/**
  * Deletes an existing backup of a table.
  * 
  *  You can call DeleteBackup at a maximum rate of 10 times per second.
  */
inline fun DynamoDbClient.deleteBackupBy(dslBlock: DeleteBackupRequestDSL.() -> Unit) =
  this.deleteBackup(DynamodbDSL.Companion.deleteBackupRequest(dslBlock))