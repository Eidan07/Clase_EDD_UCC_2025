package CasilleroAmazon;

import java.util.Scanner;

public class Menu {
    private Scanner sc;

    public Menu(Scanner sc) {
        this.sc = sc;
    }

    public void mostrarMenu() {
        System.out.println("\n----- MENÚ PRINCIPAL -----");
        System.out.println("1. Registrar Paquete");
        System.out.println("2. Consultar Casilleros Disponibles");
        System.out.println("3. Información de Paquetes");
        System.out.println("4. Salir");
        System.out.print("Elige una opción: ");
    }

    public int leerOpcion() {
        int opcion = sc.nextInt();
        sc.nextLine();
        return opcion;
    }

    public String mostrarMenuTamanos() {
        int opcion;
        do {
            System.out.println("\n----- SELECCIONAR TAMAÑO DEL PAQUETE -----");
            System.out.println("1. Small");
            System.out.println("2. Medium");
            System.out.println("3. Big");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    return "Small";
                case 2:
                    return "Medium";
                case 3:
                    return "Big";
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        } while(true);
    }
}