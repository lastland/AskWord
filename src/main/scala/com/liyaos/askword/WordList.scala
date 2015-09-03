package com.liyaos.askword

import scala.io.Source

/**
 * Created by lastland on 15/9/1.
 */
object WordList {
  val unitsInList = 10
  val filePrefix = System.getProperty("user.dir") + "/src/main/resources/"

  def fromWordList(list: List[Word]): Seq[Word] = list

  def fromListUnit(list: Int, unit: Int): Seq[Word] = {
    val fileName = filePrefix + list + "-" + unit
    Source.fromFile(fileName).getLines().map(Word(_, list, unit)).toList
  }

  def fromList(list: Int): Seq[Word] = {
    (1 to unitsInList).flatMap(fromListUnit(list, _))
  }

  def fromListRange(lists: Range): Seq[Word] = {
    lists.flatMap(fromList(_))
  }

  def fromLists(lists: Seq[Int]): Seq[Word] = {
    lists.flatMap(fromList(_))
  }
}
