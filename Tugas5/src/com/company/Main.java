package com.company;

public class Main {
    public static void main(String[] args) {
        System.out.println("Nama : Dhimas Bagus Bimasena Wibowo");
        System.out.println("NIM  : 215150700111020");
        CarRider ming = new CarRider("Lin Ming", 19, "08000000000");
        CarRider youhan = new CarRider("Bei Youhan", 20, "08111111111");
        CarRider ling = new CarRider("Ling'er", 31, "08122222222");
        CarRider yin = new CarRider("Yin", 25,"081333333333");

        CarData datamobil = new CarData();
        datamobil.addCar("SUV", "N 1111 AB", "Honda");
        datamobil.addCar("SPORT", "N 2222 AB", "SSC Tuatara");
        datamobil.addCar("TRUCK", "N 3333 AB", "Suzuki");
        datamobil.addCar("VAN", "N 4444 AB", "Toyota");

        datamobil.listOfCar();
        System.out.println();

        RentArchive arsipsewa = new RentArchive();
        arsipsewa.Rent(ming, datamobil.carList.get(1), 9);
        arsipsewa.Rent(youhan, datamobil.carList.get(0), 3);
        arsipsewa.Rent(ling, datamobil.carList.get(1), 1);
        arsipsewa.Rent(yin, datamobil.carList.get(0), 8);

        System.out.println();
        arsipsewa.info();

    }
}
