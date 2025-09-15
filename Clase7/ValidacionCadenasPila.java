import java.util.Stack;

public class ValidacionCadenasPila {
    
    public static void main(String[] args) {
        
        String[] signos = {"{", "{", "}", "}","}"};

        //Cree una pila de llaves y verifique si las llaves están
        //completas, es decir, una llave que abre tiene una llave que cierra.
        Stack<String> p = new Stack<>();
        
        for (int i = 0; i < signos.length; i++) {
            p.push(signos[i]);
        }

        System.out.println(p);
        int contador1 =0, contador2 = 0;
        
        int tam = p.size();
        for (int i = 0; i < tam; i++) {
            if(p.peek().equals("{")){
                contador1 += 1;
            }else{
                contador2 += 1;
            }
            p.pop();
        }

                            //operador ternario
        System.out.println(contador1==contador2 ? "Equilibrados" : "No Equilibrado");

        /* 
         * Revisar e implementar los metodos que se heredan de la clase vector
         * https://docs.oracle.com/javase/8/docs/api/java/util/Stack.html
         * add, addAll, contains,........todos los demas metodos
         * hacer un ejercicio donde se hagan las pruebas
        */

    }
}
