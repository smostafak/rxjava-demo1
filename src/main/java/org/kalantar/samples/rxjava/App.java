package org.kalantar.samples.rxjava;

import io.reactivex.rxjava3.core.Observable;

public class App {
  public static void main(String[] args) {
    final Observable<String> src = Observable.just("Alpha", "Beta", "Gamma");
    src.subscribe(s -> System.out.println("Observer 1: " + s));
    src.subscribe(s -> System.out.println("Observer 2: " + s));
  }
}
