package org.kalantar.samples.rxjava;


import io.reactivex.Completable;

public class ReactiveApp {
    public static void main(String[] args) {
        Completable.fromRunnable(() -> System.out.println("Process"))
                .subscribe(() -> System.out.println("Done!"));

    }
}
