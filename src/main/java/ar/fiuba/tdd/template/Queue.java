package ar.fiuba.tdd.template;

public class Queue<T> {

    private Node<T> first;
    private int nodeCount;

    public Queue() {
        this.first = new DummyNode<>();
        this.nodeCount = 0;
    }

    public boolean isEmpty() {
        return this.first.emptyNode();
    }

    public int size() {
        return this.nodeCount;
    }

    public void add(T item) {
        this.first = this.first.linkFinalNode(item);
        this.nodeCount++;
    }

    public T top() {
        return this.first.getElement();
    }

    public void remove() {
        this.first = this.first.nextNode();
        this.nodeCount--;
    }
}
