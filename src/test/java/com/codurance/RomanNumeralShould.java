package com.codurance;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralShould {

  @ParameterizedTest
  @CsvSource({
      "1, I",
      "2, II",
      "3, III",
      "4, IV"
  })
  public void return_roman_for_arabic(int input, String expected) {
    RomanNumeral numeral = new RomanNumeral();

    String result = numeral.convert(input);

    assertEquals(expected, result);
  }
}
