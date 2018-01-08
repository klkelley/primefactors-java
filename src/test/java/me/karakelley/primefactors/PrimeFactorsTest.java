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

  @Test
  public void testFactorsOfFour() {
    assertEquals(list(2, 2), PrimeFactors.calculate(4));
  }

  @Test
  public void testFactorsOfSix() {
    assertEquals(list(2, 3), PrimeFactors.calculate(6));
  }

  @Test
  public void testFactorsOfEight() {
    assertEquals(list(2, 2, 2), PrimeFactors.calculate(8));
  }

  @Test
  public void testFactorsOfNine() {
    assertEquals(list(3, 3), PrimeFactors.calculate(9));
  }

  @Test
  public void testFactorsOfTwentySeven() {
    assertEquals(list(3, 3, 3), PrimeFactors.calculate(27));
  }

  @Test
  public void testFactorsOfSixHundredTwentyFive() {
    assertEquals(list(5, 5, 5, 5), PrimeFactors.calculate(625));
  }


  private List<Integer> list(int...ints) {
    ArrayList<Integer> list = new ArrayList<Integer>();
    for ( int i : ints) {
      list.add(i);
    }
    return list;
  }

}