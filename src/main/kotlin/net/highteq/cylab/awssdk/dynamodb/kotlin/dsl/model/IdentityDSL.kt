/*
  This file was generated from https://github.com/aws/aws-sdk-java-v2 by https://github.com/cylab/aws-kotlin-dsl-builder
  Like the original code, this file and project is licensed under
  Apache License Version 2.0
  See LICENSE.txt for more info
*/
package net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.model

import kotlin.DeprecationLevel.HIDDEN
import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSL
import software.amazon.awssdk.services.dynamodb.model.Identity

/**
  * Builds instances of type Identity:
  * Contains details about the type of identity that made the request.
  */
@DynamodbDSL
class IdentityDSL {
  private val builder = Identity.builder()
  internal fun build(): Identity = builder.build()
    
  /**
    * A unique identifier for the entity that made the call. For Time To Live, the principalId is
    *  "dynamodb.amazonaws.com".
    */
  @get:JvmSynthetic // Hide from Java callers
  var principalId: String
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.principalId(value)
    }


  /**
    * The type of the identity. For Time To Live, the type is "Service".
    */
  @get:JvmSynthetic // Hide from Java callers
  var type: String
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.type(value)
    }

  
  
}

/**
  * Builds instances of type Identity:
  * Contains details about the type of identity that made the request.
  */
fun buildIdentity(dslBlock: IdentityDSL.() -> Unit) =
  IdentityDSL().apply(dslBlock).build()