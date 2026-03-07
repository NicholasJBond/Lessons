package network.repository;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Practice1 {
    public static void main(String[] args){
        ArrayList<Double> incomes=new ArrayList<>();
        incomes.add(20000.0);
        incomes.add(40000.0);
        incomes.add(60000.0);
        incomes.add(100000.0);
        incomes.add(150000.0);
        incomes.add(200000.0);

        for(Double income:incomes){
            System.out.println(taxDue(income));
        }
        System.out.println();
        System.out.println();
        System.out.println("After Tax Income:");

        for(Double income:incomes){
            System.out.println(afterTaxIncome(income));
        }


    }

    private static double taxDue(double i) {
        if(i < 18_200){
            return (0);
        } else if (i < 45_000){
            return (0.16 * (i-18_200));
        } else if (i < 135_000){
            return (4_288 + .30 * (i-45_000));
        } else if (i < 190_000){
            return (31_288 + .37 * (i-135_000));
        } else {
            return (51_638 + .45 * (i-190_000));
        }

    }

    //After tax income

    private static double afterTaxIncome(double beforeTaxIncome){
        return beforeTaxIncome-taxDue(beforeTaxIncome);

    }
}
