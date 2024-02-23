package Circulo.Implementations;
import Circulo.interfaces.ICirculo;

public class Circulo implements ICirculo {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double calcularDiametro() {
        return radio * 2;
    }

}
