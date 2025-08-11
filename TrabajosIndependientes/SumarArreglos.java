public class SumarArreglos {

    public static void main(String[] args) {
        int[] numeros = {5, 10, 15, 20, 25};

        int suma = 0;

        for(int i : numeros){
            
            suma += i;
        }

        System.out.println("La suma de los números en el arreglo es: " + suma);
    }
}