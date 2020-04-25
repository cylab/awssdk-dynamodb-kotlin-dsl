/*
  This file was generated from https://github.com/aws/aws-sdk-java-v2 by https://github.com/cylab/aws-kotlin-dsl-builder
  Like the original code, this file and project is licensed under
  Apache License Version 2.0
  See LICENSE.txt for more info
*/
package net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.model

import kotlin.DeprecationLevel.HIDDEN
import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSL
import software.amazon.awssdk.services.dynamodb.model.DescribeGlobalTableResponse
import software.amazon.awssdk.services.dynamodb.model.GlobalTableDescription

/**
  * Builds instances of type DescribeGlobalTableResponse:
  * 
  */
@DynamodbDSL
class DescribeGlobalTableResponseDSL {
  private val builder = DescribeGlobalTableResponse.builder()
  internal fun build(): DescribeGlobalTableResponse = builder.build()
    
  /**
    * Contains the details of the global table.
    */
  @get:JvmSynthetic // Hide from Java callers
  var globalTableDescription: GlobalTableDescription
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.globalTableDescription(value)
    }

  
    
  /**
    * Contains the details of the global table.
    */
  fun globalTableDescription(dslBlock: GlobalTableDescriptionDSL.() -> Unit) {
    builder.globalTableDescription(buildGlobalTableDescription(dslBlock))
  }

}

/**
  * Builds instances of type DescribeGlobalTableResponse:
  * 
  */
fun buildDescribeGlobalTableResponse(dslBlock: DescribeGlobalTableResponseDSL.() -> Unit) =
  DescribeGlobalTableResponseDSL().apply(dslBlock).build()