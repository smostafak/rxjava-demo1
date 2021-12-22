package org.kalantar.samples.rxjava;


import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;

public class ReactiveApp {
    public static void main(String[] args) {
        final Single<String> first = Observable.just("Alpha", "Beta")
                .first("NULL");
        first.subscribe(System.out::println);
    }
}
