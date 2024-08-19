package lectures.part1basics

object Functions extends App {

  def aFunc(a: String, b: Int): String =
    a + " " + b

  println(aFunc("hello", 3))

  def aParameterlessFunc(): Int = 42
  println(aParameterlessFunc())

  /*
    WHEN YOU NEED LOOPS, USE RECURSION

    while the compiler can figure out the return type of functions,
    for recursive functions, they should be provided explicitly
   */
  def aRepeatedFunc(aString: String, n: Int): String =
    if(n == 1)
      aString
    else
      aString + aRepeatedFunc(aString, n-1)
  println(aRepeatedFunc("hello",3)) // hellohellohello -> hello repeated 3 times

  println("\n################################\n")

  def greeting(name:String, age:Int) =
    println(s"Hi, my name is $name and I am $age years old")
  greeting("Sibo",10)

  def factorialFunc(a:Int): Int =
    if(a <= 0) 1
    else a * factorialFunc(a-1)
  println(factorialFunc(3))

  def fibonacci(n: Int): Int =
    if(n <= 2) 1
    else fibonacci(n-1) + fibonacci(n-2)
  println(fibonacci(12))

  def isPrime(n: Int):Boolean =
    def isPrimeUntil(t: Int): Boolean =
      if (t <= 1) true
      else n % t != 0 && isPrimeUntil(t - 1)

    isPrimeUntil(n / 2)
  println(isPrime(37))
  println(isPrime(2003))
  println(isPrime(37 * 17))


}
