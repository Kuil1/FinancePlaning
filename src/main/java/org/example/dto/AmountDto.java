package org.example.dto;

import jdk.jfr.Label;
import lombok.Data;
import lombok.Value;


@Data
public class AmountDto {
    @Label("Общая сумма")
    Integer totalAmount;
    @Label("Расходы")
    Integer expenses;
    @Label("Доходы")
    Integer income;
}
