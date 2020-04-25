/*
  This file was generated from https://github.com/aws/aws-sdk-java-v2 by https://github.com/cylab/aws-kotlin-dsl-builder
  Like the original code, this file and project is licensed under
  Apache License Version 2.0
  See LICENSE.txt for more info
*/
package net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.model

import kotlin.DeprecationLevel.HIDDEN
import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSL
import software.amazon.awssdk.services.dynamodb.model.DescribeTableResponse
import software.amazon.awssdk.services.dynamodb.model.TableDescription

/**
  * Builds instances of type DescribeTableResponse:
  * Represents the output of a DescribeTable operation.
  */
@DynamodbDSL
class DescribeTableResponseDSL {
  private val builder = DescribeTableResponse.builder()
  internal fun build(): DescribeTableResponse = builder.build()
    
  /**
    * The properties of the table.
    */
  @get:JvmSynthetic // Hide from Java callers
  var table: TableDescription
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.table(value)
    }

  
    
  /**
    * The properties of the table.
    */
  fun table(dslBlock: TableDescriptionDSL.() -> Unit) {
    builder.table(buildTableDescription(dslBlock))
  }

}

/**
  * Builds instances of type DescribeTableResponse:
  * Represents the output of a DescribeTable operation.
  */
fun buildDescribeTableResponse(dslBlock: DescribeTableResponseDSL.() -> Unit) =
  DescribeTableResponseDSL().apply(dslBlock).build()