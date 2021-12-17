package org.kalantar.samples.rxjava;

import io.reactivex.rxjava3.core.Observable;

public class App {
  public static void main(String[] args) {
    Observable.just("Alpha", "Beta", "Gamma")
        .map(String::length)
        .filter(i -> i >= 5)
        .subscribe(i -> System.out.println("RCV: " + i));
  }
}
