package me.karakelley.primefactors;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {

  public static List<Integer> calculate(int number) {
    ArrayList<Integer> factors = new ArrayList<Integer>();
    int possibleFactors = 2;
    while (number > 1) {
      while (number % possibleFactors == 0) {
        factors.add(possibleFactors);
        number /= possibleFactors;
      }
      possibleFactors++;
    }
    return factors;
  }
}
