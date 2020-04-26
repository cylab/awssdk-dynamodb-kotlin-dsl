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
import software.amazon.awssdk.services.dynamodb.model.DescribeTableRequest

/**
  * Builds instances of type DescribeTableRequest:
  * Represents the input of a DescribeTable operation.
  */
@DynamodbDSL
class DescribeTableRequestDSL {
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder = DescribeTableRequest.builder()
  internal fun build(): DescribeTableRequest = builder.build()
    
  /**
    * The name of the table to describe.
    */
  var tableName: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.tableName(value)
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
  * Builds instances of type DescribeTableRequest:
  * Represents the input of a DescribeTable operation.
  */
fun buildDescribeTableRequest(dslBlock: DescribeTableRequestDSL.() -> Unit) =
  DescribeTableRequestDSL().apply(dslBlock).build()