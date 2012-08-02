package project.euler.problem.four

import scala.annotation.tailrec

/**
 * Find the largest palindrome made from the product of two 3-digit numbers.
 *
 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */
// (913,993) = 906,609
object LargestPalindrome extends App {
  val largestProduct = 999 * 999
  println(getLargestPalindromeMadeFromProduct(largestProduct))

  @tailrec
  def getLargestPalindromeMadeFromProduct(number: Int): (Int, Int) = {
    val largestPalindrome = getLargestPalindrome(number)
    val multipliers = getMultipliers(largestPalindrome)
    if (multipliers != null) {
      multipliers
    } else {
      getLargestPalindromeMadeFromProduct(largestPalindrome - 1)
    }
  }

  @tailrec
  def getLargestPalindrome(number: Int): Int = {
    val numberString = number.toString
    val reverseNumber = numberString.reverse
    if (numberString == reverseNumber)
      number
    else
      getLargestPalindrome(number - 1)
  }

  def getMultipliers(number: Int) = {
    val x = (100 to 999).find(p => { number % p == 0 && number / p > 99 && number / p < 1000 })
    if (!x.isEmpty) {
      val y = number / x.get
      (x.get, y)
    } else {
      null
    }
  }
}