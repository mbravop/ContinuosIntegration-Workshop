package com.team4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<String> beneficiosBasic = new ArrayList<>();
    static ArrayList<String> beneficiosPremium = new ArrayList<>();
    static ArrayList<String> beneficiosFamilia = new ArrayList<>();

    public static void main(String[] args) {
        beneficiosBasic.add("Acceso a áreas comunes");
        beneficiosBasic.add("Descuentos en eventos");
        beneficiosPremium.add("Acceso ilimitado a todas las áreas");
        beneficiosPremium.add("Descuentos exclusivos en servicios");
        beneficiosFamilia.add("Asistencia personalizada");
        beneficiosFamilia.add("Acceso gratuito para familiares adicionales");

        BasicMembership basicMembership = new BasicMembership(20, beneficiosBasic, 0);
        PremiunMembership premiumMembership = new PremiunMembership(40, beneficiosPremium, 0);
        FamilyMembership familyMembership = new FamilyMembership(60, beneficiosFamilia, 0);

        AdditionalFeatures personalTraining = new AdditionalFeatures("Personal training sessions", 40);
        AdditionalFeatures groupClasses = new AdditionalFeatures("Group classes", 40);

        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("Menu");
        System.out.println("Elige tu plan:");
        System.out.println("1. Basic Membership");
        System.out.println("2. Premium Membership");
        System.out.println("3. Family Membership");
        System.out.println("4. Exit");
        System.out.print("Ingresa tu elección: ");

        choice = scanner.nextInt();
        scanner.nextLine();
        switch (choice) {
            case 1:
                System.out.println("¿Cuántos se van a registrar?");
                int numero = scanner.nextInt();
                scanner.nextLine();
                System.out.println("El valor base a pagar es de: " + basicMembership.costForMember(numero));
                System.out.println("¿Desea agregar más caracteristicas? (y/n)");
                String caracteristicas = scanner.next();
                int eleccion;
                int nuevoValor = 0;
                if (caracteristicas.equals("y")) {
                    do {
                        System.out.println("Listado de características adicionales:");
                        System.out.println("1. Personal training sessions");
                        System.out.println("2. Group classes");
                        System.out.println("3. Exit");
                        eleccion = scanner.nextInt();
                        scanner.nextLine();
                        switch (eleccion) {
                            case 1:
                                nuevoValor = basicMembership.CustomizeFeatures(personalTraining);
                                break;
                            case 2:
                                nuevoValor = basicMembership.CustomizeFeatures(groupClasses);
                                break;
                            case 3:
                                System.out.println("Exiting... Thank you!");
                                break;
                            default:
                                System.out.println("Invalid choice. Please enter a number between 1 and 3.");
                        }
                    } while (eleccion != 3);
                    System.out.println("El valor a pagar junto con las caracteristicas adicionales es " + nuevoValor);
                }
                double valorTotal = 0;
                if (numero >= 2) {
                    System.out.println(
                            "Dado que serán mas de 2 personas en registrase se aplicará un descuento del 10%");
                    valorTotal = basicMembership.Discount(nuevoValor);
                }
                System.out.println("Su total a pagar seria: " + valorTotal);
                break;
            case 2:
                System.out.println("¿Cuántos se van a registrar?");
                int numero2 = scanner.nextInt();
                scanner.nextLine();
                System.out.println("El valor base a pagar es de: " + premiumMembership.costForMember(numero2));
                System.out.println("¿Desea agregar más caracteristicas? (y/n)");
                String caracteristicas2 = scanner.next();
                int eleccion2;
                int nuevoValor2 = 0;
                if (caracteristicas2.equals("y")) {
                    do {
                        System.out.println("Listado de características adicionales:");
                        System.out.println("1. Personal training sessions");
                        System.out.println("2. Group classes");
                        System.out.println("3. Exit");
                        eleccion2 = scanner.nextInt();
                        scanner.nextLine();
                        switch (eleccion2) {
                            case 1:
                                nuevoValor2 = premiumMembership.CustomizeFeatures(personalTraining);
                                break;
                            case 2:
                                nuevoValor2 = premiumMembership.CustomizeFeatures(groupClasses);
                                break;
                            case 3:
                                System.out.println("Exiting... Thank you!");
                                break;
                            default:
                                System.out.println("Invalid choice. Please enter a number between 1 and 3.");
                        }
                    } while (eleccion2 != 3);
                    System.out.println("El valor a pagar junto con las caracteristicas adicionales es " + nuevoValor2);
                }
                double valorTotal2 = 0;
                if (numero2 >= 2) {
                    System.out.println(
                            "Dado que serán mas de 2 personas en registrase se aplicará un descuento del 10%");
                    valorTotal2 = premiumMembership.Discount(nuevoValor2);
                }
                System.out.println("Su total a pagar seria: " + valorTotal2);
                break;
            case 3:
                System.out.println("¿Cuántos se van a registrar?");
                int numero3 = scanner.nextInt();
                scanner.nextLine();
                System.out.println("El valor base a pagar es de: " + familyMembership.costForMember(numero3));
                System.out.println("¿Desea agregar más caracteristicas? (y/n)");
                String caracteristicas3 = scanner.next();
                int eleccion3;
                int nuevoValor3 = 0;
                if (caracteristicas3.equals("y")) {
                    do {
                        System.out.println("Listado de características adicionales:");
                        System.out.println("1. Personal training sessions");
                        System.out.println("2. Group classes");
                        System.out.println("3. Exit");
                        eleccion3 = scanner.nextInt();
                        scanner.nextLine();
                        switch (eleccion3) {
                            case 1:
                                nuevoValor3 = familyMembership.CustomizeFeatures(personalTraining);
                                break;
                            case 2:
                                nuevoValor3 = familyMembership.CustomizeFeatures(groupClasses);
                                break;
                            case 3:
                                System.out.println("Exiting... Thank you!");
                                break;
                            default:
                                System.out.println("Invalid choice. Please enter a number between 1 and 3.");
                        }
                    } while (eleccion3 != 3);
                    System.out.println("El valor a pagar junto con las caracteristicas adicionales es " + nuevoValor3);
                }
                double valorTotal3 = 0;
                if (numero3 >= 2) {
                    System.out.println(
                            "Dado que serán mas de 2 personas en registrase se aplicará un descuento del 10%");
                    valorTotal3 = familyMembership.Discount(nuevoValor3);
                }
                System.out.println("Su total a pagar seria: " + valorTotal3);
                break;
            case 4:
                System.out.println("Exiting... Thank you!");
                break;
            default:
                System.out.println("Invalid choice. Please enter a number between 1 and 4.");
        }

        System.out.println(); // Empty line for spacing

        scanner.close();
    }
}