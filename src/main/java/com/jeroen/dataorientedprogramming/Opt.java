package com.jeroen.dataorientedprogramming;

public sealed interface Opt<T> {
    record Some<T>(T value) implements Opt<T> { }
    record None<T>() implements Opt<T> { }
}
