package com.codurance;

import java.util.*;

public class RomanNumeral {

  public String convert(int arabic) {
    Map<Integer, String> numerals = new HashMap<>();
    numerals.put(4, "IV");
    numerals.put(5, "V");
    numerals.put(6, "VI");
    numerals.put(9, "IX");
    numerals.put(10, "X");

    StringBuilder result = new StringBuilder();
    int number = arabic;
    List<Integer> nums = new ArrayList<>(numerals.keySet());
    Collections.reverse(nums);
    while (number > 0) {
      for (int n : nums) {
          while (n <= number){
            result.append(numerals.get(n));
            number -= n;
          }
      }
      if (number > 0){
        result.append("I");
        number -= 1;
      }
    }
    return result.toString();
  }
}
