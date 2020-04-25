/*
  This file was generated from https://github.com/aws/aws-sdk-java-v2 by https://github.com/cylab/aws-kotlin-dsl-builder
  Like the original code, this file and project is licensed under
  Apache License Version 2.0
  See LICENSE.txt for more info
*/
package net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.model

import kotlin.DeprecationLevel.HIDDEN
import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSL
import software.amazon.awssdk.services.dynamodb.model.AttributeValue
import software.amazon.awssdk.services.dynamodb.model.DeleteRequest

/**
  * Builds instances of type DeleteRequest:
  * Represents a request to perform a DeleteItem operation on an item.
  */
@DynamodbDSL
class DeleteRequestDSL {
  private val builder = DeleteRequest.builder()
  internal fun build(): DeleteRequest = builder.build()
    
  /**
    * A map of attribute name to attribute values, representing the primary key of the item to delete. All of the
    *  table's primary key attributes must be specified, and their data types must match those of the table's key
    *  schema.
    */
  @get:JvmSynthetic // Hide from Java callers
  var key: Map<String, AttributeValue>
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.key(value)
    }

  
  
}

/**
  * Builds instances of type DeleteRequest:
  * Represents a request to perform a DeleteItem operation on an item.
  */
fun buildDeleteRequest(dslBlock: DeleteRequestDSL.() -> Unit) =
  DeleteRequestDSL().apply(dslBlock).build()