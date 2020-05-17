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
import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSLMarker
import software.amazon.awssdk.awscore.AwsRequestOverrideConfiguration
import software.amazon.awssdk.services.dynamodb.DynamoDbAsyncClient
import software.amazon.awssdk.services.dynamodb.DynamoDbClient
import software.amazon.awssdk.services.dynamodb.model.ReplicaUpdate
import software.amazon.awssdk.services.dynamodb.model.UpdateGlobalTableRequest
import software.amazon.awssdk.services.dynamodb.transform.UpdateGlobalTableRequestMarshaller

/**
  * Builds instances of type UpdateGlobalTableRequest:
  * 
  */
@DynamodbDSLMarker
inline class UpdateGlobalTableRequestDSL(
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder: UpdateGlobalTableRequest.Builder
){
  @PublishedApi
  internal fun build(): UpdateGlobalTableRequest = builder.build()

  /**
    * 
    */
  inline var globalTableName: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.globalTableName(value)
    }

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
  inline var replicaUpdates: Collection<ReplicaUpdate>?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.replicaUpdates(value)
    }

  /**
    * 
    */
  inline fun replicaUpdates(dslBlock: ReplicaUpdateCollectionDSL.() -> Unit) {
    builder.replicaUpdates(DynamodbDSL.Companion.replicaUpdateCollection(dslBlock))
  }

}

/**
  * Builds instances of type UpdateGlobalTableRequest:
  * 
  */
inline fun updateGlobalTableRequest(dslBlock: UpdateGlobalTableRequestDSL.() -> Unit) =
  UpdateGlobalTableRequestDSL(UpdateGlobalTableRequest.builder()).apply(dslBlock).build()

/**
  * Builds instances of type UpdateGlobalTableRequest:
  * 
  */
inline fun DynamodbDSL.Companion.updateGlobalTableRequest(dslBlock: UpdateGlobalTableRequestDSL.() -> Unit) =
  UpdateGlobalTableRequestDSL(UpdateGlobalTableRequest.builder()).apply(dslBlock).build()

/**
  * Adds or removes replicas in the specified global table. The global table must already exist to be able to use
  *  this operation. Any replica to be added must be empty, must have the same name as the global table, must have the
  *  same key schema, and must have DynamoDB Streams enabled and must have same provisioned and maximum write capacity
  *  units.
  * 
  *  Although you can use UpdateGlobalTable to add replicas and remove replicas in a single request, for
  *  simplicity we recommend that you issue separate requests for adding or removing replicas.
  * 
  *  If global secondary indexes are specified, then the following conditions must also be met:
  * 
  *  The global secondary indexes must have the same name.
  * 
  *  The global secondary indexes must have the same hash key and sort key (if present).
  * 
  *  The global secondary indexes must have the same provisioned and maximum write capacity units.
  */
inline fun DynamoDbAsyncClient.updateGlobalTableBy(dslBlock: UpdateGlobalTableRequestDSL.() -> Unit) =
  this.updateGlobalTable(DynamodbDSL.Companion.updateGlobalTableRequest(dslBlock))

/**
  * Adds or removes replicas in the specified global table. The global table must already exist to be able to use
  *  this operation. Any replica to be added must be empty, must have the same name as the global table, must have the
  *  same key schema, and must have DynamoDB Streams enabled and must have same provisioned and maximum write capacity
  *  units.
  * 
  *  Although you can use UpdateGlobalTable to add replicas and remove replicas in a single request, for
  *  simplicity we recommend that you issue separate requests for adding or removing replicas.
  * 
  *  If global secondary indexes are specified, then the following conditions must also be met:
  * 
  *  The global secondary indexes must have the same name.
  * 
  *  The global secondary indexes must have the same hash key and sort key (if present).
  * 
  *  The global secondary indexes must have the same provisioned and maximum write capacity units.
  */
inline fun DynamoDbClient.updateGlobalTableBy(dslBlock: UpdateGlobalTableRequestDSL.() -> Unit) =
  this.updateGlobalTable(DynamodbDSL.Companion.updateGlobalTableRequest(dslBlock))

/**
  * 
  */
inline fun UpdateGlobalTableRequestMarshaller.marshallBy(dslBlock: UpdateGlobalTableRequestDSL.() -> Unit) =
  this.marshall(DynamodbDSL.Companion.updateGlobalTableRequest(dslBlock))