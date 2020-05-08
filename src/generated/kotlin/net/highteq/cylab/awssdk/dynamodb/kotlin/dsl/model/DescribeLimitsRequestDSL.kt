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
import software.amazon.awssdk.awscore.AwsRequestOverrideConfiguration
import software.amazon.awssdk.services.dynamodb.DynamoDbAsyncClient
import software.amazon.awssdk.services.dynamodb.DynamoDbClient
import software.amazon.awssdk.services.dynamodb.model.DescribeLimitsRequest
import software.amazon.awssdk.services.dynamodb.transform.DescribeLimitsRequestMarshaller

/**
  * Builds instances of type DescribeLimitsRequest:
  * Represents the input of a DescribeLimits operation. Has no content.
  */
@DynamodbDSL
inline class DescribeLimitsRequestDSL(
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder: DescribeLimitsRequest.Builder
){
  @PublishedApi
  internal fun build(): DescribeLimitsRequest = builder.build()

  /**
    * 
    */
  inline var overrideConfiguration: AwsRequestOverrideConfiguration?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.overrideConfiguration(value)
    }

}

/**
  * Builds instances of type DescribeLimitsRequest:
  * Represents the input of a DescribeLimits operation. Has no content.
  */
inline fun buildDescribeLimitsRequest(dslBlock: DescribeLimitsRequestDSL.() -> Unit) =
  DescribeLimitsRequestDSL(DescribeLimitsRequest.builder()).apply(dslBlock).build()

/**
  * 
  */
inline fun DescribeLimitsRequestMarshaller.marshallBy(dslBlock: DescribeLimitsRequestDSL.() -> Unit) =
  this.marshall(buildDescribeLimitsRequest(dslBlock))

/**
  * Returns the current provisioned-capacity limits for your AWS account in a region, both for the region as a whole
  *  and for any one DynamoDB table that you create there.
  * 
  *  When you establish an AWS account, the account has initial limits on the maximum read capacity units and write
  *  capacity units that you can provision across all of your DynamoDB tables in a given region. Also, there are
  *  per-table limits that apply when you create a table there. For more information, see Limits page in the
  *  Amazon DynamoDB Developer Guide.
  * 
  *  Although you can increase these limits by filing a case at AWS Support Center, obtaining the increase is not
  *  instantaneous. The DescribeLimits action lets you write code to compare the capacity you are
  *  currently using to those limits imposed by your account so that you have enough time to apply for an increase
  *  before you hit a limit.
  * 
  *  For example, you could use one of the AWS SDKs to do the following:
  * 
  *  Call DescribeLimits for a particular region to obtain your current account limits on provisioned
  *  capacity there.
  * 
  *  Create a variable to hold the aggregate read capacity units provisioned for all your tables in that region, and
  *  one to hold the aggregate write capacity units. Zero them both.
  * 
  *  Call ListTables to obtain a list of all your DynamoDB tables.
  * 
  *  For each table name listed by ListTables, do the following:
  * 
  *  Call DescribeTable with the table name.
  * 
  *  Use the data returned by DescribeTable to add the read capacity units and write capacity units
  *  provisioned for the table itself to your variables.
  * 
  *  If the table has one or more global secondary indexes (GSIs), loop over these GSIs and add their provisioned
  *  capacity values to your variables as well.
  * 
  *  Report the account limits for that region returned by DescribeLimits, along with the total current
  *  provisioned capacity levels you have calculated.
  * 
  *  This will let you see whether you are getting close to your account-level limits.
  * 
  *  The per-table limits apply only when you are creating a new table. They restrict the sum of the provisioned
  *  capacity of the new table itself and all its global secondary indexes.
  * 
  *  For existing tables and their GSIs, DynamoDB will not let you increase provisioned capacity extremely rapidly,
  *  but the only upper limit that applies is that the aggregate provisioned capacity over all your tables and GSIs
  *  cannot exceed either of the per-account limits.
  * 
  *  DescribeLimits should only be called periodically. You can expect throttling errors if you call it
  *  more than once in a minute.
  * 
  *  The DescribeLimits Request element has no content.
  */
inline fun DynamoDbAsyncClient.describeLimitsBy(dslBlock: DescribeLimitsRequestDSL.() -> Unit) =
  this.describeLimits(buildDescribeLimitsRequest(dslBlock))

/**
  * Returns the current provisioned-capacity limits for your AWS account in a region, both for the region as a whole
  *  and for any one DynamoDB table that you create there.
  * 
  *  When you establish an AWS account, the account has initial limits on the maximum read capacity units and write
  *  capacity units that you can provision across all of your DynamoDB tables in a given region. Also, there are
  *  per-table limits that apply when you create a table there. For more information, see Limits page in the
  *  Amazon DynamoDB Developer Guide.
  * 
  *  Although you can increase these limits by filing a case at AWS Support Center, obtaining the increase is not
  *  instantaneous. The DescribeLimits action lets you write code to compare the capacity you are
  *  currently using to those limits imposed by your account so that you have enough time to apply for an increase
  *  before you hit a limit.
  * 
  *  For example, you could use one of the AWS SDKs to do the following:
  * 
  *  Call DescribeLimits for a particular region to obtain your current account limits on provisioned
  *  capacity there.
  * 
  *  Create a variable to hold the aggregate read capacity units provisioned for all your tables in that region, and
  *  one to hold the aggregate write capacity units. Zero them both.
  * 
  *  Call ListTables to obtain a list of all your DynamoDB tables.
  * 
  *  For each table name listed by ListTables, do the following:
  * 
  *  Call DescribeTable with the table name.
  * 
  *  Use the data returned by DescribeTable to add the read capacity units and write capacity units
  *  provisioned for the table itself to your variables.
  * 
  *  If the table has one or more global secondary indexes (GSIs), loop over these GSIs and add their provisioned
  *  capacity values to your variables as well.
  * 
  *  Report the account limits for that region returned by DescribeLimits, along with the total current
  *  provisioned capacity levels you have calculated.
  * 
  *  This will let you see whether you are getting close to your account-level limits.
  * 
  *  The per-table limits apply only when you are creating a new table. They restrict the sum of the provisioned
  *  capacity of the new table itself and all its global secondary indexes.
  * 
  *  For existing tables and their GSIs, DynamoDB will not let you increase provisioned capacity extremely rapidly,
  *  but the only upper limit that applies is that the aggregate provisioned capacity over all your tables and GSIs
  *  cannot exceed either of the per-account limits.
  * 
  *  DescribeLimits should only be called periodically. You can expect throttling errors if you call it
  *  more than once in a minute.
  * 
  *  The DescribeLimits Request element has no content.
  */
inline fun DynamoDbClient.describeLimitsBy(dslBlock: DescribeLimitsRequestDSL.() -> Unit) =
  this.describeLimits(buildDescribeLimitsRequest(dslBlock))