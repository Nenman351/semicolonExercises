package com.chiefSession;

import java.math.BigDecimal;

public class TaxCalculator {
        private static final BigDecimal Minimum_Earning = BigDecimal.valueOf(30000);
        private static final double Base_Tax_Rate = 0.15;
        private  static final double Additional_Tax_Rate = 0.20;

    public static BigDecimal calculateTax(Citizen citizen) {
        BigDecimal taxAmount = BigDecimal.ZERO;
        if (citizen.getEarnings().compareTo(Minimum_Earning) < 1){
            taxAmount = citizen.getEarnings().multiply(BigDecimal.valueOf(Base_Tax_Rate));
        }
        else {
            BigDecimal baseTax = Minimum_Earning.multiply(BigDecimal.valueOf(Base_Tax_Rate));
            BigDecimal excessAmount = citizen.getEarnings().subtract(Minimum_Earning);
            taxAmount = excessAmount.multiply(BigDecimal.valueOf(Additional_Tax_Rate)).add(baseTax);
        }
        return taxAmount;
    }
}
