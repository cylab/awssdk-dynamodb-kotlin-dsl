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
import software.amazon.awssdk.services.dynamodb.model.Projection
import software.amazon.awssdk.services.dynamodb.model.ProjectionType

/**
  * Builds instances of type Projection:
  * Represents attributes that are copied (projected) from the table into an index. These are in addition to the primary
  *  key attributes and index key attributes, which are automatically projected.
  */
@DynamodbDSL
class ProjectionDSL {
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder = Projection.builder()
  internal fun build(): Projection = builder.build()
    
  /**
    * Represents the non-key attribute names which will be projected into the index.
    * 
    *  For local secondary indexes, the total count of NonKeyAttributes summed across all of the local
    *  secondary indexes, must not exceed 20. If you project the same attribute into two different indexes, this
    *  counts as two distinct attributes when determining the total.
    */
  var nonKeyAttributes: Collection<String>?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.nonKeyAttributes(value)
    }


  /**
    * The set of attributes that are projected into the index:
    * 
    *  KEYS_ONLY - Only the index and primary keys are projected into the index.
    * 
    *  INCLUDE - Only the specified table attributes are projected into the index. The list of
    *  projected attributes is in NonKeyAttributes.
    * 
    *  ALL - All of the table attributes are projected into the index.
    */
  var projectionType: ProjectionType?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.projectionType(value)
    }

    
  /**
    * The set of attributes that are projected into the index:
    * 
    *  KEYS_ONLY - Only the index and primary keys are projected into the index.
    * 
    *  INCLUDE - Only the specified table attributes are projected into the index. The list of
    *  projected attributes is in NonKeyAttributes.
    * 
    *  ALL - All of the table attributes are projected into the index.
    */
  fun projectionType(value: String?) {
    builder.projectionType(value)
  }

  
  
}

/**
  * Builds instances of type Projection:
  * Represents attributes that are copied (projected) from the table into an index. These are in addition to the primary
  *  key attributes and index key attributes, which are automatically projected.
  */
fun buildProjection(dslBlock: ProjectionDSL.() -> Unit) =
  ProjectionDSL().apply(dslBlock).build()