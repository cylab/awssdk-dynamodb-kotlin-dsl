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
import software.amazon.awssdk.services.dynamodb.model.SSESpecification
import software.amazon.awssdk.services.dynamodb.model.SSEType

/**
  * Builds instances of type SSESpecification:
  * Represents the settings used to enable server-side encryption.
  */
@DynamodbDSL
class SSESpecificationDSL {
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder = SSESpecification.builder()
  internal fun build(): SSESpecification = builder.build()
    
  /**
    * Indicates whether server-side encryption is done using an AWS managed CMK or an AWS owned CMK. If enabled
    *  (true), server-side encryption type is set to KMS and an AWS managed CMK is used (AWS KMS
    *  charges apply). If disabled (false) or not specified, server-side encryption is set to AWS owned CMK.
    */
  var enabled: Boolean?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.enabled(value)
    }


  /**
    * The AWS KMS customer master key (CMK) that should be used for the AWS KMS encryption. To specify a CMK, use
    *  its key ID, Amazon Resource Name (ARN), alias name, or alias ARN. Note that you should only provide this
    *  parameter if the key is different from the default DynamoDB customer master key alias/aws/dynamodb.
    */
  var kmsMasterKeyId: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.kmsMasterKeyId(value)
    }


  /**
    * Server-side encryption type. The only supported value is:
    * 
    *  KMS - Server-side encryption that uses AWS Key Management Service. The key is stored in your
    *  account and is managed by AWS KMS (AWS KMS charges apply).
    */
  var sseType: SSEType?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.sseType(value)
    }

    
  /**
    * Server-side encryption type. The only supported value is:
    * 
    *  KMS - Server-side encryption that uses AWS Key Management Service. The key is stored in your
    *  account and is managed by AWS KMS (AWS KMS charges apply).
    */
  fun sseType(value: String?) {
    builder.sseType(value)
  }

  
  
}

/**
  * Builds instances of type SSESpecification:
  * Represents the settings used to enable server-side encryption.
  */
fun buildSSESpecification(dslBlock: SSESpecificationDSL.() -> Unit) =
  SSESpecificationDSL().apply(dslBlock).build()