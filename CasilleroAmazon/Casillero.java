package CasilleroAmazon;

public class Casillero {

    private int Id;
    private Paquete paquete;
    private String tamano;

    public Casillero(int Id, String tamano) {
        this.Id = Id;
        this.paquete = null;
        this.tamano = tamano.toLowerCase();
    }

    public boolean puedeGuardar(Paquete p) {
        String t = p.getTamano().toLowerCase();
        String c = tamano.toLowerCase();

        switch (t) {
            case "small":
                return true;
            case "medium":
                return c.equals("medium") || c.equals("big");
            case "big":
                return c.equals("big");
            default:
                return false;
        }
    }

    public boolean Disponible() {
        return paquete == null;
    }

    public void AsignarPaquete(Paquete paquete) {
        if (Disponible() && puedeGuardar(paquete)) {
            this.paquete = paquete;
        } else {
            System.out.println("El casillero " + Id + " no puede almacenar este paquete.");
        }
    }

    public Paquete getPaquete() {
        return paquete;
    }

    public void LiberarEspacio() {
        this.paquete = null;
    }

    public int getId() {
        return Id;
    }

    public String getTamano() {
        return tamano;
    }
}