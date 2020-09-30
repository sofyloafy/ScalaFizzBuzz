import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class FizzBuzzTest extends AnyFlatSpec with should.Matchers {
  var FizzBuzz = new FizzBuzz

  "FizzBuzz" should "return 1" in {
    FizzBuzz.calculate(1) should be ("1")
  }

}
