/*
  This file was generated from https://github.com/aws/aws-sdk-java-v2 by https://github.com/cylab/aws-kotlin-dsl-builder
  Like the original code, this file and project is licensed under
  Apache License Version 2.0
  See LICENSE.txt for more info
*/
@file:Suppress("DEPRECATION")
package net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.streams

import kotlin.DeprecationLevel.HIDDEN
import kotlin.DeprecationLevel.WARNING
import java.net.URI
import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSL
import software.amazon.awssdk.auth.credentials.AwsCredentialsProvider
import software.amazon.awssdk.core.client.config.ClientOverrideConfiguration
import software.amazon.awssdk.http.SdkHttpClient
import software.amazon.awssdk.regions.Region
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
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  internal val builder = DynamoDbStreamsClient.builder()
  internal fun build(): DynamoDbStreamsClient = builder.build()
    
  /**
    * 
    */
  var overrideConfiguration: ClientOverrideConfiguration
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.overrideConfiguration(value)
    }


  /**
    * 
    */
  var httpClient: SdkHttpClient
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.httpClient(value)
    }


  /**
    * 
    */
  var region: Region
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.region(value)
    }


  /**
    * 
    */
  var credentialsProvider: AwsCredentialsProvider
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.credentialsProvider(value)
    }


  /**
    * 
    */
  var endpointOverride: URI
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.endpointOverride(value)
    }

  
  
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