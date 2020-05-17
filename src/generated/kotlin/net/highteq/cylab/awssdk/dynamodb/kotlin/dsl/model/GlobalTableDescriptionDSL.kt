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
import java.time.Instant
import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSL
import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSLMarker
import software.amazon.awssdk.services.dynamodb.model.GlobalTableDescription
import software.amazon.awssdk.services.dynamodb.model.GlobalTableStatus
import software.amazon.awssdk.services.dynamodb.model.ReplicaDescription

/**
  * Builds instances of type GlobalTableDescription:
  * Contains details about the global table.
  */
@DynamodbDSLMarker
inline class GlobalTableDescriptionDSL(
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder: GlobalTableDescription.Builder
){
  @PublishedApi
  internal fun build(): GlobalTableDescription = builder.build()

  /**
    * 
    */
  inline var creationDateTime: Instant?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.creationDateTime(value)
    }

  /**
    * 
    */
  inline var globalTableArn: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.globalTableArn(value)
    }

  /**
    * 
    */
  inline var globalTableName: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.globalTableName(value)
    }

  /**
    * 
    */
  inline var globalTableStatus: GlobalTableStatus?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.globalTableStatus(value)
    }

  /**
    * 
    */
  inline var replicationGroup: Collection<ReplicaDescription>?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.replicationGroup(value)
    }

  /**
    * 
    */
  inline fun globalTableStatus(value: String?) {
    builder.globalTableStatus(value)
  }

  /**
    * 
    */
  inline fun replicationGroup(dslBlock: ReplicaDescriptionCollectionDSL.() -> Unit) {
    builder.replicationGroup(DynamodbDSL.Companion.replicaDescriptionCollection(dslBlock))
  }

}

/**
  * Builds instances of type GlobalTableDescription:
  * Contains details about the global table.
  */
inline fun globalTableDescription(dslBlock: GlobalTableDescriptionDSL.() -> Unit) =
  GlobalTableDescriptionDSL(GlobalTableDescription.builder()).apply(dslBlock).build()

/**
  * Builds instances of type GlobalTableDescription:
  * Contains details about the global table.
  */
inline fun DynamodbDSL.Companion.globalTableDescription(dslBlock: GlobalTableDescriptionDSL.() -> Unit) =
  GlobalTableDescriptionDSL(GlobalTableDescription.builder()).apply(dslBlock).build()