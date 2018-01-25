package com.example.sales;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;

@RestController
public class SalesReport {
    @RequestMapping("/sales")
    public String salesReport()
    {

        double tax;
        String salesTax;


        Scanner  kb = new Scanner(System.in);
     //   int count = 0;

            System.out.println("Enter the Number");
            double customerNum = kb.nextDouble();
            System.out.println("Enter the Name");
            String customerName = kb.next();
            System.out.println("Enter the Amount");
            double salesAmount = kb.nextDouble();
            System.out.println("Enter the TaxCode");
            int taxCode = kb.nextInt();
            {
               if (taxCode == 0) {
                   tax = 1;
                   salesTax = "tax exempt";
               } else if (taxCode == 1) {
                   tax = .03;
                   salesTax = "3%";
               } else {
                   tax = .05;
                   salesTax = "5%";
               }
                //count++
               double salesTaxDue = salesAmount * tax;
               double totalAmountDue = salesAmount + salesTaxDue;
                ;
               String report = "Customer name = " + customerName + "Sales Amount = " + salesAmount + "Sales Tax = " + salesTax + "Sales tax due = " + salesTaxDue + "Total Amount = " + totalAmountDue;

               System.out.println(report);

               return report;

           }
        }

       // while (count<30);



    }




