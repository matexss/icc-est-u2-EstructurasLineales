package controllers;

import java.util.EmptyStackException;
import models.Node;

public class Cola {
    private Node inicio;
    private Node ultimo;
    private int size;

    public Cola() {
        this.inicio = null;
        this.ultimo = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return inicio == null;
    }

    public void add(int value) {
        Node newNode = new Node(value);
        if (isEmpty()) {
            inicio = newNode;
            ultimo = newNode;
        } else {
            ultimo.setNext(newNode);
            ultimo = newNode;
        }
        size++;
    }

    public int remove() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        int value = inicio.getValue();
        inicio = inicio.getNext();
        if (inicio == null) {
            ultimo = null;
        }
        size--;
        return value;
    }

    public int peek() {
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
        Node current = inicio;
        StringBuilder sb = new StringBuilder();
        while (current != null) {
            sb.append(current.getValue()).append("|");
            current = current.getNext();
        }
        sb.setLength(sb.length() - 1); // Eliminar el último '|'
        System.out.println(sb);
    }
}
