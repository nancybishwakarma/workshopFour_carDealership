package com.ps;

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
            System.out.println("7. Get all");
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


    }

    private void processGetByMakeModelRequest(){

    }

    private void processGetByYearRequest(){

    }

    private void processGetByColorRequest(){

    }

    private void processGetByMileageRequest(){

    }

    private void processGetByVehicleTypeRequest(){

    }

    private void processGetAllVehicleRequest(){

    }

    private void processAddVehicleRequest(){

    }
    private void processRemoveVehicleRequest(){

    }



}
