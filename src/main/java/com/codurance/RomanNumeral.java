package com.codurance;

public class RomanNumeral {
  public String convert(int arabic) {
    if (arabic > 1){
      return "II";
    }
    return "I";
  }
}
