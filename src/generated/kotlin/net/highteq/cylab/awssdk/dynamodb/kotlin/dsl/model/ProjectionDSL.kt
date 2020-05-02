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
import software.amazon.awssdk.services.dynamodb.model.Projection
import software.amazon.awssdk.services.dynamodb.model.ProjectionType

/**
  * Builds instances of type Projection:
  * Represents attributes that are copied (projected) from the table into an index. These are in addition to the primary
  *  key attributes and index key attributes, which are automatically projected.
  */
@DynamodbDSL
inline class ProjectionDSL(
  @Deprecated("Usage of the builder field is not recommended. It might vanish in any new release!", level = WARNING)
  val builder: Projection.Builder
){
  @PublishedApi
  internal fun build(): Projection = builder.build()

  /**
    * 
    */
  inline var nonKeyAttributes: Collection<String>?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.nonKeyAttributes(value)
    }

  /**
    * 
    */
  inline var projectionType: ProjectionType?
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.projectionType(value)
    }

  /**
    * 
    */
  inline fun projectionType(value: String?) {
    builder.projectionType(value)
  }

}

/**
  * Builds instances of type Projection:
  * Represents attributes that are copied (projected) from the table into an index. These are in addition to the primary
  *  key attributes and index key attributes, which are automatically projected.
  */
inline fun buildProjection(dslBlock: ProjectionDSL.() -> Unit) =
  ProjectionDSL(Projection.builder()).apply(dslBlock).build()