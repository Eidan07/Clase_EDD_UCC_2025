import java.util.Stack;

public class PilasColas {

    public static void main (String[] args) {

        Stack<Int> pila = new Stack<>();
        
        System.out.println(" La pila está vacía? " + pila.empty());
        
        pila.push(10);
        pila.push(20);
        pila.push(5);
        pila.push(9);
        pila.push(35);

        
    }
}