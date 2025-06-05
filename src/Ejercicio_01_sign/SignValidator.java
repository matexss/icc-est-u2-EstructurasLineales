package Ejercicio_01_sign;

import java.util.Stack;

public class SignValidator {
    public static boolean isValid(String cadena) {
        Stack<Character> pila = new Stack<>();
        for (char actual : cadena.toCharArray()) {
            if (actual == '(' || actual == '[' || actual == '{') {
                pila.push(actual);
            } else {
                if (pila.isEmpty()) return false;
                char tope = pila.pop();
                if (!esPar(tope, actual)) return false;
            }
        }
        return pila.isEmpty();
    }

    private static boolean esPar(char a, char b) {
        return (a == '(' && b == ')') ||
               (a == '[' && b == ']') ||
               (a == '{' && b == '}');
    }
}
