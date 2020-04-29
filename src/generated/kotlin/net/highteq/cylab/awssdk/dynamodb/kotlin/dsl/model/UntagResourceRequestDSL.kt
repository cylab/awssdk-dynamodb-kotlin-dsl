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
import software.amazon.awssdk.services.dynamodb.model.UntagResourceRequest

/**
  * Builds instances of type UntagResourceRequest:
  * 
  */
@DynamodbDSL
class UntagResourceRequestDSL {
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder = UntagResourceRequest.builder()
  internal fun build(): UntagResourceRequest = builder.build()
    
  /**
    * 
    */
  var overrideConfiguration: AwsRequestOverrideConfiguration?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.overrideConfiguration(value)
    }


  /**
    * The DynamoDB resource that the tags will be removed from. This value is an Amazon Resource Name (ARN).
    */
  var resourceArn: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.resourceArn(value)
    }


  /**
    * A list of tag keys. Existing tags of the resource whose keys are members of this list will be removed from
    *  the DynamoDB resource.
    */
  var tagKeys: Collection<String>?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.tagKeys(value)
    }

  
  
  
}

/**
  * Builds instances of type UntagResourceRequest:
  * 
  */
fun buildUntagResourceRequest(dslBlock: UntagResourceRequestDSL.() -> Unit) =
  UntagResourceRequestDSL().apply(dslBlock).build()