package com.github.wblancqu.spikes.java8;

import org.junit.Test;
import rx.Observable;

import java.util.List;

public class StreamTest {

    @Test
    public void testStreaming() {
        List<Integer> range = Observable.range(0, 1000000).toList().toBlocking().first();
        range.parallelStream().filter(t -> t % 2 == 1).forEach(t -> System.out.println(Thread.currentThread().getName() + " " + t));

    }
}
