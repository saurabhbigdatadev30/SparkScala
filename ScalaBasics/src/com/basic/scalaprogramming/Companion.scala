package com.basic.scalaprogramming

object Companion extends App{
  
  // define all static level variables(Constants or static methods)
  object Employee {
    
    // define factory method 
   def apply(name: Employee): Employee = {
     println ("Hello")
     new Employee("Deepak")
   }
  }
  
  // define all instance level variables(Constants or methods)
  class Employee(name :String) {
    
    def welcome(name :String):Unit = {
      println (s"Hello Mr $name , from ${this.name}")
    }
    
  }
  
  val empobj = new Employee("AAA")
   Employee(empobj) 
  // same as Employee.apply(empobj)
 
    
  
   // empobj.welcome("XXX"); //
  }
  
  
