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
import software.amazon.awssdk.services.dynamodb.model.AttributeDefinition
import software.amazon.awssdk.services.dynamodb.model.BillingModeSummary
import software.amazon.awssdk.services.dynamodb.model.GlobalSecondaryIndexDescription
import software.amazon.awssdk.services.dynamodb.model.KeySchemaElement
import software.amazon.awssdk.services.dynamodb.model.LocalSecondaryIndexDescription
import software.amazon.awssdk.services.dynamodb.model.ProvisionedThroughputDescription
import software.amazon.awssdk.services.dynamodb.model.RestoreSummary
import software.amazon.awssdk.services.dynamodb.model.SSEDescription
import software.amazon.awssdk.services.dynamodb.model.StreamSpecification
import software.amazon.awssdk.services.dynamodb.model.TableDescription
import software.amazon.awssdk.services.dynamodb.model.TableStatus

/**
  * Builds instances of type TableDescription:
  * Represents the properties of a table.
  */
@DynamodbDSL
inline class TableDescriptionDSL(
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder: TableDescription.Builder
){
  @PublishedApi
  internal fun build(): TableDescription = builder.build()

  /**
    * 
    */
  inline var attributeDefinitions: Collection<AttributeDefinition>?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.attributeDefinitions(value)
    }

  /**
    * 
    */
  inline var billingModeSummary: BillingModeSummary?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.billingModeSummary(value)
    }

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
  inline var globalSecondaryIndexes: Collection<GlobalSecondaryIndexDescription>?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.globalSecondaryIndexes(value)
    }

  /**
    * 
    */
  inline var itemCount: Long?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.itemCount(value)
    }

  /**
    * 
    */
  inline var keySchema: Collection<KeySchemaElement>?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.keySchema(value)
    }

  /**
    * 
    */
  inline var latestStreamArn: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.latestStreamArn(value)
    }

  /**
    * 
    */
  inline var latestStreamLabel: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.latestStreamLabel(value)
    }

  /**
    * 
    */
  inline var localSecondaryIndexes: Collection<LocalSecondaryIndexDescription>?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.localSecondaryIndexes(value)
    }

  /**
    * 
    */
  inline var provisionedThroughput: ProvisionedThroughputDescription?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.provisionedThroughput(value)
    }

  /**
    * 
    */
  inline var restoreSummary: RestoreSummary?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.restoreSummary(value)
    }

  /**
    * 
    */
  inline var sseDescription: SSEDescription?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.sseDescription(value)
    }

  /**
    * 
    */
  inline var streamSpecification: StreamSpecification?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.streamSpecification(value)
    }

  /**
    * 
    */
  inline var tableArn: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.tableArn(value)
    }

  /**
    * 
    */
  inline var tableId: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.tableId(value)
    }

  /**
    * 
    */
  inline var tableName: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.tableName(value)
    }

  /**
    * 
    */
  inline var tableSizeBytes: Long?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.tableSizeBytes(value)
    }

  /**
    * 
    */
  inline var tableStatus: TableStatus?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.tableStatus(value)
    }

  /**
    * 
    */
  inline fun tableStatus(value: String?) {
    builder.tableStatus(value)
  }

  /**
    * 
    */
  inline fun attributeDefinitions(dslBlock: AttributeDefinitionCollectionDSL.() -> Unit) {
    builder.attributeDefinitions(buildAttributeDefinitionCollection(dslBlock))
  }

  /**
    * 
    */
  inline fun billingModeSummary(dslBlock: BillingModeSummaryDSL.() -> Unit) {
    builder.billingModeSummary(buildBillingModeSummary(dslBlock))
  }

  /**
    * 
    */
  inline fun globalSecondaryIndexes(dslBlock: GlobalSecondaryIndexDescriptionCollectionDSL.() -> Unit) {
    builder.globalSecondaryIndexes(buildGlobalSecondaryIndexDescriptionCollection(dslBlock))
  }

  /**
    * 
    */
  inline fun keySchema(dslBlock: KeySchemaElementCollectionDSL.() -> Unit) {
    builder.keySchema(buildKeySchemaElementCollection(dslBlock))
  }

  /**
    * 
    */
  inline fun localSecondaryIndexes(dslBlock: LocalSecondaryIndexDescriptionCollectionDSL.() -> Unit) {
    builder.localSecondaryIndexes(buildLocalSecondaryIndexDescriptionCollection(dslBlock))
  }

  /**
    * 
    */
  inline fun provisionedThroughput(dslBlock: ProvisionedThroughputDescriptionDSL.() -> Unit) {
    builder.provisionedThroughput(buildProvisionedThroughputDescription(dslBlock))
  }

  /**
    * 
    */
  inline fun restoreSummary(dslBlock: RestoreSummaryDSL.() -> Unit) {
    builder.restoreSummary(buildRestoreSummary(dslBlock))
  }

  /**
    * 
    */
  inline fun sseDescription(dslBlock: SSEDescriptionDSL.() -> Unit) {
    builder.sseDescription(buildSSEDescription(dslBlock))
  }

  /**
    * 
    */
  inline fun streamSpecification(dslBlock: StreamSpecificationDSL.() -> Unit) {
    builder.streamSpecification(buildStreamSpecification(dslBlock))
  }

}

/**
  * Builds instances of type TableDescription:
  * Represents the properties of a table.
  */
inline fun buildTableDescription(dslBlock: TableDescriptionDSL.() -> Unit) =
  TableDescriptionDSL(TableDescription.builder()).apply(dslBlock).build()