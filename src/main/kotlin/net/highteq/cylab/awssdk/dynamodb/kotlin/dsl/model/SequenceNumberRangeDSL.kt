/*
  This file was generated from https://github.com/aws/aws-sdk-java-v2 by https://github.com/cylab/aws-kotlin-dsl-builder
  Like the original code, this file and project is licensed under
  Apache License Version 2.0
  See LICENSE.txt for more info
*/
package net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.model

import kotlin.DeprecationLevel.HIDDEN
import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSL
import software.amazon.awssdk.services.dynamodb.model.SequenceNumberRange

/**
  * Builds instances of type SequenceNumberRange:
  * The beginning and ending sequence numbers for the stream records contained within a shard.
  */
@DynamodbDSL
class SequenceNumberRangeDSL {
  private val builder = SequenceNumberRange.builder()
  internal fun build(): SequenceNumberRange = builder.build()
    
  /**
    * The first sequence number.
    */
  @get:JvmSynthetic // Hide from Java callers
  var startingSequenceNumber: String
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.startingSequenceNumber(value)
    }


  /**
    * The last sequence number.
    */
  @get:JvmSynthetic // Hide from Java callers
  var endingSequenceNumber: String
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.endingSequenceNumber(value)
    }

  
  
}

/**
  * Builds instances of type SequenceNumberRange:
  * The beginning and ending sequence numbers for the stream records contained within a shard.
  */
fun buildSequenceNumberRange(dslBlock: SequenceNumberRangeDSL.() -> Unit) =
  SequenceNumberRangeDSL().apply(dslBlock).build()