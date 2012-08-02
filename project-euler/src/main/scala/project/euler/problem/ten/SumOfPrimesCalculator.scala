package project.euler.problem.ten

import project.euler.utils.PrimeUtils

/**
 * Calculate the sum of all the primes below two million.
 *
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * Find the sum of all the primes below two million.
 */
// 1,179,908,154
object SumOfPrimesCalculator extends App {
  val max = 2000000
  val sum = PrimeUtils.getPrimeNumbersUpTo(max).reduce(_ + _)
  println(sum)
}