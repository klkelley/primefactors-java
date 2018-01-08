package me.karakelley.primefactors;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {

  public static List<Integer> calculate(int number) {
    ArrayList<Integer> factors = new ArrayList<Integer>();
    int possibleFactor = 2;
    while (number > 1) {
      while (number % possibleFactor == 0) {
        factors.add(possibleFactor);
        number /= possibleFactor;
      }
      possibleFactor++;
    }
    return factors;
  }
}
