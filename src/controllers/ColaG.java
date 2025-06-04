package controllers;

import java.util.EmptyStackException;
import models.NodeGenerico;

public class ColaG<T> {
    private NodeGenerico<T> inicio;
    private NodeGenerico<T> ultimo;
    private int size;

    public ColaG() {
        this.inicio = null;
        this.ultimo = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return inicio == null;
    }

    public void add(T value) {
        NodeGenerico<T> newNode = new NodeGenerico<>(value);
        if (isEmpty()) {
            inicio = newNode;
            ultimo = newNode;
        } else {
            ultimo.setNext(newNode);
            ultimo = newNode;
        }
        size++;
    }

    public T remove() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T value = inicio.getValue();
        inicio = inicio.getNext();
        if (inicio == null) {
            ultimo = null;
        }
        size--;
        return value;
    }

    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return inicio.getValue();
    }

    public int size() {
        return size;
    }

    public void printCola() {
        if (isEmpty()) {
            System.out.println("La cola está vacía.");
            return;
        }
        NodeGenerico<T> current = inicio;
        StringBuilder sb = new StringBuilder();
        while (current != null) {
            sb.append(current.getValue()).append(" | ");
            current = current.getNext();
        }
        sb.setLength(sb.length() - 1); // Eliminar el último "|"
        System.out.println(sb);
    }
}
