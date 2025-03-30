package practice_7_jcf.task1.cost_counter;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

public class CostCounter {
    // массив, в котором индекс = номер месяца
    private ArrayList<Double> costsPerMonth;

    public CostCounter() {
        this.costsPerMonth = new ArrayList<>();
    }

    //  метод добавления значения по номеру месяца (от 1 до 12) и расходов в этот месяц
    public void addCosts(int month, Double costs) {
        costsPerMonth.add(month - 1, costs);
    }

    // метод получения значения расхода по месяцу
    public Double getCosts(int month) {
        return costsPerMonth.get(month-1);
    }

    // считать месяц с минимальным расходом
    public Double getMinCostMonth() {
        AtomicReference<Double> min = new AtomicReference<>(costsPerMonth.getFirst()); // в качестве минимального значения взяли значение расходов за первый месяц
        costsPerMonth.forEach(
                costsPerMonth -> {
                    if (costsPerMonth < min.get()) {
                        min.set(costsPerMonth);   //потребовалась AtomicReference реализация для безопасности в многопоточности, позволяет оставаться в рамках одного потока
                    }
                }
        );
        return min.get();
    }
}
