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
import software.amazon.awssdk.awscore.AwsResponseMetadata
import software.amazon.awssdk.http.SdkHttpResponse
import software.amazon.awssdk.services.dynamodb.model.ListTablesResponse

/**
  * Builds instances of type ListTablesResponse:
  * Represents the output of a ListTables operation.
  */
@DynamodbDSL
class ListTablesResponseDSL {
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder = ListTablesResponse.builder()
  internal fun build(): ListTablesResponse = builder.build()
    
  /**
    * The name of the last table in the current page of results. Use this value as the
    *  ExclusiveStartTableName in a new request to obtain the next page of results, until all the table
    *  names are returned.
    * 
    *  If you do not receive a LastEvaluatedTableName value in the response, this means that there are
    *  no more table names to be retrieved.
    */
  var lastEvaluatedTableName: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.lastEvaluatedTableName(value)
    }


  /**
    * 
    */
  var responseMetadata: AwsResponseMetadata?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.responseMetadata(value)
    }


  /**
    * 
    */
  var sdkHttpResponse: SdkHttpResponse?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.sdkHttpResponse(value)
    }


  /**
    * The names of the tables associated with the current account at the current endpoint. The maximum size of this
    *  array is 100.
    * 
    *  If LastEvaluatedTableName also appears in the output, you can use this value as the
    *  ExclusiveStartTableName parameter in a subsequent ListTables request and obtain the
    *  next page of results.
    */
  var tableNames: Collection<String>?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.tableNames(value)
    }

  
  
}

/**
  * Builds instances of type ListTablesResponse:
  * Represents the output of a ListTables operation.
  */
fun buildListTablesResponse(dslBlock: ListTablesResponseDSL.() -> Unit) =
  ListTablesResponseDSL().apply(dslBlock).build()