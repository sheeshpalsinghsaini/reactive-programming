package com.reactive.programming.basics;

import reactor.core.publisher.Flux;

public class ErrorHandlingDemo {
    public static void main(String[] args) {
        Flux<Integer> fluxStream = Flux.just("1", "2", "three", "4")
                .map(value -> {
                    try {
                        return Integer.parseInt(value);
                    } catch (NumberFormatException numberFormatException) {
                        throw new RuntimeException("Parsing Error...");
                    }
                });

        fluxStream.subscribe(
                System.out::println,
                error -> System.out.println("Error occur : "+error), // if error will occur then flow will break.
                () -> System.out.println("Flux stream successfully done...")
        );

    }
}
