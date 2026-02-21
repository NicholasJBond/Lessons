package network.repository;

import java.util.ArrayList;
import java.util.List;

public class Lesson1 {
    public static void main(String[] args) {
        //Task 1
        System.out.println(taxDue(20000));  //Should be 270
        System.out.println(taxDue(40000));  //Should be 3270
        System.out.println(taxDue(60000));  //Should be 8788
        System.out.println(taxDue(100000)); //Should be 20788
        System.out.println(taxDue(150000)); //Should be 36838
        System.out.println(taxDue(200000)); //Should be 56138

        //Task 2
        ArrayList<Double> incomes = new ArrayList<>();
        incomes.add(150000.00); // Employment
        incomes.add(25000.00); // Bonuses;
        incomes.add(58000.00); // Investment Dividends;
        System.out.println("Total amount of tax due: $" + totalTaxDue(incomes)); //Should be 46046.0
    }

    public static double taxDue(double annualIncome){
        if (annualIncome <= 18200){
            return 0;
        } else if (annualIncome <= 45000) {
            return 0.15*(annualIncome-18200);
        } else if (annualIncome <= 135000) {
            return 4288+0.3*(annualIncome-45000);
        } else if (annualIncome <= 190000){
            return 31288+0.37*(annualIncome-135000);
        } else{
            return 51638+0.45*(annualIncome-190000);
        }
    }

    private static double totalTaxDue(List<Double> incomes) {
        double totalIncome = 0;
        for (double income: incomes){
            totalIncome += income;
        }
        return taxDue(totalIncome);
    }
}
