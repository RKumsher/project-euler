package project.euler.utils

//TODO: Remove primes var in getPrimeNumbers and getPrimeNumbersUpTo
object PrimeUtils {
  
  def getPrimeNumbers(count: Int) = {
    if (count < 1)
      Nil
    else {
      var primes: List[Int] = List[Int](2)
      (2 to count).foreach(x => {
        primes = primes.::(getNextPrime(primes.head + 1))
      })
      primes.reverse
    }
  }

  def getPrimeNumbersUpTo(max: Int) = {
    if (max < 2)
      Nil
    else {
      var primes = List[Int](2)
      while (primes.head <= max) {
        primes = getNextPrime(primes.head + 1) :: primes
      }
      primes.tail.reverse
    }
  }

  def getNextPrime(number: Int): Int = {
    if (isPrime(number))
      number
    else
      getNextPrime(number + 1)
  }

  def isPrime(number: Long) = {
    if (number < 2)
      false
    else if (number == 2 || number == 3)
      true
    else
      !(2L to math.sqrt(number).round + 1).exists(number % _ == 0)
  }
  
}