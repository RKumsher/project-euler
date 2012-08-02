package project.euler.problem.seven

import project.euler.utils.PrimeUtils

/**
 * Find the 10001st prime.
 *
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 * What is the 10 001st prime number?
 */
// 104743
object PrimeNumberGenerator extends App {
  val primeNumberCount = 10001
  println(PrimeUtils.getPrimeNumbers(primeNumberCount))
  println(PrimeUtils.getPrimeNumbers(primeNumberCount).last)
}