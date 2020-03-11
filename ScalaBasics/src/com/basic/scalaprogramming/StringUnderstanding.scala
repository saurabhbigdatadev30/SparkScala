package com.basic.scalaprogramming

object StringUnderstanding {
   def main(args:Array[String]) 
    { 
    val x = 20
        val y = 10
      
        // without s interpolator 
        val str1 = "Sum of $x and $y is ${x+y}"
  
        // with s interpolator 
        val str2 = s"Sum of $x and $y is ${x+y}"
      
        println("str1: "+str1) 
        println("str2: "+str2) 
    }
}