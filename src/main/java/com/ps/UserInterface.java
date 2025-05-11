package com.ps;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    private Dealership dealership;
    private Scanner scanner = new Scanner(System.in);

    private void init(){
        //ToDO: Load dealership details from a file
        dealership = DealershipFileManager.getDealership();
    }
    public UserInterface(){
        init();
    }

    public void display(){

        //TODO: Create your main menu with do while
        System.out.println("Welcome to the dealership program");
        int mainMenuCommand;
        do{
            System.out.println("1. Get by price");
            System.out.println("2. Get by make/model");
            System.out.println("3. Get by year");
            System.out.println("4. Get by color");
            System.out.println("5. Get by mileage");
            System.out.println("6. Get by type");
            System.out.println("7. Get all vehicles");
            System.out.println("8. Add vehicle");
            System.out.println("9. Remove vehicle");
            System.out.println("0. Exit");

            System.out.println("Please enter a number");
            mainMenuCommand = scanner.nextInt();

            switch(mainMenuCommand){
                case 1:
                    processGetByPriceRequest();
                    break;
                case 2:
                    processGetByMakeModelRequest();
                    break;
                case 3:
                    processGetByYearRequest();
                    break;
                case 4:
                    processGetByColorRequest();
                    break;
                case 5:
                    processGetByMileageRequest();
                    break;
                case 6:
                    processGetByVehicleTypeRequest();
                    break;
                case 7:
                    processGetAllVehicleRequest();
                    break;
                case 8:
                    processAddVehicleRequest();
                    break;
                case 9:
                    processRemoveVehicleRequest();
                    break;
                case 0:
                    System.out.println("Exiting the program");
                    break;
                default:
                    System.out.println("Command not found. Try again!");
            }
        }while(mainMenuCommand != 0);

    }

    private void processGetByPriceRequest(){
        // TODO: Ask the user for a starting price and ending price.

        // ArrayList<Vehicle> filteredVehicles = dealership.getVehiclesByPrice(pass the price range. starting price, ending price);

        // Display vehicles with for loop

        System.out.println("________________Display vehicles by price___________________");
        System.out.println("Enter a value for minimum price");
        double min = scanner.nextDouble();

        System.out.println("Enter a value for maximum price");
        double max = scanner.nextDouble();

        ArrayList<Vehicle> filteredVehicles = dealership.vehiclesByPrice(min,max);
        displayVehicles(filteredVehicles);
    }

    private void processGetByMakeModelRequest(){
        scanner.nextLine();
        System.out.println("________________Display vehicles by Make and Model___________________");
        System.out.println("Please enter the make of the vehicle");
        String make = scanner.nextLine();
        System.out.println("Please enter the model of the vehicle");
        String model = scanner.nextLine();

        ArrayList<Vehicle> filteredVehicles = dealership.vehiclesByMakeModel(make,model);
        displayVehicles(filteredVehicles);

    }

    private void processGetByYearRequest(){
        scanner.nextLine();
        System.out.println("________________Display vehicles by Year Range___________________");
        System.out.println("Please enter a value for minimum year");
        int min = scanner.nextInt();
        System.out.println("Please enter a value for maximum year");
        int max = scanner.nextInt();

        ArrayList<Vehicle> filteredVehicles = dealership.vehiclesByYear(min,max);
        displayVehicles(filteredVehicles);
    }

    private void processGetByColorRequest(){
        scanner.nextLine();
        System.out.println("________________Display vehicles by Color___________________");
        System.out.println("Please enter the color of the vehicle");
        String color = scanner.nextLine();

        ArrayList<Vehicle> filteredVehicles = dealership.vehiclesByColor(color);
        displayVehicles(filteredVehicles);

    }

    private void processGetByMileageRequest(){
        scanner.nextLine();
        System.out.println("________________Display vehicles by Mileage___________________");
        System.out.println("Please enter a value for minimum mileage");
        int min = scanner.nextInt();
        System.out.println("Please enter a value for maximum mileage");
        int max = scanner.nextInt();
        ArrayList<Vehicle> filteredVehicles = dealership.vehiclesByMileage(min,max);
        displayVehicles(filteredVehicles);
    }

    private void processGetByVehicleTypeRequest(){
        scanner.nextLine();
        System.out.println("________________Display vehicles by Type___________________");
        System.out.println("Please enter the type of vehicle");
        String type = scanner.nextLine();

        ArrayList<Vehicle> filteredVehicles = dealership.vehiclesByType(type);
        displayVehicles(filteredVehicles);
    }

    private void processGetAllVehicleRequest(){

        ArrayList<Vehicle> vehicles = dealership.getAllVehicles();
        displayVehicles(vehicles);
    }

    private void processAddVehicleRequest(){
        try {
            FileWriter fileWriter = new FileWriter("inventory.csv",true);

            BufferedWriter writer = new BufferedWriter(fileWriter);

            scanner.nextLine();
            System.out.println("Please enter the vin of the vehicle");
            String userVin = scanner.nextLine();
            int vin = Integer.parseInt(userVin);

            System.out.println("Please enter the year of the vehicle");
            String userYear = scanner.nextLine();
            int year = Integer.parseInt(userYear);

            System.out.println("Please enter the make of the vehicle");
            String make = scanner.nextLine();

            System.out.println("Please enter the model of the vehicle");
            String model = scanner.nextLine();

            System.out.println("Please enter the type of the vehicle");
            String type = scanner.nextLine();

            System.out.println("Please enter the color of the vehicle");
            String color = scanner.nextLine();

            System.out.println("Please enter the mileage of the vehicle");
            String userOdometer = scanner.nextLine();
            int odometer = Integer.parseInt(userOdometer);

            System.out.println("Please enter the price of the vehicle");
            String userPrice = scanner.nextLine();
            double price = Double.parseDouble(userPrice);

            String userAddVehicle = String.format("%d|%d|%s|%s|%s|%s|%d|%.2f",
                    vin,
                    year,
                    make,
                    model,
                    type,
                    color,
                    odometer,
                    price);

            writer.write(userAddVehicle);
            writer.newLine();
            writer.close();
        }catch(IOException e){
            throw new RuntimeException("File write error"+ e.getMessage());
        }

    }
    private void processRemoveVehicleRequest(){














    }

    public static void displayVehicles(ArrayList<Vehicle> vehicles){
       Vehicle.vehicleCategories();
        for(Vehicle vehicle: vehicles){
            System.out.print(vehicle);
        }
    }


}
