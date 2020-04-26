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

/**
  * Builds instances of type CreateReplicaAction:
  * Represents a replica to be added.
  */
@DynamodbDSL
class CreateReplicaActionDSL {
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder = CreateReplicaAction.builder()
  internal fun build(): CreateReplicaAction = builder.build()
    
  /**
    * The Region of the replica to be added.
    */
  var regionName: String
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.regionName(value)
    }

  
  
}

/**
  * Builds instances of type CreateReplicaAction:
  * Represents a replica to be added.
  */
fun buildCreateReplicaAction(dslBlock: CreateReplicaActionDSL.() -> Unit) =
  CreateReplicaActionDSL().apply(dslBlock).build()