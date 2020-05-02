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
import software.amazon.awssdk.awscore.AwsResponseMetadata
import software.amazon.awssdk.http.SdkHttpResponse
import software.amazon.awssdk.services.dynamodb.model.RestoreTableFromBackupResponse
import software.amazon.awssdk.services.dynamodb.model.TableDescription

/**
  * Builds instances of type RestoreTableFromBackupResponse:
  * 
  */
@DynamodbDSL
inline class RestoreTableFromBackupResponseDSL(
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder: RestoreTableFromBackupResponse.Builder
){
  @PublishedApi
  internal fun build(): RestoreTableFromBackupResponse = builder.build()
    
  /**
    * 
    */
  inline var responseMetadata: AwsResponseMetadata?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.responseMetadata(value)
    }


  /**
    * 
    */
  inline var sdkHttpResponse: SdkHttpResponse?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.sdkHttpResponse(value)
    }


  /**
    * 
    */
  inline var tableDescription: TableDescription?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.tableDescription(value)
    }

  
  
    
  /**
    * 
    */
  inline fun tableDescription(dslBlock: TableDescriptionDSL.() -> Unit) {
    builder.tableDescription(buildTableDescription(dslBlock))
  }

}

/**
  * Builds instances of type RestoreTableFromBackupResponse:
  * 
  */
inline fun buildRestoreTableFromBackupResponse(dslBlock: RestoreTableFromBackupResponseDSL.() -> Unit) =
  RestoreTableFromBackupResponseDSL(RestoreTableFromBackupResponse.builder()).apply(dslBlock).build()