/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.runapplication;

/**
 *
 * @author emeris
 */
import java.util.Scanner;


// 1. Interface
interface IConsole {
   String getConsoleType();
   String getStore();
   int getSalesTotal();
}


// 2. Abstract Class
abstract class Console implements IConsole {
   private String consoleType;
   private String city;
   private int totalSales;


   public Console(String consoleType, String city, int totalSales) {
       this.consoleType = consoleType;
       this.city = city;
       this.totalSales = totalSales;
   }


   @Override
   public String getConsoleType() { return this.consoleType; }


   @Override
   public String getCity() { return this.city; }


   @Override
   public int getSalesTotal() { return this.totalSales; }
}


// 3. Subclass
class ConsoleSales extends Console {
   public ConsoleSales (String consoleType, String city, int totalSales) {
       super(consoleType, city, totalSales);
   }


   public void printSalesReport() {
       System.out.println("\nStore report");
       System.out.println("***********************");
       System.out.println("Console TYPE: " + getConsoleType());
       System.out.println("CITY: " + getCity());
       System.out.println("sales total: " + getSalesTotal());
       System.out.println("***********************");
   }
}

public class RunApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


       System.out.print("Enter the console type: ");
       String consoleType = scanner.nextLine();


       System.out.print("Enter the city for the console sales: ");
       String city = scanner.nextLine();


       System.out.print("Enter the total " + consoleType + " accidents for " + city + ": ");
       int totalAccidents = scanner.nextInt();


         ConsoleSales  report = new   ConsoleSales (consoleType, city, totalAccidents);
       report. ConsoleSales ();


       scanner.close();

    }
}
