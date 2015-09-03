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

trait PromptWithMemory extends Prompt {
  this: WordStream =>
  override def askWords(wordList: Seq[Word], length: Int): Unit = {
    var mem: List[Word] = List()
    words(wordList).take(length).foreach { word =>
      println(word)
      val c = readLine()
      if (c == "1") mem = word :: mem
    }
    if (!mem.isEmpty) askWords(mem, mem.length)
  }
}

object RandomPrompt extends Prompt with RandomWordStream

object RandomPromptWithMemory extends PromptWithMemory with RandomWordStream
