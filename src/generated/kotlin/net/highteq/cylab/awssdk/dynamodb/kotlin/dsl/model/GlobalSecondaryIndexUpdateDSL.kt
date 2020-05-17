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
import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSLMarker
import software.amazon.awssdk.services.dynamodb.model.CreateGlobalSecondaryIndexAction
import software.amazon.awssdk.services.dynamodb.model.DeleteGlobalSecondaryIndexAction
import software.amazon.awssdk.services.dynamodb.model.GlobalSecondaryIndexUpdate
import software.amazon.awssdk.services.dynamodb.model.UpdateGlobalSecondaryIndexAction

/**
  * Builds instances of type GlobalSecondaryIndexUpdate:
  * Represents one of the following:
  * 
  *  A new global secondary index to be added to an existing table.
  * 
  *  New provisioned throughput parameters for an existing global secondary index.
  * 
  *  An existing global secondary index to be removed from an existing table.
  */
@DynamodbDSLMarker
inline class GlobalSecondaryIndexUpdateDSL(
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder: GlobalSecondaryIndexUpdate.Builder
){
  @PublishedApi
  internal fun build(): GlobalSecondaryIndexUpdate = builder.build()

  /**
    * 
    */
  inline var create: CreateGlobalSecondaryIndexAction?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.create(value)
    }

  /**
    * 
    */
  inline var delete: DeleteGlobalSecondaryIndexAction?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.delete(value)
    }

  /**
    * 
    */
  inline var update: UpdateGlobalSecondaryIndexAction?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.update(value)
    }

  /**
    * 
    */
  inline fun create(dslBlock: CreateGlobalSecondaryIndexActionDSL.() -> Unit) {
    builder.create(DynamodbDSL.Companion.createGlobalSecondaryIndexAction(dslBlock))
  }

  /**
    * 
    */
  inline fun delete(dslBlock: DeleteGlobalSecondaryIndexActionDSL.() -> Unit) {
    builder.delete(DynamodbDSL.Companion.deleteGlobalSecondaryIndexAction(dslBlock))
  }

  /**
    * 
    */
  inline fun update(dslBlock: UpdateGlobalSecondaryIndexActionDSL.() -> Unit) {
    builder.update(DynamodbDSL.Companion.updateGlobalSecondaryIndexAction(dslBlock))
  }

}

/**
  * Builds instances of type GlobalSecondaryIndexUpdate:
  * Represents one of the following:
  * 
  *  A new global secondary index to be added to an existing table.
  * 
  *  New provisioned throughput parameters for an existing global secondary index.
  * 
  *  An existing global secondary index to be removed from an existing table.
  */
inline fun globalSecondaryIndexUpdate(dslBlock: GlobalSecondaryIndexUpdateDSL.() -> Unit) =
  GlobalSecondaryIndexUpdateDSL(GlobalSecondaryIndexUpdate.builder()).apply(dslBlock).build()

/**
  * Builds instances of type GlobalSecondaryIndexUpdate:
  * Represents one of the following:
  * 
  *  A new global secondary index to be added to an existing table.
  * 
  *  New provisioned throughput parameters for an existing global secondary index.
  * 
  *  An existing global secondary index to be removed from an existing table.
  */
inline fun DynamodbDSL.Companion.globalSecondaryIndexUpdate(dslBlock: GlobalSecondaryIndexUpdateDSL.() -> Unit) =
  GlobalSecondaryIndexUpdateDSL(GlobalSecondaryIndexUpdate.builder()).apply(dslBlock).build()