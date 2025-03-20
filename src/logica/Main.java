package logica;

import dominio.SistemaImpl;

import java.util.Scanner;

public class Main {


    public static void main(String[] args){
        Sistema s = new SistemaImpl();
        Scanner tecladoInt = new Scanner(System.in);
        Scanner tecladoString = new Scanner(System.in);

        int opcion = 0;
        do{
            System.out.println("Bienvenido al sistema de reservas!\n");
            System.out.println("1. Hacer reservas");
            System.out.println("2. Salir");
            System.out.print("Ingrese opcion: ");
            opcion = tecladoInt.nextInt();

            if(opcion == 1){
                System.out.println("Ingrese el nombre del cliente: ");
                String nombre = tecladoString.nextLine();
                System.out.println("Ingrese el numero de tarjeta: ");
                String numTarjeta = tecladoString.nextLine();

                if(s.hacerReservas(nombre, numTarjeta)){
                    System.out.println("Reserva completada");
                } else {
                    System.out.println("Reserva no completada, pago no aprobado.");
                }

            } else if(opcion == 2){
                System.out.println("\nHasta luego :D");
            }

        } while(opcion != 2);





    }

}
