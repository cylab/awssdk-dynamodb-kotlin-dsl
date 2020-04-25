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
import java.time.Instant
import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSL
import software.amazon.awssdk.awscore.AwsRequestOverrideConfiguration
import software.amazon.awssdk.services.dynamodb.model.BackupTypeFilter
import software.amazon.awssdk.services.dynamodb.model.ListBackupsRequest

/**
  * Builds instances of type ListBackupsRequest:
  * 
  */
@DynamodbDSL
class ListBackupsRequestDSL {
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  internal val builder = ListBackupsRequest.builder()
  internal fun build(): ListBackupsRequest = builder.build()
    
  /**
    * Maximum number of backups to return at once.
    */
  var limit: Int
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.limit(value)
    }


  /**
    * Only backups created after this time are listed. TimeRangeLowerBound is inclusive.
    */
  var timeRangeLowerBound: Instant
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.timeRangeLowerBound(value)
    }


  /**
    * Only backups created before this time are listed. TimeRangeUpperBound is exclusive.
    */
  var timeRangeUpperBound: Instant
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.timeRangeUpperBound(value)
    }


  /**
    * LastEvaluatedBackupArn is the Amazon Resource Name (ARN) of the backup last evaluated when the
    *  current page of results was returned, inclusive of the current page of results. This value may be specified
    *  as the ExclusiveStartBackupArn of a new ListBackups operation in order to fetch the
    *  next page of results.
    */
  var exclusiveStartBackupArn: String
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.exclusiveStartBackupArn(value)
    }


  /**
    * 
    */
  var overrideConfiguration: AwsRequestOverrideConfiguration
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.overrideConfiguration(value)
    }


  /**
    * The backups from the table specified by TableName are listed.
    */
  var tableName: String
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.tableName(value)
    }


  /**
    * The backups from the table specified by BackupType are listed.
    * 
    *  Where BackupType can be:
    * 
    *  USER - On-demand backup created by you.
    * 
    *  SYSTEM - On-demand backup automatically created by DynamoDB.
    * 
    *  ALL - All types of on-demand backups (USER and SYSTEM).
    */
  var backupType: BackupTypeFilter
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.backupType(value)
    }

    
  /**
    * The backups from the table specified by BackupType are listed.
    * 
    *  Where BackupType can be:
    * 
    *  USER - On-demand backup created by you.
    * 
    *  SYSTEM - On-demand backup automatically created by DynamoDB.
    * 
    *  ALL - All types of on-demand backups (USER and SYSTEM).
    */
  fun backupType(value: String) {
    builder.backupType(value)
  }

  
}

/**
  * Builds instances of type ListBackupsRequest:
  * 
  */
fun buildListBackupsRequest(dslBlock: ListBackupsRequestDSL.() -> Unit) =
  ListBackupsRequestDSL().apply(dslBlock).build()