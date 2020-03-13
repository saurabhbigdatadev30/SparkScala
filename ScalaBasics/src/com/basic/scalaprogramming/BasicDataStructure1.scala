package com.basic.scalaprogramming

import scala.annotation.tailrec

object BasicDataStructure1 extends App {
  
  val aCondition = true
  
  //*****************  Understanding Block ***************************
  val aConditionedValue =
    {
      if (aCondition) 5 else 3 // IF EXPRESSION
    }
 // println(aConditionedValue)


val aCodeBlock = {
    val y = 2
    val z = y + 1
    if (z > 2) "hello" else "goodbye"
  //  if (z > 2) 3.7 else 9
  }
 //println(aCodeBlock) 

// using block value  in another block 
 val someValue = {
    2 < 3
  }
//  println(someValue)
  
val someOtherValue = {
    if(someValue) 239 else 986
 //   42
  }
//  println(someOtherValue)  
  
  
  // *********************************   Function ******************************************************
  
  def aFunction(a: String, b: Int): String = 
    a + " " + b
 // println(aFunction("hello", 3))
  
  
 // Function as block  
 // WHEN YOU NEED LOOPS, USE RECURSION.
  
  def aRepeatedFunction(aString:String, n: Int): String = {
    
  //    println((aString ) + ",,"+ n)
    if (n == 1) "xx"
    else  aString + aRepeatedFunction(aString, n-1)
  }
  
  println(aRepeatedFunction("hello",3))

  
// Defining a function inside function  AUXILARY FUNCTION ...  
  /*
   * The return type of def aBigFunction(n: Int) =>  aSmallerFunction(n, n-1)
   */
  
  
  def aBigFunction(n: Int) = {
    def aSmallerFunction(a: Double, b: Double): Double = a + b
    aSmallerFunction(n, n-1)
  }
  println(aBigFunction(5))
  
 
   def factorial(n: Int): Int =
    if (n <= 0) 1
    else n * factorial(n-1)
    // println(factorial(5))
     
   
 def factorial_updated(n: Int): Int = {
   println("factorial() method invoked on" + "\t"+ n)
    if (n <= 0) 1
    else {
      println("Computing factorial of " + n + " - I first need factorial of " + (n-1))
      val result = n * factorial_updated(n-1)
     // println("Computed factorial of " + n)
      result
    }
}
   //  println(factorial_updated(5))
     
    
     
  /*@tailrec =>
   * Store intermediate results rather than calling the function recursively .
   * Instead of calling the base @ top of stack , we will return the accumulator which will already have the final output
   * computed from intermediate output   
   */
  def factorial_tailrecursion(num: Int): BigInt = {

     @tailrec
       def factutil(n:Int , accumulator:BigInt) : BigInt = {
   //    println(accumulator)
         if (n <= 1) accumulator
         else factutil(n-1, n* accumulator)
          }
         factutil(num,1)
    
     }
     
   //   println(factorial_tailrecursion(5))
     
     
     
/* calculating prime no from number till number/2
 * def isPrime(n: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean =
      if (t <= 1) true
      else n % t != 0 && isPrimeUntil(t-1)

    isPrimeUntil(n / 2)
  }
  println(isPrime(37))
  println(isPrime(2003))
  println(isPrime(37 * 17))*/

/* calculating prime no from number till number -1) 
 * i.e isPrime(7)
 * So t = 2,  isPrimeUntil(t:Int) is called recursivly to get isPrimeUntil(3), isPrimeUntil(4), ..... isPrimeUntil(7):
 * 7/2 ,7/3, ..... , 7/7 
 * 
 */
     
     
 def isPrime(n: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean =
      if (n <=2 || n == t) true
        else if (n % t == 0) false
        else (n % t != 0) && isPrimeUntil(t+1)

    isPrimeUntil(2)
  }
  
  
  println(isPrime(9))
//  println(isPrime(9))
 // println(isPrime(37 * 17))
     
     
}