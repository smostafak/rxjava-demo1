package org.kalantar.samples.rxjava;


import io.reactivex.rxjava3.core.Observable;

public class ReactiveApp {
    public static void main(String[] args) {
        Observable.range(1, 13)
                .subscribe(i -> System.out.println("RCV: " + i));
    }
}
