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
import software.amazon.awssdk.services.dynamodb.model.DeleteGlobalSecondaryIndexAction

/**
  * Builds instances of type DeleteGlobalSecondaryIndexAction:
  * Represents a global secondary index to be deleted from an existing table.
  */
@DynamodbDSL
class DeleteGlobalSecondaryIndexActionDSL {
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder = DeleteGlobalSecondaryIndexAction.builder()
  internal fun build(): DeleteGlobalSecondaryIndexAction = builder.build()
    
  /**
    * The name of the global secondary index to be deleted.
    */
  var indexName: String
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.indexName(value)
    }

  
  
}

/**
  * Builds instances of type DeleteGlobalSecondaryIndexAction:
  * Represents a global secondary index to be deleted from an existing table.
  */
fun buildDeleteGlobalSecondaryIndexAction(dslBlock: DeleteGlobalSecondaryIndexActionDSL.() -> Unit) =
  DeleteGlobalSecondaryIndexActionDSL().apply(dslBlock).build()