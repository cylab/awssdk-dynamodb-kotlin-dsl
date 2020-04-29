/*
  This file was generated from https://github.com/aws/aws-sdk-java-v2 by https://github.com/cylab/aws-kotlin-dsl-builder
  Like the original code, this file and project is licensed under
  Apache License Version 2.0
  See LICENSE.txt for more info
*/
@file:Suppress("DEPRECATION")
package net.highteq.cylab.awssdk.dynamodb.kotlin.dsl

import kotlin.DeprecationLevel.HIDDEN
import kotlin.DeprecationLevel.WARNING
import java.net.URI
import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSL
import software.amazon.awssdk.auth.credentials.AwsCredentialsProvider
import software.amazon.awssdk.core.client.config.ClientAsyncConfiguration
import software.amazon.awssdk.core.client.config.ClientOverrideConfiguration
import software.amazon.awssdk.http.async.SdkAsyncHttpClient
import software.amazon.awssdk.http.async.SdkAsyncHttpClient.Builder
import software.amazon.awssdk.regions.Region
import software.amazon.awssdk.services.dynamodb.DynamoDbAsyncClient

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
@DynamodbDSL
class DynamoDbAsyncClientDSL {
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder = DynamoDbAsyncClient.builder()
  internal fun build(): DynamoDbAsyncClient = builder.build()
    
  /**
    * 
    */
  var asyncConfiguration: ClientAsyncConfiguration?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.asyncConfiguration(value)
    }


  /**
    * 
    */
  var credentialsProvider: AwsCredentialsProvider?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.credentialsProvider(value)
    }


  /**
    * 
    */
  var endpointOverride: URI?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.endpointOverride(value)
    }


  /**
    * 
    */
  var httpClient: SdkAsyncHttpClient?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.httpClient(value)
    }


  /**
    * 
    */
  var httpClientBuilder: Builder<*>?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.httpClientBuilder(value)
    }


  /**
    * 
    */
  var overrideConfiguration: ClientOverrideConfiguration?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.overrideConfiguration(value)
    }


  /**
    * 
    */
  var region: Region?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.region(value)
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
fun buildDynamoDbAsyncClient(dslBlock: DynamoDbAsyncClientDSL.() -> Unit) =
  DynamoDbAsyncClientDSL().apply(dslBlock).build()