package org.example.service;

import java.util.List;

public interface FinancialPlanning {
    Integer calculationExpensesOfDay(Integer balance , List<Integer> amountOfExpenses);
}
