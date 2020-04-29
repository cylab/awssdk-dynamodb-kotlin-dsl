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
import software.amazon.awssdk.services.dynamodb.model.ProvisionedThroughput

/**
  * Builds instances of type ProvisionedThroughput:
  * Represents the provisioned throughput settings for a specified table or index. The settings can be modified using the
  *  UpdateTable operation.
  * 
  *  For current minimum and maximum provisioned throughput values, see Limits in the Amazon
  *  DynamoDB Developer Guide.
  */
@DynamodbDSL
class ProvisionedThroughputDSL {
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder = ProvisionedThroughput.builder()
  internal fun build(): ProvisionedThroughput = builder.build()
    
  /**
    * The maximum number of strongly consistent reads consumed per second before DynamoDB returns a
    *  ThrottlingException. For more information, see Specifying Read and Write Requirements in the Amazon DynamoDB Developer Guide.
    * 
    *  If read/write capacity mode is PAY_PER_REQUEST the value is set to 0.
    */
  var readCapacityUnits: Long?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.readCapacityUnits(value)
    }


  /**
    * The maximum number of writes consumed per second before DynamoDB returns a ThrottlingException.
    *  For more information, see Specifying Read and Write Requirements in the Amazon DynamoDB Developer Guide.
    * 
    *  If read/write capacity mode is PAY_PER_REQUEST the value is set to 0.
    */
  var writeCapacityUnits: Long?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.writeCapacityUnits(value)
    }

  
  
  
}

/**
  * Builds instances of type ProvisionedThroughput:
  * Represents the provisioned throughput settings for a specified table or index. The settings can be modified using the
  *  UpdateTable operation.
  * 
  *  For current minimum and maximum provisioned throughput values, see Limits in the Amazon
  *  DynamoDB Developer Guide.
  */
fun buildProvisionedThroughput(dslBlock: ProvisionedThroughputDSL.() -> Unit) =
  ProvisionedThroughputDSL().apply(dslBlock).build()