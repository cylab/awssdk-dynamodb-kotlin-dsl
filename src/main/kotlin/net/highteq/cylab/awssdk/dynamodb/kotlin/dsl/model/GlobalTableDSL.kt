/*
  This file was generated from https://github.com/aws/aws-sdk-java-v2 by https://github.com/cylab/aws-kotlin-dsl-builder
  Like the original code, this file and project is licensed under
  Apache License Version 2.0
  See LICENSE.txt for more info
*/
package net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.model

import kotlin.DeprecationLevel.HIDDEN
import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSL
import software.amazon.awssdk.services.dynamodb.model.GlobalTable
import software.amazon.awssdk.services.dynamodb.model.Replica

/**
  * Builds instances of type GlobalTable:
  * Represents the properties of a global table.
  */
@DynamodbDSL
class GlobalTableDSL {
  private val builder = GlobalTable.builder()
  internal fun build(): GlobalTable = builder.build()
    
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
    * The Regions where the global table has replicas.
    */
  @get:JvmSynthetic // Hide from Java callers
  var replicationGroup: Collection<Replica>
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.replicationGroup(value)
    }

  
    
  /**
    * The Regions where the global table has replicas.
    */
  fun replicationGroup(dslBlock: ReplicaCollectionDSL.() -> Unit) {
    builder.replicationGroup(buildReplicaCollection(dslBlock))
  }

}

/**
  * Builds instances of type GlobalTable:
  * Represents the properties of a global table.
  */
fun buildGlobalTable(dslBlock: GlobalTableDSL.() -> Unit) =
  GlobalTableDSL().apply(dslBlock).build()