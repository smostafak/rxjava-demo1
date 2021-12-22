package org.kalantar.samples.rxjava;


import io.reactivex.rxjava3.core.Observable;

public class ReactiveApp {
    public static void main(String[] args) {
        Observable.just(1 )
                .map(i -> i / 0)
                .subscribe(i -> System.out.println("RCV: " + i),
                        e -> System.out.println("ERR: " + e));
    }
}
