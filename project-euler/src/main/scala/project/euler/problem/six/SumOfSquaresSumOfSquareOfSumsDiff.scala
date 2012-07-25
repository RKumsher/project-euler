package project.euler.problem.six

import scala.annotation.tailrec

/**
 * What is the difference between the sum of the squares and the square of the sums?
 *
 * The sum of the squares of the first ten natural numbers is,
 * 12 + 22 + ... + 102 = 385
 * The square of the sum of the first ten natural numbers is,
 * (1 + 2 + ... + 10)2 = 552 = 3025
 * Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025  385 = 2640.
 * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 */
// 25502500 - 338350 = 25164150
object SumOfSquaresSumOfSquareOfSumsDiff extends App {

  val endNumber = 100

  val sumOfSquares = getSumOfSquares(endNumber)
  val squareOfSum = getSquareOfSumOfNumbers(endNumber)
  val difference = squareOfSum - sumOfSquares

  println(squareOfSum + " - " + sumOfSquares + " = " + difference)

  def getSumOfSquares(endNumber: Int) = {
    (1 to endNumber).reduce(_ + math.pow(_, 2).toInt)
  }

  def getSquareOfSumOfNumbers(endNumber: Int) = {
    val sum = (1 to endNumber).reduce(_ + _)
    math.pow(sum, 2).toInt
  }

}