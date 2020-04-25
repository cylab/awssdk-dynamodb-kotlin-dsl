/*
  This file was generated from https://github.com/aws/aws-sdk-java-v2 by https://github.com/cylab/aws-kotlin-dsl-builder
  Like the original code, this file and project is licensed under
  Apache License Version 2.0
  See LICENSE.txt for more info
*/
package net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.model

import kotlin.DeprecationLevel.HIDDEN
import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSL
import software.amazon.awssdk.services.dynamodb.model.SSEDescription
import software.amazon.awssdk.services.dynamodb.model.SSEStatus
import software.amazon.awssdk.services.dynamodb.model.SSEType

/**
  * Builds instances of type SSEDescription:
  * The description of the server-side encryption status on the specified table.
  */
@DynamodbDSL
class SSEDescriptionDSL {
  private val builder = SSEDescription.builder()
  internal fun build(): SSEDescription = builder.build()
    
  /**
    * Server-side encryption type. The only supported value is:
    * 
    *  KMS - Server-side encryption that uses AWS Key Management Service. The key is stored in your
    *  account and is managed by AWS KMS (AWS KMS charges apply).
    */
  @get:JvmSynthetic // Hide from Java callers
  var sseType: SSEType
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.sseType(value)
    }


  /**
    * The AWS KMS customer master key (CMK) ARN used for the AWS KMS encryption.
    */
  @get:JvmSynthetic // Hide from Java callers
  var kmsMasterKeyArn: String
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.kmsMasterKeyArn(value)
    }


  /**
    * Represents the current state of server-side encryption. The only supported values are:
    * 
    *  ENABLED - Server-side encryption is enabled.
    * 
    *  UPDATING - Server-side encryption is being updated.
    */
  @get:JvmSynthetic // Hide from Java callers
  var status: SSEStatus
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.status(value)
    }

    
  /**
    * Server-side encryption type. The only supported value is:
    * 
    *  KMS - Server-side encryption that uses AWS Key Management Service. The key is stored in your
    *  account and is managed by AWS KMS (AWS KMS charges apply).
    */
  fun sseType(value: String) {
    builder.sseType(value)
  }


  /**
    * Represents the current state of server-side encryption. The only supported values are:
    * 
    *  ENABLED - Server-side encryption is enabled.
    * 
    *  UPDATING - Server-side encryption is being updated.
    */
  fun status(value: String) {
    builder.status(value)
  }

  
}

/**
  * Builds instances of type SSEDescription:
  * The description of the server-side encryption status on the specified table.
  */
fun buildSSEDescription(dslBlock: SSEDescriptionDSL.() -> Unit) =
  SSEDescriptionDSL().apply(dslBlock).build()