/*
  This file was generated from https://github.com/aws/aws-sdk-java-v2 by https://github.com/cylab/aws-kotlin-dsl-builder
  Like the original code, this file and project is licensed under
  Apache License Version 2.0
  See LICENSE.txt for more info
*/
@file:Suppress("DEPRECATION", "NOTHING_TO_INLINE")
package net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.model

import kotlin.DeprecationLevel.HIDDEN
import kotlin.DeprecationLevel.WARNING
import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSL
import software.amazon.awssdk.services.dynamodb.model.ReplicaDescription

/**
  * Builds instances of type ReplicaDescription:
  * Contains the details of the replica.
  */
@DynamodbDSL
inline class ReplicaDescriptionDSL(
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder: ReplicaDescription.Builder
){
  @PublishedApi
  internal fun build(): ReplicaDescription = builder.build()
    
  /**
    * 
    */
  inline var regionName: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.regionName(value)
    }

  
  
  
}

/**
  * Builds instances of type ReplicaDescription:
  * Contains the details of the replica.
  */
inline fun buildReplicaDescription(dslBlock: ReplicaDescriptionDSL.() -> Unit) =
  ReplicaDescriptionDSL(ReplicaDescription.builder()).apply(dslBlock).build()