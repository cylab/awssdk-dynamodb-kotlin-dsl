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
import software.amazon.awssdk.awscore.AwsRequestOverrideConfiguration
import software.amazon.awssdk.services.dynamodb.model.RestoreTableFromBackupRequest

/**
  * Builds instances of type RestoreTableFromBackupRequest:
  * 
  */
@DynamodbDSL
class RestoreTableFromBackupRequestDSL {
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder = RestoreTableFromBackupRequest.builder()
  internal fun build(): RestoreTableFromBackupRequest = builder.build()
    
  /**
    * 
    */
  var overrideConfiguration: AwsRequestOverrideConfiguration?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.overrideConfiguration(value)
    }


  /**
    * The Amazon Resource Name (ARN) associated with the backup.
    */
  var backupArn: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.backupArn(value)
    }


  /**
    * The name of the new table to which the backup must be restored.
    */
  var targetTableName: String?
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
fun buildRestoreTableFromBackupRequest(dslBlock: RestoreTableFromBackupRequestDSL.() -> Unit) =
  RestoreTableFromBackupRequestDSL().apply(dslBlock).build()