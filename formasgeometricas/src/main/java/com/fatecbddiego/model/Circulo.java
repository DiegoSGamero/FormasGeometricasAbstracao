package com.fatecbddiego.model;

public class Circulo extends FormasGeometricas {
    private double raio;

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    @Override
    public double calcularArea () {
        double area = 3.1416 * raio * raio;
        return area;
    }

    @Override
    public double calcularPerimetro () {
        double perimetro = 2 * 3.1416 * raio;
        return perimetro;
    }
}
