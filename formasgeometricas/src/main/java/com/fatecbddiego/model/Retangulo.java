package com.fatecbddiego.model;

public class Retangulo extends FormasGeometricas {

    private double largura;
    private double altura;

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getLargura() {
        return largura;
    }

    @Override
    public double calcularArea () {
        double area = altura * largura;
        return area;
    }

    @Override
    public double calcularPerimetro () {
        double perimetro = 2 * altura + 2 * largura;
        return perimetro;
    }
}
