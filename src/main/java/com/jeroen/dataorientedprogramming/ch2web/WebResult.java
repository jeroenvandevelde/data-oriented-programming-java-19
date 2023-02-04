package com.jeroen.dataorientedprogramming.ch2web;

public sealed interface WebResult<T> {
    record Result<T>(T result) implements WebResult<T> { }
    record NotFound<T>() implements WebResult<T> { }
    record Error<T>() implements WebResult<T> { }
}
