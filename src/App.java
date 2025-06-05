import controllers.ColaG;
import models.Persona;


public class App {
    public static void main(String[] args) {

        Persona p1 = new Persona("Juan");
        Persona p2 = new Persona("Ana");
        Persona p3 = new Persona("Maria");

        ColaG<Persona> colaPersonas = new ColaG<Persona>();
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

 /*

        Stack stack = new Stack();
        stack.push(10);
        stack.push(-1);
        stack.push(0);
        stack.push(5);
        System.out.println("tamp= " + stack.size());
        stack.printStack();

        stack.pop();
        System.out.println("tamp= " + stack.size());
        stack.printStack();
       

        StackG<String> stackGString = new StackG<>();
        stackGString.push("Uno");
        stackGString.push("Cuatro");
        stackGString.push("Cinco");
        System.out.println("tamp= " + stackGString.size());
        stackGString.printStack();
        
        Cola cola = new Cola();
        cola.add(5);
        cola.add(7);
        cola.add(10);
        System.out.println("tamp= " + cola.size());
        cola.printCola();
        cola.remove();
        System.out.println("tamp= " + cola.size());
        cola.printCola();

*/



        
}
}
