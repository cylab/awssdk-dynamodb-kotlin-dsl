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
import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSLMarker
import software.amazon.awssdk.services.dynamodb.model.AttributeValue
import software.amazon.awssdk.services.dynamodb.model.ComparisonOperator
import software.amazon.awssdk.services.dynamodb.model.ExpectedAttributeValue

/**
  * Builds instances of type ExpectedAttributeValue:
  * Represents a condition to be compared with an attribute value. This condition can be used with
  *  DeleteItem, PutItem or UpdateItem operations; if the comparison evaluates to
  *  true, the operation succeeds; if not, the operation fails. You can use ExpectedAttributeValue in one of
  *  two different ways:
  * 
  *  Use AttributeValueList to specify one or more values to compare against an attribute. Use
  *  ComparisonOperator to specify how you want to perform the comparison. If the comparison evaluates to
  *  true, then the conditional operation succeeds.
  * 
  *  Use Value to specify a value that DynamoDB will compare against an attribute. If the values match, then
  *  ExpectedAttributeValue evaluates to true and the conditional operation succeeds. Optionally, you can
  *  also set Exists to false, indicating that you do not expect to find the attribute value in the
  *  table. In this case, the conditional operation succeeds only if the comparison evaluates to false.
  * 
  *  Value and Exists are incompatible with AttributeValueList and
  *  ComparisonOperator. Note that if you use both sets of parameters at once, DynamoDB will return a
  *  ValidationException exception.
  */
@DynamodbDSLMarker
inline class ExpectedAttributeValueDSL(
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder: ExpectedAttributeValue.Builder
){
  @PublishedApi
  internal fun build(): ExpectedAttributeValue = builder.build()

  /**
    * 
    */
  inline var attributeValueList: Collection<AttributeValue>?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.attributeValueList(value)
    }

  /**
    * 
    */
  inline var comparisonOperator: ComparisonOperator?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.comparisonOperator(value)
    }

  /**
    * 
    */
  inline var exists: Boolean?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.exists(value)
    }

  /**
    * 
    */
  inline var value: AttributeValue?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.value(value)
    }

  /**
    * 
    */
  inline fun comparisonOperator(value: String?) {
    builder.comparisonOperator(value)
  }

  /**
    * 
    */
  inline fun attributeValueList(dslBlock: AttributeValueCollectionDSL.() -> Unit) {
    builder.attributeValueList(DynamodbDSL.Companion.attributeValueCollection(dslBlock))
  }

  /**
    * 
    */
  inline fun value(dslBlock: AttributeValueDSL.() -> Unit) {
    builder.value(DynamodbDSL.Companion.attributeValue(dslBlock))
  }

}

/**
  * Builds instances of type ExpectedAttributeValue:
  * Represents a condition to be compared with an attribute value. This condition can be used with
  *  DeleteItem, PutItem or UpdateItem operations; if the comparison evaluates to
  *  true, the operation succeeds; if not, the operation fails. You can use ExpectedAttributeValue in one of
  *  two different ways:
  * 
  *  Use AttributeValueList to specify one or more values to compare against an attribute. Use
  *  ComparisonOperator to specify how you want to perform the comparison. If the comparison evaluates to
  *  true, then the conditional operation succeeds.
  * 
  *  Use Value to specify a value that DynamoDB will compare against an attribute. If the values match, then
  *  ExpectedAttributeValue evaluates to true and the conditional operation succeeds. Optionally, you can
  *  also set Exists to false, indicating that you do not expect to find the attribute value in the
  *  table. In this case, the conditional operation succeeds only if the comparison evaluates to false.
  * 
  *  Value and Exists are incompatible with AttributeValueList and
  *  ComparisonOperator. Note that if you use both sets of parameters at once, DynamoDB will return a
  *  ValidationException exception.
  */
inline fun expectedAttributeValue(dslBlock: ExpectedAttributeValueDSL.() -> Unit) =
  ExpectedAttributeValueDSL(ExpectedAttributeValue.builder()).apply(dslBlock).build()

/**
  * Builds instances of type ExpectedAttributeValue:
  * Represents a condition to be compared with an attribute value. This condition can be used with
  *  DeleteItem, PutItem or UpdateItem operations; if the comparison evaluates to
  *  true, the operation succeeds; if not, the operation fails. You can use ExpectedAttributeValue in one of
  *  two different ways:
  * 
  *  Use AttributeValueList to specify one or more values to compare against an attribute. Use
  *  ComparisonOperator to specify how you want to perform the comparison. If the comparison evaluates to
  *  true, then the conditional operation succeeds.
  * 
  *  Use Value to specify a value that DynamoDB will compare against an attribute. If the values match, then
  *  ExpectedAttributeValue evaluates to true and the conditional operation succeeds. Optionally, you can
  *  also set Exists to false, indicating that you do not expect to find the attribute value in the
  *  table. In this case, the conditional operation succeeds only if the comparison evaluates to false.
  * 
  *  Value and Exists are incompatible with AttributeValueList and
  *  ComparisonOperator. Note that if you use both sets of parameters at once, DynamoDB will return a
  *  ValidationException exception.
  */
inline fun DynamodbDSL.Companion.expectedAttributeValue(dslBlock: ExpectedAttributeValueDSL.() -> Unit) =
  ExpectedAttributeValueDSL(ExpectedAttributeValue.builder()).apply(dslBlock).build()