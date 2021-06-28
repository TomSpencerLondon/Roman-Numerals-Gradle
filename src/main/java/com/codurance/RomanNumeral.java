package com.codurance;

import java.util.HashMap;
import java.util.Map;

public class RomanNumeral {

  public String convert(int arabic) {
    Map<Integer, String> numerals = new HashMap<>();
    numerals.put(4, "IV");
    numerals.put(5, "V");

    StringBuilder result = new StringBuilder();
    for (int i = 0; i < arabic; i++){
      if (numerals.keySet().contains(arabic)){
        result.append(numerals.get(arabic));
        break;
      }
      result.append("I");
    }

    return result.toString();
  }
}
