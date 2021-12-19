package org.kalantar.samples.rxjava;

import io.reactivex.rxjava3.core.Observable;

public class ReactiveApp {
    public static void main(String[] args) {
        final Observable<String> src = Observable.just("Alpha", "Beta", "Gamma");
        src.subscribe(s -> System.out.println("Observer 1: " + s));
        src.map(String::length)
                .filter(i -> i >= 5)
                .subscribe(s -> System.out.println("Observer 2: " + s));
    }
}
