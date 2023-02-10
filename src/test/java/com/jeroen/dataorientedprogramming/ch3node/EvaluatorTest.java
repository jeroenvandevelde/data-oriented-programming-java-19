package com.jeroen.dataorientedprogramming.ch3node;

import org.junit.jupiter.api.Test;

import java.util.function.Function;

public class EvaluatorTest {
    @Test
    void test() {
        Evaluator evaluator = new Evaluator();
        double eval = evaluator.eval(new AddNode(new ConstNode(5.0), new ConstNode(3.0)));
        System.out.println(eval);
    }
}
