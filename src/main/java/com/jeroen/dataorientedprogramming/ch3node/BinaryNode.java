package com.jeroen.dataorientedprogramming.ch3node;

sealed interface BinaryNode extends Node {
    Node left();
    Node right();
}

record AddNode(Node left, Node right) implements BinaryNode { }
record MulNode(Node left, Node right) implements BinaryNode { }
record ExpNode(Node left, int exp) implements Node { }
record NegNode(Node node) implements Node { }
record ConstNode(double val) implements Node { }
