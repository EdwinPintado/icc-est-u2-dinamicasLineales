import java.util.Stack;

public class Ejercicio1 {

    // metodo que devuelve una cadena de texto invertida 
    // texto --> COMPUTACION
    // texto --> BOICATUPMOC
    // USANDO SOLO PILAS 

    public String invertString (String texto){
        Stack<Character> pila = new Stack<>();

        for(int i = 0 ; i < texto.length(); i++ ){
            texto.charAt(i);
            pila.push(texto.charAt(i));
        }

        for(char letra : texto.toCharArray()){
            pila.push(letra);
        }

        String invertido = "";
        while(!pila.isEmpty()){
            invertido += pila.pop();
        }
        return invertido; 
    }
}
