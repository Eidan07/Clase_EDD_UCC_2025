public class EjecutarVehiculo{

    public static void main(String[] args) {
       Vehiculo[] v = new Vehiculo [5];
       v[0] = new Vehiculo ("Mercedes benz ", "152CAS ", 2025, true);
       v[1] = new Vehiculo ("Toyota ", "237QEY ", 2016, false);
       v[2] = new Vehiculo ("Audi ", "198FQW ",  1990, false);
       v[3] = new Vehiculo ("Mitsubishi ", "428WHS ", 2015, true);
       v[4] = new Vehiculo ("Mercedes benz ", "152CAS ", 2025, true);

       v[0].recorrerVector(v);
    }
}