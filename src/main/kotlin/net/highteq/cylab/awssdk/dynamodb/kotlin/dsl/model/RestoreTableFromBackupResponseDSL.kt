/*
  This file was generated from https://github.com/aws/aws-sdk-java-v2 by https://github.com/cylab/aws-kotlin-dsl-builder
  Like the original code, this file and project is licensed under
  Apache License Version 2.0
  See LICENSE.txt for more info
*/
package net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.model

import kotlin.DeprecationLevel.HIDDEN
import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSL
import software.amazon.awssdk.services.dynamodb.model.RestoreTableFromBackupResponse
import software.amazon.awssdk.services.dynamodb.model.TableDescription

/**
  * Builds instances of type RestoreTableFromBackupResponse:
  * 
  */
@DynamodbDSL
class RestoreTableFromBackupResponseDSL {
  private val builder = RestoreTableFromBackupResponse.builder()
  internal fun build(): RestoreTableFromBackupResponse = builder.build()
    
  /**
    * The description of the table created from an existing backup.
    */
  @get:JvmSynthetic // Hide from Java callers
  var tableDescription: TableDescription
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.tableDescription(value)
    }

  
    
  /**
    * The description of the table created from an existing backup.
    */
  fun tableDescription(dslBlock: TableDescriptionDSL.() -> Unit) {
    builder.tableDescription(buildTableDescription(dslBlock))
  }

}

/**
  * Builds instances of type RestoreTableFromBackupResponse:
  * 
  */
fun buildRestoreTableFromBackupResponse(dslBlock: RestoreTableFromBackupResponseDSL.() -> Unit) =
  RestoreTableFromBackupResponseDSL().apply(dslBlock).build()