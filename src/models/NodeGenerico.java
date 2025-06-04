package models;

public class NodeGenerico<T> {
    private T value;
    private NodeGenerico<T> next;

    public NodeGenerico(T value) {
        this.value = value;
        this.next = null;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public NodeGenerico<T> getNext() {
        return next;
    }

    public void setNext(NodeGenerico<T> next) {
        this.next = next;
    }
}
