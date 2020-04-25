/*
  This file was generated from https://github.com/aws/aws-sdk-java-v2 by https://github.com/cylab/aws-kotlin-dsl-builder
  Like the original code, this file and project is licensed under
  Apache License Version 2.0
  See LICENSE.txt for more info
*/
package net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.model

import kotlin.DeprecationLevel.HIDDEN
import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSL
import software.amazon.awssdk.services.dynamodb.model.ReplicaSettingsDescription
import software.amazon.awssdk.services.dynamodb.model.UpdateGlobalTableSettingsResponse

/**
  * Builds instances of type UpdateGlobalTableSettingsResponse:
  * 
  */
@DynamodbDSL
class UpdateGlobalTableSettingsResponseDSL {
  private val builder = UpdateGlobalTableSettingsResponse.builder()
  internal fun build(): UpdateGlobalTableSettingsResponse = builder.build()
    
  /**
    * The name of the global table.
    */
  @get:JvmSynthetic // Hide from Java callers
  var globalTableName: String
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.globalTableName(value)
    }


  /**
    * The Region-specific settings for the global table.
    */
  @get:JvmSynthetic // Hide from Java callers
  var replicaSettings: Collection<ReplicaSettingsDescription>
    @Deprecated("", level = HIDDEN) // Hide from Kotlin callers
    get() = throw UnsupportedOperationException()
    set(value) {
      builder.replicaSettings(value)
    }

  
    
  /**
    * The Region-specific settings for the global table.
    */
  fun replicaSettings(dslBlock: ReplicaSettingsDescriptionCollectionDSL.() -> Unit) {
    builder.replicaSettings(buildReplicaSettingsDescriptionCollection(dslBlock))
  }

}

/**
  * Builds instances of type UpdateGlobalTableSettingsResponse:
  * 
  */
fun buildUpdateGlobalTableSettingsResponse(dslBlock: UpdateGlobalTableSettingsResponseDSL.() -> Unit) =
  UpdateGlobalTableSettingsResponseDSL().apply(dslBlock).build()