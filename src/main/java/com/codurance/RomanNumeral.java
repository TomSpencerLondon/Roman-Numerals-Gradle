package com.codurance;

import java.util.*;

public class RomanNumeral {

  public String convert(int arabic) {
    Map<Integer, String> numerals = getNumeralConversions();

    StringBuilder result = new StringBuilder();
    int number = arabic;
    for (int n : getNums()) {
      while (n <= number) {
        result.append(numerals.get(n));
        number -= n;
      }
    }
    return result.toString();
  }

  private Map<Integer, String> getNumeralConversions() {
    Map<Integer, String> numerals = new HashMap<>();
    numerals.put(1, "I");
    numerals.put(4, "IV");
    numerals.put(5, "V");
    numerals.put(6, "VI");
    numerals.put(9, "IX");
    numerals.put(10, "X");
    return numerals;
  }

  private List<Integer> getNums() {
    List<Integer> nums = new ArrayList<>(getNumeralConversions().keySet());
    Collections.reverse(nums);
    return nums;
  }
}
