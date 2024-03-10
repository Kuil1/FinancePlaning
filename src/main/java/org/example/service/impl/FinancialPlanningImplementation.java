package org.example.service.impl;

import org.example.service.FinancialPlanning;

import java.util.List;

public class FinancialPlanningImplementation implements FinancialPlanning {

    /**
     * @param balance          текущий баланс кошелька
     * @param amountOfExpenses колличество потраченных средств
     * @return оставшееся колл-во на балансе кошелька
     */
    @Override
    public Integer calculationExpensesOfDay(Integer balance, List<Integer> amountOfExpenses) {
        for (int num : amountOfExpenses) {
            balance -= num;
        }
        return balance;
    }

    /**
     * Подсчет дохода за месяц
     *
     * @param hoursInThisMonth часов в месяце
     * @param hourlyRate       часовая ставка
     * @param pension          пенсия
     * @param scholarship      стипендия
     * @return общий доход за месяц
     */

    @Override
    public Integer calculationIncomeOfMonth(Integer hoursInThisMonth, Integer hourlyRate, Integer pension, Integer scholarship) {
        return hourlyRate * hoursInThisMonth + pension + scholarship;
    }

    /**
     * Подсчет расходов за месяц
     *
     * @param requiredExpenses   обязательные расходы
     * @param additionalExpenses дополнительные расходы
     * @return общий расход за месяц
     */

    @Override
    public Integer calculationExpensesOfMonth(Integer requiredExpenses, Integer additionalExpenses) {
        return requiredExpenses + additionalExpenses;
    }


}
