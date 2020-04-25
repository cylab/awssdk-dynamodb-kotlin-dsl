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
import software.amazon.awssdk.services.dynamodb.model.ReplicaUpdate
import software.amazon.awssdk.services.dynamodb.model.UpdateGlobalTableRequest

/**
  * Builds instances of type UpdateGlobalTableRequest:
  * 
  */
@DynamodbDSL
class UpdateGlobalTableRequestDSL {
  private val builder = UpdateGlobalTableRequest.builder()
  internal fun build(): UpdateGlobalTableRequest = builder.build()
    
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
    * A list of Regions that should be added or removed from the global table.
    */
  @get:JvmSynthetic // Hide from Java callers
  var replicaUpdates: Collection<ReplicaUpdate>
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.replicaUpdates(value)
    }

  
    
  /**
    * A list of Regions that should be added or removed from the global table.
    */
  fun replicaUpdates(dslBlock: ReplicaUpdateCollectionDSL.() -> Unit) {
    builder.replicaUpdates(buildReplicaUpdateCollection(dslBlock))
  }

}

/**
  * Builds instances of type UpdateGlobalTableRequest:
  * 
  */
fun buildUpdateGlobalTableRequest(dslBlock: UpdateGlobalTableRequestDSL.() -> Unit) =
  UpdateGlobalTableRequestDSL().apply(dslBlock).build()