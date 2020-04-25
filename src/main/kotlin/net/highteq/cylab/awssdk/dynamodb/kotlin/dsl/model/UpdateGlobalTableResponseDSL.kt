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
import software.amazon.awssdk.services.dynamodb.model.GlobalTableDescription
import software.amazon.awssdk.services.dynamodb.model.UpdateGlobalTableResponse

/**
  * Builds instances of type UpdateGlobalTableResponse:
  * 
  */
@DynamodbDSL
class UpdateGlobalTableResponseDSL {
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  internal val builder = UpdateGlobalTableResponse.builder()
  internal fun build(): UpdateGlobalTableResponse = builder.build()
    
  /**
    * Contains the details of the global table.
    */
  var globalTableDescription: GlobalTableDescription
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.globalTableDescription(value)
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
    * Contains the details of the global table.
    */
  fun globalTableDescription(dslBlock: GlobalTableDescriptionDSL.() -> Unit) {
    builder.globalTableDescription(buildGlobalTableDescription(dslBlock))
  }

}

/**
  * Builds instances of type UpdateGlobalTableResponse:
  * 
  */
fun buildUpdateGlobalTableResponse(dslBlock: UpdateGlobalTableResponseDSL.() -> Unit) =
  UpdateGlobalTableResponseDSL().apply(dslBlock).build()