package org.kalantar.samples.rxjava;


import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;

import java.util.concurrent.TimeUnit;

public class ReactiveApp {
    public static void main(String[] args) throws InterruptedException {
        final Disposable disposable = Observable.interval(1, TimeUnit.SECONDS)
                .subscribe(i -> System.out.println("RCV: " + i));

        Thread.currentThread().join(5000);

        disposable.dispose();

        Thread.currentThread().join(5000);
    }
}
