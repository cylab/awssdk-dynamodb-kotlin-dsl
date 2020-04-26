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
@DynamodbDSL
class GlobalSecondaryIndexUpdateDSL {
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder = GlobalSecondaryIndexUpdate.builder()
  internal fun build(): GlobalSecondaryIndexUpdate = builder.build()
    
  /**
    * The name of an existing global secondary index, along with new provisioned throughput settings to be applied
    *  to that index.
    */
  var update: UpdateGlobalSecondaryIndexAction
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.update(value)
    }


  /**
    * The name of an existing global secondary index to be removed.
    */
  var delete: DeleteGlobalSecondaryIndexAction
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.delete(value)
    }


  /**
    * The parameters required for creating a global secondary index on an existing table:
    * 
    *  IndexName 
    * 
    *  KeySchema 
    * 
    *  AttributeDefinitions 
    * 
    *  Projection 
    * 
    *  ProvisionedThroughput
    */
  var create: CreateGlobalSecondaryIndexAction
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.create(value)
    }

  
    
  /**
    * The name of an existing global secondary index, along with new provisioned throughput settings to be applied
    *  to that index.
    */
  fun update(dslBlock: UpdateGlobalSecondaryIndexActionDSL.() -> Unit) {
    builder.update(buildUpdateGlobalSecondaryIndexAction(dslBlock))
  }


  /**
    * The name of an existing global secondary index to be removed.
    */
  fun delete(dslBlock: DeleteGlobalSecondaryIndexActionDSL.() -> Unit) {
    builder.delete(buildDeleteGlobalSecondaryIndexAction(dslBlock))
  }


  /**
    * The parameters required for creating a global secondary index on an existing table:
    * 
    *  IndexName 
    * 
    *  KeySchema 
    * 
    *  AttributeDefinitions 
    * 
    *  Projection 
    * 
    *  ProvisionedThroughput
    */
  fun create(dslBlock: CreateGlobalSecondaryIndexActionDSL.() -> Unit) {
    builder.create(buildCreateGlobalSecondaryIndexAction(dslBlock))
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
fun buildGlobalSecondaryIndexUpdate(dslBlock: GlobalSecondaryIndexUpdateDSL.() -> Unit) =
  GlobalSecondaryIndexUpdateDSL().apply(dslBlock).build()