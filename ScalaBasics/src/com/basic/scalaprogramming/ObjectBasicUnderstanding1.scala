package com.basic.scalaprogramming

object ObjectBasicUnderstanding1 extends App {
  val author1 = new Writer1("Charles", "Dickens", 1812)
  val author2 = new Writer1("Charles", "Dickens", 1812)
  val novel = new Novel1("Great Expectations", 1861, author1)
 // println(novel.authorAge)
  println(novel.isWrittenBy(author2))
  println(novel.isWrittenBy(author1))
}

class Writer1(firstName: String, surname: String, val year: Int) {
  def fullName: String = firstName + " " + surname
}

class Novel1(name: String, year: Int, author: Writer1) {
  // note that year in Writer is a constructor args .To convert this to field we need
  //  year by val year then only it can be used as author.year
  def authorAge = year - author.year
  
  
  def isWrittenBy(author: Writer1):Boolean = 
    {
    author == this.author
    }
}