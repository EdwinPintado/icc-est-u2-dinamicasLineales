import java.util.Stack;
public class Ejercicio2 {
    public boolean esPalindromo(String palabra) {

    // Método que verifica si una cadena de texto
    // es palíndroma usando una pila.
    // Un texto es palíndromo cuando se lee igual
    // de izquierda a derecha y de derecha a izquierda.
    // Ejemplo:
    // texto -> radar
    // return -> true
    // texto -> computacion
    // return -> false
    // Restricción:
    // USAR SOLO PILAS COMO ESTRUCTURA AUXILIAR
    // Lógica esperada:
    // 1. Crear una pila de caracteres.
    // 2. Recorrer el texto carácter por carácter.
    // 3. Insertar cada carácter en la pila.
    // 4. Sacar los caracteres de la pila para formar
    // El texto invertido.
    // 5. Comparar el texto original con el texto invertido.
    // 6. Si son iguales, retornar true.
    // 7. Si son diferentes, retornar false.

        Stack<Character> pila = new Stack<>();

        for(char letra: palabra.toCharArray()){
            pila.push (letra);
        }
        
        for(char letra: palabra.toCharArray() ){
            if(letra != pila.pop())
                return false;
        }
        return true;

    }
}

