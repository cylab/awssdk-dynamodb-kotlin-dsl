/*
  This file was generated from https://github.com/aws/aws-sdk-java-v2 by https://github.com/cylab/aws-kotlin-dsl-builder
  Like the original code, this file and project is licensed under
  Apache License Version 2.0
  See LICENSE.txt for more info
*/
package net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.model

import kotlin.DeprecationLevel.HIDDEN
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
class AttributeValueDSL {
  private val builder = AttributeValue.builder()
  internal fun build(): AttributeValue = builder.build()
    
  /**
    * An attribute of type String Set. For example:
    * 
    *  "SS": ["Giraffe", "Hippo" ,"Zebra"]
    */
  @get:JvmSynthetic // Hide from Java callers
  var ss: Collection<String>
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.ss(value)
    }


  /**
    * An attribute of type Number Set. For example:
    * 
    *  "NS": ["42.2", "-19", "7.5", "3.14"]
    * 
    *  Numbers are sent across the network to DynamoDB as strings, to maximize compatibility across languages and
    *  libraries. However, DynamoDB treats them as number type attributes for mathematical operations.
    */
  @get:JvmSynthetic // Hide from Java callers
  var ns: Collection<String>
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.ns(value)
    }


  /**
    * 
    */
  @get:JvmSynthetic // Hide from Java callers
  var bs: Collection<SdkBytes>
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.bs(value)
    }


  /**
    * An attribute of type Boolean. For example:
    * 
    *  "BOOL": true
    */
  @get:JvmSynthetic // Hide from Java callers
  var bool: Boolean
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.bool(value)
    }


  /**
    * An attribute of type Null. For example:
    * 
    *  "NULL": true
    */
  @get:JvmSynthetic // Hide from Java callers
  var nul: Boolean
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.nul(value)
    }


  /**
    * An attribute of type Number. For example:
    * 
    *  "N": "123.45"
    * 
    *  Numbers are sent across the network to DynamoDB as strings, to maximize compatibility across languages and
    *  libraries. However, DynamoDB treats them as number type attributes for mathematical operations.
    */
  @get:JvmSynthetic // Hide from Java callers
  var n: String
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.n(value)
    }


  /**
    * An attribute of type String. For example:
    * 
    *  "S": "Hello"
    */
  @get:JvmSynthetic // Hide from Java callers
  var s: String
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.s(value)
    }


  /**
    * An attribute of type List. For example:
    * 
    *  "L": [ {"S": "Cookies"} , {"S": "Coffee"}, {"N", "3.14159"}]
    */
  @get:JvmSynthetic // Hide from Java callers
  var l: Collection<AttributeValue>
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.l(value)
    }


  /**
    * 
    */
  @get:JvmSynthetic // Hide from Java callers
  var b: SdkBytes
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.b(value)
    }


  /**
    * An attribute of type Map. For example:
    * 
    *  "M": {"Name": {"S": "Joe"}, "Age": {"N": "35"}}
    */
  @get:JvmSynthetic // Hide from Java callers
  var m: Map<String, AttributeValue>
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.m(value)
    }

  
    
  /**
    * An attribute of type List. For example:
    * 
    *  "L": [ {"S": "Cookies"} , {"S": "Coffee"}, {"N", "3.14159"}]
    */
  fun l(dslBlock: AttributeValueCollectionDSL.() -> Unit) {
    builder.l(buildAttributeValueCollection(dslBlock))
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
fun buildAttributeValue(dslBlock: AttributeValueDSL.() -> Unit) =
  AttributeValueDSL().apply(dslBlock).build()