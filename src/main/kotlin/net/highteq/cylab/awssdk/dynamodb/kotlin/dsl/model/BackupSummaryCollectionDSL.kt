/*
  This file was generated from https://github.com/aws/aws-sdk-java-v2 by https://github.com/cylab/aws-kotlin-dsl-builder
  Like the original code, this file and project is licensed under
  Apache License Version 2.0
  See LICENSE.txt for more info
*/
package net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.model

import net.highteq.cylab.awssdk.dynamodb.kotlin.dsl.DynamodbDSL
import software.amazon.awssdk.services.dynamodb.model.BackupSummary

/**
  * Builds instances of type BackupSummary:
  * Contains details for the backup.
  */
@DynamodbDSL
class BackupSummaryCollectionDSL {
  private val list = ArrayList<BackupSummary>()
  internal fun build() : List<BackupSummary> = list

  /**
    * Receives a sub DSL in 'dslBlock' to build a BackupSummary instance
    * and adds it to the collection built by the enclosing DSL
    */
  fun add(dslBlock: BackupSummaryDSL.() -> Unit) {
    list.add(BackupSummaryDSL().apply(dslBlock).build())
  }

  /**
    * Adds a BackupSummary to the collection built by this DSL
    */
  fun add(item: BackupSummary) {
    list.add(item)
  }

  /**
    * Adds all given BackupSummary instances to the collection built by this DSL
    */
  fun addAll(items: Collection<BackupSummary>) {
    list.addAll(items)
  }

  /**
    * Adds all given BackupSummary instances to the collection built by this DSL
    */
  infix fun addAll(items: Array<BackupSummary>) {
    list.addAll(items)
  }

  /**
    * Adds a BackupSummary to the collection built by this DSL
    */
  operator fun BackupSummary.unaryPlus() {
    list.add(this)
  }

  /**
    * Adds all given BackupSummary instances to the collection built by this DSL
    */
  operator fun Collection<BackupSummary>.unaryPlus() {
    list.addAll(this)
  }

  /**
    * Adds all given BackupSummary instances to the collection built by this DSL
    */
  operator fun Array<BackupSummary>.unaryPlus() {
    list.addAll(this)
  }
}

/**
  * Builds instances of type BackupSummary:
  * Contains details for the backup.
  */
fun buildBackupSummaryCollection(dslBlock: BackupSummaryCollectionDSL.() -> Unit) =
  BackupSummaryCollectionDSL().apply(dslBlock).build()