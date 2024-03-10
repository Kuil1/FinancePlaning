package org.example.service;

import java.util.List;

public interface FinancialPlanning {
    /**
     * Расчет расходов за текущий день
     *
     * @param balance          текущий баланс кошелька
     * @param amountOfExpenses колличество потраченных средств
     * @return оставшееся колл-во на балансе кошелька на текущий день
     */
    Integer calculationExpensesOfDay(Integer balance, List<Integer> amountOfExpenses);

    /**
     * Подсчет дохода за месяц
     *
     * @param hoursInThisMonth часов в месяце
     * @param hourlyRate       часовая ставка
     * @param pension          пенсия
     * @param scholarship      стипендия
     * @return общий доход за месяц
     */

    Integer calculationIncomeOfMonth(Integer hoursInThisMonth, Integer hourlyRate, Integer pension, Integer scholarship);


    /** Подсчет расходов за месяц
     *
     * @param requiredExpenses обязательные расходы
     * @param additionalExpenses дополнительные расходы
     * @return общий расход за месяц
     */
    Integer calculationExpensesOfMonth(Integer requiredExpenses, Integer additionalExpenses);

}
