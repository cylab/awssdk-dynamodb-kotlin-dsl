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
import software.amazon.awssdk.services.dynamodb.model.ListGlobalTablesResponse

/**
  * Builds instances of type ListGlobalTablesResponse:
  * 
  */
@DynamodbDSL
class ListGlobalTablesResponseDSL {
  private val builder = ListGlobalTablesResponse.builder()
  internal fun build(): ListGlobalTablesResponse = builder.build()
    
  /**
    * List of global table names.
    */
  @get:JvmSynthetic // Hide from Java callers
  var globalTables: Collection<GlobalTable>
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.globalTables(value)
    }


  /**
    * Last evaluated global table name.
    */
  @get:JvmSynthetic // Hide from Java callers
  var lastEvaluatedGlobalTableName: String
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.lastEvaluatedGlobalTableName(value)
    }

  
    
  /**
    * List of global table names.
    */
  fun globalTables(dslBlock: GlobalTableCollectionDSL.() -> Unit) {
    builder.globalTables(buildGlobalTableCollection(dslBlock))
  }

}

/**
  * Builds instances of type ListGlobalTablesResponse:
  * 
  */
fun buildListGlobalTablesResponse(dslBlock: ListGlobalTablesResponseDSL.() -> Unit) =
  ListGlobalTablesResponseDSL().apply(dslBlock).build()