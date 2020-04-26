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
import java.time.Duration
import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSL
import software.amazon.awssdk.awscore.exception.AwsErrorDetails
import software.amazon.awssdk.services.dynamodb.model.ResourceInUseException

/**
  * Builds instances of type ResourceInUseException:
  * The operation conflicts with the resource's availability. For example, you attempted to recreate an existing table,
  *  or tried to delete a table currently in the CREATING state.
  */
@DynamodbDSL
class ResourceInUseExceptionDSL {
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder = ResourceInUseException.builder()
  internal fun build(): ResourceInUseException = builder.build()
    
  /**
    * 
    */
  var cause: Throwable
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.cause(value)
    }


  /**
    * 
    */
  var message: String
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.message(value)
    }


  /**
    * 
    */
  var awsErrorDetails: AwsErrorDetails
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.awsErrorDetails(value)
    }


  /**
    * 
    */
  var requestId: String
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.requestId(value)
    }


  /**
    * 
    */
  var statusCode: Int
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.statusCode(value)
    }


  /**
    * 
    */
  var clockSkew: Duration
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.clockSkew(value)
    }

    
  /**
    * 
    */
  fun cause(value: Throwable) {
    builder.cause(value)
  }


  /**
    * 
    */
  fun message(value: String) {
    builder.message(value)
  }


  /**
    * 
    */
  fun requestId(value: String) {
    builder.requestId(value)
  }


  /**
    * 
    */
  fun statusCode(value: Int) {
    builder.statusCode(value)
  }

  
}

/**
  * Builds instances of type ResourceInUseException:
  * The operation conflicts with the resource's availability. For example, you attempted to recreate an existing table,
  *  or tried to delete a table currently in the CREATING state.
  */
fun buildResourceInUseException(dslBlock: ResourceInUseExceptionDSL.() -> Unit) =
  ResourceInUseExceptionDSL().apply(dslBlock).build()