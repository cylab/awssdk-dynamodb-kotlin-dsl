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
inline class ReplicaUpdateDSL(
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder: ReplicaUpdate.Builder
){
  @PublishedApi
  internal fun build(): ReplicaUpdate = builder.build()

  /**
    * 
    */
  inline var create: CreateReplicaAction?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.create(value)
    }

  /**
    * 
    */
  inline var delete: DeleteReplicaAction?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.delete(value)
    }

  /**
    * 
    */
  inline fun create(dslBlock: CreateReplicaActionDSL.() -> Unit) {
    builder.create(buildCreateReplicaAction(dslBlock))
  }

  /**
    * 
    */
  inline fun delete(dslBlock: DeleteReplicaActionDSL.() -> Unit) {
    builder.delete(buildDeleteReplicaAction(dslBlock))
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
inline fun buildReplicaUpdate(dslBlock: ReplicaUpdateDSL.() -> Unit) =
  ReplicaUpdateDSL(ReplicaUpdate.builder()).apply(dslBlock).build()