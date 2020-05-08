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
import software.amazon.awssdk.services.dynamodb.model.CreateGlobalTableRequest
import software.amazon.awssdk.services.dynamodb.model.Replica
import software.amazon.awssdk.services.dynamodb.transform.CreateGlobalTableRequestMarshaller

/**
  * Builds instances of type CreateGlobalTableRequest:
  * 
  */
@DynamodbDSL
inline class CreateGlobalTableRequestDSL(
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder: CreateGlobalTableRequest.Builder
){
  @PublishedApi
  internal fun build(): CreateGlobalTableRequest = builder.build()

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
  inline var replicationGroup: Collection<Replica>?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.replicationGroup(value)
    }

  /**
    * 
    */
  inline fun replicationGroup(dslBlock: ReplicaCollectionDSL.() -> Unit) {
    builder.replicationGroup(buildReplicaCollection(dslBlock))
  }

}

/**
  * Builds instances of type CreateGlobalTableRequest:
  * 
  */
inline fun buildCreateGlobalTableRequest(dslBlock: CreateGlobalTableRequestDSL.() -> Unit) =
  CreateGlobalTableRequestDSL(CreateGlobalTableRequest.builder()).apply(dslBlock).build()

/**
  * 
  */
inline fun CreateGlobalTableRequestMarshaller.marshallBy(dslBlock: CreateGlobalTableRequestDSL.() -> Unit) =
  this.marshall(buildCreateGlobalTableRequest(dslBlock))

/**
  * Creates a global table from an existing table. A global table creates a replication relationship between two or
  *  more DynamoDB tables with the same table name in the provided regions.
  * 
  *  If you want to add a new replica table to a global table, each of the following conditions must be true:
  * 
  *  The table must have the same primary key as all of the other replicas.
  * 
  *  The table must have the same name as all of the other replicas.
  * 
  *  The table must have DynamoDB Streams enabled, with the stream containing both the new and the old images of the
  *  item.
  * 
  *  None of the replica tables in the global table can contain any data.
  * 
  *  If global secondary indexes are specified, then the following conditions must also be met:
  * 
  *  The global secondary indexes must have the same name.
  * 
  *  The global secondary indexes must have the same hash key and sort key (if present).
  * 
  *  Write capacity settings should be set consistently across your replica tables and secondary indexes. DynamoDB
  *  strongly recommends enabling auto scaling to manage the write capacity settings for all of your global tables
  *  replicas and indexes.
  * 
  *  If you prefer to manage write capacity settings manually, you should provision equal replicated write capacity
  *  units to your replica tables. You should also provision equal replicated write capacity units to matching
  *  secondary indexes across your global table.
  */
inline fun DynamoDbAsyncClient.createGlobalTableBy(dslBlock: CreateGlobalTableRequestDSL.() -> Unit) =
  this.createGlobalTable(buildCreateGlobalTableRequest(dslBlock))

/**
  * Creates a global table from an existing table. A global table creates a replication relationship between two or
  *  more DynamoDB tables with the same table name in the provided regions.
  * 
  *  If you want to add a new replica table to a global table, each of the following conditions must be true:
  * 
  *  The table must have the same primary key as all of the other replicas.
  * 
  *  The table must have the same name as all of the other replicas.
  * 
  *  The table must have DynamoDB Streams enabled, with the stream containing both the new and the old images of the
  *  item.
  * 
  *  None of the replica tables in the global table can contain any data.
  * 
  *  If global secondary indexes are specified, then the following conditions must also be met:
  * 
  *  The global secondary indexes must have the same name.
  * 
  *  The global secondary indexes must have the same hash key and sort key (if present).
  * 
  *  Write capacity settings should be set consistently across your replica tables and secondary indexes. DynamoDB
  *  strongly recommends enabling auto scaling to manage the write capacity settings for all of your global tables
  *  replicas and indexes.
  * 
  *  If you prefer to manage write capacity settings manually, you should provision equal replicated write capacity
  *  units to your replica tables. You should also provision equal replicated write capacity units to matching
  *  secondary indexes across your global table.
  */
inline fun DynamoDbClient.createGlobalTableBy(dslBlock: CreateGlobalTableRequestDSL.() -> Unit) =
  this.createGlobalTable(buildCreateGlobalTableRequest(dslBlock))