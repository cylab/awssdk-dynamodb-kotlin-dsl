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
import software.amazon.awssdk.awscore.AwsRequestOverrideConfiguration
import software.amazon.awssdk.services.dynamodb.DynamoDbAsyncClient
import software.amazon.awssdk.services.dynamodb.DynamoDbClient
import software.amazon.awssdk.services.dynamodb.model.DeleteTableRequest
import software.amazon.awssdk.services.dynamodb.transform.DeleteTableRequestMarshaller

/**
  * Builds instances of type DeleteTableRequest:
  * Represents the input of a DeleteTable operation.
  */
@DynamodbDSL
inline class DeleteTableRequestDSL(
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder: DeleteTableRequest.Builder
){
  @PublishedApi
  internal fun build(): DeleteTableRequest = builder.build()

  /**
    * 
    */
  inline var overrideConfiguration: AwsRequestOverrideConfiguration?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.overrideConfiguration(value)
    }

  /**
    * 
    */
  inline var tableName: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.tableName(value)
    }

}

/**
  * Builds instances of type DeleteTableRequest:
  * Represents the input of a DeleteTable operation.
  */
inline fun buildDeleteTableRequest(dslBlock: DeleteTableRequestDSL.() -> Unit) =
  DeleteTableRequestDSL(DeleteTableRequest.builder()).apply(dslBlock).build()

/**
  * 
  */
inline fun DeleteTableRequestMarshaller.marshallBy(dslBlock: DeleteTableRequestDSL.() -> Unit) =
  this.marshall(buildDeleteTableRequest(dslBlock))

/**
  * The DeleteTable operation deletes a table and all of its items. After a DeleteTable
  *  request, the specified table is in the DELETING state until DynamoDB completes the deletion. If the
  *  table is in the ACTIVE state, you can delete it. If a table is in CREATING or
  *  UPDATING states, then DynamoDB returns a ResourceInUseException. If the specified table
  *  does not exist, DynamoDB returns a ResourceNotFoundException. If table is already in the
  *  DELETING state, no error is returned.
  * 
  *  DynamoDB might continue to accept data read and write operations, such as GetItem and
  *  PutItem, on a table in the DELETING state until the table deletion is complete.
  * 
  *  When you delete a table, any indexes on that table are also deleted.
  * 
  *  If you have DynamoDB Streams enabled on the table, then the corresponding stream on that table goes into the
  *  DISABLED state, and the stream is automatically deleted after 24 hours.
  * 
  *  Use the DescribeTable action to check the status of the table.
  */
inline fun DynamoDbAsyncClient.deleteTableBy(dslBlock: DeleteTableRequestDSL.() -> Unit) =
  this.deleteTable(buildDeleteTableRequest(dslBlock))

/**
  * The DeleteTable operation deletes a table and all of its items. After a DeleteTable
  *  request, the specified table is in the DELETING state until DynamoDB completes the deletion. If the
  *  table is in the ACTIVE state, you can delete it. If a table is in CREATING or
  *  UPDATING states, then DynamoDB returns a ResourceInUseException. If the specified table
  *  does not exist, DynamoDB returns a ResourceNotFoundException. If table is already in the
  *  DELETING state, no error is returned.
  * 
  *  DynamoDB might continue to accept data read and write operations, such as GetItem and
  *  PutItem, on a table in the DELETING state until the table deletion is complete.
  * 
  *  When you delete a table, any indexes on that table are also deleted.
  * 
  *  If you have DynamoDB Streams enabled on the table, then the corresponding stream on that table goes into the
  *  DISABLED state, and the stream is automatically deleted after 24 hours.
  * 
  *  Use the DescribeTable action to check the status of the table.
  */
inline fun DynamoDbClient.deleteTableBy(dslBlock: DeleteTableRequestDSL.() -> Unit) =
  this.deleteTable(buildDeleteTableRequest(dslBlock))