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
import software.amazon.awssdk.services.dynamodb.model.AttributeValue
import software.amazon.awssdk.services.dynamodb.model.PutRequest

/**
  * Builds instances of type PutRequest:
  * Represents a request to perform a PutItem operation on an item.
  */
@DynamodbDSL
class PutRequestDSL {
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder = PutRequest.builder()
  internal fun build(): PutRequest = builder.build()
    
  /**
    * A map of attribute name to attribute values, representing the primary key of an item to be processed by
    *  PutItem. All of the table's primary key attributes must be specified, and their data types must
    *  match those of the table's key schema. If any attributes are present in the item that are part of an index
    *  key schema for the table, their types must match the index key schema.
    */
  var item: Map<String, AttributeValue>?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.item(value)
    }

  
  
}

/**
  * Builds instances of type PutRequest:
  * Represents a request to perform a PutItem operation on an item.
  */
fun buildPutRequest(dslBlock: PutRequestDSL.() -> Unit) =
  PutRequestDSL().apply(dslBlock).build()