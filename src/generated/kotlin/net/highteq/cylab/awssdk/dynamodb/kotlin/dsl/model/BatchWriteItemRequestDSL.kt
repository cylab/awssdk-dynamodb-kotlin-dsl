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
import software.amazon.awssdk.awscore.AwsRequestOverrideConfiguration
import software.amazon.awssdk.services.dynamodb.model.BatchWriteItemRequest
import software.amazon.awssdk.services.dynamodb.model.ReturnConsumedCapacity
import software.amazon.awssdk.services.dynamodb.model.ReturnItemCollectionMetrics
import software.amazon.awssdk.services.dynamodb.model.WriteRequest

/**
  * Builds instances of type BatchWriteItemRequest:
  * Represents the input of a BatchWriteItem operation.
  */
@DynamodbDSL
class BatchWriteItemRequestDSL {
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder = BatchWriteItemRequest.builder()
  internal fun build(): BatchWriteItemRequest = builder.build()
    
  /**
    * 
    */
  var overrideConfiguration: AwsRequestOverrideConfiguration?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.overrideConfiguration(value)
    }


  /**
    * A map of one or more table names and, for each table, a list of operations to be performed (
    *  DeleteRequest or PutRequest). Each element in the map consists of the following:
    * 
    *  DeleteRequest - Perform a DeleteItem operation on the specified item. The item to
    *  be deleted is identified by a Key subelement:
    * 
    *  Key - A map of primary key attribute values that uniquely identify the item. Each entry in this
    *  map consists of an attribute name and an attribute value. For each primary key, you must provide all
    *  of the key attributes. For example, with a simple primary key, you only need to provide a value for the
    *  partition key. For a composite primary key, you must provide values for both the partition key and the
    *  sort key.
    * 
    *  PutRequest - Perform a PutItem operation on the specified item. The item to be put
    *  is identified by an Item subelement:
    * 
    *  Item - A map of attributes and their values. Each entry in this map consists of an attribute
    *  name and an attribute value. Attribute values must not be null; string and binary type attributes must have
    *  lengths greater than zero; and set type attributes must not be empty. Requests that contain empty values are
    *  rejected with a ValidationException exception.
    * 
    *  If you specify any attributes that are part of an index key, then the data types for those attributes must
    *  match those of the schema in the table's attribute definition.
    */
  var requestItems: Map<String, Collection<WriteRequest>>?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.requestItems(value)
    }


  /**
    * Sets the value of the ReturnConsumedCapacity property for this object.
    */
  var returnConsumedCapacity: ReturnConsumedCapacity?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.returnConsumedCapacity(value)
    }


  /**
    * Determines whether item collection metrics are returned. If set to SIZE, the response includes
    *  statistics about item collections, if any, that were modified during the operation are returned in the
    *  response. If set to NONE (the default), no statistics are returned.
    */
  var returnItemCollectionMetrics: ReturnItemCollectionMetrics?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.returnItemCollectionMetrics(value)
    }

    
  /**
    * Sets the value of the ReturnConsumedCapacity property for this object.
    */
  fun returnConsumedCapacity(value: String?) {
    builder.returnConsumedCapacity(value)
  }


  /**
    * Determines whether item collection metrics are returned. If set to SIZE, the response includes
    *  statistics about item collections, if any, that were modified during the operation are returned in the
    *  response. If set to NONE (the default), no statistics are returned.
    */
  fun returnItemCollectionMetrics(value: String?) {
    builder.returnItemCollectionMetrics(value)
  }

  
}

/**
  * Builds instances of type BatchWriteItemRequest:
  * Represents the input of a BatchWriteItem operation.
  */
fun buildBatchWriteItemRequest(dslBlock: BatchWriteItemRequestDSL.() -> Unit) =
  BatchWriteItemRequestDSL().apply(dslBlock).build()