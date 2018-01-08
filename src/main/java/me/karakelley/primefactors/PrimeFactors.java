package me.karakelley.primefactors;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {

  public static List<Integer> calculate(int number) {
    ArrayList<Integer> factors = new ArrayList<Integer>();
    if (number > 1) {
      factors.add(2);
    }
    return factors;
  }
}
