package com.reactive.programming.basics;

import reactor.core.publisher.Flux;

public class FluxDemo {

    public static void main(String[] args) {
        Flux<String> fluxStream = Flux.just("Hello", "Reactive", "Programmer", "with", "Project Reactor");

        fluxStream.subscribe(
                System.out::println,
                error -> System.out.println("Error occur : "+ error),
                () -> System.out.println("Flux Stream Successfully completion...")
        );
    }
}
