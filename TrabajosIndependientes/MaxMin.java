public class MaxMin {
    public static void main(String[] args) {
        int[] numeros = {5, 23, 82, -12, -41, 51};
        
        int mayor = 0, menor = 0;
        
        for(int i = 0; i < numeros.length; i++){
                        if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
            System.out.println(numeros[i]);
        }
        System.out.println(" El numero mayor es: " + mayor);

                System.out.println(" El numero menor es: " + menor);
    }
    
}