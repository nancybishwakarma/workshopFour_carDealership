package com.ps;

import java.util.ArrayList;

public class Dealership {

        private String name;
        private String address;
        private String phone;

        private ArrayList<Vehicle> inventory;

    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.inventory = new ArrayList<>();

    }


    public ArrayList<Vehicle> vehiclesByPrice(double min, double max) {
        ArrayList<Vehicle> result = new ArrayList<>();

        for (Vehicle vehicle : getAllVehicles()) {
            double vehiclePrice = vehicle.getPrice();
            if (vehiclePrice >= min && vehiclePrice <= max) {
                result.add(vehicle);
            }
        }
        Vehicle.vehicleCategories();
        return result;
    }

    public ArrayList<Vehicle> vehiclesByMakeModel(String make, String model){
        ArrayList<Vehicle> result = new ArrayList<>();

        for (Vehicle vehicle : getAllVehicles()) {
            String vehicleMake = vehicle.getMake();
            String vehicleModel = vehicle.getModel();
            if(make.equalsIgnoreCase(vehicleMake) && model.equalsIgnoreCase(vehicleModel)) {
                result.add(vehicle);
            }
        }
        Vehicle.vehicleCategories();
        return result;
    }
    public ArrayList<Vehicle> vehiclesByYear(int min, int max){
        ArrayList<Vehicle> result = new ArrayList<>();

        for (Vehicle vehicle : getAllVehicles()) {
            int vehicleYear = vehicle.getYear();

            if(vehicleYear>=min && vehicleYear<=max) {
                result.add(vehicle);
            }
        }
        Vehicle.vehicleCategories();
        return result;
    }
    public ArrayList<Vehicle> vehiclesByColor(String color){
        ArrayList<Vehicle> result = new ArrayList<>();

        for (Vehicle vehicle : getAllVehicles()) {
            String vehicleColor = vehicle.getColor();

            if(vehicleColor.equalsIgnoreCase(color)) {
                result.add(vehicle);
            }
        }
        Vehicle.vehicleCategories();
        return result;
    }
    public ArrayList<Vehicle> vehiclesByMileage(int min, int max){
        ArrayList<Vehicle> result = new ArrayList<>();

        for (Vehicle vehicle : getAllVehicles()) {
            int vehicleMileage = vehicle.getOdometer();

            if(vehicleMileage >= min && vehicleMileage <= max ) {
                result.add(vehicle);
            }
        }
        Vehicle.vehicleCategories();
        return result;

    }
    public ArrayList<Vehicle> vehiclesByType(String type){
        ArrayList<Vehicle> result = new ArrayList<>();

        for (Vehicle vehicle : getAllVehicles()) {
            String vehicleType = vehicle.getType();

            if(vehicleType.equalsIgnoreCase(type)) {
                result.add(vehicle);
            }
        }
        Vehicle.vehicleCategories();
        return result;
    }
    public ArrayList<Vehicle> getAllVehicles(){

        return inventory;
    }
    public void addVehicle(Vehicle vehicle){
        inventory.add(vehicle);
    }
    public void removeVehicle(Vehicle vehicle){
        inventory.remove(vehicle);
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }



}

