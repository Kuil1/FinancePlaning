package org.example.service.impl;

import org.example.service.FinancialPlanning;

import java.util.List;

public class FinancialPlanningImplementation implements FinancialPlanning {

    @Override
    public Integer calculationExpensesOfDay(Integer balance, List<Integer> amountOfExpenses) {
        for(int num: amountOfExpenses){
            balance-=num;
        }
        System.out.println(balance);
         return balance;
    }
}
