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
import software.amazon.awssdk.services.dynamodb.model.ContinuousBackupsDescription
import software.amazon.awssdk.services.dynamodb.model.UpdateContinuousBackupsResponse

/**
  * Builds instances of type UpdateContinuousBackupsResponse:
  * 
  */
@DynamodbDSL
class UpdateContinuousBackupsResponseDSL {
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  internal val builder = UpdateContinuousBackupsResponse.builder()
  internal fun build(): UpdateContinuousBackupsResponse = builder.build()
    
  /**
    * Represents the continuous backups and point in time recovery settings on the table.
    */
  var continuousBackupsDescription: ContinuousBackupsDescription
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.continuousBackupsDescription(value)
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