/*
  This file was generated from https://github.com/aws/aws-sdk-java-v2 by https://github.com/cylab/aws-kotlin-dsl-builder
  Like the original code, this file and project is licensed under
  Apache License Version 2.0
  See LICENSE.txt for more info
*/
package net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.model

import kotlin.DeprecationLevel.HIDDEN
import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSL
import software.amazon.awssdk.services.dynamodb.model.DeleteTableResponse
import software.amazon.awssdk.services.dynamodb.model.TableDescription

/**
  * Builds instances of type DeleteTableResponse:
  * Represents the output of a DeleteTable operation.
  */
@DynamodbDSL
class DeleteTableResponseDSL {
  private val builder = DeleteTableResponse.builder()
  internal fun build(): DeleteTableResponse = builder.build()
    
  /**
    * Represents the properties of a table.
    */
  @get:JvmSynthetic // Hide from Java callers
  var tableDescription: TableDescription
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.tableDescription(value)
    }

  
    
  /**
    * Represents the properties of a table.
    */
  fun tableDescription(dslBlock: TableDescriptionDSL.() -> Unit) {
    builder.tableDescription(buildTableDescription(dslBlock))
  }

}

/**
  * Builds instances of type DeleteTableResponse:
  * Represents the output of a DeleteTable operation.
  */
fun buildDeleteTableResponse(dslBlock: DeleteTableResponseDSL.() -> Unit) =
  DeleteTableResponseDSL().apply(dslBlock).build()