import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        runLinkedList(); // LinkedList
        runQueue(); // Colas
        runStack(); // Pilas

        System.out.println("\n---- EJERCICIO 1 ----\n");
        Ejercicio1 ejercicio1 = new Ejercicio1();
        String texto = "COMPUTACION";
        String invertido = ejercicio1.invertString(texto);
        System.out.println(invertido);



        System.out.println("\n---- EJERCICIO 2 ----\n");
        {
        System.out.println("Primer inteto con (radar)");
        Ejercicio2 ejercicio2 = new Ejercicio2();
        String texto1 = "radar";
        texto = texto1.toLowerCase();
        boolean esPolindromo = ejercicio2.esPalindromo(texto);
        System.out.println(esPolindromo);
        }
        {
        System.out.println("\nSegundo inteto con (computacion)");
        Ejercicio2 ejercicio2 = new Ejercicio2();
        String texto2 = "computacion";
        texto = texto2.toLowerCase();
        boolean esPolindromo = ejercicio2.esPalindromo(texto);
        System.out.println(esPolindromo);
        }
        {
        System.out.println("\nTercer inteto con (Radar)");
        Ejercicio2 ejercicio2 = new Ejercicio2();
        String texto3 = "Radar";
        texto = texto3.toLowerCase();
        boolean esPolindromo = ejercicio2.esPalindromo(texto);
        System.out.println(esPolindromo);
        }

    }

    private static void runStack() {
        Stack<String> pila = new Stack<>();
        pila.push("A");
        pila.push("B");
        pila.push("C");
        
        System.out.println("\nMetodos Stack \n");
        String elemento = pila.pop();
        System.out.println(pila.size());
        System.out.println(elemento);

        Deque<String> pila2 = new ArrayDeque<>();
        Deque<String> pila3 = new LinkedList<>();
        pila2.push("a");
        pila3.push("A");
        pila.pop();
        pila.pop();
    }

    private static void runQueue() {
       Queue<String> cola = new ArrayDeque<>();
       cola.offer("Jose");
       cola.offer("Andres");
       cola.offer("Ana");

       System.out.println("\nMetodos Queue \n");
       System.out.println(cola.isEmpty());
       System.out.println(cola.size());

       System.out.println(cola.peek());
       System.out.println(cola.size());

       System.out.println(cola.poll());
       System.out.println(cola.size());

       while (!cola.isEmpty()) {
        String cliente = cola.poll();
        System.out.println("Atendi a " + cliente);

        // ofer --> agrega al final
        // peek --> devielve el primero sin eliminarlo
        // poll --> devielve el primero eliminandolo
       }

    }

    private static void runLinkedList() {
        System.out.println("\nLista Enlazada / LinkedList\n");
        LinkedList<String> nombres = new LinkedList<>();

        System.out.println("\nMetodos Lista Enlazada \n");
        System.out.println("Esta vacia?: " + nombres.isEmpty());
        System.out.println("Tamanio: " + nombres.size() + "\n");

        nombres.add("Juan");
        nombres.add("Pedro");
        nombres.add("Maria");
        nombres.add("Diego");

        System.out.println("Esta vacia?: " + nombres.isEmpty());
        System.out.println("Tamanio: " + nombres.size() + "\n");

        // Devuelve el primero
        System.out.println(nombres.getFirst());
        // Devuelve el dato en ese indice
        System.out.println(nombres.get(2));
        // Devuelve el ultimo
        System.out.println(nombres.getLast());

        // Retorna el primero pero no lo elimina
        System.out.println(nombres.peek());
        // Devuelve el tamaño
        System.out.println(nombres.size());
    
        // Elimina y devuelve el valor
        System.out.println(nombres.pop());
        System.out.println(nombres.size());
    }
}
