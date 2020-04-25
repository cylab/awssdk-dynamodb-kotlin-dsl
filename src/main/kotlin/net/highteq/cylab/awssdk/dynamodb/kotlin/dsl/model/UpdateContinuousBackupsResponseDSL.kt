/*
  This file was generated from https://github.com/aws/aws-sdk-java-v2 by https://github.com/cylab/aws-kotlin-dsl-builder
  Like the original code, this file and project is licensed under
  Apache License Version 2.0
  See LICENSE.txt for more info
*/
package net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.model

import kotlin.DeprecationLevel.HIDDEN
import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSL
import software.amazon.awssdk.services.dynamodb.model.ContinuousBackupsDescription
import software.amazon.awssdk.services.dynamodb.model.UpdateContinuousBackupsResponse

/**
  * Builds instances of type UpdateContinuousBackupsResponse:
  * 
  */
@DynamodbDSL
class UpdateContinuousBackupsResponseDSL {
  private val builder = UpdateContinuousBackupsResponse.builder()
  internal fun build(): UpdateContinuousBackupsResponse = builder.build()
    
  /**
    * Represents the continuous backups and point in time recovery settings on the table.
    */
  @get:JvmSynthetic // Hide from Java callers
  var continuousBackupsDescription: ContinuousBackupsDescription
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.continuousBackupsDescription(value)
    }

  
    
  /**
    * Represents the continuous backups and point in time recovery settings on the table.
    */
  fun continuousBackupsDescription(dslBlock: ContinuousBackupsDescriptionDSL.() -> Unit) {
    builder.continuousBackupsDescription(buildContinuousBackupsDescription(dslBlock))
  }

}

/**
  * Builds instances of type UpdateContinuousBackupsResponse:
  * 
  */
fun buildUpdateContinuousBackupsResponse(dslBlock: UpdateContinuousBackupsResponseDSL.() -> Unit) =
  UpdateContinuousBackupsResponseDSL().apply(dslBlock).build()