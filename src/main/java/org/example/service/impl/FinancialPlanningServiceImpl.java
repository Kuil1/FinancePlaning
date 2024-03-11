package org.example.service.impl;

import lombok.NonNull;
import org.example.service.FinancialPlanningService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FinancialPlanningServiceImpl implements FinancialPlanningService {

    /**
     * @param balance          текущий баланс кошелька
     * @param amountOfExpenses колличество потраченных средств
     * @return оставшееся колл-во на балансе кошелька
     */
    @Override
    public Integer calculationExpensesOfDay(@NonNull Integer balance, @NonNull List<Integer> amountOfExpenses) {
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
    public Integer calculationIncomeOfMonth(@NonNull Integer hoursInThisMonth, @NonNull Integer hourlyRate, @NonNull Integer pension, @NonNull Integer scholarship) {
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
    public Integer calculationExpensesOfMonth(@NonNull Integer requiredExpenses, @NonNull Integer additionalExpenses) {
        return requiredExpenses + additionalExpenses;
    }

    @Override
    public Integer additionalExpenses(Integer expenses, String descriptionOfExpenses) {
        return null;
    }
}
