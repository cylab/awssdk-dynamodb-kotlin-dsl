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
import software.amazon.awssdk.services.dynamodb.model.CreateReplicaAction
import software.amazon.awssdk.services.dynamodb.model.DeleteReplicaAction
import software.amazon.awssdk.services.dynamodb.model.ReplicaUpdate

/**
  * Builds instances of type ReplicaUpdate:
  * Represents one of the following:
  * 
  *  A new replica to be added to an existing global table.
  * 
  *  New parameters for an existing replica.
  * 
  *  An existing replica to be removed from an existing global table.
  */
@DynamodbDSL
class ReplicaUpdateDSL {
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder = ReplicaUpdate.builder()
  internal fun build(): ReplicaUpdate = builder.build()
    
  /**
    * The name of the existing replica to be removed.
    */
  var delete: DeleteReplicaAction
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.delete(value)
    }


  /**
    * The parameters required for creating a replica on an existing global table.
    */
  var create: CreateReplicaAction
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.create(value)
    }

  
    
  /**
    * The name of the existing replica to be removed.
    */
  fun delete(dslBlock: DeleteReplicaActionDSL.() -> Unit) {
    builder.delete(buildDeleteReplicaAction(dslBlock))
  }


  /**
    * The parameters required for creating a replica on an existing global table.
    */
  fun create(dslBlock: CreateReplicaActionDSL.() -> Unit) {
    builder.create(buildCreateReplicaAction(dslBlock))
  }

}

/**
  * Builds instances of type ReplicaUpdate:
  * Represents one of the following:
  * 
  *  A new replica to be added to an existing global table.
  * 
  *  New parameters for an existing replica.
  * 
  *  An existing replica to be removed from an existing global table.
  */
fun buildReplicaUpdate(dslBlock: ReplicaUpdateDSL.() -> Unit) =
  ReplicaUpdateDSL().apply(dslBlock).build()