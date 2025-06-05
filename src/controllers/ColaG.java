package controllers;

import java.util.EmptyStackException;
import models.NodeGenerico;
import models.Persona;

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

    public T findByName(String name) {
        NodeGenerico<T> current = inicio;
        while (current != null) {
            T value = current.getValue();
            if (value instanceof Persona) {
                Persona persona = (Persona) value;
                if (persona.getNombre().equalsIgnoreCase(name)) {
                    System.out.println("Encontrado: " + persona);
                    return value;
                }
            }
            current = current.getNext();
        }
        System.out.println("No se encontró una persona con el nombre: " + name);
        return null;
    }

    public T removeByName(String name) {
        NodeGenerico<T> current = inicio;
        NodeGenerico<T> prev = null;

        while (current != null) {
            T value = current.getValue();
            if (value instanceof Persona) {
                Persona persona = (Persona) value;
                if (persona.getNombre().equalsIgnoreCase(name)) {
                    // Si está al inicio
                    if (current == inicio) {
                        return remove();
                    }
                    if (current == ultimo) {
                        ultimo = prev;
                    }
                    prev.setNext(current.getNext());
                    size--;
                    System.out.println("Eliminado: " + persona);
                    return value;
                }
            }
            prev = current;
            current = current.getNext();
        }

        System.out.println("No se encontró una persona con el nombre: " + name);
        return null;
    }
}
