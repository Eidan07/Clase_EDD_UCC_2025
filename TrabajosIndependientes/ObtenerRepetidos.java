public class ObtenerRepetidos {
    public static void main(String[] args) {
    
        int[] numeros = new int[10];
        int contador;

        for(int i = 0; i < 10; i++){
            numeros[i] = (int) (Math.random() *5);

            System.out.println(numeros[i]);
        }

        for(int i = 0; i < numeros.length; i++){
            contador = 1;
            for (int j = 0; j < numeros.length; j++){
                if(j != i){
                    if (numeros[i] == numeros[j]) {
                        contador++;
                    }
                }
            }
            System.out.println("El número " + numeros[i] + " se repite " + contador + " veces ");
        }
    }
}
