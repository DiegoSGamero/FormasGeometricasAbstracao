package com.fatecbddiego.model;

public abstract class FormasGeometricas {
    protected double area;
    protected double perimetro;

    public void setArea(double area) {
        this.area = area;
    }

    public double getArea() {
        return area;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public abstract double calcularArea();
    public abstract double calcularPerimetro();
}
