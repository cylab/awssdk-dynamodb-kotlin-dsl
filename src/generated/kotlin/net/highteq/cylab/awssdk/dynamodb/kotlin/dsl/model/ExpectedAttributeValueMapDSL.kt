/*
  This file was generated from https://github.com/aws/aws-sdk-java-v2 by https://github.com/cylab/aws-kotlin-dsl-builder
  Like the original code, this file and project is licensed under
  Apache License Version 2.0
  See LICENSE.txt for more info
*/
package net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.model

import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSL
import software.amazon.awssdk.services.dynamodb.model.ExpectedAttributeValue

/**
  * Builds instances of type ExpectedAttributeValue:
  * Represents a condition to be compared with an attribute value. This condition can be used with
  *  DeleteItem, PutItem, or UpdateItem operations; if the comparison evaluates to
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
@DynamodbDSL
class ExpectedAttributeValueMapDSL {
  private val map = mutableMapOf<String, ExpectedAttributeValue>()
  internal fun build() : Map<String, ExpectedAttributeValue> = map

  /**
    * Builds an object of type ExpectedAttributeValue from 
    * the given DSL in 'dslBlock' and adds it to the map at ['key']
    */
  fun o(key: String, dslBlock: ExpectedAttributeValueDSL.() -> Unit) {
    map[key] = ExpectedAttributeValueDSL().apply(dslBlock).build()
  }

  /**
    * Adds a pair of String -> ExpectedAttributeValue to the map
    */
  operator fun Pair<String, ExpectedAttributeValue>.unaryPlus() {
    map[this.first] = this.second
  }

  /**
    * Adds all given Pair<String, ExpectedAttributeValue> instances to the map
    */
  operator fun Collection<Pair<String, ExpectedAttributeValue>>.unaryPlus() {
    this.forEach { map[it.first] = it.second }
  }

  /**
    * Adds all given Pair<String, ExpectedAttributeValue> instances to the map
    */
  operator fun Array<Pair<String, ExpectedAttributeValue>>.unaryPlus() {
    this.forEach { map[it.first] = it.second }
  }

  /**
    * Adds all entries in the given map
    */
  operator fun Map<String, ExpectedAttributeValue>.unaryPlus() {
    map.putAll(this)
  }
}

/**
  * Builds instances of type ExpectedAttributeValue:
  * Represents a condition to be compared with an attribute value. This condition can be used with
  *  DeleteItem, PutItem, or UpdateItem operations; if the comparison evaluates to
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
fun buildExpectedAttributeValueMap(dslBlock: ExpectedAttributeValueMapDSL.() -> Unit) =
  ExpectedAttributeValueMapDSL().apply(dslBlock).build()