public class Estudiante{

    //Atributos de la clase
    private int id;
    private String nombre;
    private String apellido;
    private String facultad;
    private String[] cursos;

    //Constructor de la clase
    //(Para reconocer un constructor es porque tiene el mismo nombre de la clase)

    public Estudiante(int id, String nombre, String apellido, String facultad){
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.facultad = facultad;
    }

    public int getId(){
        return id;
    }

    public String getFacultad(){
        return facultad;
    }

    public String[] getCursos(){
        return cursos;
    }


    public void matricularCursos (int id, String[] cursos){
        this.cursos = cursos;
        String cad = " ";
        for (int i = 0; i < cursos.length; i++){
            cad += cursos[i] + " ";
        }
        System.out.println("id: "+ id + " Cursos Matriculados: " + cad);
    }
    public String toString(){
        return "Estudiante { id:" + id + " Nombre " + nombre + " Apellido " + apellido + " Facultad " + facultad + " } ";
    }

        public void contarPorFacultad(Estudiante[] estudiantes){
        int contadorIngieneria = 0;
        int contadorDerecho = 0;
        int contadorPsicologia = 0;

        for (int i = 0; i < estudiantes.length; i++){
            if (estudiantes[i] == null) continue;

            if (estudiantes[i].getFacultad().equalsIgnoreCase(" Ingieneria ")){
                contadorIngieneria++;
            } else if (estudiantes[i].getFacultad().equalsIgnoreCase(" Derecho ")){
                contadorDerecho++;
            } else if (estudiantes[i].getFacultad().equalsIgnoreCase(" Psicologia ")){
                contadorPsicologia++;
            }
        }

        System.out.println(" Estudiantes en Ingieneria: " + contadorIngieneria);
        System.out.println(" Estudiantes en Derecho: " + contadorDerecho);
        System.out.println(" Estudiantes en Psicologia: " + contadorPsicologia);

    }

    public void contarPorCursos(Estudiante[] estudiantes){
    int contadorCalculo = 0;
    int contadorProbabilidad = 0;
    int contadorEstructura = 0;

    int contadorFilosofia = 0;
    int contadorCivil = 0;
    int contadorConstitucional = 0;

    int contadorPsicobiologia = 0;
    int contadorFundamentos = 0;
    int contadorPsicometria = 0;

    for(int i = 0; i < estudiantes.length; i++){
        if(estudiantes[i] == null || estudiantes[i].getCursos() == null ){
            continue;
        }

        String[] cursos = estudiantes[i].getCursos();
        
        for(int j = 0; j < cursos.length; j++){
            String curso = cursos[j];

            if (curso.equals(" Calculo Integral ")){
                contadorCalculo++;
            } else if (curso.equals(" Probabilidad y Estadistica ")){
                contadorProbabilidad++;
            } else if (curso.equals(" Estructura de Datos ")){
                contadorEstructura++;
            } else if (curso.equals(" Filosofía del Derecho ")){
                contadorFilosofia++;
            } else if (curso.equals(" Derecho civil ")){
                contadorCivil++;
            } else if (curso.equals(" Derecho constitucional ")){
                contadorConstitucional++;
            } else if (curso.equals(" Psicobiología ")){
                contadorPsicobiologia++;
            } else if (curso.equals(" Fundamentos de la psicología ")){
                contadorFundamentos++;
            } else if (curso.equals(" Psicometría ")){
                contadorPsicometria++;
            }
        }
    }

    System.out.println(" Curso Calculo Integral: " + contadorCalculo + " estudiantes ");
    System.out.println("-------------------------------------------------------------");
    System.out.println(" Curso Probabilidad y Estadistica: " + contadorProbabilidad + " estudiantes ");
    System.out.println("-------------------------------------------------------------");
    System.out.println(" Curso Estructura de Datos: " + contadorEstructura + " estudiantes ");
    System.out.println("-------------------------------------------------------------");
    System.out.println(" Curso Filosofía del Derecho: " + contadorFilosofia + " estudiantes ");
    System.out.println("-------------------------------------------------------------");
    System.out.println(" Curso Derecho civil: " + contadorCivil + " estudiantes ");
    System.out.println("-------------------------------------------------------------");
    System.out.println(" Curso Derecho constitucional: " + contadorConstitucional + " estudiantes ");
    System.out.println("-------------------------------------------------------------");
    System.out.println(" Curso Psicobiología: " + contadorPsicobiologia + " estudiantes ");
    System.out.println("-------------------------------------------------------------");
    System.out.println(" Curso Fundamentos de la psicología: " + contadorFundamentos + " estudiantes ");
    System.out.println("-------------------------------------------------------------");
    System.out.println(" Curso Psicometría: " + contadorPsicometria + " estudiantes ");
    System.out.println("-------------------------------------------------------------");
    }
    
}
