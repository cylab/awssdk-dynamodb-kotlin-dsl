/*
  This file was generated from https://github.com/aws/aws-sdk-java-v2 by https://github.com/cylab/aws-kotlin-dsl-builder
  Like the original code, this file and project is licensed under
  Apache License Version 2.0
  See LICENSE.txt for more info
*/
package net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.model

import kotlin.DeprecationLevel.HIDDEN
import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSL
import software.amazon.awssdk.services.dynamodb.model.AttributeAction
import software.amazon.awssdk.services.dynamodb.model.AttributeValue
import software.amazon.awssdk.services.dynamodb.model.AttributeValueUpdate

/**
  * Builds instances of type AttributeValueUpdate:
  * For the UpdateItem operation, represents the attributes to be modified, the action to perform on each,
  *  and the new value for each.
  * 
  *  You cannot use UpdateItem to update any primary key attributes. Instead, you will need to delete the
  *  item, and then use PutItem to create a new item with new attributes.
  * 
  *  Attribute values cannot be null; string and binary type attributes must have lengths greater than zero; and set type
  *  attributes must not be empty. Requests with empty values will be rejected with a ValidationException
  *  exception.
  */
@DynamodbDSL
class AttributeValueUpdateDSL {
  private val builder = AttributeValueUpdate.builder()
  internal fun build(): AttributeValueUpdate = builder.build()
    
