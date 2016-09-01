package ar.fiuba.tdd.template;

abstract class Node<T> {

    abstract boolean emptyNode();

    abstract Node<T> linkFinalNode(T item);

    abstract T getElement();

    abstract Node<T> nextNode();
}
