package org.kalantar.samples.rxjava;


import io.reactivex.Maybe;

public class ReactiveApp {
    public static void main(String[] args) {
        Maybe.just(100)
                .subscribe(integer -> System.out.println("Process 1: " + integer),
                        e -> System.out.println("ERR: " + e),
                        () -> System.out.println("Process 1 Done!"));

        Maybe.empty()
                .subscribe(integer -> System.out.println("Process 2: " + integer),
                        e -> System.out.println("ERR: " + e),
                        () -> System.out.println("Process 2 Done!"));
    }
}
