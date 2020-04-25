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
import software.amazon.awssdk.services.dynamodb.model.KeySchemaElement
import software.amazon.awssdk.services.dynamodb.model.Projection
import software.amazon.awssdk.services.dynamodb.model.ProvisionedThroughput

/**
  * Builds instances of type CreateGlobalSecondaryIndexAction:
  * Represents a new global secondary index to be added to an existing table.
  */
@DynamodbDSL
class CreateGlobalSecondaryIndexActionDSL {
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  internal val builder = CreateGlobalSecondaryIndexAction.builder()
  internal fun build(): CreateGlobalSecondaryIndexAction = builder.build()
    
  /**
    * Represents attributes that are copied (projected) from the table into an index. These are in addition to the
    *  primary key attributes and index key attributes, which are automatically projected.
    */
  var projection: Projection
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.projection(value)
    }


  /**
    * The name of the global secondary index to be created.
    */
  var indexName: String
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.indexName(value)
    }


  /**
    * The key schema for the global secondary index.
    */
  var keySchema: Collection<KeySchemaElement>
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.keySchema(value)
    }


  /**
    * Represents the provisioned throughput settings for the specified global secondary index.
    * 
    *  For current minimum and maximum provisioned throughput values, see Limits in the
    *  Amazon DynamoDB Developer Guide.
    */
  var provisionedThroughput: ProvisionedThroughput
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.provisionedThroughput(value)
    }

  
    
  /**
    * Represents attributes that are copied (projected) from the table into an index. These are in addition to the
    *  primary key attributes and index key attributes, which are automatically projected.
    */
  fun projection(dslBlock: ProjectionDSL.() -> Unit) {
    builder.projection(buildProjection(dslBlock))
  }


  /**
    * Represents the provisioned throughput settings for the specified global secondary index.
    * 
    *  For current minimum and maximum provisioned throughput values, see Limits in the
    *  Amazon DynamoDB Developer Guide.
    */
  fun provisionedThroughput(dslBlock: ProvisionedThroughputDSL.() -> Unit) {
    builder.provisionedThroughput(buildProvisionedThroughput(dslBlock))
  }


  /**
    * The key schema for the global secondary index.
    */
  fun keySchema(dslBlock: KeySchemaElementCollectionDSL.() -> Unit) {
    builder.keySchema(buildKeySchemaElementCollection(dslBlock))
  }

}

/**
  * Builds instances of type CreateGlobalSecondaryIndexAction:
  * Represents a new global secondary index to be added to an existing table.
  */
fun buildCreateGlobalSecondaryIndexAction(dslBlock: CreateGlobalSecondaryIndexActionDSL.() -> Unit) =
  CreateGlobalSecondaryIndexActionDSL().apply(dslBlock).build()