package com.liyaos.askword

/**
 * Created by lastland on 15/9/1.
 */
object Main {
  def main(args: Array[String]) {
    RandomPromptWithMemory.askWords(WordList.fromListRange(1 to 2), 100)
  }
}
