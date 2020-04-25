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
import software.amazon.awssdk.services.dynamodb.model.BackupSummary
import software.amazon.awssdk.services.dynamodb.model.ListBackupsResponse

/**
  * Builds instances of type ListBackupsResponse:
  * 
  */
@DynamodbDSL
class ListBackupsResponseDSL {
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  internal val builder = ListBackupsResponse.builder()
  internal fun build(): ListBackupsResponse = builder.build()
    
  /**
    * List of BackupSummary objects.
    */
  var backupSummaries: Collection<BackupSummary>
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.backupSummaries(value)
    }


  /**
    * The ARN of the backup last evaluated when the current page of results was returned, inclusive of the current
    *  page of results. This value may be specified as the ExclusiveStartBackupArn of a new
    *  ListBackups operation in order to fetch the next page of results.
    * 
    *  If LastEvaluatedBackupArn is empty, then the last page of results has been processed and there
    *  are no more results to be retrieved.
    * 
    *  If LastEvaluatedBackupArn is not empty, this may or may not indicate that there is more data to
    *  be returned. All results are guaranteed to have been returned if and only if no value for
    *  LastEvaluatedBackupArn is returned.
    */
  var lastEvaluatedBackupArn: String
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.lastEvaluatedBackupArn(value)
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
    * List of BackupSummary objects.
    */
  fun backupSummaries(dslBlock: BackupSummaryCollectionDSL.() -> Unit) {
    builder.backupSummaries(buildBackupSummaryCollection(dslBlock))
  }

}

/**
  * Builds instances of type ListBackupsResponse:
  * 
  */
fun buildListBackupsResponse(dslBlock: ListBackupsResponseDSL.() -> Unit) =
  ListBackupsResponseDSL().apply(dslBlock).build()