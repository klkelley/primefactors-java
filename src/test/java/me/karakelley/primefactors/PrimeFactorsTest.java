package me.karakelley.primefactors;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


class PrimeFactorsTest {

  @Test
  public void testFactorsOfOne() {
    assertEquals(list(), PrimeFactors.calculate(1));
  }

  @Test
  public void testFactorsOfTwo() {
    assertEquals(list(2), PrimeFactors.calculate((2)));
  }

  @Test
  public void testFactorsOfThree() {
    assertEquals(list(3), PrimeFactors.calculate(3));
  }

  private List<Integer> list(int...ints) {
    ArrayList<Integer> list = new ArrayList<Integer>();
    for ( int i : ints) {
      list.add(i);
    }
    return list;
  }

}