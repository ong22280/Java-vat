//นาย สิทธิพงค์ เหมล้วน รหัส 6330300950

import java.util.Scanner;

public class Lab2Tax6330300950
{
  public static void main(String[] args)
  {
    double tax, calTax, total;
    int salary, yearCost, taxDeduction, income, calculateIncome;
    String str;
    char member;

    Scanner scan_double = new Scanner(System.in);
    Scanner scan_int = new Scanner(System.in);
    Scanner scan_str = new Scanner(System.in);

    System.out.print("Enter Salary: ");
    salary = scan_int.nextInt();
    System.out.print("Enter Year cost: ");
    yearCost = scan_int.nextInt();
    System.out.print("Enter Tax deduction: ");
    taxDeduction = scan_int.nextInt();
    System.out.print("You have other income? ");
    str = scan_str.nextLine();
    member = str.charAt(0);

    if (member == 'Y') {
      System.out.print("Input other income: ");
      income = scan_int.nextInt();
      calculateIncome = (salary*12)-yearCost-taxDeduction+income;
    }
    else {
      calculateIncome = (salary*12)-yearCost-taxDeduction;
    }

    System.out.println("Income : "+"("+salary+"x12)"+" - "+yearCost+" - "+taxDeduction+" = "+calculateIncome);

    if (calculateIncome<=150000) {
      tax = 0;
      System.out.println("Tax is 0%");
      System.out.println("Your Tax = Free");
    }
    else if (calculateIncome<=300000) {
      tax = 5;
      System.out.println("Tax is 5%");
      calTax = (calculateIncome-150000)*0.05;
      System.out.println("Cal Tax "+calculateIncome+"- 150000 * 5% = "+calTax);
      System.out.println("Your Tax = "+calTax+" BTH");
    }
    else if (calculateIncome<=500000) {
      tax = 10;
      System.out.println("Tax is 10%");
      calTax = (calculateIncome-(300000))*0.10;
      total = calTax+7500;
      System.out.println("Cal Tax ("+calculateIncome+"- 300000 * 10% ) -7500 = "+calTax);
      System.out.println("Your Tax = "+total+" BTH");
    }
    else if (calculateIncome<=750000) {
      tax = 15;
      System.out.println("Tax is 15%");
      calTax = (calculateIncome-(500000))*0.15;
      total = calTax+27500;
      System.out.println("Cal Tax ("+calculateIncome+"- 500000 * 15% ) -27500 = "+calTax);
      System.out.println("Your Tax = "+total+" BTH");
    }
    else if (calculateIncome<=1000000) {
      tax = 20;
      System.out.println("Tax is 20%");
      calTax = (calculateIncome-(750000))*0.20;
      total = calTax+65000;
      System.out.println("Cal Tax ("+calculateIncome+"- 750000 * 20% ) -65000 = "+calTax);
      System.out.println("Your Tax = "+total+" BTH");
    }
    else if (calculateIncome<=2000000) {
      tax = 25;
      System.out.println("Tax is 25%");
      calTax = (calculateIncome-(1000000))*0.25;
      total = calTax+115000;
      System.out.println("Cal Tax ("+calculateIncome+"- 1000000 * 25% ) -115000 = "+calTax);
      System.out.println("Your Tax = "+total+" BTH");
    }
    else if (calculateIncome<=5000000) {
      tax = 30;
      System.out.println("Tax is 30%");
      calTax = (calculateIncome-(2000000))*0.30;
      total = calTax+365000;
      System.out.println("Cal Tax ("+calculateIncome+"- 2000000 * 30% ) -365000 = "+calTax);
      System.out.println("Your Tax = "+total+" BTH");
    }
    else {
      tax = 35;
      System.out.println("Tax is 15%");
      calTax = (calculateIncome-(5000000))*0.35;
      total = calTax+1256000;
      System.out.println("Cal Tax ("+calculateIncome+"- 5000000 * 35% ) -1256000 = "+calTax);
      System.out.println("Your Tax = "+total+" BTH");
    }
  }
}
