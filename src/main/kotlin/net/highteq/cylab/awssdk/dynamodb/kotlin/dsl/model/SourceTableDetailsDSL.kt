/*
  This file was generated from https://github.com/aws/aws-sdk-java-v2 by https://github.com/cylab/aws-kotlin-dsl-builder
  Like the original code, this file and project is licensed under
  Apache License Version 2.0
  See LICENSE.txt for more info
*/
package net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.model

import kotlin.DeprecationLevel.HIDDEN
import java.time.Instant
import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSL
import software.amazon.awssdk.services.dynamodb.model.BillingMode
import software.amazon.awssdk.services.dynamodb.model.KeySchemaElement
import software.amazon.awssdk.services.dynamodb.model.ProvisionedThroughput
import software.amazon.awssdk.services.dynamodb.model.SourceTableDetails

/**
  * Builds instances of type SourceTableDetails:
  * Contains the details of the table when the backup was created.
  */
@DynamodbDSL
class SourceTableDetailsDSL {
  private val builder = SourceTableDetails.builder()
  internal fun build(): SourceTableDetails = builder.build()
    
  /**
    * The name of the table for which the backup was created.
    */
  @get:JvmSynthetic // Hide from Java callers
  var tableName: String
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.tableName(value)
    }


  /**
    * Schema of the table.
    */
  @get:JvmSynthetic // Hide from Java callers
  var keySchema: Collection<KeySchemaElement>
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.keySchema(value)
    }


  /**
    * Read IOPs and Write IOPS on the table when the backup was created.
    */
  @get:JvmSynthetic // Hide from Java callers
  var provisionedThroughput: ProvisionedThroughput
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.provisionedThroughput(value)
    }


  /**
    * Size of the table in bytes. Note that this is an approximate value.
    */
  @get:JvmSynthetic // Hide from Java callers
  var tableSizeBytes: Long
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.tableSizeBytes(value)
    }


  /**
    * Number of items in the table. Note that this is an approximate value.
    */
  @get:JvmSynthetic // Hide from Java callers
  var itemCount: Long
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.itemCount(value)
    }


  /**
    * ARN of the table for which backup was created.
    */
  @get:JvmSynthetic // Hide from Java callers
  var tableArn: String
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.tableArn(value)
    }


  /**
    * Unique identifier for the table for which the backup was created.
    */
  @get:JvmSynthetic // Hide from Java callers
  var tableId: String
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.tableId(value)
    }


  /**
    * Controls how you are charged for read and write throughput and how you manage capacity. This setting can be
    *  changed later.
    * 
    *  PROVISIONED - Sets the read/write capacity mode to PROVISIONED. We recommend using
    *  PROVISIONED for predictable workloads.
    * 
    *  PAY_PER_REQUEST - Sets the read/write capacity mode to PAY_PER_REQUEST. We
    *  recommend using PAY_PER_REQUEST for unpredictable workloads.
    */
  @get:JvmSynthetic // Hide from Java callers
  var billingMode: BillingMode
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.billingMode(value)
    }


  /**
    * Time when the source table was created.
    */
  @get:JvmSynthetic // Hide from Java callers
  var tableCreationDateTime: Instant
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.tableCreationDateTime(value)
    }

    
  /**
    * Controls how you are charged for read and write throughput and how you manage capacity. This setting can be
    *  changed later.
    * 
    *  PROVISIONED - Sets the read/write capacity mode to PROVISIONED. We recommend using
    *  PROVISIONED for predictable workloads.
    * 
    *  PAY_PER_REQUEST - Sets the read/write capacity mode to PAY_PER_REQUEST. We
    *  recommend using PAY_PER_REQUEST for unpredictable workloads.
    */
  fun billingMode(value: String) {
    builder.billingMode(value)
  }

    
  /**
    * Read IOPs and Write IOPS on the table when the backup was created.
    */
  fun provisionedThroughput(dslBlock: ProvisionedThroughputDSL.() -> Unit) {
    builder.provisionedThroughput(buildProvisionedThroughput(dslBlock))
  }


  /**
    * Schema of the table.
    */
  fun keySchema(dslBlock: KeySchemaElementCollectionDSL.() -> Unit) {
    builder.keySchema(buildKeySchemaElementCollection(dslBlock))
  }

}

/**
  * Builds instances of type SourceTableDetails:
  * Contains the details of the table when the backup was created.
  */
fun buildSourceTableDetails(dslBlock: SourceTableDetailsDSL.() -> Unit) =
  SourceTableDetailsDSL().apply(dslBlock).build()