package network.repository;

import java.lang.reflect.AccessFlag;
import java.util.ArrayList;
import java.util.List;

public class Lesson1 {
    public static void main(String[] args) {
//        //Task 1
//        System.out.println(taxDue(20000));  //Should be 270
//        System.out.println(taxDue(40000));  //Should be 3270
//        System.out.println(taxDue(60000));  //Should be 8788
//        System.out.println(taxDue(100000)); //Should be 20788
//        System.out.println(taxDue(150000)); //Should be 36838
//        System.out.println(taxDue(200000)); //Should be 56138
//
//        //Task 2
//        ArrayList<Double> incomes = new ArrayList<>();
//        incomes.add(150000.00); // Employment
//        incomes.add(25000.00); // Bonuses;
//        incomes.add(58000.00); // Investment Dividends;
//        System.out.println("Total amount of tax due: $" + totalTaxDue(incomes)); //Should be 46046.0
//
//        System.out.println(calculateBeforeTaxIncome(18250));
//        System.out.println(calculateBeforeTaxIncome(50000));
//        System.out.println(calculateBeforeTaxIncome(70000));
        double hourlyRate = 30.0;
        System.out.println("Hourly Rate Before Tax: $" + calculateBeforeTaxIncome(hourlyRate*40*52)/52/40);
    }

    public static double taxDue(double annualIncome){
        if(annualIncome < 18_200){
            return (0);
        } else if (annualIncome < 45_000){
            return (0.16 * (annualIncome-18_200));
        } else if (annualIncome < 135_000){
            return (4_288 + .30 * (annualIncome-45_000));
        } else if (annualIncome < 190_000){
            return (31_288 + .37 * (annualIncome-135_000));
        } else {
            return (51_638 + .45 * (annualIncome-190_000));
        }
    }

    private static double totalTaxDue(List<Double> incomes) {
        double totalIncome = 0;
        for (Double income: incomes){
            totalIncome+= income;
        }
        return taxDue(totalIncome);
    }



    public static double calculateBeforeTaxIncome(double afterTaxIncome){
        if (afterTaxIncome < 18200){
            return afterTaxIncome;
        } else if (afterTaxIncome < (45000-4288)){
            return (afterTaxIncome-0.16*18200)/(1-0.16);
        } else if (afterTaxIncome < (135000-31288)){
            return (afterTaxIncome+4288-0.3*45000)/(1-0.3);
        } else if (afterTaxIncome < (190000-51638)){
            return (afterTaxIncome + 31288 - 0.37*135000)/(1-0.37);
        } else{
            return (afterTaxIncome + 51638 - 0.45*190000)/(1-0.45);
        }
    }







}
