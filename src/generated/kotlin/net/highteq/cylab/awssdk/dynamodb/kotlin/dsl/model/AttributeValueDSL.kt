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
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder = AttributeValue.builder()
  internal fun build(): AttributeValue = builder.build()
    
  /**
    * 
    */
  var b: SdkBytes?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.b(value)
    }


  /**
    * An attribute of type Boolean. For example:
    * 
    *  "BOOL": true
    */
  var bool: Boolean?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.bool(value)
    }


  /**
    * 
    */
  var bs: Collection<SdkBytes>?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.bs(value)
    }


  /**
    * An attribute of type List. For example:
    * 
    *  "L": [ {"S": "Cookies"} , {"S": "Coffee"}, {"N", "3.14159"}]
    */
  var l: Collection<AttributeValue>?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.l(value)
    }


  /**
    * An attribute of type Map. For example:
    * 
    *  "M": {"Name": {"S": "Joe"}, "Age": {"N": "35"}}
    */
  var m: Map<String, AttributeValue>?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.m(value)
    }


  /**
    * An attribute of type Number. For example:
    * 
    *  "N": "123.45"
    * 
    *  Numbers are sent across the network to DynamoDB as strings, to maximize compatibility across languages and
    *  libraries. However, DynamoDB treats them as number type attributes for mathematical operations.
    */
  var n: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.n(value)
    }


  /**
    * An attribute of type Number Set. For example:
    * 
    *  "NS": ["42.2", "-19", "7.5", "3.14"]
    * 
    *  Numbers are sent across the network to DynamoDB as strings, to maximize compatibility across languages and
    *  libraries. However, DynamoDB treats them as number type attributes for mathematical operations.
    */
  var ns: Collection<String>?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.ns(value)
    }


  /**
    * An attribute of type Null. For example:
    * 
    *  "NULL": true
    */
  var nul: Boolean?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.nul(value)
    }


  /**
    * An attribute of type String. For example:
    * 
    *  "S": "Hello"
    */
  var s: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.s(value)
    }


  /**
    * An attribute of type String Set. For example:
    * 
    *  "SS": ["Giraffe", "Hippo" ,"Zebra"]
    */
  var ss: Collection<String>?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.ss(value)
    }

  
  
    
  /**
    * An attribute of type List. For example:
    * 
    *  "L": [ {"S": "Cookies"} , {"S": "Coffee"}, {"N", "3.14159"}]
    */
  fun l(dslBlock: AttributeValueCollectionDSL.() -> Unit) {
    builder.l(buildAttributeValueCollection(dslBlock))
  }


  /**
    * An attribute of type Map. For example:
    * 
    *  "M": {"Name": {"S": "Joe"}, "Age": {"N": "35"}}
    */
  fun m(dslBlock: AttributeValueMapDSL.() -> Unit) {
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
fun buildAttributeValue(dslBlock: AttributeValueDSL.() -> Unit) =
  AttributeValueDSL().apply(dslBlock).build()