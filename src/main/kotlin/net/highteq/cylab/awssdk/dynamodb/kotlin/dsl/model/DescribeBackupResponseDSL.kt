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
import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSL
import software.amazon.awssdk.awscore.AwsResponseMetadata
import software.amazon.awssdk.http.SdkHttpResponse
import software.amazon.awssdk.services.dynamodb.model.BackupDescription
import software.amazon.awssdk.services.dynamodb.model.DescribeBackupResponse

/**
  * Builds instances of type DescribeBackupResponse:
  * 
  */
@DynamodbDSL
class DescribeBackupResponseDSL {
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  internal val builder = DescribeBackupResponse.builder()
  internal fun build(): DescribeBackupResponse = builder.build()
    
  /**
    * Contains the description of the backup created for the table.
    */
  var backupDescription: BackupDescription
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.backupDescription(value)
    }


  /**
    * 
    */
  var responseMetadata: AwsResponseMetadata
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.responseMetadata(value)
    }


  /**
    * 
    */
  var sdkHttpResponse: SdkHttpResponse
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.sdkHttpResponse(value)
    }

  
    
  /**
    * Contains the description of the backup created for the table.
    */
  fun backupDescription(dslBlock: BackupDescriptionDSL.() -> Unit) {
    builder.backupDescription(buildBackupDescription(dslBlock))
  }

}

/**
  * Builds instances of type DescribeBackupResponse:
  * 
  */
fun buildDescribeBackupResponse(dslBlock: DescribeBackupResponseDSL.() -> Unit) =
  DescribeBackupResponseDSL().apply(dslBlock).build()