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
import software.amazon.awssdk.awscore.AwsRequestOverrideConfiguration
import software.amazon.awssdk.services.dynamodb.model.RestoreTableFromBackupRequest

/**
  * Builds instances of type RestoreTableFromBackupRequest:
  * 
  */
@DynamodbDSL
inline class RestoreTableFromBackupRequestDSL(
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder: RestoreTableFromBackupRequest.Builder
){
  @PublishedApi
  internal fun build(): RestoreTableFromBackupRequest = builder.build()
    
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


  /**
    * 
    */
  inline var targetTableName: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.targetTableName(value)
    }

  
  
  
}

/**
  * Builds instances of type RestoreTableFromBackupRequest:
  * 
  */
inline fun buildRestoreTableFromBackupRequest(dslBlock: RestoreTableFromBackupRequestDSL.() -> Unit) =
  RestoreTableFromBackupRequestDSL(RestoreTableFromBackupRequest.builder()).apply(dslBlock).build()