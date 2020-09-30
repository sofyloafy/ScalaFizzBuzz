import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class FizzBuzzTest extends AnyFlatSpec with should.Matchers {
  var FizzBuzz = new FizzBuzz

  "FizzBuzz" should "return number" in {
    FizzBuzz.calculate(1) should be ("1")
    FizzBuzz.calculate(4) should be ("4")
  }

  "FizzBuzz" should "return Fizz for multiples of 3" in {
    FizzBuzz.calculate(3) should be ("Fizz")
    FizzBuzz.calculate(6) should be ("Fizz")
    FizzBuzz.calculate(9) should be ("Fizz")
  }

  "FizzBuzz" should "return Buzz for 5" in {
    FizzBuzz.calculate(5) should be ("Buzz")
    FizzBuzz.calculate(10) should be ("Buzz")

  }


}
