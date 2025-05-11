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


    public ArrayList<Vehicle> vehicleByPrice(double min, double max){
        return null;
    }

    public ArrayList<Vehicle> vehicleByMakeModel(String make, String model){
        return null;
    }
    public ArrayList<Vehicle> vehicleByYear(int min, int max){
        return null;
    }
    public ArrayList<Vehicle> vehicleByColor(String color){
        return null;
    }
    public void addVehicle(Vehicle vehicle){
        inventory.add(vehicle);
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

