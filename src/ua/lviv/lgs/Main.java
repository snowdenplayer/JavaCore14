package ua.lviv.lgs;

import java.util.Scanner;

public class Main {
    static void menu(){
        System.out.println("Press 1 to add commodity");
        System.out.println("Press 2 to remove commodity");
        System.out.println("Press 3 to change commodity");
        System.out.println("Press 4 to sort by name");
        System.out.println("Press 5 to sort by length");
        System.out.println("Press 6 to sort by width");
        System.out.println("Press 7 to sort by weight");
        System.out.println("Press 8 to show");
        System.out.println("Press 9 to output i-th element");
        System.out.println("Press 10 to exit");
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Commodity commodity = new Commodity();
        while (true) {
            menu();

            switch(scan.next()) {

                case "1" :
                    commodity.add();
                    break;

                case "2" :
                    commodity.remove();
                    break;

                case "3" :
                    commodity.change();
                    break;

                case "4" :
                    commodity.sortByName();
                    break;

                case "5" :
                    commodity.sortByLength();
                    break;

                case "6" :
                    commodity.sortByWeight();
                    break;

                case "7" :
                    commodity.sortByWidth();
                    break;

                case "8" :
                    commodity.show();
                    break;
                case "9" :
                    commodity.Element();
                    break;

                case "10" :
                    System.exit(0);

            }
        }


    }
}
