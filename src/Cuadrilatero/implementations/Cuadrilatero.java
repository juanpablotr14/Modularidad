package Cuadrilatero.implementations;

import Cuadrilatero.interfaces.ICuadrilatero;

public class Cuadrilatero implements ICuadrilatero{
    private double altura;
    private double ancho;

    public Cuadrilatero(double altura, double ancho) {
        this.altura = altura;
        this.ancho = ancho;
    }

    public double calcularArea() {
        return altura * ancho;
    }

    public double calcularPerimetro() {
        return 2 * (altura + ancho);
    }
}