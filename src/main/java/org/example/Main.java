package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double distancia;
        double consumoPor100Km;
        double precioLitro;
        double consumoTotal;
        double costoTotal;

        Scanner leerTeclado = new Scanner(System.in);

        System.out.print("Ingrese la distancia total del viaje (en kilómetros): ");
        distancia = leerTeclado.nextDouble();

        System.out.print("Ingrese el consumo de combustible del automóvil (litros por cada 100 km): ");
        consumoPor100Km = leerTeclado.nextDouble();

        System.out.print("Ingrese el precio por litro de combustible: ");
        precioLitro = leerTeclado.nextDouble();

        consumoTotal = (distancia / 100.0) * consumoPor100Km;

        costoTotal = consumoTotal * precioLitro;

        System.out.println("\nResumen del viaje:");
        System.out.println("Distancia total del viaje: " + distancia + " km");
        System.out.println("Consumo de combustible del automóvil: " + consumoPor100Km + " litros/100 km");
        System.out.println("Precio por litro de combustible: " + precioLitro + " moneda local");
        System.out.printf("Consumo total de combustible necesario: %.2f litros\n", consumoTotal);
        System.out.printf("Costo total de combustible necesario: %.2f %s\n", costoTotal, "moneda local");

    }
}
