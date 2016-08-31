package ar.fiuba.tdd.template;

class DataNode<T> extends Node<T> {

    private T item;
    private Node<T> next;

    DataNode(T item) {
        this.item = item;
        this.next = new DummyNode<T>();
    }

    public boolean emptyNode() {
        return false;
    }

    public Node<T> linkFinalNode(T item) {
        this.next = this.next.linkFinalNode(item);
        return this;
    }

    public T getElement() {
        return this.item;
    }

    public Node<T> nextNode() {
        return this.next;
    }
}
