/*
  This file was generated from https://github.com/aws/aws-sdk-java-v2 by https://github.com/cylab/aws-kotlin-dsl-builder
  Like the original code, this file and project is licensed under
  Apache License Version 2.0
  See LICENSE.txt for more info
*/
package net.highteq.cylab.awssdk.dynamodb.kotlin.dsl

import kotlin.DeprecationLevel.HIDDEN
import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSL
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
  private val builder = DynamoDbAsyncClient.builder()
  internal fun build(): DynamoDbAsyncClient = builder.build()
  
  
  
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