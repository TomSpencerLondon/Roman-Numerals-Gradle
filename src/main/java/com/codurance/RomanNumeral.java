package com.codurance;

public class RomanNumeral {
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
