package project.euler.problem.three

/**
 * Find the largest prime factor of a composite number.
 *
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600,851,475,143 ?
 */

//TODO: Finish

object LargestPrimeFactorOfComposite extends App {
  val number = 600851475143L

  //  println((1 to 2000000).filter(isPrime(_)));

  println(GetPrimeFactors(number))

  def GetPrimeFactors(number: Long) = {
    var i: Long = 1
    while (i < number / 2 + 1) {
      //      if (isPrime(i) && number % i == 0) {
      if (number % i == 0) {
        println(i)
      }
      println(i / number);
      i += 1
    }
    //(1L to (number / 2 + 1)).filter(isPrime(_))
  }

}