package com.github.wblancqu.spikes.rxjava;

import org.junit.Test;
import rx.Observable;
import rx.schedulers.Schedulers;

import static java.util.Arrays.asList;

public class RxJavaTest {

    @Test
    public void testName() {
        Observable.from(asList(1, 2, 3, 4))
                .map(i -> Thread.currentThread().getName() + " : " + i)
                .subscribeOn(Schedulers.computation())
                .subscribe(System.out::println);
    }
}
