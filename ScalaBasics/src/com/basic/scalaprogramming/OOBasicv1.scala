package com.basic.scalaprogramming

object OOBasicv1 extends App {
  
/* SCALA DOES NOT HAVE CLASS-LEVEL FUNCTIONALITY ("static")..as defined in java. 
  
  We split the functionalities between class & Object(Singleton).We create companion .... where we have 
  class and object of same name i.e (Person class & Person Object) inside OOBasicv1. 
  We can define functions and variables in both. 
  Person class - instance-level functionality
  Person Object - class level functionality 
  
  This means any section of code i.e (Person class & Person Object) will be accessed through instance, 
  either through regular class instance i.e 
  for Person class (instance level)  or Person Object (singleton instance) for class/static level.
  
  
  */
  // singleton 
  object Person { 
     // class level (static functionality  variable) .. CONSTANT & Method
   
    // Constant
    val N_EYES = 2
    // static method 
    def canFly: Boolean = false
      
    // factory method -- defined in object
    def apply(mother: Person, father: Person): Person = new Person("Bobbie")
    
    
    val personObj1 = Person
    val personObj2 = Person
    println(personObj1==personObj2)  
}
 // ************************* Class ************************************** 
  
  class Person(val name: String) {
    // instance-level functionality
    
    def greeting(name:String):Unit ={
      println (s"Hello Mr $name , from ${this.name}")
    }
    
  }
  
 // def main(args: Array[String]): Unit
  // {
  
  
 // accessing static fields (defined in Object).. does not depends on instance
//  println(Person.N_EYES)
//  println(Person.canFly)     //  -- object's method invoked
  
  // accessing class method
    val personObj = new Person("AAA")
    personObj.greeting("XXX"); // -- class's method invoked
    // }  // End of main
}