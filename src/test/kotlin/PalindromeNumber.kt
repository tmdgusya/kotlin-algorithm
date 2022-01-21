import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class PalindromeNumber : FunSpec({

  test("Condition 1") {
    //given
    val given = 121
    val expected = true

    //when
    val result = isPalindrome(given)

    //then
    result shouldBe expected
  }

  test("Condition2") {
    //given
    val given = -121
    val expected = false

    //when
    val result = isPalindrome(given)

    //then
    result shouldBe expected
  }

})

fun isPalindrome(x: Int): Boolean {
  val originalWord = x.toString()
  val reversedWord = originalWord.reversed()

  return originalWord isSameWord reversedWord
}

infix fun String.isSameWord(otherWord: String): Boolean {
  return this == otherWord
}