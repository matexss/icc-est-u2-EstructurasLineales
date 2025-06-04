package controllers;

import models.NodeGenerico;

public class StackG<T> {
    private int size;
    private NodeGenerico<T> top;

    public StackG() {
        this.top = null;
        this.size = 0;
    }

    public void push(T value) {
        NodeGenerico<T> newNode = new NodeGenerico<>(value);
        newNode.setNext(top);
        top = newNode;
        size++;
    }

    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("La pila está vacía");
        }
        T value = top.getValue();
        top = top.getNext();
        size--;
        return value;
    }

    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("La pila está vacía");
        }
        return top.getValue();
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int size() {
        return size;
    }

    public void printStack() {
        if (isEmpty()) {
            System.out.println("La pila está vacía.");
            return;
        }
        NodeGenerico<T> current = top;
        StringBuilder sb = new StringBuilder();
        while (current != null) {
            sb.append(current.getValue()).append(" | ");
            current = current.getNext();
        }
        // Eliminar el último '|'
        sb.setLength(sb.length() - 1);
        System.out.println(sb);
    }
}
