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
import software.amazon.awssdk.services.dynamodb.model.DeleteReplicaAction

/**
  * Builds instances of type DeleteReplicaAction:
  * Represents a replica to be removed.
  */
@DynamodbDSL
class DeleteReplicaActionDSL {
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder = DeleteReplicaAction.builder()
  internal fun build(): DeleteReplicaAction = builder.build()
    
  /**
    * The Region of the replica to be removed.
    */
  var regionName: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.regionName(value)
    }

  
  
}

/**
  * Builds instances of type DeleteReplicaAction:
  * Represents a replica to be removed.
  */
fun buildDeleteReplicaAction(dslBlock: DeleteReplicaActionDSL.() -> Unit) =
  DeleteReplicaActionDSL().apply(dslBlock).build()