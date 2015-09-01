package com.liyaos.askword

/**
 * Created by lastland on 15/9/1.
 */
trait Prompt {
  this: WordStream =>
  def askWords(wordList: Seq[Word], length: Int): Unit = {
    words(wordList).take(length).foreach { word =>
      println(word)
      readLine()
    }
  }
}

object RandomPrompt extends Prompt with RandomWordStream