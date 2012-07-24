package project.euler.problem.five

/**
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */
// 232792560
object SmallestNumberDivisibleByRange extends App {
  val range = (1 to 20)
  val result = (1 to Int.MaxValue).find(number => {
    !range.exists(number % _ != 0)
  })
  println(result)
}