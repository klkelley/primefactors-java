package me.karakelley.primefactors;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {

  public static List<Integer> calculate(int number) {
    ArrayList<Integer> primeFactors = new ArrayList<Integer>();
    int possibleFactors = 2;
    while (number > 1) {
      while (number % possibleFactors == 0) {
        primeFactors.add(possibleFactors);
        number /= possibleFactors;
      }
      possibleFactors++;
    }
    return primeFactors;
  }
}
