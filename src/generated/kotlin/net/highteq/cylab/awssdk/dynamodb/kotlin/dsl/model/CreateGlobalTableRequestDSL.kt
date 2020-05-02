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
import software.amazon.awssdk.services.dynamodb.model.CreateGlobalTableRequest
import software.amazon.awssdk.services.dynamodb.model.Replica

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