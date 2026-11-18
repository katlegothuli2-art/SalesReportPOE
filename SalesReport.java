/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.salesreport;

/**
 *
 * @author Student
 */
import java.util.Scanner;
public class SalesReport {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //Declarations
       //String[]months= {"Month 1","Month 2", "Month 3"};
       String[]product={"Monarch mattress", "Restonic brbados mattress", "Sealy Phuket mattress"};
       int[][]sales = new int[3][3];
       int[]productSales= new int[3];
       
      for(int i = 0; i<product.length;i++){
          System.out.println("Enter number of sales for month 1 " + " for " + product + ":");
          sales[i][0]=scanner.nextInt();
          System.out.println("Enter number of sales for month 2 " + " for " + product + ":");
          sales[i][1]=scanner.nextInt();
          System.out.println("Enter number of sales for month 3 " + " for " + product + ":");
          sales[i][2]=scanner.nextInt();
                
          
          //total product sals
          //sales[i] =
      } 
       
       
    //Display results
    System.out.println("PRODUCT SALES REPORT - 2026");
    System.out.println("**************************************");  
    
    //Shows results 
    for(int i=0;i<sales.length;i++){
        int monthlySales = sales[i][0] + sales[i][1] + sales[i][2];
        
    }
    }
    
    
}
