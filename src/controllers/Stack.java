package controllers;

import java.util.EmptyStackException;
import models.Node;

public class Stack {
    private Node top;
    private int size;

    public Stack() {
        this.top = null;
        this.size = 0;
    }

    public void push(int value) {
        Node newNode = new Node(value);
        newNode.setNext(top);
        top = newNode;
        size++;
    }

    public int pop() {
        if (top == null) {
            throw new EmptyStackException();
        }
        int value = top.getValue();
        top = top.getNext();
        size--;
        return value;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return top.getValue();
    }

    public int size() {
        return size;
    }

    public void printStack() {
        if (isEmpty()) {
            System.out.println("La pila está vacía.");
            return;
        }
        Node current = top;
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
