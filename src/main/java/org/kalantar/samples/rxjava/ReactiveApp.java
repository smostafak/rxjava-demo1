package org.kalantar.samples.rxjava;


import io.reactivex.Observable;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.observers.ResourceObserver;

import java.util.concurrent.TimeUnit;

public class ReactiveApp {
  public static void main(String[] args) throws InterruptedException {
    final Disposable disposable = Observable.interval(1, TimeUnit.SECONDS)
        .subscribeWith(new ResourceObserver<>() {

          @Override
          public void onNext(@NonNull Long aLong) {
            System.out.println(aLong);
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

    Thread.currentThread().join(5000);

    disposable.dispose();

    System.out.println("Wait 5s...");

    Thread.currentThread().join(5000);
  }
}
