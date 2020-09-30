case class FizzBuzz() {
  def calculate(number: Int): String = {
    if (number % 3 == 0){
      "Fizz"
    } else if (number % 5 == 0){
      "Buzz"
    } else {
      "1"
    }
  }

}
