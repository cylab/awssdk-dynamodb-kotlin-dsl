/*
  This file was generated from https://github.com/aws/aws-sdk-java-v2 by https://github.com/cylab/aws-kotlin-dsl-builder
  Like the original code, this file and project is licensed under
  Apache License Version 2.0
  See LICENSE.txt for more info
*/
@file:Suppress("DEPRECATION", "NOTHING_TO_INLINE")
package net.highteq.cylab.awssdk.dynamodb.kotlin.dsl

import kotlin.DeprecationLevel.HIDDEN
import kotlin.DeprecationLevel.WARNING
import java.net.URI
import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSL
import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSLMarker
import software.amazon.awssdk.auth.credentials.AwsCredentialsProvider
import software.amazon.awssdk.core.client.config.ClientAsyncConfiguration
import software.amazon.awssdk.core.client.config.ClientOverrideConfiguration
import software.amazon.awssdk.http.async.SdkAsyncHttpClient
import software.amazon.awssdk.regions.Region
import software.amazon.awssdk.services.dynamodb.DynamoDbAsyncClient
import software.amazon.awssdk.services.dynamodb.DynamoDbAsyncClientBuilder

/**
  * Builds instances of type DynamoDbAsyncClient:
  * Service client for accessing DynamoDB asynchronously. This can be created using the static {@link #builder()} method.
  * 
  *  Amazon DynamoDB
  * 
  *  Amazon DynamoDB is a fully managed NoSQL database service that provides fast and predictable performance with
  *  seamless scalability. DynamoDB lets you offload the administrative burdens of operating and scaling a distributed
  *  database, so that you don't have to worry about hardware provisioning, setup and configuration, replication, software
  *  patching, or cluster scaling.
  * 
  *  With DynamoDB, you can create database tables that can store and retrieve any amount of data, and serve any level of
  *  request traffic. You can scale up or scale down your tables' throughput capacity without downtime or performance
  *  degradation, and use the AWS Management Console to monitor resource utilization and performance metrics.
  * 
  *  DynamoDB automatically spreads the data and traffic for your tables over a sufficient number of servers to handle
  *  your throughput and storage requirements, while maintaining consistent and fast performance. All of your data is
  *  stored on solid state disks (SSDs) and automatically replicated across multiple Availability Zones in an AWS region,
  *  providing built-in high availability and data durability.
  */
@DynamodbDSLMarker
inline class DynamoDbAsyncClientDSL(
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder: DynamoDbAsyncClientBuilder
){
  @PublishedApi
  internal fun build(): DynamoDbAsyncClient = builder.build()

  /**
    * 
    */
  inline var asyncConfiguration: ClientAsyncConfiguration?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.asyncConfiguration(value)
    }

  /**
    * 
    */
  inline var credentialsProvider: AwsCredentialsProvider?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.credentialsProvider(value)
    }

  /**
    * 
    */
  inline var endpointOverride: URI?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.endpointOverride(value)
    }

  /**
    * 
    */
  inline var httpClient: SdkAsyncHttpClient?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.httpClient(value)
    }

  /**
    * 
    */
  inline var httpClientBuilder: SdkAsyncHttpClient.Builder<*>?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.httpClientBuilder(value)
    }

  /**
    * 
    */
  inline var overrideConfiguration: ClientOverrideConfiguration?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.overrideConfiguration(value)
    }

  /**
    * 
    */
  inline var region: Region?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.region(value)
    }

  /**
    * 
    */
  inline fun enableEndpointDiscovery() {
    builder.enableEndpointDiscovery()
  }

}

/**
  * Builds instances of type DynamoDbAsyncClient:
  * Service client for accessing DynamoDB asynchronously. This can be created using the static {@link #builder()} method.
  * 
  *  Amazon DynamoDB
  * 
  *  Amazon DynamoDB is a fully managed NoSQL database service that provides fast and predictable performance with
  *  seamless scalability. DynamoDB lets you offload the administrative burdens of operating and scaling a distributed
  *  database, so that you don't have to worry about hardware provisioning, setup and configuration, replication, software
  *  patching, or cluster scaling.
  * 
  *  With DynamoDB, you can create database tables that can store and retrieve any amount of data, and serve any level of
  *  request traffic. You can scale up or scale down your tables' throughput capacity without downtime or performance
  *  degradation, and use the AWS Management Console to monitor resource utilization and performance metrics.
  * 
  *  DynamoDB automatically spreads the data and traffic for your tables over a sufficient number of servers to handle
  *  your throughput and storage requirements, while maintaining consistent and fast performance. All of your data is
  *  stored on solid state disks (SSDs) and automatically replicated across multiple Availability Zones in an AWS region,
  *  providing built-in high availability and data durability.
  */
inline fun dynamoDbAsyncClient(dslBlock: DynamoDbAsyncClientDSL.() -> Unit) =
  DynamoDbAsyncClientDSL(DynamoDbAsyncClient.builder()).apply(dslBlock).build()

/**
  * Builds instances of type DynamoDbAsyncClient:
  * Service client for accessing DynamoDB asynchronously. This can be created using the static {@link #builder()} method.
  * 
  *  Amazon DynamoDB
  * 
  *  Amazon DynamoDB is a fully managed NoSQL database service that provides fast and predictable performance with
  *  seamless scalability. DynamoDB lets you offload the administrative burdens of operating and scaling a distributed
  *  database, so that you don't have to worry about hardware provisioning, setup and configuration, replication, software
  *  patching, or cluster scaling.
  * 
  *  With DynamoDB, you can create database tables that can store and retrieve any amount of data, and serve any level of
  *  request traffic. You can scale up or scale down your tables' throughput capacity without downtime or performance
  *  degradation, and use the AWS Management Console to monitor resource utilization and performance metrics.
  * 
  *  DynamoDB automatically spreads the data and traffic for your tables over a sufficient number of servers to handle
  *  your throughput and storage requirements, while maintaining consistent and fast performance. All of your data is
  *  stored on solid state disks (SSDs) and automatically replicated across multiple Availability Zones in an AWS region,
  *  providing built-in high availability and data durability.
  */
inline fun DynamodbDSL.Companion.dynamoDbAsyncClient(dslBlock: DynamoDbAsyncClientDSL.() -> Unit) =
  DynamoDbAsyncClientDSL(DynamoDbAsyncClient.builder()).apply(dslBlock).build()