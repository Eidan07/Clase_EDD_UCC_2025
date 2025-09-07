package CasilleroAmazon;

public class Paquete {
    
    private String FechaIngreso;
    private String Destinatario;
    private String Tamano;



    public Paquete (String Destinatario, String FechaIngreso, String Tamano){
        this.Destinatario = Destinatario;
        this.FechaIngreso = FechaIngreso;
        this.Tamano = Tamano;
    }

    public String getDestinatario(){     
        return Destinatario;
    }

    public String getFechaIngreso(){
        return FechaIngreso;
    }


    public String getTamano() {
        return Tamano;
    }

    public String mostrarInformacion(){
        return "Destinatario "+ Destinatario + "Fecha de Ingreso " + FechaIngreso + " Tamaño: " + Tamano;
    }
}
