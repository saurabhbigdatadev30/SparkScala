package com.basic.scalaprogramming

object OOBasics extends App {
  val person = new Person("John", 26)
  // println(person.age)
  // println(person.x)
  //  person.greet("SAURABH")
//   person.greet()
  
  val author = new Writer("Charles", "Dickens", 1812)
  val imposter = new Writer("Charles", "Dickens", 1812)
  val novel = new Novel("Great Expectations", 1861, author)
  println(novel.authorAge)
  println(novel.isWrittenBy(imposter))
  println(novel.isWrittenBy(author))
}


// *************************  Classes *****************************************

class Person(name: String,  val age: Int = 0) {
    // body
    val x = 2
    //println("class is executed")
    
    
      def greet(name: String): Unit = {
       // println("$name says: Hi, $name")  -- String Interpolator to access variables inside string , 
          println(s"$name says: Hi, $name")
       // parameter vs field vals this.name is parameter
       println (s"Hello Mr $name , from ${this.name}")
       
}
    
     // overloading
    def greet(): Unit = println(s"Hi, I am $name")
}

class Writer(firstName: String, surname: String, val year: Int) {
  def fullName: String = firstName + " " + surname
}

class Novel(name: String, year: Int, author: Writer) {
  // author is Writer obj
  def authorAge = year - author.year
  def isWrittenBy(author: Writer):Boolean = 
    {
    author == this.author
    }
   
  def copy(newYear: Int): Novel = new Novel(name, newYear, author)
}


class Counter(count: Int) {
  def inc = {
    println("incrementing")
    new Counter(count + 1)  // immutability
  }
  
   def dec = {
    println("decrementing")
    new Counter(count - 1)
  } 
}
  