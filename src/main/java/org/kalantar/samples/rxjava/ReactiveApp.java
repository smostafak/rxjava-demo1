package org.kalantar.samples.rxjava;


import io.reactivex.Maybe;
import io.reactivex.rxjava3.core.Observable;

public class ReactiveApp {
    public static void main(String[] args) {
        Observable.just(100)
                .subscribe(integer -> System.out.println("Process 1: " + integer),
                        e -> System.out.println("ERR: " + e),
                        () -> System.out.println("Process 1 Done!"));

        Observable.empty()
                .subscribe(integer -> System.out.println("Process 2: " + integer),
                        e -> System.out.println("ERR: " + e),
                        () -> System.out.println("Process 2 Done!"));
    }
}
