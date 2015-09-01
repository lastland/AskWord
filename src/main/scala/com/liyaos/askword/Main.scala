package com.liyaos.askword

/**
 * Created by lastland on 15/9/1.
 */
object Main {
  def main(args: Array[String]) {
    RandomPrompt.askWords(WordList.fromList(1), 10)
  }
}
