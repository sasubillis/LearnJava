import java.io.*;

public class LearnJava_week1 {

  /*
   * Given two non-egative int values, return true if they have the same last
   * digit, such as with 27 and 57.
   * Note that the % "mod" operator computes remainders, so 17 % 10 is 7.
   *
   * lastDigit(7, 17) → true
   * lastDigit(6, 17) → false
   * lastDigit(3, 113) → true
   */
  public static boolean lastDigit(int a, int b) {
    return true;
  }

  /*
   * Given 2 ints, a and b, return true if one if them is 10 or if their sum is
   * 10.
   *
   * makes10(9, 10) → true
   * makes10(9, 9) → false
   * makes10(1, 9) → true
   */
  public boolean makes10(int a, int b) {
    return true;
  }

  /*
   * Return true if the given non-negative number is a multiple of 3 or a multiple
   * of 5. Use the % "mod" operator -- see Introduction to Mod
   *
   * or35(3) → true
   * or35(10) → true
   * or35(8) → false
   */
  public boolean or35(int n) {
    return true;
  }

  /*
   * Given 2 int values, return whichever value is nearest to the value 10, or
   * return 0 in the event of a tie. Note that Math.abs(n) returns the absolute
   * value of a number.
   *
   * close10(8, 13) → 8
   * close10(13, 8) → 8
   * close10(13, 7) → 0
   */
  public int close10(int a, int b) {
    return 1;
  }

  /*
   * Given 2 int values, return true if either of them is in the range 10..20
   * inclusive.
   *
   *
   * in1020(12, 99) → true
   * in1020(21, 12) → true
   * in1020(8, 99) → false
   */
  public boolean in1020(int a, int b) {
    return true;
  }

  /*
   * Given two temperatures, return true if one is less than 0 and the other is
   * greater than 100.
   *
   * icyHot(120, -1) → true
   * icyHot(-1, 120) → true
   * icyHot(2, 120) → false
   */
  public boolean icyHot(int temp1, int temp2) {
    return true;
  }

  /*
   * Return true if the given string begins with "mix", except the 'm' can be
   * anything, so "pix", "9ix" .. all count.
   *
   *
   * mixStart("mix snacks") → true
   * mixStart("pix snacks") → true
   * mixStart("piz snacks") → false
   */
  public boolean mixStart(String str) {
    return true;
  }

  /*
   * Check if String Ending Matches Second String
   * Create a function that takes two strings and returns true if the first string
   * ends with the second string; otherwise return false.
   *
   * Examples
   * checkEnding("abc", "bc") ➞ true
   * checkEnding("abc", "d") ➞ false
   * checkEnding("samurai", "zi") ➞ false
   * checkEnding("feminine", "nine") ➞ true
   * checkEnding("convention", "tio") ➞ false
   */
  public boolean checkEnding(String s1, String s2) {
    return true;
  }

  /*
   * Create a function that takes two numbers as arguments (num, length) and
   * returns an array of multiples of num until the array length reaches length.
   *
   * Examples
   * arrayOfMultiples(7, 5) ➞ [7, 14, 21, 28, 35]
   * arrayOfMultiples(12, 10) ➞ [12, 24, 36, 48, 60, 72, 84, 96, 108, 120]
   * arrayOfMultiples(17, 6) ➞ [17, 34, 51, 68, 85, 102]
   */
  public int[] arrayOfMultiples(int n1, int n2) {
    int[] arr = { 1, 2 };
    return arr;
  }

  /*
   * Given the shortest side of a 30° by 60° by 90° triangle, find out the other
   * two sides. Return the longest side and medium-length side in that order.
   *
   * Examples
   * otherSides(1) ➞ [2.0, 1.73]
   *
   * otherSides(12) ➞ [24.0, 20.0]
   *
   * otherSides(2) ➞ [4.0, 3.46]
   *
   * otherSides(3) ➞ [6.0, 5.2]
   * Notes
   * 30° by 60° by 90° triangles always follow this rule: let's say the shortest
   * side length is x units, the hypotenuse would be 2x units and the other side
   * would be x * square root of 3.
   * The results in the Tests are rounded up to 2 decimal places.
   * Return the result as an array.
   */

   

  /*
   * Create a function which returns the number of true values there are in an
   * array.
   *
   * Examples
   * countTrue([true, false, false, true, false]) ➞ 2
   * countTrue([false, false, false, false]) ➞ 0
   * countTrue([]) ➞ 0
   */
  public int countTrue(String[] arr) {
    return 1;
  }

  /*
   * Create a function that takes an integer and outputs an n x n square solely
   * consisting of the integer n.
   *
   * Examples
   * squarePatch(3) ➞ [
   * [3, 3, 3],
   * [3, 3, 3],
   * [3, 3, 3]
   * ]
   *
   * squarePatch(5) ➞ [
   * [5, 5, 5, 5, 5],
   * [5, 5, 5, 5, 5],
   * [5, 5, 5, 5, 5],
   * [5, 5, 5, 5, 5],
   * [5, 5, 5, 5, 5]
   * ]
   *
   * squarePatch(1) ➞ [
   * [1]
   * ]
   *
   * squarePatch(0) ➞ []
   */

  // Main method
  public static void main(String[] args) {
    System.out.println(lastDigit(7, 17));
  }
}
