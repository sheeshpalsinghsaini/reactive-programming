package com.reactive.programming.basics;

import reactor.core.publisher.Mono;

public class MonoDemo {

    public static void main(String[] args) {
        Mono<String> monoString = Mono.just("Hello World");

        monoString.subscribe(
                System.out::println,        // emitting items will come here
                error -> System.out.println("Error occur : "+error), // if any error throw then will execute this one
                () -> System.out.println("Mono Stream done successfully...") // will execute on the successful completion stream.
        );

    }
}
