import java.util.Arrays;

public class EjecutarEstudiante{
    
    public static void main(String[] args) {
        
        //Forma 1
        //Creación de los objetos
        Estudiante objEst1 = new Estudiante(909876, "Juan", "Velasco", "Ingieneria");
        Estudiante objEst2 = new Estudiante(634789, "Miriam", "Suares", "Ingieneria");
        Estudiante objEst3 = new Estudiante(382723, "Carlos", "Beltran", "Ingieneria");

        System.out.println(objEst1);
        System.out.println(objEst2);
        System.out.println(objEst3);

        System.out.println("--------------------");
        //Crear arreglo de objetos
        Estudiante[] est = new Estudiante[5];
        est[0] = objEst1;
        est[1] = objEst2;
        est[2] = objEst3;

        //Forma 2

        est[3] = new Estudiante(243527, "Carmen", "Hoyos", "Derecho");
        est[4] = new Estudiante(123974, "Jeronimo", "Torres", "Psicologia");

        System.out.println(Arrays.toString(est));

        System.out.println("------------------------");
        
        for (Estudiante e: est) {
            System.out.println(e);
        }

        System.out.println("------------------------");

        for (int i = 0; i < est.length; i++){
            System.out.println(est[i]);
        }
        
        //Implementar el método matricularCursos(id: int, cursos[]: String): void.

        //Implementar un método que permita saber cuantos estudiantes hay en cada facultad.

        //Implementar un método que permita saber cuantos estudiantes hay en cada curso.
    }
}