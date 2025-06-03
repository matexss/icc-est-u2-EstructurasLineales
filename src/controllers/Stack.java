package controllers;

import java.util.EmptyStackException;
import models.Node;

public class Stack {

    private Node top;

    public Stack() {
        this.top = null;
    }

    // Método para insertar un valor en la pila
    public void push(int value) {
        Node newNode = new Node(value);
        newNode.setNext(top);
        top = newNode;
    }

    // Método para eliminar el elemento superior de la pila y devolver su valor
    public int pop() {
        if (top == null) {
            throw new EmptyStackException();
        }
        int value = top.getValue();
        top = top.getNext();
        return value;
    }

    // Método para verificar si la pila está vacía
    public boolean isEmpty() {
        return top == null;
    }

    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return top.getValue();
    }



     // Método para imprimir la pila
    public void printStack() {
        if (isEmpty()) {
            System.out.println("La pila está vacía.");
            return;
        }
        System.out.println("Contenido de la pila:");
        Node current = top;
        while (current != null) {
            System.out.println(current.getValue());
            current = current.getNext();
        }
         }

}
