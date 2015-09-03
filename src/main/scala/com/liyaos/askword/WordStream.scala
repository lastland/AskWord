package com.liyaos.askword

import scala.util.Random

/**
 * Created by lastland on 15/9/1.
 */
trait WordStream {
  def words(w: Seq[Word]): Iterator[Word]
}

trait RandomWordStream extends WordStream {
  def words(w: Seq[Word]) = {
    Random.shuffle(w).iterator
  }
}
