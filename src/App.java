import Ejercicio_01_sign.SignValidator;
import Ejercicio_02_sorting.StackSorter;

import java.util.Stack;

public class App {
    public static void main(String[] args) {


        System.out.println(" Ejercicio 01: Validación de signos ");

        String cadenaValida = "([]){}";
        String cadenaInvalida = "({)}";

        System.out.println("Cadena: " + cadenaValida + "  Resultado: " + SignValidator.isValid(cadenaValida));
        System.out.println("Cadena: " + cadenaInvalida + "  Resultado: " + SignValidator.isValid(cadenaInvalida));


        System.out.println("\n Ejercicio 02: Ordenar Stack ");

        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(1);
        stack.push(4);
        stack.push(2);

        System.out.println("Stack original:");
        System.out.println(stack);

        StackSorter.sortStack(stack);  

        System.out.println("Stack ordenado:");
        System.out.println(stack);


     
        /*
        Persona p1 = new Persona("Juan");
        Persona p2 = new Persona("Ana");
        Persona p3 = new Persona("Maria");

        ColaG<Persona> colaPersonas = new ColaG<>();
        colaPersonas.add(p1);
        colaPersonas.add(p2);
        colaPersonas.add(p3);
        System.out.println("tamp= " + colaPersonas.size());
        colaPersonas.printCola();
        System.out.println("Atiende a la persona: " + colaPersonas.remove());
        System.out.println("tamp= " + colaPersonas.size());
        colaPersonas.printCola();
        Persona pEliminada = colaPersonas.removeByName("Maria");
        System.out.println("Persona eliminada: " + pEliminada);
        */

        /*
        // Código relacionado con Stack no genérico y StackG, tampoco es requerido
        Stack stack = new Stack();
        stack.push(10);
        stack.push(-1);
        stack.push(0);
        stack.push(5);
        stack.pop();
        stack.printStack();

        StackG<String> stackGString = new StackG<>();
        stackGString.push("Uno");
        stackGString.push("Cuatro");
        stackGString.push("Cinco");
        stackGString.printStack();

        Cola cola = new Cola();
        cola.add(5);
        cola.add(7);
        cola.add(10);
        cola.printCola();
        cola.remove();
        cola.printCola();
        */
    }
}
