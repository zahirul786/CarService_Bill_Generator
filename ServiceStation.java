import java.util.ArrayList;
import java.util.*;

interface Car {
    int getServicePrice(String serviceCode);
}

class Hatchback implements Car {
    public int getServicePrice(String serviceCode) {
        switch (serviceCode) {
            case "BS01":
                return 2000;
            case "EF01":
                return 5000;
            case "CF01":
                return 2000;
            case "BF01":
                return 1000;
            case "GF01":
                return 3000;
            default:
                return 0;
        }
    }
}

class Sedan implements Car {
    public int getServicePrice(String serviceCode) {
        switch (serviceCode) {
            case "BS01":
                return 4000;
            case "EF01":
                return 8000;
            case "CF01":
                return 4000;
            case "BF01":
                return 1500;
            case "GF01":
                return 6000;
            default:
                return 0;
        }
    }
}

class SUV implements Car {
    public int getServicePrice(String serviceCode) {
        switch (serviceCode) {
            case "BS01":
                return 5000;
            case "EF01":
                return 10000;
            case "CF01":
                return 6000;
            case "BF01":
                return 2500;
            case "GF01":
                return 8000;
            default:
                return 0;
        }
    }
}

public class ServiceStation {
    public static void main(String[] args) {
        int TotalBill = 0, price = 0;
        ArrayList<String> billReciept = new ArrayList<String>(); // This is Services charge
        ArrayList<String> list = new ArrayList<>(); // This is Services ID list
        list.add("BS01");
        list.add("EF01");
        list.add("CF01");
        list.add("BF01");
        list.add("GF01");
        ArrayList<String> list2 = new ArrayList<>(); // This is Services list
        list2.add("Basic Service");
        list2.add("Engine Fixing");
        list2.add("Clutch Fixing");
        list2.add("Brake Fixing:");
        list2.add("Gears Fixing:");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter car type :  Hatchback/Sedan/SUV");
        String CarName = sc.next();
        String control = "yes";
        if (CarName.equals("Hatchback")) { // THis is for Hatchback car
            Hatchback CarType = new Hatchback();
            while (control.equals("yes")) {
                System.out.println("press 0 for basic service");
                System.out.println("press 1 for Engine Fixing");
                System.out.println("press 2 for Clutch Fixing");
                System.out.println("press 3 for Brake Fixing");
                System.out.println("press 4 for Gear Fixing");
                int index = sc.nextInt();
                if (index >= 0 && index <= 4) {
                    price = CarType.getServicePrice(list.get(index));
                } else {
                    price = 0;
                    break;
                }
                TotalBill += price;
                billReciept.add(list2.get(index) + "    " + Integer.toString(price));
                System.out.println("If you want more service  press yes");
                control = sc.next();
            }

        } else if (CarName.equals("Sedan")) { // This is for Sedan car
            Hatchback CarType = new Hatchback();
            while (control.equals("yes")) {
                System.out.println("press 0 for basic service");
                System.out.println("press 1 for Engine Fixing");
                System.out.println("press 2 for Clutch Fixing");
                System.out.println("press 3 for Brake Fixing");
                System.out.println("press 4 for Gear Fixing");
                int index = sc.nextInt();
                if (index >= 0 && index <= 4) {
                    price = CarType.getServicePrice(list.get(index));
                } else {
                    price = 0;
                    break;
                }
                TotalBill += price;
                billReciept.add(list2.get(index) + "    " + Integer.toString(price));
                System.out.println("If you want more service  press yes");
                control = sc.next();
            }

        } else if (CarName.equals("SUV")) { // This is for SUV Car
            Hatchback CarType = new Hatchback();
            while (control.equals("yes")) {
                System.out.println("press 0 for basic service");
                System.out.println("press 1 for Engine Fixing");
                System.out.println("press 2 for Clutch Fixing");
                System.out.println("press 3 for Brake Fixing");
                System.out.println("press 4 for Gear Fixing");
                int index = sc.nextInt();
                if (index >= 0 && index <= 4) {
                    price = CarType.getServicePrice(list.get(index));
                } else {
                    price = 0;
                    break;
                }
                TotalBill += price;
                billReciept.add(list2.get(index) + "    " + Integer.toString(price));
                System.out.println("If you want more service  press yes");
                control = sc.next();
            }

        } else
            System.out.println("Services is ot Available");

        // This portion is for Bill Reciept Show

        System.out.println("This is your Car Name :" + CarName);
        System.out.println("Service Type" + "    " + "ServicePrice ");
        for (int i = 0; i < billReciept.size(); i++) {
            System.out.println(billReciept.get(i));
        }
        if (TotalBill > 10000) {
            System.out.println("Complimentary Cleaning is Provided free(Nil)");
        }
        System.out.println("---------------------------------------------------");
        System.out.println("Total Bill is :" + "   " + TotalBill);
    }
}
