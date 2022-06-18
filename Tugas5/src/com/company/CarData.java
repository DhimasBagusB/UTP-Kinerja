package com.company;
 import java.util.ArrayList;

    public class CarData {
        ArrayList<Car> carList;

        public CarData() {
            carList = new ArrayList<Car>();
        }

        public void addCar(String carType, String polNum, String merk) {
            carList.add(new Car(carType, polNum, merk));
        }

        public void listOfCar() {
            System.out.println("==============================");
            System.out.println("        DAFTAR MOBIL          ");
            System.out.println("==============================");
            for (Car i : carList) {
                System.out.print("TIPE MOBIL\t: " + i.getCarType());
                System.out.println();
                System.out.print("No. POLISI\t: " + i.getPolNum());
                System.out.println();
                System.out.print("MERK MOBIL\t: " + i.getMerk());
                System.out.println();
                System.out.println("------------------------------");
            }
        }
}
