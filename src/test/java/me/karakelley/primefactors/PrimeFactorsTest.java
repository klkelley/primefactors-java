package me.karakelley.primefactors;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PrimeFactorsTest {

  static Collection<Object[]> data() {
    return Arrays.asList(new Object[][] {
            {1, Collections.emptyList()}
    });
  }

  @ParameterizedTest
  @MethodSource("data")
  void test(int number, List<Integer> expectedOutput) {
    assertEquals(expectedOutput, PrimeFactors.calculate(number));
  }

}