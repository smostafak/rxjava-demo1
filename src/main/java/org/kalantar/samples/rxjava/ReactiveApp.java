package org.kalantar.samples.rxjava;


import io.reactivex.rxjava3.core.Single;

public class ReactiveApp {
    public static void main(String[] args) {
        Single.just("Hello!")
                .map(String::length)
                .subscribe(System.out::println, e -> System.out.println("ERR: " + e));
    }
}
