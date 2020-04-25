/*
  This file was generated from https://github.com/aws/aws-sdk-java-v2 by https://github.com/cylab/aws-kotlin-dsl-builder
  Like the original code, this file and project is licensed under
  Apache License Version 2.0
  See LICENSE.txt for more info
*/
package net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.streams

import kotlin.DeprecationLevel.HIDDEN
import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSL
import software.amazon.awssdk.services.dynamodb.streams.DynamoDbStreamsClient

/**
  * Builds instances of type DynamoDbStreamsClient:
  * Service client for accessing Amazon DynamoDB Streams. This can be created using the static {@link #builder()} method.
  * 
  *  Amazon DynamoDB
  * 
  *  Amazon DynamoDB Streams provides API actions for accessing streams and processing stream records. To learn more about
  *  application development with Streams, see Capturing Table Activity with
  *  DynamoDB Streams in the Amazon DynamoDB Developer Guide.
  */
@DynamodbDSL
class DynamoDbStreamsClientDSL {
  private val builder = DynamoDbStreamsClient.builder()
  internal fun build(): DynamoDbStreamsClient = builder.build()
  
  
  
}

/**
  * Builds instances of type DynamoDbStreamsClient:
  * Service client for accessing Amazon DynamoDB Streams. This can be created using the static {@link #builder()} method.
  * 
  *  Amazon DynamoDB
  * 
  *  Amazon DynamoDB Streams provides API actions for accessing streams and processing stream records. To learn more about
  *  application development with Streams, see Capturing Table Activity with
  *  DynamoDB Streams in the Amazon DynamoDB Developer Guide.
  */
fun buildDynamoDbStreamsClient(dslBlock: DynamoDbStreamsClientDSL.() -> Unit) =
  DynamoDbStreamsClientDSL().apply(dslBlock).build()