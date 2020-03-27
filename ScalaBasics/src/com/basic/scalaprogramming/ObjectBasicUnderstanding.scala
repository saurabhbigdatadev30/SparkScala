package com.basic.scalaprogramming

object ObjectBasicUnderstanding  {
  
  def main(args: Array[String]) {
    val person = new PersonX("John","Mc Lanen", 26)
    println(person.greet("Wills"))
}
}



//scala way of constructor args + parameters/fields (getters ,setter not needed , values set directly )

class PersonX(var firstName: String, var lastname: String, var age: Int) 
{
   def greet(firstName:String): Unit = {
      println(s"Hello Mr $firstName , this is ${this.firstName}");
  }
 
  // expression invoked  when PersonX  object is initalized 
  println("hello ss")
}