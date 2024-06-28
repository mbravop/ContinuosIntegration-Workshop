package com.team4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<String> beneficiosBasic = new ArrayList<>();
    static ArrayList<String> beneficiosPremium = new ArrayList<>();
    static ArrayList<String> beneficiosFamilia = new ArrayList<>();

    public static void main(String[] args) {
        
        
        
        

        AdditionalFeatures personalTraining = new AdditionalFeatures("Personal training sessions", 20);
        AdditionalFeatures groupClasses = new AdditionalFeatures("Group classes", 30);
    
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("Menu");
        System.out.println("Elige tu plan:");
        System.out.println("1. Basic Membership");
        System.out.println("2. Premium Membership");
        System.out.println("3. Family Membership");
        System.out.println("4. Exit");
        System.out.print("Ingresa tu elecci?n: ");

        choice = scanner.nextInt();
        scanner.nextLine();
        switch (choice) {
            case 1:
                
                System.out.println("?Cu?ntos se van a registrar?");
                int numero = scanner.nextInt();
                scanner.nextLine();
                BasicMembership basicMembership = new BasicMembership(20, numero);
                System.out.println("El valor base a pagar es de: " + basicMembership.costForMember(numero));
                System.out.println("?Desea agregar m?s caracteristicas? (y/n)");
                String caracteristicas = scanner.next();
                int eleccion;
                int nuevoValor = 0;
                if (caracteristicas.equals("y")) {
                    do {
                        System.out.println("Listado de caracter?sticas adicionales:");
                        System.out.println("1. Personal training sessions");
                        System.out.println("2. Group classes");
                        System.out.println("3. Exit");
                        eleccion = scanner.nextInt();
                        scanner.nextLine();
                        switch (eleccion) {
                            case 1:
                                basicMembership.additionalFeatures.add(personalTraining);
                                nuevoValor = basicMembership.customizeFeatures(personalTraining);
                                break;
                            case 2:
                                basicMembership.additionalFeatures.add(groupClasses);
                                nuevoValor = basicMembership.customizeFeatures(groupClasses);
                                break;
                            case 3:
                                System.out.println("Saliendo de la eleccion de caracteristicas");
                                break;
                            default:
                                System.out.println("Invalid choice. Please enter a number between 1 and 3.");
                        }
                    } while (eleccion != 3);
                    System.out.println("El valor a pagar junto con las caracteristicas adicionales es " + nuevoValor);
                }
                if (numero >= 2) {
                    System.out.println("Dado que ser?n mas de 2 personas en registrase se aplicar? un descuento del 10%");
                    nuevoValor = (int) basicMembership.discount(nuevoValor);
                }
                if(nuevoValor>400){
                    nuevoValor-=50;
                    basicMembership.descuento+=50;
                }
                else if(nuevoValor>200){
                    nuevoValor-=20;
                    basicMembership.descuento+=20;
                }
                System.out.println("Su total a pagar seria: " + nuevoValor);
                System.out.println("Su membresia escogida es la siguiente: ");
                ConfirmMembershipDetails(basicMembership,nuevoValor,scanner);
                break;
            case 2:

                AdditionalFeatures premiumFacilities = new AdditionalFeatures("Access to exclusive gym facilities", 80);
                AdditionalFeatures premiumPrograms = new AdditionalFeatures("Specialized training programs", 120);
                System.out.println("?Cu?ntos se van a registrar?");
                int numero2 = scanner.nextInt();
                scanner.nextLine();
                PremiunMembership premiumMembership = new PremiunMembership(40, numero2);
                System.out.println("El valor base a pagar es de: " + premiumMembership.costForMember(numero2));
                System.out.println("?Desea agregar m?s caracteristicas? (y/n)");
                String caracteristicas2 = scanner.next();
                int nPremium = 0;
                int eleccion2;
                int nuevoValor2 = 0;
                if (caracteristicas2.equals("y")) {
                    do {
                        System.out.println("Listado de caracter?sticas adicionales:");
                        System.out.println("1. Personal training sessions");
                        System.out.println("2. Group classes");
                        System.out.println("3. "+premiumFacilities.descripcion);
                        System.out.println("4. "+premiumPrograms.descripcion);
                        System.out.println("5. Exit");
                        eleccion2 = scanner.nextInt();
                        scanner.nextLine();
                        switch (eleccion2) {
                            case 1:
                                premiumMembership.additionalFeatures.add(personalTraining);
                                nuevoValor2 = premiumMembership.customizeFeatures(personalTraining);
                                break;
                            case 2:
                                premiumMembership.additionalFeatures.add(groupClasses);
                                nuevoValor2 = premiumMembership.customizeFeatures(groupClasses);
                                break;
                            case 3:
                                nPremium+=1;
                                premiumMembership.additionalFeatures.add(premiumFacilities);
                                nuevoValor2 = premiumMembership.customizeFeatures(premiumFacilities);
                                break;
                            case 4:
                                nPremium+=1;
                                premiumMembership.additionalFeatures.add(premiumPrograms);
                                nuevoValor2 = premiumMembership.customizeFeatures(premiumPrograms);
                                break;        
                            case 5:
                                System.out.println("Saliendo de la eleccion de caracteristicas");
                                break;
                            default:
                                System.out.println("Invalid choice. Please enter a number between 1 and 5.");
                        }
                    } while (eleccion2 != 5);
                    System.out.println("El valor a pagar junto con las caracteristicas adicionales es " + nuevoValor2);
                }
                if (numero2 >= 2) {
                    System.out.println(
                            "Dado que ser?n mas de 2 personas en registrase se aplicar? un descuento del 10%");
                    nuevoValor2 = (int) premiumMembership.discount(nuevoValor2);
                }
                if(nPremium >= 1){
                    System.out.println("Se realizara un recargo del 15% por las adiciones premium");
                    nuevoValor2 = (int) premiumMembership.charge(nuevoValor2);
                }
                if(nuevoValor2>400){
                    premiumMembership.descuento+=50;
                    nuevoValor2-=50;
                }
                else if(nuevoValor2>200){
                    premiumMembership.descuento+=20;
                    nuevoValor2-=20;
                }
                System.out.println("Su total a pagar seria: " + nuevoValor2);
                System.out.println("Su membresia escogida es la siguiente: ");
                ConfirmMembershipDetails(premiumMembership,nuevoValor2,scanner);
                break;
            case 3:

                System.out.println("?Cu?ntos se van a registrar?");
                int numero3 = scanner.nextInt();
                scanner.nextLine();
                FamilyMembership familyMembership = new FamilyMembership(60, numero3);
                System.out.println("El valor base a pagar es de: " + familyMembership.costForMember(numero3));
                System.out.println("?Desea agregar m?s caracteristicas? (y/n)");
                String caracteristicas3 = scanner.next();
                int eleccion3;
                int nuevoValor3 = 0;
                if (caracteristicas3.equals("y")) {
                    do {
                        System.out.println("Listado de caracter?sticas adicionales:");
                        System.out.println("1. Personal training sessions");
                        System.out.println("2. Group classes");
                        System.out.println("3. Exit");
                        eleccion3 = scanner.nextInt();
                        scanner.nextLine();
                        switch (eleccion3) {
                            case 1:
                                nuevoValor3 = familyMembership.customizeFeatures(personalTraining);
                                break;
                            case 2:
                                nuevoValor3 = familyMembership.customizeFeatures(groupClasses);
                                break;
                            case 3:
                                System.out.println("Saliendo de la eleccion de caracteristicas");
                                break;
                            default:
                                System.out.println("Invalid choice. Please enter a number between 1 and 3.");
                        }
                    } while (eleccion3 != 3);
                    System.out.println("El valor a pagar junto con las caracteristicas adicionales es " + nuevoValor3);
                }
                
                if (numero3 >= 2) {
                    System.out.println(
                            "Dado que ser?n mas de 2 personas en registrase se aplicar? un descuento del 10%");
                    nuevoValor3 = (int) familyMembership.discount(nuevoValor3);
                }
                if(nuevoValor3>400){
                    familyMembership.descuento+=50;
                    nuevoValor3-=50;
                    
                }
                else if(nuevoValor3>200){
                    familyMembership.descuento+=20;
                    nuevoValor3-=20;
                }

                System.out.println("Su total a pagar seria: " + nuevoValor3);
                System.out.println("Su membresia escogida es la siguiente: ");
                ConfirmMembershipDetails(familyMembership,nuevoValor3,scanner);

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

    public static void ConfirmMembershipDetails(Membership m, int costoFinal, Scanner sc){
        
            System.out.println("Membresia "+m.tipo);
            System.out.println("Caracteristicas adicionales:");
            for(AdditionalFeatures af:m.additionalFeatures){
                System.out.println(af.descripcion);
            }
            System.out.println("El costo final es de "+costoFinal);
            System.out.println("El descuento total fue de: "+m.descuento);
            System.out.println("Desea confirmar su membresia?(y/n)");
            String opcion;
            opcion = sc.next();
            sc.nextLine();
            switch (opcion) {
                case "y":
                    System.out.println("Su membresia ha sido confirmada");
                    break;
                case "n":
                    System.out.println("Su membresia ha sido cancelada");
                    break;
                default:
                    System.out.println("Invalid choice. Please select yes or no");
            }

            sc.close();
    }
}
