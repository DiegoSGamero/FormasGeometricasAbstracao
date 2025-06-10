package com.fatecbddiego;

import java.util.Scanner;

import com.fatecbddiego.model.Circulo;
import com.fatecbddiego.model.Retangulo;

public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        Retangulo retangulo = new Retangulo();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha entre área de circulo (C) ou retangulo (R)");
        String resp  = scanner.nextLine();

        switch (resp) {
            case "r":
            case "R":
                System.out.println("Largura (somente numeros): ");
                double larguraR  = scanner.nextDouble();
                retangulo.setLargura(larguraR);
                System.out.println("Altura (somente numeros): ");
                double alturaR  = scanner.nextDouble();
                retangulo.setAltura(alturaR);
                System.out.println("Area: " + retangulo.calcularArea());
                System.out.println("Perimetro: " + retangulo.calcularPerimetro());
                scanner.close();
                break;
            
            case "c":
            case "C":
                System.out.println("Raio (somente numeros): ");
                double raioR  = scanner.nextDouble();
                circulo.setRaio(raioR);
                System.out.println("Area: " + circulo.calcularArea());
                System.out.println("Perimetro: " + circulo.calcularPerimetro());
                scanner.close();
                break;
            default:
                throw new AssertionError();
        }
    }
}