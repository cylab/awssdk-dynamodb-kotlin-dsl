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
import software.amazon.awssdk.core.SdkBytes
import software.amazon.awssdk.services.dynamodb.model.AttributeValue

/**
  * Builds instances of type AttributeValue:
  * Represents the data for an attribute.
  * 
  *  Each attribute value is described as a name-value pair. The name is the data type, and the value is the data itself.
  * 
  *  For more information, see Data Types in the Amazon DynamoDB Developer Guide.
  */
@DynamodbDSL
inline class AttributeValueDSL(
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder: AttributeValue.Builder
){
  @PublishedApi
  internal fun build(): AttributeValue = builder.build()

  /**
    * 
    */
  inline var b: SdkBytes?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.b(value)
    }

  /**
    * 
    */
  inline var bool: Boolean?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.bool(value)
    }

  /**
    * 
    */
  inline var bs: Collection<SdkBytes>?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.bs(value)
    }

  /**
    * 
    */
  inline var l: Collection<AttributeValue>?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.l(value)
    }

  /**
    * 
    */
  inline var m: Map<String, AttributeValue>?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.m(value)
    }

  /**
    * 
    */
  inline var n: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.n(value)
    }

  /**
    * 
    */
  inline var ns: Collection<String>?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.ns(value)
    }

  /**
    * 
    */
  inline var nul: Boolean?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.nul(value)
    }

  /**
    * 
    */
  inline var s: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.s(value)
    }

  /**
    * 
    */
  inline var ss: Collection<String>?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.ss(value)
    }

  /**
    * 
    */
  inline fun l(dslBlock: AttributeValueCollectionDSL.() -> Unit) {
    builder.l(buildAttributeValueCollection(dslBlock))
  }

  /**
    * 
    */
  inline fun m(dslBlock: AttributeValueMapDSL.() -> Unit) {
    builder.m(buildAttributeValueMap(dslBlock))
  }

}

/**
  * Builds instances of type AttributeValue:
  * Represents the data for an attribute.
  * 
  *  Each attribute value is described as a name-value pair. The name is the data type, and the value is the data itself.
  * 
  *  For more information, see Data Types in the Amazon DynamoDB Developer Guide.
  */
inline fun buildAttributeValue(dslBlock: AttributeValueDSL.() -> Unit) =
  AttributeValueDSL(AttributeValue.builder()).apply(dslBlock).build()