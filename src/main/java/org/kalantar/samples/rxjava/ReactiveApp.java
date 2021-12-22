package org.kalantar.samples.rxjava;


import io.reactivex.rxjava3.core.Observable;

public class ReactiveApp {
    private static int START = 1;
    private static int COUNT = 3;

    public static void main(String[] args) {
        final var range = Observable.range(START, COUNT);
        final var name = Thread.currentThread().getName();
        range.subscribe(i -> System.out.println("[" + name + "] Observer 1: " + i));
        COUNT = 5;
        range.subscribe(i -> System.out.println("[" + name + "] Observer 2: " + i));
    }
}
