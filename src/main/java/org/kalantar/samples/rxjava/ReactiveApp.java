package org.kalantar.samples.rxjava;


import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.observables.ConnectableObservable;

public class ReactiveApp {
    public static void main(String[] args) {
        final ConnectableObservable<String> src =
                Observable.just("Alpha", "Beta", "Gamma").publish();
        src.subscribe(s -> System.out.println("[" + Thread.currentThread().getId() + "] Observer 1: " + s));
        src.map(String::length)
                .subscribe(s -> System.out.println("[" + Thread.currentThread().getId() + "] Observer 2: " + s));
        src.connect();
    }
}
