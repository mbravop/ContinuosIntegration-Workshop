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
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu");
            System.out.println("Elige tu plan:");
            System.out.println("1. Basic Membership");
            System.out.println("2. Premium Membership");
            System.out.println("3. Family Membership");
            System.out.println("4. Exit");
            System.out.print("Ingresa tu elección: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("You chose Option 1");
                    // Add code for Option 1 functionality
                    break;
                case 2:
                    System.out.println("You chose Option 2");
                    // Add code for Option 2 functionality
                    break;
                case 3:
                    System.out.println("You chose Option 3");
                    // Add code for Option 3 functionality
                    break;
                case 4:
                    System.out.println("Exiting... Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }

            System.out.println(); // Empty line for spacing
        } while (choice != 4);

        scanner.close();
    }
}