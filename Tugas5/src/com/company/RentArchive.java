package com.company;
import java.util.ArrayList;

    public class RentArchive {
        ArrayList<CarRent> rentData = new ArrayList<CarRent>();
        CarRent[] arrayRentData = new CarRent [rentData.size()];

        public void Rent(CarRider rider, Car car, int rentDur) {

            if (car.isStatus() == true) {
                System.out.println("MOBIL BERHASIL DISEWA");
                car.setStatus(false);
                rentData.add(new CarRent(rider, car, rentDur));
                arrayRentData = rentData.toArray(arrayRentData);
            } else {
                System.out.println("MAAF, MOBIL SUDAH DISEWA");
            }
        }

        public void info() {
            System.out.println("==============================");
            System.out.println("     INFORMASI PELANGGAN      ");
            System.out.println("==============================");

            for (int i = 0; i < arrayRentData.length; i++) {
                System.out.println("NAMA PEMINJAM\t: " + arrayRentData[i].getRider().getName());
                System.out.println("TIPE MOBIL\t\t: " + arrayRentData[i].getCar().getCarType());
                System.out.println("NO. POLISI\t\t: " + arrayRentData[i].getCar().getPolNum());
                System.out.println("LAMA RENTAL\t\t: " + arrayRentData[i].getRentDur());
                System.out.println("---------------------------");
            }

        }

    }

