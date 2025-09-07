package CasilleroAmazon;

import java.util.Scanner;

public class EjecutarCasillero {
    private Casillero[][] casilleros;
    private Scanner sc;
    private Menu menu;

    public EjecutarCasillero(int filas, int columnas) {
        sc = new Scanner(System.in);
        menu = new Menu(sc);

        casilleros = new Casillero[filas][columnas];
        int contador = 1;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                String Tamano = (i == 0) ? "small" : (i == 1) ? "medium" : "big";
                casilleros[i][j] = new Casillero(contador++, Tamano);
            }
        }
    }

    public void iniciar() {
        int opcion;
        do {
            menu.mostrarMenu();
            opcion = menu.leerOpcion();

            switch (opcion) {
                case 1:
                    registrarPaquete();
                    break;
                case 2:
                    consultarDisponible();
                    break;
                case 3:
                    mostrarInformacionPaquetes();
                    break;
                case 4:
                    System.out.println("Cerrando aplicación...");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (opcion != 4);

        sc.close();
    }

    private void registrarPaquete() {
        System.out.print("Ingrese el nombre del destinatario: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese la fecha de ingreso (dd/mm/aaaa): ");
        String fechas = sc.nextLine();

        String tamano = menu.mostrarMenuTamanos().toLowerCase();

        Paquete nuevo = new Paquete(nombre, fechas, tamano);

        for (int i = 0; i < casilleros.length; i++) {
            for (int j = 0; j < casilleros[i].length; j++) {
                if (casilleros[i][j].Disponible() && casilleros[i][j].puedeGuardar(nuevo)) {
                    casilleros[i][j].AsignarPaquete(nuevo);
                    System.out.println("Paquete asignado al casillero " + casilleros[i][j].getId() +
                        " (Tamaño casillero: " + casilleros[i][j].getTamano() + ")");
                    return;
                }
            }
        }
        System.out.println("No hay casilleros disponibles para el tamaño de su paquete.");
    }

    private void consultarDisponible() {
        System.out.println("\n----- Casilleros disponibles -----");
        for (int i = 0; i < casilleros.length; i++) {
            for (int j = 0; j < casilleros[i].length; j++) {
                if (casilleros[i][j].Disponible()) {
                    System.out.print("[ " + casilleros[i][j].getId() + " " + casilleros[i][j].getTamano() + " ] ");
                } else {
                    System.out.print("[ X ] ");
                }
            }
            System.out.println();
        }
    }

    private void mostrarInformacionPaquetes() {
        System.out.println("\n----- Información de paquetes -----");
        for (int i = 0; i < casilleros.length; i++) {
            for (int j = 0; j < casilleros[i].length; j++) {
                if (!casilleros[i][j].Disponible()) {
                    System.out.println("Casillero " + casilleros[i][j].getId() +
                            " (" + casilleros[i][j].getTamano() + ") -> " +
                            casilleros[i][j].getPaquete().mostrarInformacion());
                }
            }
        }
    }

    public static void main(String[] args) {
        EjecutarCasillero app = new EjecutarCasillero(3, 10);
        app.iniciar();
    }
}