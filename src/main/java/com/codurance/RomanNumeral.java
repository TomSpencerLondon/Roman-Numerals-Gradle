package com.codurance;

import java.util.HashMap;
import java.util.Map;

public class RomanNumeral {
  Map<Integer, String> numerals = new HashMap<>();

  public String convert(int arabic) {
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < arabic; i++){
      if (arabic == 5){
        result.append("V");
        break;
      } else if (arabic == 4){
        result.append("IV");
        break;
      }
      result.append("I");
    }

    return result.toString();
  }
}
