package com.jeroen.dataorientedprogramming;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class OptTest {

    @Test
    void testNone() {
        Opt<Integer> integerOpt = new Opt.None<>();

        String result = switch (integerOpt) {
            case Opt.None<Integer> ignored -> "None";
            case Opt.Some<Integer> some -> some.value().toString();
        };

        assertThat(result).isEqualTo("None");
    }

    @Test
    void testSome() {
        Opt<Integer> integerOpt = new Opt.Some<>(1);

        String result = switch (integerOpt) {
            case Opt.None<Integer> ignored -> "None";
            case Opt.Some<Integer> some -> some.value().toString();
        };

        assertThat(result).isEqualTo("1");

    }

}
