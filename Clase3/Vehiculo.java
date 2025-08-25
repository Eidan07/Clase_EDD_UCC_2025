public class Vehiculo{
    private String marca;
    private String chasis;
    private int modelo;
    private boolean matriculado;

    public Vehiculo (String marca, String chasis , int modelo, boolean matriculado){
        this.marca = marca;
        this.chasis = chasis;
        this.modelo = modelo;
        this.matriculado = matriculado;

        
    }
    
    public String getMarca(){
            return marca;
        }


    public String toString(){
        return "Vehiculo { Marca: " + marca + " Chasis: " + chasis + " Modelo: "+ modelo + " Matriculado: " + matriculado + "}";
    }

    public void recorrerVector(Vehiculo[] v){
        for(int i = 0; i < v.length; i++){
            System.out.println(v[i]);
       }

    }
}