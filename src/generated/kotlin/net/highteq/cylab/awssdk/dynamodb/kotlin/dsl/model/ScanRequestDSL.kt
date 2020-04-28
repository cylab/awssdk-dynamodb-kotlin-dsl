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
import software.amazon.awssdk.awscore.AwsRequestOverrideConfiguration
import software.amazon.awssdk.services.dynamodb.model.AttributeValue
import software.amazon.awssdk.services.dynamodb.model.Condition
import software.amazon.awssdk.services.dynamodb.model.ConditionalOperator
import software.amazon.awssdk.services.dynamodb.model.ReturnConsumedCapacity
import software.amazon.awssdk.services.dynamodb.model.ScanRequest
import software.amazon.awssdk.services.dynamodb.model.Select

/**
  * Builds instances of type ScanRequest:
  * Represents the input of a Scan operation.
  */
@DynamodbDSL
class ScanRequestDSL {
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder = ScanRequest.builder()
  internal fun build(): ScanRequest = builder.build()
    
  /**
    * This is a legacy parameter. Use ProjectionExpression instead. For more information, see AttributesToGet in the Amazon DynamoDB Developer Guide.
    */
  var attributesToGet: Collection<String>?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.attributesToGet(value)
    }


  /**
    * This is a legacy parameter. Use FilterExpression instead. For more information, see ConditionalOperator in the Amazon DynamoDB Developer Guide.
    */
  var conditionalOperator: ConditionalOperator?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.conditionalOperator(value)
    }


  /**
    * A Boolean value that determines the read consistency model during the scan:
    * 
    *  If ConsistentRead is false, then the data returned from Scan might not
    *  contain the results from other recently completed write operations (PutItem,
    *  UpdateItem, or DeleteItem).
    * 
    *  If ConsistentRead is true, then all of the write operations that completed before
    *  the Scan began are guaranteed to be contained in the Scan response.
    * 
    *  The default setting for ConsistentRead is false.
    * 
    *  The ConsistentRead parameter is not supported on global secondary indexes. If you scan a global
    *  secondary index with ConsistentRead set to true, you will receive a
    *  ValidationException.
    */
  var consistentRead: Boolean?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.consistentRead(value)
    }


  /**
    * The primary key of the first item that this operation will evaluate. Use the value that was returned for
    *  LastEvaluatedKey in the previous operation.
    * 
    *  The data type for ExclusiveStartKey must be String, Number or Binary. No set data types are
    *  allowed.
    * 
    *  In a parallel scan, a Scan request that includes ExclusiveStartKey must specify the
    *  same segment whose previous Scan returned the corresponding value of
    *  LastEvaluatedKey.
    */
  var exclusiveStartKey: Map<String, AttributeValue>?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.exclusiveStartKey(value)
    }


  /**
    * One or more substitution tokens for attribute names in an expression. The following are some use cases for
    *  using ExpressionAttributeNames:
    * 
    *  To access an attribute whose name conflicts with a DynamoDB reserved word.
    * 
    *  To create a placeholder for repeating occurrences of an attribute name in an expression.
    * 
    *  To prevent special characters in an attribute name from being misinterpreted in an expression.
    * 
    *  Use the # character in an expression to dereference an attribute name. For example, consider the
    *  following attribute name:
    * 
    *  Percentile
    * 
    *  The name of this attribute conflicts with a reserved word, so it cannot be used directly in an expression.
    *  (For the complete list of reserved words, see Reserved Words
    *  in the Amazon DynamoDB Developer Guide). To work around this, you could specify the following for
    *  ExpressionAttributeNames:
    * 
    *  {"#P":"Percentile"}
    * 
    *  You could then use this substitution in an expression, as in this example:
    * 
    *  #P = :val
    * 
    *  Tokens that begin with the : character are expression attribute values, which are placeholders
    *  for the actual value at runtime.
    * 
    *  For more information on expression attribute names, see Specifying Item Attributes in the Amazon DynamoDB Developer Guide.
    */
  var expressionAttributeNames: Map<String, String>?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.expressionAttributeNames(value)
    }


  /**
    * One or more values that can be substituted in an expression.
    * 
    *  Use the : (colon) character in an expression to dereference an attribute value. For example, suppose
    *  that you wanted to check whether the value of the ProductStatus attribute was one of the
    *  following:
    * 
    *  Available | Backordered | Discontinued
    * 
    *  You would first need to specify ExpressionAttributeValues as follows:
    * 
    *  { ":avail":{"S":"Available"}, ":back":{"S":"Backordered"}, ":disc":{"S":"Discontinued"} }
    * 
    *  You could then use these values in an expression, such as this:
    * 
    *  ProductStatus IN (:avail, :back, :disc)
    * 
    *  For more information on expression attribute values, see Condition Expressions in the Amazon DynamoDB Developer Guide.
    */
  var expressionAttributeValues: Map<String, AttributeValue>?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.expressionAttributeValues(value)
    }


  /**
    * A string that contains conditions that DynamoDB applies after the Scan operation, but before the
    *  data is returned to you. Items that do not satisfy the FilterExpression criteria are not
    *  returned.
    * 
    *  A FilterExpression is applied after the items have already been read; the process of filtering
    *  does not consume any additional read capacity units.
    * 
    *  For more information, see Filter Expressions in the Amazon DynamoDB Developer Guide.
    */
  var filterExpression: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.filterExpression(value)
    }


  /**
    * The name of a secondary index to scan. This index can be any local secondary index or global secondary index.
    *  Note that if you use the IndexName parameter, you must also provide TableName.
    */
  var indexName: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.indexName(value)
    }


  /**
    * The maximum number of items to evaluate (not necessarily the number of matching items). If DynamoDB processes
    *  the number of items up to the limit while processing the results, it stops the operation and returns the
    *  matching values up to that point, and a key in LastEvaluatedKey to apply in a subsequent
    *  operation, so that you can pick up where you left off. Also, if the processed dataset size exceeds 1 MB
    *  before DynamoDB reaches this limit, it stops the operation and returns the matching values up to the limit,
    *  and a key in LastEvaluatedKey to apply in a subsequent operation to continue the operation. For
    *  more information, see Working with
    *  Queries in the Amazon DynamoDB Developer Guide.
    */
  var limit: Int?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.limit(value)
    }


  /**
    * 
    */
  var overrideConfiguration: AwsRequestOverrideConfiguration?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.overrideConfiguration(value)
    }


  /**
    * A string that identifies one or more attributes to retrieve from the specified table or index. These
    *  attributes can include scalars, sets, or elements of a JSON document. The attributes in the expression must
    *  be separated by commas.
    * 
    *  If no attribute names are specified, then all attributes will be returned. If any of the requested attributes
    *  are not found, they will not appear in the result.
    * 
    *  For more information, see Specifying Item Attributes in the Amazon DynamoDB Developer Guide.
    */
  var projectionExpression: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.projectionExpression(value)
    }


  /**
    * Sets the value of the ReturnConsumedCapacity property for this object.
    */
  var returnConsumedCapacity: ReturnConsumedCapacity?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.returnConsumedCapacity(value)
    }


  /**
    * This is a legacy parameter. Use FilterExpression instead. For more information, see ScanFilter in the Amazon DynamoDB Developer Guide.
    */
  var scanFilter: Map<String, Condition>?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.scanFilter(value)
    }


  /**
    * For a parallel Scan request, Segment identifies an individual segment to be scanned
    *  by an application worker.
    * 
    *  Segment IDs are zero-based, so the first segment is always 0. For example, if you want to use four
    *  application threads to scan a table or an index, then the first thread specifies a Segment value
    *  of 0, the second thread specifies 1, and so on.
    * 
    *  The value of LastEvaluatedKey returned from a parallel Scan request must be used as
    *  ExclusiveStartKey with the same segment ID in a subsequent Scan operation.
    * 
    *  The value for Segment must be greater than or equal to 0, and less than the value provided for
    *  TotalSegments.
    * 
    *  If you provide Segment, you must also provide TotalSegments.
    */
  var segment: Int?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.segment(value)
    }


  /**
    * The attributes to be returned in the result. You can retrieve all item attributes, specific item attributes,
    *  the count of matching items, or in the case of an index, some or all of the attributes projected into the
    *  index.
    * 
    *  ALL_ATTRIBUTES - Returns all of the item attributes from the specified table or index. If you
    *  query a local secondary index, then for each matching item in the index, DynamoDB fetches the entire item
    *  from the parent table. If the index is configured to project all item attributes, then all of the data can be
    *  obtained from the local secondary index, and no fetching is required.
    * 
    *  ALL_PROJECTED_ATTRIBUTES - Allowed only when querying an index. Retrieves all attributes that
    *  have been projected into the index. If the index is configured to project all attributes, this return value
    *  is equivalent to specifying ALL_ATTRIBUTES.
    * 
    *  COUNT - Returns the number of matching items, rather than the matching items themselves.
    * 
    *  SPECIFIC_ATTRIBUTES - Returns only the attributes listed in AttributesToGet. This
    *  return value is equivalent to specifying AttributesToGet without specifying any value for
    *  Select.
    * 
    *  If you query or scan a local secondary index and request only attributes that are projected into that index,
    *  the operation reads only the index and not the table. If any of the requested attributes are not projected
    *  into the local secondary index, DynamoDB fetches each of these attributes from the parent table. This extra
    *  fetching incurs additional throughput cost and latency.
    * 
    *  If you query or scan a global secondary index, you can only request attributes that are projected into the
    *  index. Global secondary index queries cannot fetch attributes from the parent table.
    * 
    *  If neither Select nor AttributesToGet are specified, DynamoDB defaults to
    *  ALL_ATTRIBUTES when accessing a table, and ALL_PROJECTED_ATTRIBUTES when accessing
    *  an index. You cannot use both Select and AttributesToGet together in a single
    *  request, unless the value for Select is SPECIFIC_ATTRIBUTES. (This usage is
    *  equivalent to specifying AttributesToGet without any value for Select.)
    * 
    *  If you use the ProjectionExpression parameter, then the value for Select can only
    *  be SPECIFIC_ATTRIBUTES. Any other value for Select will return an error.
    */
  var select: Select?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.select(value)
    }


  /**
    * The name of the table containing the requested items; or, if you provide IndexName, the name of
    *  the table to which that index belongs.
    */
  var tableName: String?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.tableName(value)
    }


  /**
    * For a parallel Scan request, TotalSegments represents the total number of segments
    *  into which the Scan operation will be divided. The value of TotalSegments
    *  corresponds to the number of application workers that will perform the parallel scan. For example, if you
    *  want to use four application threads to scan a table or an index, specify a TotalSegments value
    *  of 4.
    * 
    *  The value for TotalSegments must be greater than or equal to 1, and less than or equal to
    *  1000000. If you specify a TotalSegments value of 1, the Scan operation will be
    *  sequential rather than parallel.
    * 
    *  If you specify TotalSegments, you must also specify Segment.
    */
  var totalSegments: Int?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.totalSegments(value)
    }

    
  /**
    * This is a legacy parameter. Use FilterExpression instead. For more information, see ConditionalOperator in the Amazon DynamoDB Developer Guide.
    */
  fun conditionalOperator(value: String?) {
    builder.conditionalOperator(value)
  }


  /**
    * Sets the value of the ReturnConsumedCapacity property for this object.
    */
  fun returnConsumedCapacity(value: String?) {
    builder.returnConsumedCapacity(value)
  }


  /**
    * The attributes to be returned in the result. You can retrieve all item attributes, specific item attributes,
    *  the count of matching items, or in the case of an index, some or all of the attributes projected into the
    *  index.
    * 
    *  ALL_ATTRIBUTES - Returns all of the item attributes from the specified table or index. If you
    *  query a local secondary index, then for each matching item in the index, DynamoDB fetches the entire item
    *  from the parent table. If the index is configured to project all item attributes, then all of the data can be
    *  obtained from the local secondary index, and no fetching is required.
    * 
    *  ALL_PROJECTED_ATTRIBUTES - Allowed only when querying an index. Retrieves all attributes that
    *  have been projected into the index. If the index is configured to project all attributes, this return value
    *  is equivalent to specifying ALL_ATTRIBUTES.
    * 
    *  COUNT - Returns the number of matching items, rather than the matching items themselves.
    * 
    *  SPECIFIC_ATTRIBUTES - Returns only the attributes listed in AttributesToGet. This
    *  return value is equivalent to specifying AttributesToGet without specifying any value for
    *  Select.
    * 
    *  If you query or scan a local secondary index and request only attributes that are projected into that index,
    *  the operation reads only the index and not the table. If any of the requested attributes are not projected
    *  into the local secondary index, DynamoDB fetches each of these attributes from the parent table. This extra
    *  fetching incurs additional throughput cost and latency.
    * 
    *  If you query or scan a global secondary index, you can only request attributes that are projected into the
    *  index. Global secondary index queries cannot fetch attributes from the parent table.
    * 
    *  If neither Select nor AttributesToGet are specified, DynamoDB defaults to
    *  ALL_ATTRIBUTES when accessing a table, and ALL_PROJECTED_ATTRIBUTES when accessing
    *  an index. You cannot use both Select and AttributesToGet together in a single
    *  request, unless the value for Select is SPECIFIC_ATTRIBUTES. (This usage is
    *  equivalent to specifying AttributesToGet without any value for Select.)
    * 
    *  If you use the ProjectionExpression parameter, then the value for Select can only
    *  be SPECIFIC_ATTRIBUTES. Any other value for Select will return an error.
    */
  fun select(value: String?) {
    builder.select(value)
  }

    
  /**
    * The primary key of the first item that this operation will evaluate. Use the value that was returned for
    *  LastEvaluatedKey in the previous operation.
    * 
    *  The data type for ExclusiveStartKey must be String, Number or Binary. No set data types are
    *  allowed.
    * 
    *  In a parallel scan, a Scan request that includes ExclusiveStartKey must specify the
    *  same segment whose previous Scan returned the corresponding value of
    *  LastEvaluatedKey.
    */
  fun exclusiveStartKey(dslBlock: AttributeValueMapDSL.() -> Unit) {
    builder.exclusiveStartKey(buildAttributeValueMap(dslBlock))
  }


  /**
    * One or more values that can be substituted in an expression.
    * 
    *  Use the : (colon) character in an expression to dereference an attribute value. For example, suppose
    *  that you wanted to check whether the value of the ProductStatus attribute was one of the
    *  following:
    * 
    *  Available | Backordered | Discontinued
    * 
    *  You would first need to specify ExpressionAttributeValues as follows:
    * 
    *  { ":avail":{"S":"Available"}, ":back":{"S":"Backordered"}, ":disc":{"S":"Discontinued"} }
    * 
    *  You could then use these values in an expression, such as this:
    * 
    *  ProductStatus IN (:avail, :back, :disc)
    * 
    *  For more information on expression attribute values, see Condition Expressions in the Amazon DynamoDB Developer Guide.
    */
  fun expressionAttributeValues(dslBlock: AttributeValueMapDSL.() -> Unit) {
    builder.expressionAttributeValues(buildAttributeValueMap(dslBlock))
  }


  /**
    * This is a legacy parameter. Use FilterExpression instead. For more information, see ScanFilter in the Amazon DynamoDB Developer Guide.
    */
  fun scanFilter(dslBlock: ConditionMapDSL.() -> Unit) {
    builder.scanFilter(buildConditionMap(dslBlock))
  }

}

/**
  * Builds instances of type ScanRequest:
  * Represents the input of a Scan operation.
  */
fun buildScanRequest(dslBlock: ScanRequestDSL.() -> Unit) =
  ScanRequestDSL().apply(dslBlock).build()