/*
  This file was generated from https://github.com/aws/aws-sdk-java-v2 by https://github.com/cylab/aws-kotlin-dsl-builder
  Like the original code, this file and project is licensed under
  Apache License Version 2.0
  See LICENSE.txt for more info
*/
package net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.model

import kotlin.DeprecationLevel.HIDDEN
import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSL
import software.amazon.awssdk.awscore.AwsRequestOverrideConfiguration
import software.amazon.awssdk.services.dynamodb.model.DescribeBackupRequest

/**
  * Builds instances of type DescribeBackupRequest:
  * 
  */
@DynamodbDSL
class DescribeBackupRequestDSL {
  private val builder = DescribeBackupRequest.builder()
  internal fun build(): DescribeBackupRequest = builder.build()
    
  /**
    * 
    */
  @get:JvmSynthetic // Hide from Java callers
  var overrideConfiguration: AwsRequestOverrideConfiguration
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.overrideConfiguration(value)
    }


  /**
    * The Amazon Resource Name (ARN) associated with the backup.
    */
  @get:JvmSynthetic // Hide from Java callers
  var backupArn: String
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.backupArn(value)
    }

  
  
}

/**
  * Builds instances of type DescribeBackupRequest:
  * 
  */
fun buildDescribeBackupRequest(dslBlock: DescribeBackupRequestDSL.() -> Unit) =
  DescribeBackupRequestDSL().apply(dslBlock).build()