  /**
    * Represents the data for an attribute.
    * 
    *  Each attribute value is described as a name-value pair. The name is the data type, and the value is the data
    *  itself.
    * 
    *  For more information, see Data Types in the Amazon DynamoDB Developer Guide.
    */
  @get:JvmSynthetic // Hide from Java callers
  var value: AttributeValue
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.value(value)
    }


  /**
    * Specifies how to perform the update. Valid values are PUT (default), DELETE, and
    *  ADD. The behavior depends on whether the specified primary key already exists in the table.
    * 
    *  If an item with the specified Key is found in the table:
    * 
    *  PUT - Adds the specified attribute to the item. If the attribute already exists, it is replaced
    *  by the new value.
    * 
    *  DELETE - If no value is specified, the attribute and its value are removed from the item. The
    *  data type of the specified value must match the existing value's data type.
    * 
    *  If a set of values is specified, then those values are subtracted from the old set. For example, if
    *  the attribute value was the set [a,b,c] and the DELETE action specified
    *  [a,c], then the final attribute value would be [b]. Specifying an empty set is an
    *  error.
    * 
    *  ADD - If the attribute does not already exist, then the attribute and its values are added to
    *  the item. If the attribute does exist, then the behavior of ADD depends on the data type of the
    *  attribute:
    * 
    *  If the existing attribute is a number, and if Value is also a number, then the
    *  Value is mathematically added to the existing attribute. If Value is a negative
    *  number, then it is subtracted from the existing attribute.
    * 
    *  If you use ADD to increment or decrement a number value for an item that doesn't exist before
    *  the update, DynamoDB uses 0 as the initial value.
    * 
    *  In addition, if you use ADD to update an existing item, and intend to increment or decrement an
    *  attribute value which does not yet exist, DynamoDB uses 0 as the initial value. For example,
    *  suppose that the item you want to update does not yet have an attribute named itemcount, but you
    *  decide to ADD the number 3 to this attribute anyway, even though it currently does
    *  not exist. DynamoDB will create the itemcount attribute, set its initial value to 0, and
    *  finally add 3 to it. The result will be a new itemcount attribute in the item, with a
    *  value of 3.
    * 
    *  If the existing data type is a set, and if the Value is also a set, then the Value
    *  is added to the existing set. (This is a set operation, not mathematical addition.) For example, if
    *  the attribute value was the set [1,2], and the ADD action specified
    *  [3], then the final attribute value would be [1,2,3]. An error occurs if an Add
    *  action is specified for a set attribute and the attribute type specified does not match the existing set
    *  type.
    * 
    *  Both sets must have the same primitive data type. For example, if the existing data type is a set of strings,
    *  the Value must also be a set of strings. The same holds true for number sets and binary sets.
    * 
    *  This action is only valid for an existing attribute whose data type is number or is a set. Do not use
    *  ADD for any other data types.
    * 
    *  If no item with the specified Key is found:
    * 
    *  PUT - DynamoDB creates a new item with the specified primary key, and then adds the attribute.
    * 
    *  DELETE - Nothing happens; there is no attribute to delete.
    * 
    *  ADD - DynamoDB creates an item with the supplied primary key and number (or set of numbers) for
    *  the attribute value. The only data types allowed are number and number set; no other data types can be
    *  specified.
    */
  @get:JvmSynthetic // Hide from Java callers
  var action: AttributeAction
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.action(value)
    }

    
  /**
    * Specifies how to perform the update. Valid values are PUT (default), DELETE, and
    *  ADD. The behavior depends on whether the specified primary key already exists in the table.
    * 
    *  If an item with the specified Key is found in the table:
    * 
    *  PUT - Adds the specified attribute to the item. If the attribute already exists, it is replaced
    *  by the new value.
    * 
    *  DELETE - If no value is specified, the attribute and its value are removed from the item. The
    *  data type of the specified value must match the existing value's data type.
    * 
    *  If a set of values is specified, then those values are subtracted from the old set. For example, if
    *  the attribute value was the set [a,b,c] and the DELETE action specified
    *  [a,c], then the final attribute value would be [b]. Specifying an empty set is an
    *  error.
    * 
    *  ADD - If the attribute does not already exist, then the attribute and its values are added to
    *  the item. If the attribute does exist, then the behavior of ADD depends on the data type of the
    *  attribute:
    * 
    *  If the existing attribute is a number, and if Value is also a number, then the
    *  Value is mathematically added to the existing attribute. If Value is a negative
    *  number, then it is subtracted from the existing attribute.
    * 
    *  If you use ADD to increment or decrement a number value for an item that doesn't exist before
    *  the update, DynamoDB uses 0 as the initial value.
    * 
    *  In addition, if you use ADD to update an existing item, and intend to increment or decrement an
    *  attribute value which does not yet exist, DynamoDB uses 0 as the initial value. For example,
    *  suppose that the item you want to update does not yet have an attribute named itemcount, but you
    *  decide to ADD the number 3 to this attribute anyway, even though it currently does
    *  not exist. DynamoDB will create the itemcount attribute, set its initial value to 0, and
    *  finally add 3 to it. The result will be a new itemcount attribute in the item, with a
    *  value of 3.
    * 
    *  If the existing data type is a set, and if the Value is also a set, then the Value
    *  is added to the existing set. (This is a set operation, not mathematical addition.) For example, if
    *  the attribute value was the set [1,2], and the ADD action specified
    *  [3], then the final attribute value would be [1,2,3]. An error occurs if an Add
    *  action is specified for a set attribute and the attribute type specified does not match the existing set
    *  type.
    * 
    *  Both sets must have the same primitive data type. For example, if the existing data type is a set of strings,
    *  the Value must also be a set of strings. The same holds true for number sets and binary sets.
    * 
    *  This action is only valid for an existing attribute whose data type is number or is a set. Do not use
    *  ADD for any other data types.
    * 
    *  If no item with the specified Key is found:
    * 
    *  PUT - DynamoDB creates a new item with the specified primary key, and then adds the attribute.
    * 
    *  DELETE - Nothing happens; there is no attribute to delete.
    * 
    *  ADD - DynamoDB creates an item with the supplied primary key and number (or set of numbers) for
    *  the attribute value. The only data types allowed are number and number set; no other data types can be
    *  specified.
    */
  fun action(value: String) {
    builder.action(value)
  }

    
  /**
    * Represents the data for an attribute.
    * 
    *  Each attribute value is described as a name-value pair. The name is the data type, and the value is the data
    *  itself.
    * 
    *  For more information, see Data Types in the Amazon DynamoDB Developer Guide.
    */
  fun value(dslBlock: AttributeValueDSL.() -> Unit) {
    builder.value(buildAttributeValue(dslBlock))
  }

}

/**
  * Builds instances of type AttributeValueUpdate:
  * For the UpdateItem operation, represents the attributes to be modified, the action to perform on each,
  *  and the new value for each.
  * 
  *  You cannot use UpdateItem to update any primary key attributes. Instead, you will need to delete the
  *  item, and then use PutItem to create a new item with new attributes.
  * 
  *  Attribute values cannot be null; string and binary type attributes must have lengths greater than zero; and set type
  *  attributes must not be empty. Requests with empty values will be rejected with a ValidationException
  *  exception.
  */
fun buildAttributeValueUpdate(dslBlock: AttributeValueUpdateDSL.() -> Unit) =
  AttributeValueUpdateDSL().apply(dslBlock).build()