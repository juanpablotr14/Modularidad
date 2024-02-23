package services;
import java.util.Scanner;

import Circulo.Implementations.Circulo;
import Cuadrilatero.implementations.Cuadrilatero;

public class ImpresionConsola {
 
    private SolicitarConsola consola = new SolicitarConsola();
    private Scanner scanner;

    public ImpresionConsola( Scanner _scanner ){
        scanner = _scanner;
    }


    public void mostrarOpciones(){
        System.out.println("\n-------- Área y Perímetro --------\n");
        System.out.println("Ingresa el numero correspondiente a tu eleccion: ");
        System.out.println("1. Cuadrilatero");
        System.out.println("2. Circulo");
        System.out.println("3. Salir");
    }


    public void obtenerCase1(){
        System.out.println("\n---------- Has seleccionado Cuadrilátero --------\n");
                    
        System.out.println("Ingrese la altura del cuadrilatero:");
        double altura = consola.pedirNumero(scanner);

        System.out.println("Ingrese el ancho del cuadrilatero:");
        double ancho = consola.pedirNumero(this.scanner);

        Cuadrilatero cuadrilatero = new Cuadrilatero(altura, ancho);

        System.out.println("Área del cuadrilatero: " + cuadrilatero.calcularArea());
        System.out.println("Perímetro del cuadrilatero: " + cuadrilatero.calcularPerimetro());
    }

    public void obtenerCase2(){
        System.out.println("\n--------- Has seleccionado Círculo -------\n");
                
        System.out.println("Ingrese el radio del circulo:");
        double radio =  consola.pedirNumero(scanner);

        Circulo circulo = new Circulo(radio);
        System.out.println("Diametro del círculo: " + circulo.calcularDiametro());
    }

    public void obtenerCase3(){
        System.out.println("Saliendo del programa, hasta la proxima! :D");
    }

    public void obtenerCase4(){
        System.out.println("Opción no válida! :(");
    }
}
