package com.jeroen.dataorientedprogramming.ch3node;

sealed interface Node permits BinaryNode, ConstNode, ExpNode, NegNode { }
