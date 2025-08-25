import java.util.Arrays;

public class EjecutarEstudiante{
    
    public static void main(String[] args) {
        
        //Forma 1
        //Creación de los objetos
        //Estudiante objEst1 = new Estudiante(909876, " Juan ", " Velasco ", " Ingieneria ");
        //Estudiante objEst2 = new Estudiante(634789, " Miriam ", " Suares ", " Ingieneria ");
        //Estudiante objEst3 = new Estudiante(382723, " Carlos ", " Beltran ", " Ingieneria ");

        //System.out.println(objEst1);
        //System.out.println(objEst2);
        //System.out.println(objEst3);

        //System.out.println("-------------------------------------------------------------");
        //Crear arreglo de objetos
        Estudiante[] est = new Estudiante[9];
        est[0] = new Estudiante(909876, " Juan ", " Velasco ", " Ingieneria ");
        est[1] = new Estudiante(634789, " Miriam ", " Suares ", " Ingieneria ");
        est[2] = new Estudiante(382723, " Carlos ", " Beltran ", " Ingieneria ");

        //Forma 2

        est[3] = new Estudiante(243527, " Carmen ", " Hoyos ", " Derecho ");
        est[4] = new Estudiante(123974, " Laura ", " Patiño ", " Psicologia ");
        est[5] = new Estudiante(372181, " Mercedes ", " Zuluaga ", " Psicologia ");
        est[6] = new Estudiante(712309, " Eidan ", " Zuñiga ", " Psicologia ");
        est[7] = new Estudiante(412891, " Jaqueline ", " Rengifo ", " Derecho ");
        est[8] = new Estudiante(547098, " Erick ", " Torres ", " Derecho ");
        //System.out.println(Arrays.toString(est));


        //System.out.println("-------------------------------------------------------------");
        
        /*for (Estudiante e: est) {
            System.out.println(e);
        }*/

        System.out.println("-------------------------------------------------------------");

        for (int i = 0; i < est.length; i++){
            System.out.println(est[i]);
        }
        
        System.out.println("-------------------------------------------------------------");
        
        //Implementar el método matricularCursos(id: int, cursos[]: String): void.

        String[] cursosJuan = {" Calculo Integral ", " Probabilidad y Estadistica ", " Estructura de Datos "};
        est[0].matricularCursos(est[0].getId(), cursosJuan);

                String[] cursosMiriam = {" Calculo Integral ", " Probabilidad y Estadistica ", " Estructura de Datos "};
        est[1].matricularCursos(est[1].getId(), cursosMiriam);

                String[] cursosCarlos = {" Calculo Integral ", " Probabilidad y Estadistica ", " Estructura de Datos "};
        est[2].matricularCursos(est[2].getId(), cursosCarlos);

                String[] cursosCarmen = {" Filosofía del Derecho ", " Derecho civil ", " Derecho constitucional "};
        est[3].matricularCursos(est[3].getId(), cursosCarmen);

                String[] cursosLaura = {" Psicobiología ", " Fundamentos de la psicología ", " Psicometría "};
        est[4].matricularCursos(est[4].getId(), cursosLaura);

                        String[] cursosMercedes = {" Psicobiología ", " Fundamentos de la psicología ", " Psicometría "};
        est[5].matricularCursos(est[5].getId(), cursosMercedes);

                        String[] cursosEidan = {" Psicobiología ", " Fundamentos de la psicología ", " Psicometría "};
        est[6].matricularCursos(est[6].getId(), cursosEidan);

                        String[] cursosJaqueline = {" Filosofía del Derecho ", " Derecho civil ", " Derecho constitucional "};
        est[7].matricularCursos(est[7].getId(), cursosJaqueline);

                        String[] cursosErick = {" Filosofía del Derecho ", " Derecho civil ", " Derecho constitucional "};
        est[8].matricularCursos(est[8].getId(), cursosErick);

        System.out.println("-------------------------------------------------------------");

        //Implementar un método que permita saber cuantos estudiantes hay en cada facultad.Ç

        est[0].contarPorFacultad(est);

        System.out.println("-------------------------------------------------------------");
        
        //Implementar un método que permita saber cuantos estudiantes hay en cada curso.

        est[0].contarPorCursos(est);
    }
}