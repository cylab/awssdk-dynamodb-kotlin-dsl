/*
  This file was generated from https://github.com/aws/aws-sdk-java-v2 by https://github.com/cylab/aws-kotlin-dsl-builder
  Like the original code, this file and project is licensed under
  Apache License Version 2.0
  See LICENSE.txt for more info
*/
package net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.model

import kotlin.DeprecationLevel.HIDDEN
import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSL
import software.amazon.awssdk.awscore.AwsRequestOverrideConfiguration
import software.amazon.awssdk.services.dynamodb.model.ListGlobalTablesRequest

/**
  * Builds instances of type ListGlobalTablesRequest:
  * 
  */
@DynamodbDSL
class ListGlobalTablesRequestDSL {
  private val builder = ListGlobalTablesRequest.builder()
  internal fun build(): ListGlobalTablesRequest = builder.build()
    
  /**
    * The first global table name that this operation will evaluate.
    */
  @get:JvmSynthetic // Hide from Java callers
  var exclusiveStartGlobalTableName: String
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.exclusiveStartGlobalTableName(value)
    }


  /**
    * 
    */
  @get:JvmSynthetic // Hide from Java callers
  var overrideConfiguration: AwsRequestOverrideConfiguration
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.overrideConfiguration(value)
    }


  /**
    * Lists the global tables in a specific Region.
    */
  @get:JvmSynthetic // Hide from Java callers
  var regionName: String
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.regionName(value)
    }


  /**
    * The maximum number of table names to return, if the parameter is not specified DynamoDB defaults to 100.
    * 
    *  If the number of global tables DynamoDB finds reaches this limit, it stops the operation and returns the
    *  table names collected up to that point, with a table name in the LastEvaluatedGlobalTableName to
    *  apply in a subsequent operation to the ExclusiveStartGlobalTableName parameter.
    */
  @get:JvmSynthetic // Hide from Java callers
  var limit: Int
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.limit(value)
    }

  
  
}

/**
  * Builds instances of type ListGlobalTablesRequest:
  * 
  */
fun buildListGlobalTablesRequest(dslBlock: ListGlobalTablesRequestDSL.() -> Unit) =
  ListGlobalTablesRequestDSL().apply(dslBlock).build()