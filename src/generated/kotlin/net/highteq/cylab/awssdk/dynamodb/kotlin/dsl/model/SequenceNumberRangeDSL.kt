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
import software.amazon.awssdk.services.dynamodb.model.SequenceNumberRange

/**
  * Builds instances of type SequenceNumberRange:
  * The beginning and ending sequence numbers for the stream records contained within a shard.
  */
@DynamodbDSL
class SequenceNumberRangeDSL {
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder = SequenceNumberRange.builder()
  internal fun build(): SequenceNumberRange = builder.build()
    
  /**
    * The last sequence number.
    */
  var endingSequenceNumber: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.endingSequenceNumber(value)
    }


  /**
    * The first sequence number.
    */
  var startingSequenceNumber: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.startingSequenceNumber(value)
    }

  
  
  
}

/**
  * Builds instances of type SequenceNumberRange:
  * The beginning and ending sequence numbers for the stream records contained within a shard.
  */
fun buildSequenceNumberRange(dslBlock: SequenceNumberRangeDSL.() -> Unit) =
  SequenceNumberRangeDSL().apply(dslBlock).build()