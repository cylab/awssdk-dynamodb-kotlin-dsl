/*
  This file was generated from https://github.com/aws/aws-sdk-java-v2 by https://github.com/cylab/aws-kotlin-dsl-builder
  Like the original code, this file and project is licensed under
  Apache License Version 2.0
  See LICENSE.txt for more info
*/
package net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.model

import kotlin.DeprecationLevel.HIDDEN
import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSL
import software.amazon.awssdk.awscore.AwsRequestOverrideConfiguration
import software.amazon.awssdk.services.dynamodb.model.CreateGlobalTableRequest
import software.amazon.awssdk.services.dynamodb.model.Replica

/**
  * Builds instances of type CreateGlobalTableRequest:
  * 
  */
@DynamodbDSL
class CreateGlobalTableRequestDSL {
  private val builder = CreateGlobalTableRequest.builder()
  internal fun build(): CreateGlobalTableRequest = builder.build()
    
  /**
    * 
    */
  @get:JvmSynthetic // Hide from Java callers
  var overrideConfiguration: AwsRequestOverrideConfiguration
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.overrideConfiguration(value)
    }


  /**
    * The global table name.
    */
  @get:JvmSynthetic // Hide from Java callers
  var globalTableName: String
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.globalTableName(value)
    }


  /**
    * The Regions where the global table needs to be created.
    */
  @get:JvmSynthetic // Hide from Java callers
  var replicationGroup: Collection<Replica>
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.replicationGroup(value)
    }

  
    
  /**
    * The Regions where the global table needs to be created.
    */
  fun replicationGroup(dslBlock: ReplicaCollectionDSL.() -> Unit) {
    builder.replicationGroup(buildReplicaCollection(dslBlock))
  }

}

/**
  * Builds instances of type CreateGlobalTableRequest:
  * 
  */
fun buildCreateGlobalTableRequest(dslBlock: CreateGlobalTableRequestDSL.() -> Unit) =
  CreateGlobalTableRequestDSL().apply(dslBlock).build()