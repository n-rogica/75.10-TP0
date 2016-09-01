package ar.fiuba.tdd.template;

public class DummyNode<T> extends Node<T> {

    public boolean emptyNode() {
        return true;
    }

    public DataNode<T> linkFinalNode(T item) {
        return new DataNode<T>(item);
    }

    public T getElement() {
        throw new AssertionError("The queue is empty");
    }

    public Node nextNode() {
        throw  new AssertionError("The queue is empty");
    }








}
