package org.kalantar.samples.rxjava;


import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.Observable;

public class ReactiveApp {
    public static void main(String[] args) {
        final Maybe<String> maybe = Observable.just("Alpha", "Beta")
                .firstElement();
        maybe.subscribe(i -> System.out.println("RCV: " + i),
                e -> System.out.println("ERR: " + e),
                () -> System.out.println("Done!"));


    }
}
