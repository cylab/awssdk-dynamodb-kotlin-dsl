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
import software.amazon.awssdk.services.dynamodb.model.ReplicaUpdate
import software.amazon.awssdk.services.dynamodb.model.UpdateGlobalTableRequest

/**
  * Builds instances of type UpdateGlobalTableRequest:
  * 
  */
@DynamodbDSL
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
    builder.replicaUpdates(buildReplicaUpdateCollection(dslBlock))
  }

}

/**
  * Builds instances of type UpdateGlobalTableRequest:
  * 
  */
inline fun buildUpdateGlobalTableRequest(dslBlock: UpdateGlobalTableRequestDSL.() -> Unit) =
  UpdateGlobalTableRequestDSL(UpdateGlobalTableRequest.builder()).apply(dslBlock).build()