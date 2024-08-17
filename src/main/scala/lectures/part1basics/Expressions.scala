package lectures.part1basics

object Expressions extends App {

  val x = 1 + 2 // an expression
  println(x)

  println(2 + 3 * 4) // 14 -> a mathematical expresssion

  println(1 == x) // false

  /**
   * Instructions vs Expressions
   * instructions is what u tell the computer to do
   * expressions have a value or type
   */

    var aVariable = 8

  // if expression
  val aCondition = true
  val aConditionValue = if(aCondition) 5 else 3
  println(aConditionValue)
  println(if(aCondition) 5 else 3) // we can print this because it is an expression in Scala

  // EVERYTHING IN SCALA IS AN EXPRESSION
  val aWierdValue = (aVariable = 3) // aWierdValue is type Unit, same as void in Java
  println(aWierdValue) // () -> this is what Unit prints

  // side effects: println(), whiles, reassigning

  val aCodeBlock = {
    val y = 2
    val z = y + 1

    if(z > 2) "hello" else "goodbye"
  }
  println(aCodeBlock)
}
