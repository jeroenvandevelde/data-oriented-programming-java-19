package com.jeroen.dataorientedprogramming.ch3node;

import java.util.function.Function;

public class Evaluator {
    double eval(Node n) {
        return switch (n) {
            case AddNode(var left, var right) -> eval(left) + eval(right);
            case MulNode(var left, var right) -> eval(left) * eval(right);
            case ExpNode(var node, int exp) -> Math.exp(eval(node));
            case NegNode(var node) -> -eval(node);
            case ConstNode(double val) -> val;
        };
    }

    String format(Node n) {
        return switch (n) {
            case AddNode(var left, var right) -> format(left) + " + " + format(right);
            case MulNode(var left, var right) -> format(left) + " * " + format(right);
            case ExpNode(var node, int exp) -> String.format("%s^%d", format(node), exp);
            case NegNode(var node) -> String.format("-%s", format(node));
            case ConstNode(double val) -> Double.toString(val);
        };
    }
}
