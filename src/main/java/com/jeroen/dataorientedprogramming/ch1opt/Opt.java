package com.jeroen.dataorientedprogramming.ch1opt;

public sealed interface Opt<T> {
    record Some<T>(T value) implements Opt<T> { }
    record None<T>() implements Opt<T> { }
}
