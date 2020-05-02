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
import software.amazon.awssdk.services.dynamodb.model.AttributeValue
import software.amazon.awssdk.services.dynamodb.model.KeysAndAttributes

/**
  * Builds instances of type KeysAndAttributes:
  * Represents a set of primary keys and, for each key, the attributes to retrieve from the table.
  * 
  *  For each primary key, you must provide all of the key attributes. For example, with a simple primary key, you
  *  only need to provide the partition key. For a composite primary key, you must provide both the partition key
  *  and the sort key.
  */
@DynamodbDSL
inline class KeysAndAttributesDSL(
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder: KeysAndAttributes.Builder
){
  @PublishedApi
  internal fun build(): KeysAndAttributes = builder.build()

  /**
    * 
    */
  inline var attributesToGet: Collection<String>?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.attributesToGet(value)
    }

  /**
    * 
    */
  inline var consistentRead: Boolean?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.consistentRead(value)
    }

  /**
    * 
    */
  inline var expressionAttributeNames: Map<String, String>?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.expressionAttributeNames(value)
    }

  /**
    * 
    */
  inline var keys: Collection<Map<String, AttributeValue>>?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.keys(value)
    }

  /**
    * 
    */
  inline var projectionExpression: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.projectionExpression(value)
    }

}

/**
  * Builds instances of type KeysAndAttributes:
  * Represents a set of primary keys and, for each key, the attributes to retrieve from the table.
  * 
  *  For each primary key, you must provide all of the key attributes. For example, with a simple primary key, you
  *  only need to provide the partition key. For a composite primary key, you must provide both the partition key
  *  and the sort key.
  */
inline fun buildKeysAndAttributes(dslBlock: KeysAndAttributesDSL.() -> Unit) =
  KeysAndAttributesDSL(KeysAndAttributes.builder()).apply(dslBlock).build()