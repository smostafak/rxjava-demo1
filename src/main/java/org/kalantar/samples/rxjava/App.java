package org.kalantar.samples.rxjava;

import io.reactivex.rxjava3.core.Observable;

public class App {
  public static void main(String[] args) {
    final Observable<String> src = Observable.create(emitter -> {
      try {
        emitter.onNext("Alpha");
        emitter.onNext("Beta");
        emitter.onNext("Gamma");
        emitter.onComplete();
      } catch (Throwable e) {
        emitter.onError(e);
      }
    });

    src.map(String::length)
        .filter(i -> i >= 5)
        .subscribe(o ->
            System.out.println("Received: " + o), Throwable::printStackTrace);
  }
}
