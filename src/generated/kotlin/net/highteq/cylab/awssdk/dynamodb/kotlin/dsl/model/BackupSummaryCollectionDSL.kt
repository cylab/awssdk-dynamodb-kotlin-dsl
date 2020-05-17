/*
  This file was generated from https://github.com/aws/aws-sdk-java-v2 by https://github.com/cylab/aws-kotlin-dsl-builder
  Like the original code, this file and project is licensed under
  Apache License Version 2.0
  See LICENSE.txt for more info
*/
@file:Suppress("DEPRECATION", "NOTHING_TO_INLINE")
package net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.model

import kotlin.DeprecationLevel.WARNING
import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSL
import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSLMarker
import software.amazon.awssdk.services.dynamodb.model.BackupSummary

/**
  * Builds a collection of type BackupSummary:
  * Contains details for the backup.
  */
@DynamodbDSLMarker
inline class BackupSummaryCollectionDSL(
  @PublishedApi
  @Deprecated("Don't use internal fields!", level = WARNING)
  internal val list : MutableList<BackupSummary>
){
  @PublishedApi
  internal fun build() = list

  /**
    * Builds an object of type BackupSummary from 
    * the given DSL in 'dslBlock' and adds it to the collection
    */
  inline fun o(dslBlock: BackupSummaryDSL.() -> Unit) {
    list.add(DynamodbDSL.backupSummary(dslBlock))
  }

  /**
    * Adds a BackupSummary to the collection built by this DSL
    */
  inline operator fun BackupSummary.unaryPlus() {
    list.add(this)
  }

  /**
    * Adds all given BackupSummary instances to the collection built by this DSL
    */
  inline operator fun Collection<BackupSummary>.unaryPlus() {
    list.addAll(this)
  }

  /**
    * Adds all given BackupSummary instances to the collection built by this DSL
    */
  inline operator fun Array<BackupSummary>.unaryPlus() {
    list.addAll(this)
  }
}

/**
  * Builds a collection of type BackupSummary:
  * Contains details for the backup.
  */
inline fun backupSummaryCollection(dslBlock: BackupSummaryCollectionDSL.() -> Unit) =
  BackupSummaryCollectionDSL(mutableListOf<BackupSummary>()).apply(dslBlock).build()

/**
  * Builds a collection of type BackupSummary:
  * Contains details for the backup.
  */
inline fun DynamodbDSL.Companion.backupSummaryCollection(dslBlock: BackupSummaryCollectionDSL.() -> Unit) =
  BackupSummaryCollectionDSL(mutableListOf<BackupSummary>()).apply(dslBlock).build()