package services;

import java.util.Scanner;

public class SolicitarConsola {
    

    public double pedirNumero(Scanner scanner) {



        double numero = 0;
        boolean entradaValida = false;
        do {
            try {
                numero = scanner.nextDouble();
                entradaValida = true;
            } catch (Exception e) {
                System.out.println("Error: Debes ingresar un número válido. Inténtalo de nuevo:");
                scanner.next();
            }
        } while (!entradaValida);


        return numero;
    }
}
