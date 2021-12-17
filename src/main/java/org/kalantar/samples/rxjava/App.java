package org.kalantar.samples.rxjava;

import io.reactivex.rxjava3.core.Observable;

public class App {
  public static void main(String[] args) {
    final Observable<Object> src = Observable.create(emitter -> {
      try {
        emitter.onNext("Alpha");
        emitter.onNext("Beta");
        emitter.onNext("Gamma");
        emitter.onComplete();
      } catch (Throwable e) {
        emitter.onError(e);
      }
    });

    src.subscribe(o ->
        System.out.println("Received: " + o), Throwable::printStackTrace);
  }
}
