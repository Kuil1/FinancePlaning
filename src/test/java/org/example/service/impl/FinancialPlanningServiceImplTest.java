package org.example.service.impl;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class FinancialPlanningServiceImplTest {
    public static final Integer balance = 100_000;

    @InjectMocks
    FinancialPlanningServiceImpl finPlan;


    @DisplayName("Расчет расходов за день, положительный результат")
    @Test
    void calculationExpensesOfDay() {
        //given
        List<Integer> expenses = new ArrayList<>();
        expenses.add(20);
        //when
        Integer result = finPlan.calculationExpensesOfDay(balance, expenses);
        //then
        assertEquals(99_980, result);
    }

    @DisplayName("Расчет доходов за месяц, результат положительный")
    @Test
    void calculationIncomeOfMonth() {
        //given
        Integer hours = 159;
        Integer hourlyRate = 914;
        Integer pension = 14_300;
        Integer scholarship = 18_000;
        //when
        Integer result = finPlan.calculationIncomeOfMonth(hours, hourlyRate, pension, scholarship);
        //then
        assertEquals(result, 177_626);

    }
    @DisplayName("Расчет расходов за месяц, положительный результат")
    @Test
    void calculationExpensesOfMonth() {
        //given
        Integer requiredExpenses = 100_000;
        Integer additionalExpenses = 20_000;
        //when
        Integer result = finPlan.calculationExpensesOfMonth(requiredExpenses,additionalExpenses);
        assertEquals(result,120_000);
    }
}