/*
  This file was generated from https://github.com/aws/aws-sdk-java-v2 by https://github.com/cylab/aws-kotlin-dsl-builder
  Like the original code, this file and project is licensed under
  Apache License Version 2.0
  See LICENSE.txt for more info
*/
package net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.model

import kotlin.DeprecationLevel.HIDDEN
import java.time.Instant
import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSL
import software.amazon.awssdk.services.dynamodb.model.GlobalTableDescription
import software.amazon.awssdk.services.dynamodb.model.GlobalTableStatus
import software.amazon.awssdk.services.dynamodb.model.ReplicaDescription

/**
  * Builds instances of type GlobalTableDescription:
  * Contains details about the global table.
  */
@DynamodbDSL
class GlobalTableDescriptionDSL {
  private val builder = GlobalTableDescription.builder()
  internal fun build(): GlobalTableDescription = builder.build()
    
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
    * The creation time of the global table.
    */
  @get:JvmSynthetic // Hide from Java callers
  var creationDateTime: Instant
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.creationDateTime(value)
    }


  /**
    * The unique identifier of the global table.
    */
  @get:JvmSynthetic // Hide from Java callers
  var globalTableArn: String
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.globalTableArn(value)
    }


  /**
    * The current state of the global table:
    * 
    *  CREATING - The global table is being created.
    * 
    *  UPDATING - The global table is being updated.
    * 
    *  DELETING - The global table is being deleted.
    * 
    *  ACTIVE - The global table is ready for use.
    */
  @get:JvmSynthetic // Hide from Java callers
  var globalTableStatus: GlobalTableStatus
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.globalTableStatus(value)
    }


  /**
    * The Regions where the global table has replicas.
    */
  @get:JvmSynthetic // Hide from Java callers
  var replicationGroup: Collection<ReplicaDescription>
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.replicationGroup(value)
    }

    
  /**
    * The current state of the global table:
    * 
    *  CREATING - The global table is being created.
    * 
    *  UPDATING - The global table is being updated.
    * 
    *  DELETING - The global table is being deleted.
    * 
    *  ACTIVE - The global table is ready for use.
    */
  fun globalTableStatus(value: String) {
    builder.globalTableStatus(value)
  }

    
  /**
    * The Regions where the global table has replicas.
    */
  fun replicationGroup(dslBlock: ReplicaDescriptionCollectionDSL.() -> Unit) {
    builder.replicationGroup(buildReplicaDescriptionCollection(dslBlock))
  }

}

/**
  * Builds instances of type GlobalTableDescription:
  * Contains details about the global table.
  */
fun buildGlobalTableDescription(dslBlock: GlobalTableDescriptionDSL.() -> Unit) =
  GlobalTableDescriptionDSL().apply(dslBlock).build()