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
import software.amazon.awssdk.awscore.AwsRequestOverrideConfiguration
import software.amazon.awssdk.services.dynamodb.model.ListTablesRequest

/**
  * Builds instances of type ListTablesRequest:
  * Represents the input of a ListTables operation.
  */
@DynamodbDSL
class ListTablesRequestDSL {
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder = ListTablesRequest.builder()
  internal fun build(): ListTablesRequest = builder.build()
    
  /**
    * The first table name that this operation will evaluate. Use the value that was returned for
    *  LastEvaluatedTableName in a previous operation, so that you can obtain the next page of results.
    */
  var exclusiveStartTableName: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.exclusiveStartTableName(value)
    }


  /**
    * A maximum number of table names to return. If this parameter is not specified, the limit is 100.
    */
  var limit: Int?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.limit(value)
    }


  /**
    * 
    */
  var overrideConfiguration: AwsRequestOverrideConfiguration?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.overrideConfiguration(value)
    }

  
  
  
}

/**
  * Builds instances of type ListTablesRequest:
  * Represents the input of a ListTables operation.
  */
fun buildListTablesRequest(dslBlock: ListTablesRequestDSL.() -> Unit) =
  ListTablesRequestDSL().apply(dslBlock).build()