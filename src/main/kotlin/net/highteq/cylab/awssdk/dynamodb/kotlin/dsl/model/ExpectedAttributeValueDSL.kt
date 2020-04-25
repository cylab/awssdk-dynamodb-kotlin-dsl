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
import software.amazon.awssdk.services.dynamodb.model.AttributeValue
import software.amazon.awssdk.services.dynamodb.model.ComparisonOperator
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
class ExpectedAttributeValueDSL {
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  internal val builder = ExpectedAttributeValue.builder()
  internal fun build(): ExpectedAttributeValue = builder.build()
    
  /**
    * Causes DynamoDB to evaluate the value before attempting a conditional operation:
    * 
    *  If Exists is true, DynamoDB will check to see if that attribute value already
    *  exists in the table. If it is found, then the operation succeeds. If it is not found, the operation fails
    *  with a ConditionCheckFailedException.
    * 
    *  If Exists is false, DynamoDB assumes that the attribute value does not exist in the
    *  table. If in fact the value does not exist, then the assumption is valid and the operation succeeds. If the
    *  value is found, despite the assumption that it does not exist, the operation fails with a
    *  ConditionCheckFailedException.
    * 
    *  The default setting for Exists is true. If you supply a Value all by
    *  itself, DynamoDB assumes the attribute exists: You don't have to set Exists to true
    *  , because it is implied.
    * 
    *  DynamoDB returns a ValidationException if:
    * 
    *  Exists is true but there is no Value to check. (You expect a value to
    *  exist, but don't specify what that value is.)
    * 
    *  Exists is false but you also provide a Value. (You cannot expect an
    *  attribute to have a value, while also expecting it not to exist.)
    */
  var exists: Boolean
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.exists(value)
    }


  /**
    * Represents the data for the expected attribute.
    * 
    *  Each attribute value is described as a name-value pair. The name is the data type, and the value is the data
    *  itself.
    * 
    *  For more information, see Data Types in the Amazon DynamoDB Developer Guide.
    */
  var value: AttributeValue
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.value(value)
    }


  /**
    * A comparator for evaluating attributes in the AttributeValueList. For example, equals, greater
    *  than, less than, etc.
    * 
    *  The following comparison operators are available:
    * 
    *  EQ | NE | LE | LT | GE | GT | NOT_NULL | NULL | CONTAINS | NOT_CONTAINS | BEGINS_WITH | IN | BETWEEN
    * 
    *  The following are descriptions of each comparison operator.
    * 
    *  EQ : Equal. EQ is supported for all data types, including lists and maps.
    * 
    *  AttributeValueList can contain only one AttributeValue element of type String,
    *  Number, Binary, String Set, Number Set, or Binary Set. If an item contains an AttributeValue
    *  element of a different type than the one provided in the request, the value does not match. For example,
    *  {"S":"6"} does not equal {"N":"6"}. Also, {"N":"6"} does not equal
    *  {"NS":["6", "2", "1"]}.
    * 
    *  NE : Not equal. NE is supported for all data types, including lists and maps.
    * 
    *  AttributeValueList can contain only one AttributeValue of type String, Number,
    *  Binary, String Set, Number Set, or Binary Set. If an item contains an AttributeValue of a
    *  different type than the one provided in the request, the value does not match. For example,
    *  {"S":"6"} does not equal {"N":"6"}. Also, {"N":"6"} does not equal
    *  {"NS":["6", "2", "1"]}.
    * 
    *  LE : Less than or equal.
    * 
    *  AttributeValueList can contain only one AttributeValue element of type String,
    *  Number, or Binary (not a set type). If an item contains an AttributeValue element of a different
    *  type than the one provided in the request, the value does not match. For example, {"S":"6"} does
    *  not equal {"N":"6"}. Also, {"N":"6"} does not compare to
    *  {"NS":["6", "2", "1"]}.
    * 
    *  LT : Less than.
    * 
    *  AttributeValueList can contain only one AttributeValue of type String, Number, or
    *  Binary (not a set type). If an item contains an AttributeValue element of a different type than
    *  the one provided in the request, the value does not match. For example, {"S":"6"} does not equal
    *  {"N":"6"}. Also, {"N":"6"} does not compare to {"NS":["6", "2", "1"]}.
    * 
    *  GE : Greater than or equal.
    * 
    *  AttributeValueList can contain only one AttributeValue element of type String,
    *  Number, or Binary (not a set type). If an item contains an AttributeValue element of a different
    *  type than the one provided in the request, the value does not match. For example, {"S":"6"} does
    *  not equal {"N":"6"}. Also, {"N":"6"} does not compare to
    *  {"NS":["6", "2", "1"]}.
    * 
    *  GT : Greater than.
    * 
    *  AttributeValueList can contain only one AttributeValue element of type String,
    *  Number, or Binary (not a set type). If an item contains an AttributeValue element of a different
    *  type than the one provided in the request, the value does not match. For example, {"S":"6"} does
    *  not equal {"N":"6"}. Also, {"N":"6"} does not compare to
    *  {"NS":["6", "2", "1"]}.
    * 
    *  NOT_NULL : The attribute exists. NOT_NULL is supported for all data types,
    *  including lists and maps.
    * 
    *  This operator tests for the existence of an attribute, not its data type. If the data type of attribute "
    *  a" is null, and you evaluate it using NOT_NULL, the result is a Boolean
    *  true. This result is because the attribute "a" exists; its data type is not
    *  relevant to the NOT_NULL comparison operator.
    * 
    *  NULL : The attribute does not exist. NULL is supported for all data types,
    *  including lists and maps.
    * 
    *  This operator tests for the nonexistence of an attribute, not its data type. If the data type of attribute "
    *  a" is null, and you evaluate it using NULL, the result is a Boolean
    *  false. This is because the attribute "a" exists; its data type is not relevant to
    *  the NULL comparison operator.
    * 
    *  CONTAINS : Checks for a subsequence, or value in a set.
    * 
    *  AttributeValueList can contain only one AttributeValue element of type String,
    *  Number, or Binary (not a set type). If the target attribute of the comparison is of type String, then the
    *  operator checks for a substring match. If the target attribute of the comparison is of type Binary, then the
    *  operator looks for a subsequence of the target that matches the input. If the target attribute of the
    *  comparison is a set ("SS", "NS", or "BS"), then the operator evaluates
    *  to true if it finds an exact match with any member of the set.
    * 
    *  CONTAINS is supported for lists: When evaluating "a CONTAINS b", "a
    *  " can be a list; however, "b" cannot be a set, a map, or a list.
    * 
    *  NOT_CONTAINS : Checks for absence of a subsequence, or absence of a value in a set.
    * 
    *  AttributeValueList can contain only one AttributeValue element of type String,
    *  Number, or Binary (not a set type). If the target attribute of the comparison is a String, then the operator
    *  checks for the absence of a substring match. If the target attribute of the comparison is Binary, then the
    *  operator checks for the absence of a subsequence of the target that matches the input. If the target
    *  attribute of the comparison is a set ("SS", "NS", or "BS"), then the
    *  operator evaluates to true if it does not find an exact match with any member of the set.
    * 
    *  NOT_CONTAINS is supported for lists: When evaluating "a NOT CONTAINS b", "a
    *  " can be a list; however, "b" cannot be a set, a map, or a list.
    * 
    *  BEGINS_WITH : Checks for a prefix.
    * 
    *  AttributeValueList can contain only one AttributeValue of type String or Binary
    *  (not a Number or a set type). The target attribute of the comparison must be of type String or Binary (not a
    *  Number or a set type).
    * 
    *  IN : Checks for matching elements in a list.
    * 
    *  AttributeValueList can contain one or more AttributeValue elements of type String,
    *  Number, or Binary. These attributes are compared against an existing attribute of an item. If any elements of
    *  the input are equal to the item attribute, the expression evaluates to true.
    * 
    *  BETWEEN : Greater than or equal to the first value, and less than or equal to the second value.
    * 
    *  AttributeValueList must contain two AttributeValue elements of the same type,
    *  either String, Number, or Binary (not a set type). A target attribute matches if the target value is greater
    *  than, or equal to, the first element and less than, or equal to, the second element. If an item contains an
    *  AttributeValue element of a different type than the one provided in the request, the value does
    *  not match. For example, {"S":"6"} does not compare to {"N":"6"}. Also,
    *  {"N":"6"} does not compare to {"NS":["6", "2", "1"]}
    */
  var comparisonOperator: ComparisonOperator
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.comparisonOperator(value)
    }


  /**
    * One or more values to evaluate against the supplied attribute. The number of values in the list depends on
    *  the ComparisonOperator being used.
    * 
    *  For type Number, value comparisons are numeric.
    * 
    *  String value comparisons for greater than, equals, or less than are based on ASCII character code values. For
    *  example, a is greater than A, and a is greater than B.
    *  For a list of code values, see http://
    *  en.wikipedia.org/wiki/ASCII#ASCII_printable_characters.
    * 
    *  For Binary, DynamoDB treats each byte of the binary data as unsigned when it compares binary values.
    * 
    *  For information on specifying data types in JSON, see JSON Data Format
    *  in the Amazon DynamoDB Developer Guide.
    */
  var attributeValueList: Collection<AttributeValue>
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.attributeValueList(value)
    }

    
  /**
    * A comparator for evaluating attributes in the AttributeValueList. For example, equals, greater
    *  than, less than, etc.
    * 
    *  The following comparison operators are available:
    * 
    *  EQ | NE | LE | LT | GE | GT | NOT_NULL | NULL | CONTAINS | NOT_CONTAINS | BEGINS_WITH | IN | BETWEEN
    * 
    *  The following are descriptions of each comparison operator.
    * 
    *  EQ : Equal. EQ is supported for all data types, including lists and maps.
    * 
    *  AttributeValueList can contain only one AttributeValue element of type String,
    *  Number, Binary, String Set, Number Set, or Binary Set. If an item contains an AttributeValue
    *  element of a different type than the one provided in the request, the value does not match. For example,
    *  {"S":"6"} does not equal {"N":"6"}. Also, {"N":"6"} does not equal
    *  {"NS":["6", "2", "1"]}.
    * 
    *  NE : Not equal. NE is supported for all data types, including lists and maps.
    * 
    *  AttributeValueList can contain only one AttributeValue of type String, Number,
    *  Binary, String Set, Number Set, or Binary Set. If an item contains an AttributeValue of a
    *  different type than the one provided in the request, the value does not match. For example,
    *  {"S":"6"} does not equal {"N":"6"}. Also, {"N":"6"} does not equal
    *  {"NS":["6", "2", "1"]}.
    * 
    *  LE : Less than or equal.
    * 
    *  AttributeValueList can contain only one AttributeValue element of type String,
    *  Number, or Binary (not a set type). If an item contains an AttributeValue element of a different
    *  type than the one provided in the request, the value does not match. For example, {"S":"6"} does
    *  not equal {"N":"6"}. Also, {"N":"6"} does not compare to
    *  {"NS":["6", "2", "1"]}.
    * 
    *  LT : Less than.
    * 
    *  AttributeValueList can contain only one AttributeValue of type String, Number, or
    *  Binary (not a set type). If an item contains an AttributeValue element of a different type than
    *  the one provided in the request, the value does not match. For example, {"S":"6"} does not equal
    *  {"N":"6"}. Also, {"N":"6"} does not compare to {"NS":["6", "2", "1"]}.
    * 
    *  GE : Greater than or equal.
    * 
    *  AttributeValueList can contain only one AttributeValue element of type String,
    *  Number, or Binary (not a set type). If an item contains an AttributeValue element of a different
    *  type than the one provided in the request, the value does not match. For example, {"S":"6"} does
    *  not equal {"N":"6"}. Also, {"N":"6"} does not compare to
    *  {"NS":["6", "2", "1"]}.
    * 
    *  GT : Greater than.
    * 
    *  AttributeValueList can contain only one AttributeValue element of type String,
    *  Number, or Binary (not a set type). If an item contains an AttributeValue element of a different
    *  type than the one provided in the request, the value does not match. For example, {"S":"6"} does
    *  not equal {"N":"6"}. Also, {"N":"6"} does not compare to
    *  {"NS":["6", "2", "1"]}.
    * 
    *  NOT_NULL : The attribute exists. NOT_NULL is supported for all data types,
    *  including lists and maps.
    * 
    *  This operator tests for the existence of an attribute, not its data type. If the data type of attribute "
    *  a" is null, and you evaluate it using NOT_NULL, the result is a Boolean
    *  true. This result is because the attribute "a" exists; its data type is not
    *  relevant to the NOT_NULL comparison operator.
    * 
    *  NULL : The attribute does not exist. NULL is supported for all data types,
    *  including lists and maps.
    * 
    *  This operator tests for the nonexistence of an attribute, not its data type. If the data type of attribute "
    *  a" is null, and you evaluate it using NULL, the result is a Boolean
    *  false. This is because the attribute "a" exists; its data type is not relevant to
    *  the NULL comparison operator.
    * 
    *  CONTAINS : Checks for a subsequence, or value in a set.
    * 
    *  AttributeValueList can contain only one AttributeValue element of type String,
    *  Number, or Binary (not a set type). If the target attribute of the comparison is of type String, then the
    *  operator checks for a substring match. If the target attribute of the comparison is of type Binary, then the
    *  operator looks for a subsequence of the target that matches the input. If the target attribute of the
    *  comparison is a set ("SS", "NS", or "BS"), then the operator evaluates
    *  to true if it finds an exact match with any member of the set.
    * 
    *  CONTAINS is supported for lists: When evaluating "a CONTAINS b", "a
    *  " can be a list; however, "b" cannot be a set, a map, or a list.
    * 
    *  NOT_CONTAINS : Checks for absence of a subsequence, or absence of a value in a set.
    * 
    *  AttributeValueList can contain only one AttributeValue element of type String,
    *  Number, or Binary (not a set type). If the target attribute of the comparison is a String, then the operator
    *  checks for the absence of a substring match. If the target attribute of the comparison is Binary, then the
    *  operator checks for the absence of a subsequence of the target that matches the input. If the target
    *  attribute of the comparison is a set ("SS", "NS", or "BS"), then the
    *  operator evaluates to true if it does not find an exact match with any member of the set.
    * 
    *  NOT_CONTAINS is supported for lists: When evaluating "a NOT CONTAINS b", "a
    *  " can be a list; however, "b" cannot be a set, a map, or a list.
    * 
    *  BEGINS_WITH : Checks for a prefix.
    * 
    *  AttributeValueList can contain only one AttributeValue of type String or Binary
    *  (not a Number or a set type). The target attribute of the comparison must be of type String or Binary (not a
    *  Number or a set type).
    * 
    *  IN : Checks for matching elements in a list.
    * 
    *  AttributeValueList can contain one or more AttributeValue elements of type String,
    *  Number, or Binary. These attributes are compared against an existing attribute of an item. If any elements of
    *  the input are equal to the item attribute, the expression evaluates to true.
    * 
    *  BETWEEN : Greater than or equal to the first value, and less than or equal to the second value.
    * 
    *  AttributeValueList must contain two AttributeValue elements of the same type,
    *  either String, Number, or Binary (not a set type). A target attribute matches if the target value is greater
    *  than, or equal to, the first element and less than, or equal to, the second element. If an item contains an
    *  AttributeValue element of a different type than the one provided in the request, the value does
    *  not match. For example, {"S":"6"} does not compare to {"N":"6"}. Also,
    *  {"N":"6"} does not compare to {"NS":["6", "2", "1"]}
    */
  fun comparisonOperator(value: String) {
    builder.comparisonOperator(value)
  }

    
  /**
    * Represents the data for the expected attribute.
    * 
    *  Each attribute value is described as a name-value pair. The name is the data type, and the value is the data
    *  itself.
    * 
    *  For more information, see Data Types in the Amazon DynamoDB Developer Guide.
    */
  fun value(dslBlock: AttributeValueDSL.() -> Unit) {
    builder.value(buildAttributeValue(dslBlock))
  }


  /**
    * One or more values to evaluate against the supplied attribute. The number of values in the list depends on
    *  the ComparisonOperator being used.
    * 
    *  For type Number, value comparisons are numeric.
    * 
    *  String value comparisons for greater than, equals, or less than are based on ASCII character code values. For
    *  example, a is greater than A, and a is greater than B.
    *  For a list of code values, see http://
    *  en.wikipedia.org/wiki/ASCII#ASCII_printable_characters.
    * 
    *  For Binary, DynamoDB treats each byte of the binary data as unsigned when it compares binary values.
    * 
    *  For information on specifying data types in JSON, see JSON Data Format
    *  in the Amazon DynamoDB Developer Guide.
    */
  fun attributeValueList(dslBlock: AttributeValueCollectionDSL.() -> Unit) {
    builder.attributeValueList(buildAttributeValueCollection(dslBlock))
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
fun buildExpectedAttributeValue(dslBlock: ExpectedAttributeValueDSL.() -> Unit) =
  ExpectedAttributeValueDSL().apply(dslBlock).build()