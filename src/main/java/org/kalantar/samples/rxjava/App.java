package org.kalantar.samples.rxjava;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;

public class App {
  public static void main(String[] args) {
    Observable.just("Alpha", "Beta", "Gamma")
        .map(String::length)
        .filter(i -> i >= 5)
        .subscribe(new Observer<>() {
          @Override
          public void onSubscribe(@NonNull Disposable d) {}

          @Override
          public void onNext(@NonNull Integer value) {
            System.out.println("RECEIVED: " + value);
          }

          @Override
          public void onError(@NonNull Throwable e) {
            e.printStackTrace();
          }

          @Override
          public void onComplete() {
            System.out.println("Done!");
          }
        });
  }
}
