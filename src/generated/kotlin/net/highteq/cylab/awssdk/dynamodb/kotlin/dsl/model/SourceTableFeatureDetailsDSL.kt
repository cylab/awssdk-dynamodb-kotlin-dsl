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
import software.amazon.awssdk.services.dynamodb.model.GlobalSecondaryIndexInfo
import software.amazon.awssdk.services.dynamodb.model.LocalSecondaryIndexInfo
import software.amazon.awssdk.services.dynamodb.model.SSEDescription
import software.amazon.awssdk.services.dynamodb.model.SourceTableFeatureDetails
import software.amazon.awssdk.services.dynamodb.model.StreamSpecification
import software.amazon.awssdk.services.dynamodb.model.TimeToLiveDescription

/**
  * Builds instances of type SourceTableFeatureDetails:
  * Contains the details of the features enabled on the table when the backup was created. For example, LSIs, GSIs,
  *  streams, TTL.
  */
@DynamodbDSL
class SourceTableFeatureDetailsDSL {
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder = SourceTableFeatureDetails.builder()
  internal fun build(): SourceTableFeatureDetails = builder.build()
    
  /**
    * Represents the GSI properties for the table when the backup was created. It includes the IndexName,
    *  KeySchema, Projection, and ProvisionedThroughput for the GSIs on the table at the time of backup.
    */
  var globalSecondaryIndexes: Collection<GlobalSecondaryIndexInfo>?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.globalSecondaryIndexes(value)
    }


  /**
    * Represents the LSI properties for the table when the backup was created. It includes the IndexName, KeySchema
    *  and Projection for the LSIs on the table at the time of backup.
    */
  var localSecondaryIndexes: Collection<LocalSecondaryIndexInfo>?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.localSecondaryIndexes(value)
    }


  /**
    * The description of the server-side encryption status on the table when the backup was created.
    */
  var sseDescription: SSEDescription?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.sseDescription(value)
    }


  /**
    * Stream settings on the table when the backup was created.
    */
  var streamDescription: StreamSpecification?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.streamDescription(value)
    }


  /**
    * Time to Live settings on the table when the backup was created.
    */
  var timeToLiveDescription: TimeToLiveDescription?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.timeToLiveDescription(value)
    }

  
    
  /**
    * Represents the GSI properties for the table when the backup was created. It includes the IndexName,
    *  KeySchema, Projection, and ProvisionedThroughput for the GSIs on the table at the time of backup.
    */
  fun globalSecondaryIndexes(dslBlock: GlobalSecondaryIndexInfoCollectionDSL.() -> Unit) {
    builder.globalSecondaryIndexes(buildGlobalSecondaryIndexInfoCollection(dslBlock))
  }


  /**
    * Represents the LSI properties for the table when the backup was created. It includes the IndexName, KeySchema
    *  and Projection for the LSIs on the table at the time of backup.
    */
  fun localSecondaryIndexes(dslBlock: LocalSecondaryIndexInfoCollectionDSL.() -> Unit) {
    builder.localSecondaryIndexes(buildLocalSecondaryIndexInfoCollection(dslBlock))
  }


  /**
    * The description of the server-side encryption status on the table when the backup was created.
    */
  fun sseDescription(dslBlock: SSEDescriptionDSL.() -> Unit) {
    builder.sseDescription(buildSSEDescription(dslBlock))
  }


  /**
    * Stream settings on the table when the backup was created.
    */
  fun streamDescription(dslBlock: StreamSpecificationDSL.() -> Unit) {
    builder.streamDescription(buildStreamSpecification(dslBlock))
  }


  /**
    * Time to Live settings on the table when the backup was created.
    */
  fun timeToLiveDescription(dslBlock: TimeToLiveDescriptionDSL.() -> Unit) {
    builder.timeToLiveDescription(buildTimeToLiveDescription(dslBlock))
  }

}

/**
  * Builds instances of type SourceTableFeatureDetails:
  * Contains the details of the features enabled on the table when the backup was created. For example, LSIs, GSIs,
  *  streams, TTL.
  */
fun buildSourceTableFeatureDetails(dslBlock: SourceTableFeatureDetailsDSL.() -> Unit) =
  SourceTableFeatureDetailsDSL().apply(dslBlock).build()