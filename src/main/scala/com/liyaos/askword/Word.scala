package com.liyaos.askword

/**
 * Created by lastland on 15/9/1.
 */
case class Word(word: String, lst: Int, unit: Int) {
  override def toString = {
    s"$word\t\tfrom List $lst, Unit $unit"
  }
}
